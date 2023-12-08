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
    'WhoBrokeTheBuild'
]

pipeline {
    agent any
    options {
        skipDefaultCheckout()
        timeout(time: 1, unit: 'HOURS')
    }

    stages {
        stage('Setup') {
            steps {
                sh 'printenv'

                script {
                    if (env.JOB_BASE_NAME != "alpha-release" && env.JOB_BASE_NAME != "stable-release") {
                        // This is safe because untrusted PRs will use Jenkinsfile from the target branch
                        if (env.BRANCH_NAME.startsWith('PR-') && !AdminList.contains(env.CHANGE_AUTHOR)) {
                            currentBuild.result = 'ABORTED'
                            error 'This user does not have permission to build PRs'
                        }
                    }
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
                                sh "./deploy/build.sh --os=${OS} --test --eventport=\$((4100+\${EXECUTOR_NUMBER}))"

                                // TODO: Why does this hang on windows?
                                archiveArtifacts artifacts: '**/tests/*.log,**/tests/**/test-suite.tap,**/tests/**/core'
                            }

                            if (env.OS == "ubuntu22") {
                                stage("Test IDL/MATLAB") {
                                    // TODO: Improve
                                    MDSPLUS_DIR = sh(
                                        script: "dirname \$(find . -name 'setup.sh')",
                                        returnStdout: true
                                    ).trim()

                                    withEnv([
                                        "PYTHONUNBUFFERED=1",
                                        "TEST_MDSIP_SERVER=alcdaq6",
                                        "TEST_TREE=cmod",
                                        "TEST_SHOT=1090909009",
                                        "TEST_NODE1=sum(\\IP)",
                                        "TEST_NODE1_VALUE=-6.96628e+07",
                                        "TEST_NODE2=TSTART",
                                        "TEST_NODE2_VALUE=-4.00000",
                                        "TEST_DB_NAME=logbook",
                                        "MDSPLUS_DIR=${MDSPLUS_DIR}"
                                    ]) {
                                        sh ". \$MDSPLUS_DIR/setup.sh; printenv; python3 ./idl/testing/run_tests.py"
                                    }
                                }
                            }

                            if (!env.OS.startsWith('test-')) {
                                stage("${OS} Release") {
                                    // TODO: This isn't exactly right, but
                                    sh "./deploy/build.sh --os=${OS} --release"
                                }
                            }
                        }
                    }
                ])
            }
        }
        stage('Publish') {
            when {
                anyOf {
                    environment name: 'JOB_BASE_NAME', value: 'alpha-release';
                    environment name: 'JOB_BASE_NAME', value: 'stable-release';
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
                                echo "Publishing ${JOB_BASE_NAME}..."
                            }
                        }
                    ])
                }
            }
        }
    }
}

