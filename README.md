### Learning basics of microservices


##### Generate network, db, pgadmin...
sudo docker compose up -d

##### Starting docker service on startup
sudo systemctl start docker.service
sudo systemctl enable docker.service

##### adding user to Docker group
sudo usermod -aG docker $USER
