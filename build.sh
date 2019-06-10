# Configuration
EMAIL='spicervolt@gmail.com'
GOOGLE_CLIENTID='588654354409-365mn3hbjvam5jp7ggnl7578ssp6otpi.apps.googleusercontent.com'
BACKEND_PORT=7776
# ########### #

docker build -t backend .
docker rm --force abs-backend
docker run --name abs-backend -d -e EMAIL=$EMAIL -e GOOGLE_CLIENTID=$GOOGLE_CLIENTID -p $BACKEND_PORT:8081 backend
