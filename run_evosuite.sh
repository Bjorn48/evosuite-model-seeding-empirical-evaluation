project=$1
flagmodel=$2
flagtest=$3
clone_seed_p=$4
class=$5
i=$6

population=$7
search_budget=$8

projectCP=$(python python/generateProjectCP.py "bins/$project")
      if [ "$flagmodel" -eq 1 ]; then
        # model_seeding execution mode
        echo "Model seeding is on - seed_clone=$clone_seed_p"
        model_dir="analysis-result/$project/models"
        generatedTestDir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i"
        if [ -d "$generatedTestDir" ]; then
          echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          continue
        fi
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget  -Dshow_progress=FALSE -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Donline_model_seeding=TRUE -Dmodel_path="$model_dir" -Dtest_dir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i" > "logs/model_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/model_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
        pid=$!
        . parsing.sh "model" $population $search_budget $pid $i $project $class $clone_seed_p $generatedTestDir &
        # Parse the execution log and save the useful information in to the model_seeding csv file
      elif [[ "$flagtest" -eq 1  ]]; then
        # test_seeding execution mode
        junits=$(python python/collect-junits.py $project $class)
        # Check if we have relative tests for the target class or not.
        if [[ -z "$junits" ]]; then
          echo "There is no test for class $class. Test seeding is skipped"
          # If we donot have one, we will skip test_seeding because test_seeding without test is equivalent to no_seeding.
       else
         echo "Test seeding is on - seed_clone=$clone_seed_p"
         generatedTestDir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i"
         if [ -d "$generatedTestDir" ]; then
          echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          continue
         fi
         java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dcarve_object_pool=TRUE -Dselected_junit="$junits" -Dtest_dir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i" > "logs/test_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/test_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
         pid=$!
         . parsing.sh "test" $population $search_budget $pid $i $project $class $clone_seed_p $generatedTestDir &
         # Parse the execution log and save the useful information in to the test_seeding csv file
        fi
      else
        # no_seeding execution mode
        echo "No seeding is on"
        echo "$projectCP"
        generatedTestDir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i"
        if [ -d "$generatedTestDir" ]; then
          echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          continue
        fi
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dtest_dir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i" > "logs/no_seeding/$project-$class-$i-out.txt" 2> "logs/no_seeding/$project-$class-$i-err.txt" &
        pid=$!
        . parsing.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir &
        # Parse the execution log and save the useful information in to the no_seeding csv file
      fi