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
				echo 'Cleaning begins...'
				deleteDir()
				checkout scm
				echo 'Cleaning is finished.'
            }
        }
        stage('Compile') {
            steps {
				echo 'Compile begins...'
				withMaven {
                    bat 'mvn clean compile'
                }
				echo 'Compile is finished.'
            }
        }
		stage('Test') {
            steps {
				echo 'Test begins...'
                withMaven {
                    bat 'mvn test'
                }
				echo 'Test is finished.'
            }
        }
    }
}

