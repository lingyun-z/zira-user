pipeline {
  agent any
  environment {
    PROJECT_NAME = "zira-user"
  }

  stages {
    stage('build') {
      steps {
        sh "docker build -t ${PROJECT_NAME}:latest ."
      }
    }

    stage('deploy') {
      steps {
        sh "bash deploy.sh ${PROJECT_NAME}"
      }
    }
  }
}
