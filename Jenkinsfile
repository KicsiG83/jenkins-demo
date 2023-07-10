pipeline {
    agent any
    options {
        disableConcurrentBuilds()
        skipDefaultCheckout()
        timeout(time: 1, unit: 'HOURS')
        timestamps()
    }
    triggers {
        cron('@midnight')
    }
    stages {
        stage('Clean') {
            steps {
                deleteDir()
                checkout scm
            }
        }
		stage('start compile') {
			steps {
				echo 'start compile'
			}	
		}
        stage('Compile') {
            steps {
                withMaven {
                    bat 'mvn clean compile'
                }
            }
        }
		stage('end compile') {
			steps {
				echo 'end compile'
			}	
		}
		stage('start test') {
			steps {
				echo 'start test'
			}	
		}
		stage('Test') {
            steps {
                withMaven {
                    bat 'mvn test'
                }
            }
        }
		stage('end test') {
			steps {
				echo 'end test'
			}	
		}
    }
}

