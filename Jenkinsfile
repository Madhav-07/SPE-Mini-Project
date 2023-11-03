pipeline {
    environment {
        image = ""
        docker_token = "Dockerhub"
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
                script {
                    image = docker.build('madhav022/calculator:latest')
                }
            }
        }
        stage('Step4: Docker Image Push') {
            steps {
                script {
                    docker.withRegistry('', docker_token) {
                        image.push()
                    }
                }
            }
        }
        stage('Step5: Using Ansible to Deploy Calculator App') {
            steps {
                ansiblePlaybook becomeUser: null,
                colorized: true,
                credentialsId: 'localhost_cred',
                disableHostKeyChecking: true,
                inventory: 'deployment/inventory',
                playbook: 'deployment/deploying.yaml',
                sudoUser: null
            }
        }
    }
}