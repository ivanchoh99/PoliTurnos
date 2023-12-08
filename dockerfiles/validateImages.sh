#!/bin/bash

# Verifica si hay imágenes en Docker
if docker images | grep -q .; then

  # Elimina todas las imágenes
  docker rmi $(docker images -q)

fi