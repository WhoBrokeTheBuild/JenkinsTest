@Library('camunda-community') _

pipeline {
    agent any

    stages {
        stage('BuildAndTest') {
            dynamicMatrix([
                failFast: false,
                axes: [
                    OS: ['ubuntu18', 'ubuntu20', 'ubuntu22']
                ],
                actions: {
                    stage("${OS} Bootstrap") {
                        steps {
                            sh "./deploy/build.sh --os=bootstrap"
                        }
                    }
                    stage("${OS} Build") {
                        steps {
                            sh "./deploy/build.sh --os=${OS} --release"
                        }
                    }
                    stage("${OS} Test") {
                        steps {
                            echo "Testing..."
                        }
                    }
                }
            ])
        }
    }
}

