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
				echo 'clean is started...'
				deleteDir()
				checkout scm
				echo 'clean is finished'
            }
        }
        stage('Compile') {
            steps {
				echo 'start compile'
				withMaven {
                    bat 'mvn clean compile'
                }
				echo 'end compile'
            }
        }
		stage('Test') {
            steps {
				echo 'start test'
                withMaven {
                    bat 'mvn test'
                }
				echo 'end test'
            }
        }
    }
}

