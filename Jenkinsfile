pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args 'C:/Program Files (x86)/Jenkins/workspace' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
