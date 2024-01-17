
def OSList = [
    'windows',
    'ubuntu18',
    'ubuntu20',
    'ubuntu22',
    'rhel7',
    'rhel8',
    'rhel9',
    'debian9-64',
    'debian10-64',
    'debian11-64',
    'test-asan',
    'test-tsan',
    'test-ubsan',
]

def AdminList = [
    'WhoBrokeTheBuild',
    'mwinkel-dev'
]

def schedule = "";
if (BRANCH_NAME == "alpha") {
    schedule = "0 18 * * *";
}
if (BRANCH_NAME == "stable") {
    schedule = "0 19 * * *";
}

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

                script {
                    
                    // is PR
                    if (env.CHANGE_ID) {
                        // This is safe because untrusted PRs will use Jenkinsfile from the target branch
                        if (env.GITHUB_COMMENT_AUTHOR) {
                            if (!AdminList.contains(env.GITHUB_COMMENT_AUTHOR)) {
                                currentBuild.result = 'ABORTED'
                                error 'This user does not have permission to trigger builds.'
                            }
                            else {
                                echo("Build was started by ${GITHUB_COMMENT_AUTHOR}, who wrote: \"${GITHUB_COMMENT}\", which matches the trigger pattern.")
                            }
                        }
                        else if (!AdminList.contains(env.CHANGE_AUTHOR)) {
                            currentBuild.result = 'ABORTED'
                            error 'This user does not have permission to trigger builds.'
                        }
                    }
                }

                // This shouldn't be needed, but just in case
                cleanWs disableDeferredWipeout: true, deleteDirs: true
            }
        }

        stage('Distributions') {
            steps {
                script {
                    parallel OSList.collectEntries {
                        OS -> [ "${OS} Build & Test": {
                            stage("${OS} Build & Test") {
                                ws("${WORKSPACE}/${OS}") {
                                    stage("${OS} Clone") {
                                        checkout scm;
                                    }

                                    // stage("${OS} Bootstrap") {
                                    //     sh "GIT_BRANCH=\$BRANCH_NAME ./deploy/build.sh --os=bootstrap"

                                    //     if (OS.endsWith("armhf")) {
                                    //         sh "docker run --rm --privileged multiarch/qemu-user-static:register --reset"
                                    //     }
                                    // }

                                    stage("${OS} Test") {
                                        // try {
                                        //     def network = "jenkins-${EXECUTOR_NUMBER}-${OS}"
                                        //     sh "./deploy/build.sh --os=${OS} --test --dockernetwork=${network}"
                                        // }
                                        // finally {
                                        //     sh "./deploy/tap-to-junit.py --junit-suite-name=${OS}"
                                        //     junit skipPublishingChecks: true, testResults: 'mdsplus-junit.xml', keepLongStdio: true

                                        //     echo "Testing complete"
                                        // }
                                    }

                                    // if (false && env.CHANGE_ID && !OS.startsWith("test-")) {
                                    //     stage("${OS} Test Packaging") {
                                    //         sh "./deploy/build.sh --os=${OS} --release"
                                    //     }
                                    // }
                                }
                            }
                        }]
                    }
                }
            }
        }

        // stage('Additional Testing') {
        //     parallel {
        //         stage("Test IDL") {
        //             sh "Testing IDL"
        //         }

        //         stage("Test MATLAB") {
        //             sh "Testing MATLAB"
        //         }
        //     }
        // }

        stage('Publish') {
            steps {
                script {
                    def new_version = null
                
                    stage("Calculate Version") {
                        ws("${WORKSPACE}/publish") {
                            checkout scm;

                            new_version = sh(
                                script: "./deploy/get_new_version.py",
                                returnStdout: true
                            ).trim()

                            echo "Calculated new version to be ${new_version}"
                        }
                    }

                    if (new_version != null) {
                        release_file_list = []

                        parallel OSList.findAll{ OS -> (!OS.startsWith("test-")) }.collectEntries {
                            OS -> [ "${OS} Release & Publish": {
                                stage("${OS} Release & Publish") {
                                    ws("${WORKSPACE}/${OS}") {
                                        // stage("${OS} Release") {
                                        //     sh "./deploy/build.sh --os=${OS} --release=${new_version}"
                                        // }

                                        stage("${OS} Publish") {
                                            sh "mkdir tarfiles; echo 'hello' > tarfiles/test-${OS}.tgz"

                                            release_file_list.addAll(findFiles(glob: 'tarfiles/*.tgz'))

                                            // release_file_list.add("${WORKSPACE}/test-${OS}.txt")
                                            // sh "./deploy/build.sh --os=${OS} --publish=${new_version} --publishdir=/tmp/publish"
                                        }
                                    }
                                }
                            }]
                        }

                        stage("Publish Version") {
                            ws("${WORKSPACE}/publish") {
                                def tag = "${BRANCH_NAME}_release-" + new_version.replaceAll("\\.", "-")

                                echo "${release_file_list}"

                                echo "Creating GitHub Release and Tag for ${tag}"
                                withCredentials([usernamePassword(credentialsId: 'MDSplus Test',
                                                                usernameVariable: 'GITHUB_APP',
                                                                passwordVariable: 'GITHUB_ACCESS_TOKEN')]) {

                                    // TODO: Protect against spaces in filenames
                                    def release_file_list_arg = release_file_list.join(" ")
                                    sh "./deploy/create_github_release.py --tag ${tag} --api-token \$GITHUB_ACCESS_TOKEN ${release_file_list_arg}"
                                }

                            }
                        }
                    }
                }
            }
        }
    }
    post {
        always {
            cleanWs disableDeferredWipeout: true, deleteDirs: true
        }
    }
}

