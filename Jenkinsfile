@Library('camunda-community') _

pipeline {
    agent any
    options { skipDefaultCheckout() } 

    stages {
        stage('BuildAndTest') {
            steps {
                cleanWs()

                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: [
                            'windows',
                            'ubuntu18', 'ubuntu20', 'ubuntu22',
                            'rhel7', 'rhel8', 'rhel9',
                            // 'alpine3.9-armhf', 'alpine3.9-x86_64', 'alpine3.9-x86',
                            'debian9-64', 'debian10-64', 'debian11-64'
                        ]
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
                                
                                sh "./deploy/build.sh --os=${OS} --release"
                            }
                            if (env.OS == "ubuntu18") {
                                stage("${OS} Test") {
                                    echo "Testing..."
                                }   
                            }
                        }
                    }
                ])
            }
        }
    }
}

