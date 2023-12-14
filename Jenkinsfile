@Library('camunda-community') _

def OSList = [
    'windows',
    'ubuntu18', 'ubuntu20', 'ubuntu22',
    'rhel7', 'rhel8', 'rhel9',
    // 'alpine3.9-armhf', 'alpine3.9-x86_64', 'alpine3.9-x86',
    'debian9-64', 'debian10-64', 'debian11-64',
    'test-asan', 'test-tsan', 'test-ubsan',
]

def AdminList = [
    'WhoBrokeTheBuild',
    'mwinkel-dev'
]

// TODO: Change this?
def schedule = "";
if (BRANCH_NAME == "alpha") {
    // schedule = "H(3-6) 18 * * *";
    schedule = "*/5 * * * *";
}
if (BRANCH_NAME == "stable") {
    schedule = "H(2-5) 18 * * *";
}

def triggerCause = currentBuild.getBuildCauses()[0]._class;

pipeline {
    agent any
    options {
        skipDefaultCheckout()
        timeout(time: 1, unit: 'HOURS')
    }
    triggers {
        cron(schedule)
        issueCommentTrigger('(?i).*retest\\s+this\\s+please.*')
    }

    stages {
        stage('Setup') {
            steps {
                sh 'printenv'
                echo schedule
                echo triggerCause

                script {

                    if (triggerCause == hudson.triggers.TimerTrigger$TimerTriggerCause) {
                        echo "Yup"
                    }

                    // This is safe because untrusted PRs will use Jenkinsfile from the target branch
                    if (env.CHANGE_ID) { // is PR
                        if (env.GITHUB_COMMENT_AUTHOR) {
                            if (!AdminList.contains(env.GITHUB_COMMENT_AUTHOR)) {
                                currentBuild.result = 'ABORTED'
                                error 'This user cannot use "retest this please"'
                            }
                            else {
                                echo("Build was started by ${GITHUB_COMMENT_AUTHOR}, who wrote: \"${GITHUB_COMMENT}\", which matches the trigger pattern.")
                            }
                        }
                        else if (!AdminList.contains(env.CHANGE_AUTHOR)) {
                            currentBuild.result = 'ABORTED'
                            error 'This user does not have permission to build PRs'
                        }
                    }

                    // if (&& env.BRANCH_NAME.startsWith('PR-') && !AdminList.contains(env.CHANGE_AUTHOR)) {

                    //     pullRequest.createStatus(
                    //         status: 'error',
                    //         context: 'continuous-integration/jenkins/pr-head',
                    //         description: 'This user does not have permission to build PRs',
                    //         targetUrl: "${env.JOB_URL}"
                    //     )

                    //     currentBuild.result = 'ABORTED'
                    //     error 'This user does not have permission to build PRs'
                    // }
                }

                cleanWs disableDeferredWipeout: true, deleteDirs: true
            }
        }
        stage('Distributions') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: OSList
                    ],
                    actions: {
                        ws("${WORKSPACE}/${OS}") {

                            stage("${OS} Clone") {
                                checkout scm;
                            }

                            stage("${OS} Bootstrap") {
                                sh "./deploy/build.sh --os=bootstrap"

                                if (env.OS.endsWith("armhf")) {
                                    sh "docker run --rm --privileged multiarch/qemu-user-static:register --reset"
                                }
                            }

                            stage("${OS} Test") {
                                // sh "./deploy/build.sh --os=${OS} --test --eventport=\$((4100+\${EXECUTOR_NUMBER}))"

                                // // TODO: Why does this hang on windows?
                                // if (env.OS != "windows") {
                                //     archiveArtifacts artifacts: 'tests/**/*.log,tests/**/test-suite.tap,tests/**/core'
                                // }
                            }

                            // if (env.OS == "ubuntu22") {
                            //     stage("Test IDL/MATLAB") {
                            //         // TODO: Improve
                            //         MDSPLUS_DIR = sh(
                            //             script: "dirname \$(find tests/ -name 'setup.sh')",
                            //             returnStdout: true
                            //         ).trim()

                            //         withEnv([
                            //             "PYTHONUNBUFFERED=1",
                            //             "TEST_MDSIP_SERVER=alcdaq6",
                            //             "TEST_TREE=cmod",
                            //             "TEST_SHOT=1090909009",
                            //             "TEST_NODE1=sum(\\IP)",
                            //             "TEST_NODE1_VALUE=-6.96628e+07",
                            //             "TEST_NODE2=TSTART",
                            //             "TEST_NODE2_VALUE=-4.00000",
                            //             "TEST_DB_NAME=logbook",
                            //             "MDSPLUS_DIR=${MDSPLUS_DIR}"
                            //         ]) {
                            //             sh ". \$MDSPLUS_DIR/setup.sh; printenv; python3 ./idl/testing/run_tests.py"
                            //         }
                            //     }
                            // }

                            if (!env.OS.startsWith('test-')) {
                                stage("${OS} Release") {
                                    // TODO: This isn't exactly right, but
                                    // sh "./deploy/build.sh --os=${OS} --release"
                                }
                            }
                        }
                    }
                ])
            }
        }
        stage('Publish') {
            when {
                allOf {
                    expression {
                        return triggerCause == hudson.triggers.TimerTrigger$TimerTriggerCause;
                    }
                    anyOf {
                        environment name: 'BRANCH_NAME', value: 'alpha';
                        environment name: 'BRANCH_NAME', value: 'stable';
                    }
                }
            }
            steps {
                script {
                    dynamicMatrix([
                        failFast: false,
                        axes: [
                            OS: OSList
                        ],
                        actions: {
                            stage("${OS} Publish") {
                                echo "Publishing ${BRANCH_NAME}..."
                            }
                        }
                    ])
                }
            }
        }
    }
}

