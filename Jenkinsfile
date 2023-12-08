pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build'){
            parallel{
                stage('Build JAR') {
                    steps {
                        echo('---Obteniendo cambios del repositorio---')
                        git 'https://github.com/ivanchoh99/PoliTurnos.git'
                        echo('---Construyendo el proyecto---')
                            
                        bat "mvn -DskipTests=true  clean package compile"
                        echo('---Proyecto Construido---')
                    }
                }
                
                stage('Build Docker Image'){

                    steps{
                        echo('build images of docker necessary')
                    }
                }
            }
        }
        
        stage('Run Docker Containers'){

            steps{
                echo('run containers')
            }
        }
        
    }
}
