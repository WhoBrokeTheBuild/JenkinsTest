pipeline {
    agent any

    stages {
        stage('BuildAndTest') {
            matrix{
                agent any
                axes {
                    axis {
                        name 'OS'
                        values 'ubuntu18' 'ubuntu20' 'ubuntu22'
                    }
                }
            }
            stages {
                stage('Build') {
                    steps {
                        sh './deploy/build.sh --os=${PLATFORM} --release'
                    }
                }
                stage('Test') {
                    steps {
                        echo 'Testing...'
                    }
                }
            }
        }
    }
}

