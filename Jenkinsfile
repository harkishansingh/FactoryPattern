pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args 'C:/Users/harkishs/.m2' 
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
