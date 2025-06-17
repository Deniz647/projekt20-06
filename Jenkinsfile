pipeline {
  agent any

  environment {
    MAVEN_OPTS = "-Dmaven.repo.local=.m2/repository"
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/springboot-backend') {
          sh 'mvn clean install'
        }
      }
    }

    stage('Test') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/springboot-backend') {
          sh 'mvn test'
        }
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deployment folgt später – z. B. auf Server kopieren oder Container starten.'
      }
    }
  }

  post {
    always {
      echo 'Pipeline abgeschlossen.'
    }
  }
}
