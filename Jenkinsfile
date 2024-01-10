
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
            // parallel {

            //     stage("Ubuntu 18") {
            //         agent any
                            
            //         steps {
            //             ws("${WORKSPACE}/ubuntu18") {
            //                 stage("Clone") {
            //                     steps {
            //                         checkout scm;
            //                     }
            //                 }

            //                 stage("Test") {
            //                     steps {
            //                         sh "touch test.log"
            //                     }
            //                 }
            //             }
            //         }

            //         post {
            //             always {
            //                 ws("${WORKSPACE}/ubuntu18") {
            //                     archiveArtifacts "test.log"
            //                 }
            //             }
            //         }
            //     }

            //     stage("Ubuntu 20") {
            //         agent any
                            
            //         steps {
            //             ws("${WORKSPACE}/ubuntu20") {
            //                 stage("Clone") {
            //                     steps {
            //                         checkout scm;
            //                     }
            //                 }

            //                 stage("Test") {
            //                     steps {
            //                         sh "touch test.log"
            //                     }
            //                 }
            //             }
            //         }

            //         post {
            //             always {
            //                 ws("${WORKSPACE}/ubuntu20") {
            //                     archiveArtifacts "test.log"
            //                 }
            //             }
            //         }
            //     }

            //     stage("Ubuntu 22") {
            //         agent any
                            
            //         steps {
            //             ws("${WORKSPACE}/ubuntu22") {
            //                 stage("Clone") {
            //                     steps {
            //                         checkout scm;
            //                     }
            //                 }

            //                 stage("Test") {
            //                     steps {
            //                         sh "touch test.log"
            //                     }
            //                 }
            //             }
            //         }

            //         post {
            //             always {
            //                 ws("${WORKSPACE}/ubuntu22") {
            //                     archiveArtifacts "test.log"
            //                 }
            //             }
            //         }
            //     }

            // }

            steps {
                script {
                    parallel OSList.collectEntries {
                        OS -> [ OS: {
                            stage("${OS}") {
                                ws("${WORKSPACE}/${OS}") {

                                    stage("${OS} Clone") {
                                        checkout scm;
                                    }

                                    stage("${OS} Test") {
                                        try {
                                            sh "touch test.log"
                                            sh "false"
                                        }
                                        finally {
                                            archiveArtifacts "test.log"
                                        }
                                    }

                                }
                            }
                        }]
                    }
                }
            }

            // post {
            //     always {
            //         parallel OSList.collectEntries {
            //             OS -> [
            //                 "${OS}": {
            //                     ws("${WORKSPACE}/${OS}") {
            //                         archiveArtifacts "test.log"
            //                     }
            //                 }
            //             ]
            //         }
            //     }
            // }
        }

        // stage('Publish') {
        //     when {
        //         allOf {
        //             anyOf {
        //                 branch 'alpha';
        //                 branch 'stable';
        //             }

        //             triggeredBy 'TimerTrigger'
        //         }
        //     }
        //     steps {
        //         script {
        //             dynamicMatrix([
        //                 failFast: false,
        //                 axes: [
        //                     OS: OSList
        //                 ],
        //                 actions: {
        //                     ws("${WORKSPACE}/${OS}") {
        //                         stage("${OS} Publish") {
        //                             echo "Publishing ${BRANCH_NAME}..."
        //                         }        
        //                     }
        //                 }
        //             ])
        //         }
        //     }
        // }
    }
    post {
        always {
            cleanWs disableDeferredWipeout: true, deleteDirs: true
        }
    }
}

