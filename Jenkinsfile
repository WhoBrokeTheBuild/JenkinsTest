pipeline {
    agent any

    stages {
        stage('BuildAndTest') {
            steps {
                dynamicMatrix([
                    failFast: false,
                    axes: [
                        'OS': ['ubuntu18', 'ubuntu20', 'ubuntu22']
                    ],
                    actions: {
                    stage('Bootstrap ${OS}') {
                        steps {
                            sh './deploy/build.sh --os=bootstrap'
                        }
                    }
                    stage('Build ${OS}') {
                        steps {
                            sh './deploy/build.sh --os=${OS} --release'
                        }
                    }
                    stage('Test ${OS}') {
                        steps {
                            echo 'Testing...'
                        }
                    }
                    }
                ])
            }
        }
    }
}

