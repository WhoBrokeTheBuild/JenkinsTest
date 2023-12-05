@Library('camunda-community') _

pipeline {
    agent any

    stages {
        stage('Bootstrap') {
            steps {
                sh "./deploy/build.sh --os=bootstrap"
            }
        }
        stage('BuildAndTest') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        OS: ['ubuntu18']
                    ],
                    actions: {
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

