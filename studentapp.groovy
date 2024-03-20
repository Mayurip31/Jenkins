pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {

               git branch: 'main', credentialsId: 'ID', url: 'https://github.com/Mayurip31/Jenkins.git'
               echo 'Hello World'
            }
        }
        
        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Here we are deploying the code'
            }
        }
