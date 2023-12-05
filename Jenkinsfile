@Library('camunda-community') _

pipeline {
    agent none
    options { skipDefaultCheckout() } 

    stages {
        stage('BuildAndTest') {
            steps {
                sh 'env'
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: ['ubuntu18', 'ubuntu20', 'ubuntu22']
                    ],
                    actions: {
                        agent any

                        dir ("${OS}") {
                            stage("${OS} Clone") {
                                checkout scm;
                            }
                            stage("${OS} Bootstrap") {
                                sh "./deploy/build.sh --os=bootstrap"
                                sh "./deploy/build.sh --os=${OS} --release"
                            }
                            // stage("${OS} Build") {
                            // }
                            // stage("${OS} Test") {
                            //     echo "Testing..."
                            // }
                        }
                    }
                ])
            }
        }
    }
}

