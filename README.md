# j-mongodb
Projeto de estudo mongodb com springboot

# Infra estrututa
```shell
    docker run -d \
      --name meu-mongodb \
      -p 27017:27017 \
      -e MONGO_INITDB_ROOT_USERNAME=admin \
      -e MONGO_INITDB_ROOT_PASSWORD=senha123 \
      mongo:latest
```
## Criando a collection pessoa
```shell
  mongosh mongodb://admin:senha123@localhost:27017 --username admin
  db.createCollection("user")
  db.user.insertMany(
      [
          { name: "João", email: "joao@example", status: "A"}
      ]
  )
```
## - CRUD user
### CREATE
```shell
    curl --location 'http://localhost:8080/api/v1/users' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "name": "xandão",
        "email": "xand_o_terror@stf.com",
        "status": "A"
    }'
```
### READ
```shell
    curl --location 'http://localhost:8080/api/v1/users'
```
### UPDATE
```shell
    curl --location --request PUT 'http://localhost:8080/api/v1/users/63f8b0c4d3e2f1a2b3c4d5e6' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "name": "xandão",
    "email": "xand_o_terror@stf.com",
    "status": "A"
}'
```
### DELETE
```shell
    curl --location --request DELETE 'http://localhost:8080/api/v1/users/63f8b0c4d3e2f1a2b3c4d                                                                                                  
```

### READ Paginate
```shell
    curl --location 'http://localhost:8080/api/v1/users'
```