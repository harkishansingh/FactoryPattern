pipeline {


agent {
    docker {
        image 'maven:3-alpine'
        args '-u root'
    }
  }
  stages {
    stage('Build') {
        steps {
            echo 'Harkishan'
            bat 'mvn -B -DskipTests clean install'
        }
    }
  }
}
