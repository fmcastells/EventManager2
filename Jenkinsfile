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
        stage('Push') {
            steps {
                sh "docker build -t localhost:5000/eventmanager:latest ."
                sh "docker push localhost:5000/eventmanager:latest"
            }
        }
    }
}
