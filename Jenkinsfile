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
        stage('Build') {
            steps {
                withMaven {
                    sh 'mvn clean package'
                }
            }
        }
    }
}

