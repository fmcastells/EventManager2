pipeline {
  agent none

    stages {
        stage('Build&Test') {
            agent {
                     docker { image 'maven:3.6.1-jdk-8' }
                  }
            steps {
                sh "mvn clean install"
            }
        }
    }
}