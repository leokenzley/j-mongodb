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
# Criando a collection pessoa
```shell
  mongosh mongodb://admin:senha123@localhost:27017 --username admin
  db.createCollection("user")
  db.user.insertMany(
      [
          { name: "João", email: "joao@example", status: "A"}
      ]
  )
```