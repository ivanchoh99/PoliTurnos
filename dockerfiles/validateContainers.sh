#!/bin/bash

# Verifica si hay contenedores en ejecución
if docker ps | grep -q .; then

  # Detiene todos los contenedores
  docker stop $(docker ps -q)

  # Elimina todos los contenedores detenidos
  docker rm $(docker ps -aq)

fi