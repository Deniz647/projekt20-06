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

    stage('Build Backend') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/springboot-backend') {
          sh 'mvn clean install'
        }
      }
    }

    stage('Test Backend') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/springboot-backend') {
          sh 'mvn test'
        }
      }
    }

    stage('Deploy Backend') {
      steps {
        echo 'Deployment folgt später – z. B. auf Server kopieren oder Container starten.'
      }
    }

    stage('Install Frontend Dependencies') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/angular-frontend') {
          sh 'npm install'
        }
      }
    }

    stage('Run Frontend Tests') {
      steps {
        dir('app/Angular-10-Spring-Boot-CRUD-Full-Stack-App-master/angular-frontend') {
          sh 'npm test --watch=false'
        }
      }
    }
  }

  post {
    always {
      echo 'Pipeline abgeschlossen.'
    }
  }
}
