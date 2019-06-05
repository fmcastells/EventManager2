pipeline {
  agent any

    stages {
        stage('Build&Test') {
            steps {
                sh "./mvnw clean install"
            }
        }
        stage('Push') {
            steps {
                sh "docker build -t localhost:5000/eventmanager:{branch} ."
                sh "docker push localhost:5000/eventmanager:{branch}"
            }
        }
        stage('Deploy') {
             when { branch 'master' }
                    steps {
                        sh "docker stop eventmanager"
                        sh "docker rm eventmanager"
                        sh "docker run -d --name eventmanager -p 8081:8081 localhost:5000/eventmanager:{branch}"
                    }
                }
    }
}
