pipeline {
    environment {
        image=""
    }
    
    agent any
    stages {
        stage('Step1: Git') {
            steps {
                git branch: 'master', url: 'https://github.com/Madhav-07/SPE-Mini-Project.git'
            }
        }
        stage('Step2: Maven Build') {
            steps {
                sh "mvn clean"
                sh "mvn compile"
                sh "mvn install"
            }
        }
        stage('Step3: Docker Create Image') {
            steps {

            }
        }
        // stage('Step Misc: Run') {
        //     steps {
        //         sh "java -cp ./target/calculator-1.0-SNAPSHOT.jar com.example.Calculator"
        //     }
        // }
        stage('Step4: Docker Pull') {
            steps {

            }
        }
    }
}