scaffoldingTest=$1
RunLimit=$2
proc_threads=$3

# Collect test suite information, like project name, target class, etc.
echo "Processing file '$scaffoldingTest'"
IFS='/' read -r -a dirs <<< "$scaffoldingTest"
configuration="${dirs[2]}"
echo "configuration: "$configuration
folderName="${dirs[3]}"
IFS='-' read -r -a usefulStuff <<< "$folderName"
project_name="${usefulStuff[0]}"
target_class="${usefulStuff[1]}"
clone_seed_p="${usefulStuff[2]}"
execution_id="${usefulStuff[3]}"
echo "project: "$project_name
echo "target_class: "$target_class
echo "clone_seed_p: "$clone_seed_p
echo "execution_id: "$execution_id
projectCP=$(ls -d -1 "$PWD/bins/$project_name/"* | tr '\n' ':')
test_execution_libs=$(ls -p "$PWD/pitest/libs/test_execution/"* | tr '\n' ':')

# 1- Compile scaffolding
javac -cp "$projectCP$test_execution_libs" $scaffoldingTest
testDir=$(dirname $scaffoldingTest)
scaffodlingClassPathEntryDir="generated_tests/cub_test_gen/$configuration/$folderName"
find $testDir -type f -name "*_ESTest.java" | while read mainTest; do
  javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest

  # 3- Run the main test for 5 times. if it fails even once, we count it as a flaky test and we will ignore it
  for ((run=1;run<=RunLimit;run++))
  do
    java -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" org.junit.runner.JUnitCore $target_class"_ESTest" > $scaffodlingClassPathEntryDir/junit_result.txt
    failingTestsOutput=$(python pitest/scripts/python/parse_failing_tests.py "$scaffodlingClassPathEntryDir/junit_result.txt")
    read -r -a array <<< "$failingTestsOutput"
    for index in "${!array[@]}"
    do
      containsElement "${array[index]}" "${flaky_tests[@]}"
      if [[ "$?" -eq "0" ]]; then
        flaky_tests+=("${array[index]}")
      fi
    done
    printf 'The test is: %s\n' "${flaky_tests[@]}"

    if (( ${#flaky_tests[@]} )); then
      for mainTest in `find $testDir -name "*_ESTest.java" -type f`; do
        java -jar pitest/libs/flaky_related/IgnoreAdder.jar $mainTest "${flaky_tests[@]}"
      done
    fi
   done

    # 4- Compile main tests again after potential changes (changes = add @ignore to flaky test cases)
    javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest

    pitestLibs=$(ls -d -1 "pitest/libs/pitest/"* | tr '\n' ':')

    # 5- Run pitest
    classPaths="$projectCP$test_execution_libs$scaffodlingClassPathEntryDir:$pitestLibs"
    sourceDirs="sources/$project_name/src"
    outDir="pitest/out/cub_test_gen/$configuration/$project_name-$target_class-$clone_seed_p-$execution_id"
    mutableCPs=$(python pitest/scripts/python/export_mutable_cps.py $projectCP)

    # The java command has to point to Java 8
    java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
      --reportDir $outDir \
      --targetClasses $target_class \
      --targetTests $target_class"_ESTest" \
      --mutableCodePaths "$mutableCPs" \
      --testPlugin evosuite \
      --sourceDirs $sourceDirs \
      --mutators ALL \
      --timestampedReports=false \
      --outputFormats "HTML,XML,CSV" \
      --threads $proc_threads &

    # Monitor process completion, and remove stalled processes if needed
    pitPid=$!
    # This command has to point to Java 11+
    java -jar pitest/libs/process-timeout-monitor.jar $pitPid "$outDir"
done
