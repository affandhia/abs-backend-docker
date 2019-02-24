docker build -t backend .
docker rm --force abs-backend-new
docker run --name abs-backend-new -d -e EMAIL='spicervolt@gmail.com' -e GOOGLE_CLIENTID='588654354409-365mn3hbjvam5jp7ggnl7578ssp6otpi.apps.googleusercontent.com' -p 7776:8081 -p 7777:80 -p 443:443 -p 3306:3306 backend
