# EvoSuite (un)common behavior test generation evaluation tool
This tool is designed for running an empirical evaluation for common and uncommon behavior test
generation using EvoSuite. It is designed to run in a UNIX environment. It is based on the [STAMP
tool it is forked from](https://github.com/STAMP-project/evosuite-model-seeding-empirical-evaluation).

## Required inputs
This tool needs the following inputs:

- **binary files:** the compiled packages of the software under test should be located in `bins/<project_name>`.
- **source files (optional):** source code of the software under test, should be located in `sources/<project_name>`.
- **classes.csv file:** This CSV file contains the list of the classes in the target projects that
we want to generate unit tests for. The first column of this CSV file is the name of the target
class, and the second one indicates the project name.
- **execution count file:** A file containing the execution counts for the software under test,
originating from preceding executions of the software (during production use, for example). For the
format of this file, see
[the repository of the EvoSuite fork that is used for this evaluation](https://github.com/STAMP-project/evosuite-ramp/tree/cub-test-gen).
It contains both a
[JSON schema](https://github.com/STAMP-project/evosuite-ramp/blob/cub-test-gen/client/src/main/java/org/evosuite/coverage/execcount/execution-count-schema.json)
and a
[JSON example](https://github.com/STAMP-project/evosuite-ramp/blob/cub-test-gen/client/src/main/java/org/evosuite/coverage/execcount/execution-count-example.json).

## Running the test generation
Execute the following command. Parameters are in angled brackets and are described below.
```
. main.sh <#rounds> <classes> <#processes limit> <search_budget> <exec_count_file>
```

- **#rounds:** Number of times tests should be generated for the same class using the same
configuration.
- **classes:** Path to the file containing classes for which tests should be generated, in the
format described above under *Required inputs*.
- **#processes limit:** The maximum number of EvoSuite processes that may be running at once.
Note that EvoSuite by default spawns two processes (master and client) for each execution.
- **search_budget:** The search budget to be used by EvoSuite (i.e., the maximum number of seconds
used for generation).
- **exec_count_file:** Path to the execution count file as described above under *Required inputs*.

## Output
With `/` being the root of this project:
- **`/evosuite-report/`**:
    - **`statistics.csv`**: The statistics file outputed by EvoSuite.
    - **`branch-coverage.csv`**: Branch coverage information for the generated tests, outputed by
    EvoSuite. The format is described below under *Branch coverage data*.
    - **`test-case-lengths.csv`**: The length of each generated test case in terms of number of
    statements. The first column contains the test case id, and the second column its length. The id
    has the same format as for `branch-coverage.csv`, but with the test case number per suite
    appended.
    - **`test-case-branch-cov/<class-name>-<configuration-name>-<iteration-number>-<test-case-number>.csv`**:
    File specifying the branches covered and not covered by each test case. All branches in the
    class that the test case exercises are listed. The first column contains the first and last
    (both inclusive) line of a branch in the format `<first-line>-<last-line>`. The second column
    contains `true` if the branch is covered, and `false` if it is not covered.
- **`/generated_tests/cub_test_gen/<configuration-name>/<project-name>-<class-name>-1-<iteration-number>`**:
    Contains all tests generated by EvoSuite. Configurations are described below under
    *Configurations*.
- **`/logs/cub_test_gen/<configuration-name>/<project-name>-<class-name>-<iteration-number>-`**:
    - **`out`**: EvoSuite standard output log files
    - **`err`**: EvoSuite error log files

## Branch coverage data
The version of EvoSuite included in this repository outputs coverage data for all branches in
the software under test. It is saved in the `branch-coverage.csv` file mentioned under *Output*.
On each line, it contains the following information (variables in angled brackets):
```
<configuration>,<branch-line-numbers>,<#executions by generated tests>,<#executions in count file>
```
With the variables in the following format and meaning the following:
- **configuration**: `<class-name>-<configuration-name>-<iteration>` Configuration names are
described below under *Configurations*.
- **branch-line-numbers**: Line numbers of the branch in source code, in the format
    `<first line number>-<last line number>` (both inclusive).
- **#executions by generated tests**: Number of times the branch has been executed by the tests
generated by EvoSuite, over the whole suite generated by that EvoSuite execution.
- **#executions in count file**: Execution count for the branch as specified by the input execution
    count file.
    
## Configurations
EvoSuite is executed in the following configurations by this tool. They are listed by their names
as used in the folder structure for output files. In short, EvoSuite is executed using MOSA and
NSGA-II. For MOSA, it is executed using different combinations of fitness functions and secondary
objectives. For NSGA-II, it is executed using both the minimum and maximum execution count fitness
functions.

- **fit_def_sec_def**: MOSA using the EvoSuite default fitness functions and secondary objectives.
- **fit_def_sec_max**: MOSA using the EvoSuite default fitness functions and maximum execution count
    secondary objective.
- **fit_def_sec_min**: MOSA using the EvoSuite default fitness functions and minimum execution count
    secondary objective.
- **fit_max_min_sec_def**: MOSA using the minimum and maximum execution count fitness functions, and
    the EvoSuite default secondary objective.
- **fit_max_sec_max**: MOSA using the maximum execution count fitness function and secondary
    objective.
- **fit_min_sec_min**: MOSA using the minimum execution count fitness function and secondary
   objective.
- **nsgaii_max**: NSGA-II using the maximum execution count fitness function and secondary objective.
- **nsgaii_min**: NSGA-II using the minimum execution count fitness function and secondary objective.

## Running Pitest
The script `run_pitest.sh` in this repository can be used to run Pitest (PIT, a mutation testing
tool) on the generated tests. The script automatically searches for EvoSuite generated test suites
in the `generated_test` folder, and executes PIT on each test suite separately. Depending on the
parameters used, separate PIT executions can be executed in parallel, and multiple threads may be
used by single executions. The script can be called as follows:

```shell script
./run_pitest.sh <#process limit> <#threads limit> <user id>
```

Arguments are as follows:
- `<#process limit>`: The maximum number of PIT processes that may run at once. Note that each PIT
execution uses two processes at the same time. So to allow 4 parallel executions, for example, use a
value of 8.
- `<#thread limit>`: The maximum number of threads that may be used by each PIT process.
- `<user-id>`: The id of the user on the system on which the script is executed. This is used for
retrieving the number of active processes.

Output data is as follows:
- `/logs-pitest/cub-test-gen/<configuration>/<test-suite-name>`: PIT log files. For configurations see the
*Configurations* section above. The test suite name is the name of the test suite file generated by
EvoSuite.
    - `.log`: Standard output
    - `.err`: Error output
- `/pitest/out/cub_test_gen/<configuration>/<test-suite-name>`: PIT output reports. Configuration is named as above
under *Configurations*. The test suite name is the name of the test suite file generated by
EvoSuite. For the format of the PIT reports, see the PIT documentation.

## Running EvoSuite using Docker
The `docker-structure` folder contains the file structure needed to execute the experiment for the common/uncommon
behavior extension for EvoSuite, using Docker. It also contains a helper script for PowerShell and
Bash to download (if not downloaded already) and run the docker image.

### Running the experiment
To run the EvoSuite test generation using Docker, do the following.

1. Clone this repository and navigate to the `docker-structure` folder
2. Place the execution count file that you want to use in the exec_counts folder
3. Install [Docker](https://www.docker.com/). The procedure for this differs between operating
    systems.
4. Run one of the following commands within the repository you cloned to start running the
experiment using either PowerShell or Bash. (note that it is possible to run the `docker run`
command manually using different settings, but only the settings used in the run files have been
tested).

For PowerShell:
```powershell
powershell.exe -ExecutionPolicy Bypass -File .\run.ps1 $iterations $classes_file $process_limit `
$search_budget $exec_count_file
```

For Bash:
```shell script
./run.sh $iterations $classes_file $process_limit $search_budget $exec_count_file
```

Parameter explanation:
- `$iterations`: Number of times tests should be generated for the same class using the same
configuration.
- `$classes_file`: Path to the file containing classes for which tests should be generated. See [the
main GitHub repository of the tool](https://github.com/Bjorn48/cubtg-es-evaluation) for more
information about the format of this file.
- `$process_limit`: The maximum number of EvoSuite processes that may be running at once.
Note that EvoSuite by default spawns two processes (master and client) for each execution.
- `$search_budget`: The search budget to be used by EvoSuite.
- `$exec_count_file`: Path to the execution count file.

The command will download the docker image from [Docker Hub](https://hub.docker.com/) and start a
corresponding container. It is also possible to build a custom Docker image using the Dockerfile in
the root of the repository.

Local directories are bound to the docker container using the used `--mount` option. These are the
folders contained in the `docker-structure` folder. They will contain the output of the experiment.

By default, the docker container will run in the foreground. To make it run in the background, enter
`^P^Q`. It can then be returned to the foreground using the `docker attach <container_name>` command.
To find out the container name, run `docker container ls` to list all running containers.

# Licenses
This repository contains the following software under the following licenses. The full licenses are
included under the `/dependency-licenses/` folder
- *EvoSuite*: A (modified) EvoSuite binary is included. EvoSuite is distributed under the GNU LGPLv3.
    The modified version of EvoSuite that is used can be found in
    [this GitHub repository](https://github.com/STAMP-project/evosuite-ramp/tree/cub-test-gen).
- *JabRef*: A (modified) JabRef binary and (modified) source code is included. JabRef is distributed
    under the MIT license.
