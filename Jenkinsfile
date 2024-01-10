
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
                    parallel {

                        for (OS in OSList) {
                            
                            stage("${OS}") {

                                ws("${WORKSPACE}/${OS}") {

                                    stage("${OS} Clone") {
                                        checkout scm;
                                    }

                                    stage("${OS} Test") {
                                        sh "touch test.log"
                                    }

                                    post {
                                        always {
                                            archiveArtifacts "test.log"
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
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

