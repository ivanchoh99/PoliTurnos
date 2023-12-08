pipeline {
    agent any

    tools {
        maven "M3"
        jdk "jdk"
    }

    stages {
        stage('Build JAR') {
            steps {
                echo('---Obteniendo cambios del repositorio---')
                git 'https://github.com/ivanchoh99/PoliTurnos.git'
                echo('---Construyendo el proyecto---')
                bat "mvn -DskipTests=true  clean package compile"
                echo('---Proyecto Construido---')
                pwd()
            }
        }
            
        stage('Build Docker Image'){

            steps{
                echo('Creacion de imagen App')
                bat ('dir')
                //bat('docker build -t poli-turnos DockerfilePoliTurnos')
            }
        }
    
        stage('Run Docker Containers'){

            steps{
                echo('run containers')
            }
        }
        
    }
}
