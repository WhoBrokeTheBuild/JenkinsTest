@Library('camunda-community') _

def OSList = [
    'windows',
    'ubuntu18', 'ubuntu20', 'ubuntu22',
    'rhel7', 'rhel8', 'rhel9',
    // 'alpine3.9-armhf', 'alpine3.9-x86_64', 'alpine3.9-x86',
    'debian9-64', 'debian10-64', 'debian11-64'
]

def AdminList = [
    'WhoBrokeTheBuild'
]

pipeline {
    agent any
    options { skipDefaultCheckout() } 

    stages {
        stage('Setup') {
            steps {
                sh 'printenv'

                script {
                    // This is safe because untrusted PRs will use Jenkinsfile from the target branch
                    if (env.BRANCH_NAME.startsWith('PR-') && !AdminList.contains(env.CHANGE_AUTHOR)) {
                        currentBuild.result = 'ABORTED'
                        error 'This user does not have permission to build PRs'
                    }
                }

                cleanWs()
            }
        }
        stage('BuildAndTest') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: OSList
                    ],
                    actions: {
                        ws("${OS}") {
                            stage("${OS} Clone") {
                                checkout scm;
                            }
                            stage("${OS} Bootstrap") {
                                sh "./deploy/build.sh --os=bootstrap"
                            }
                            stage("${OS} Build") {
                                if (env.OS.endsWith("armhf")) {
                                    sh "docker run --rm --privileged multiarch/qemu-user-static:register --reset"
                                }

                                // sh "./deploy/build.sh --os=${OS} --release"
                            }
                            // archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
                            if (env.OS == "ubuntu18") {
                                stage("Test IDL/MATLAB") {
                                    echo "Testing..."
                                    // sh "false"
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
                    branch 'alpha';
                    branch 'stable';
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

