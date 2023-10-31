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
        // stage('Step Misc: Run') {
        //     steps {
        //         sh "java -cp ./target/calculator-1.0-SNAPSHOT.jar com.example.Calculator"
        //     }
        // }
        stage('Step4: Docker Image Push') {
            steps {
                script {
                    docker.withRegistry('', docker_token) {
                        image.push()
                    }
                }
            }
        }
        // stage('Step5: Deleting Old versions of Docker Images & Containers') {
        //     steps {
        //         sh "docker image prune -f && docker container prune -f"
        //     }
        // }
        stage('Step5: Using Ansible to Deploy Calculator') {
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