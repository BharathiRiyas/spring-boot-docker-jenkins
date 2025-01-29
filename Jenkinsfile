pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/BharathiRiyas/spring-boot-docker-jenkins.git'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Running Maven build
                    sh 'mvn clean install'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    // Add deployment steps if needed
                    echo 'Deployment can be added here'
                }
            }
        }
    }
}

