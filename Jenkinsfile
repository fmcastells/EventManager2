pipeline {
  agent any

    stages {
            stage('Prepare') {
                steps {
                    sh "docker login -u fcastells -p Timao71910"
                }
            }
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
        stage('Deploy') {
                    steps {
                        sh "docker stop eventmanager"
                        sh "docker rm eventmanager"
                        sh "docker run -d --name eventmanager -p 8081:8081 localhost:5000/eventmanager:latest"
                    }
                }
    }
}
