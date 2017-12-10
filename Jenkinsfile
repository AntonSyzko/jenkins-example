pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                echo "Starting maven build"
                    sh "whoami"
                    sh "ls -la"
                    sh 'java -version'
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn --version'
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Installation Stage') {
            steps {
                withMaven(maven : 'maven_3_5_2') {
                    sh 'mvn install'
                }
            }
        }
    }
}