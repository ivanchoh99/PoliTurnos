pipeline {
    agent any

    tools {
        maven 'M3'
        jdk 'jdk'
    }

    stages {
        stage('Build JAR') {
            steps {
                echo('----------Obteniendo cambios del repositorio----------')
                git('https://github.com/ivanchoh99/PoliTurnos.git')
                echo('----------Construyendo el proyecto----------')
                bat('mvn -DskipTests=true  clean package compile')
                echo('----------Proyecto Construido----------')
                pwd()
            }
        }
            
        stage('Build Docker Image'){\
            steps{
                bat('cd dockerfiles && validateImages.sh')
                echo('----------Creacion de imagen App----------')
                bat('docker build -t poli-turnos -f dockerfiles/DockerfilePoliTurnos .')
                echo('----------Creacion de imagen Mongo----------')
                bat('docker pull mongo')
            }
        }
    
        stage('Create Docker Containers'){
            steps{
                bat('cd dockerfiles && validateContainers.sh')
                bat('cd dockerfiles && validateNetwork.sh')
                echo('----------Creacion Contenedor Mongo----------')
                bat('docker create -p27017:27017 --name mongito --network poli-red  mongo')
                echo('----------Creacion Contenedor App----------')
                bat('docker create -p3000:3000 --name poli-turnos --network poli-red poli-turnos')
            }
        }
        
        stage('Run Docker Containers'){
            steps{
                echo('----------Run Contenedor Monogo----------')
                bat('docker start mongito')
                echo('----------Run Contenedor App----------')
                bat('docker start poli-turnos')
            }
        }
        
    }
}
