@Library('camunda-community') _

pipeline {
    agent any

    stages {
        stage('BuildAndTest') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: ['ubuntu18', 'ubuntu20', 'ubuntu22']
                    ],
                    actions: {
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
                ])
            }
        }
    }
}

