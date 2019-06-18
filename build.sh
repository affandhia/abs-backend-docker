#!bin/bash

# Configuration

# Usage for setting environment simply: EMAIL="example@email.com" bash build.sh

EMAIL=${EMAIL:='spicervolt@gmail.com'}
GOOGLE_CLIENTID=${GOOGLE_CLIENTID:='588654354409-365mn3hbjvam5jp7ggnl7578ssp6otpi.apps.googleusercontent.com'}
BACKEND_PORT=${BACKEND_PORT:=7776}
BACKEND_CONTAINER_NAME=${BACKEND_CONTAINER_NAME:=abs-backend}
BACKEND_IMAGE=${BACKEND_IMAGE:=backend}
# ########### #

docker build -t $BACKEND_IMAGE .
docker rm --force $BACKEND_CONTAINER_NAME
docker run --name $BACKEND_CONTAINER_NAME -d -e EMAIL=$EMAIL -e GOOGLE_CLIENTID=$GOOGLE_CLIENTID -p $BACKEND_PORT:8081 $BACKEND_IMAGE
