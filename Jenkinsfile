@Library('camunda-community') _

pipeline {
    agent any
    options { skipDefaultCheckout() } 

    stages {
        stage('BuildAndTest') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: ['ubuntu18', 'ubuntu20', 'ubuntu22']
                    ],
                    actions: {
                        dir ("${OS}") {
                            stage("${OS} Clone") {
                                checkout scm;
                            }
                            stage("${OS} Bootstrap") {
                                sh "./deploy/build.sh --os=bootstrap"
                            }
                            stage("${OS} Build") {
                                sh "./deploy/build.sh --os=${OS} --release"
                            }
                            stage("${OS} Test") {
                                echo "Testing..."
                            }
                        }
                    }
                ])
            }
        }
    }
}

