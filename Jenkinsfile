pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                dir('Documents/springboot1/demoanil') { // Navigate to the directory with the pom.xml
                    withMaven(maven : 'MAVEN_HOME') {
                        sh 'mvn clean compile'
                    }
                }
            }
        }

        stage ('Testing Stage') {
            steps {
                dir(''Documents/springboot1/demoanil') { // Navigate to the directory with the pom.xml
                    withMaven(maven : 'MAVEN_HOME') {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage ('Deployment Stage') {
            steps {
                dir(''Documents/springboot1/demoanil') { // Navigate to the directory with the pom.xml
                    withMaven(maven : 'MAVEN_HOME') {
                        sh 'mvn deploy'
                    }
                }
            }
        }
    }
}
