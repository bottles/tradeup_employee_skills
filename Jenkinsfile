pipeline {
  agent any
  stages {
    stage('hello') {
      steps {
        echo 'hello world.'
      }
    }
    stage('build') {
      steps {
        sh '''git checkout test_connection;
ls;
cd server;
grails test-app employee_skills.EmployeeSpec -echoOut -unit;'''
      }
    }
  }
}