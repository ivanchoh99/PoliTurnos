#!/bin/bash

# Verifica si existe la red poli-red
if docker network ls | grep -q poli-red; then

  # Elimina la red poli-red
  docker network rm poli-red

fi

# Crea la red poli-red
docker network create poli-red