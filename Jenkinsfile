pipeline {
  agent any

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
                sh "docker tag -f localhost:5000/eventmanager:latest localhost:5000/eventmanager:latest"
                sh "docker push -f localhost:5000/eventmanager:latest"
            }
        }
        stage('Deploy') {
                    steps {
                        sh "docker run -d --name eventmanager -p 8081:8081 localhost:5000/eventmanager:latest"
                    }
                }
    }
}
