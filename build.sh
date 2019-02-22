docker build -t backend .
docker rm --force abs-backend
docker run --name abs-backend -e EMAIL=spicervolt@gmail.com -d -p 7776:8081 -p 7777:80 -p 443:443 -p 3306:3306 backend