pipeline {
    environment {
        docker=""
    }
    
    agent any
    stages {
        stage('Step1: Git') {
            steps {
                git branch 'Master'
                git url https://github.com/Madhav-07/SPE-Mini-Project.git
            }
        }
        stage('Step2: Maven Build') {
            steps {
                sh "mvn clean"
                sh "mvn compile"
                sh "mvn install"
            }
        }
        stage('Step3: Docker Create') {
            steps {
                
            }
        }
    }
}