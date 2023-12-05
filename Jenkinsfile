@Library('camunda-community') _

pipeline {
    agent any

    stages {
        stage('BuildAndTest') {
            matrix {
                axes {
                    axis {
                        name 'OS'
                        values 'ubuntu18', 'ubuntu20', 'ubuntu22'
                    }
                }
                stages {
                    stage('Matrix') {
                        script {
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
                    }
                }
            }
        }
    }
}

