pipeline {
    agent any
    stages {
        stage('Build') {
            steps { bat 'mvn clean compile' }
        }
        stage('Test') {
            steps { bat 'mvn test' }
        }
        stage('Package') {
            steps { bat 'mvn package -DskipTests' }
        }
        stage('Docker Build') {
            steps { bat 'docker build -t myapp:latest .' }
        }
        stage('Deploy') {
            steps {
                // We use "|| echo" so Jenkins doesn't crash if the container doesn't exist yet
                bat 'docker rm -f myapp-container || echo "No container to remove"'
                bat 'docker run -d --name myapp-container -p 8081:8080 myapp:latest'
            }
        }
    }
    post {
        success { echo 'Pipeline completed successfully!' }
        failure  { echo 'Pipeline failed. Check logs.' }
    }
}