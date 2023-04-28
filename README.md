# FactoryMethod

Projeto Java com Factory Method
Este é um projeto Java que implementa o padrão Factory Method, utilizando as bibliotecas Spring Boot, Spring Data JPA e H2 Database.

Estrutura do projeto
O projeto está dividido em quatro pacotes principais:

model: contém a classe User, que representa a entidade que será gerenciada pela aplicação.
service: contém a classe UserService, que implementa a lógica de negócio da aplicação.
repository: contém a interface UserRepository, que define os métodos para acesso aos dados da entidade User.
controller: contém a classe UserController, que expõe os endpoints da API REST e gerencia as requisições HTTP recebidas.
Endpoints da API REST

A classe UserController implementa quatro endpoints da API REST, que correspondem aos quatro métodos de CRUD (Create, Read, Update, Delete) que podem ser executados sobre a entidade User:

GET /users: retorna a lista de todos os usuários cadastrados.

GET /users/{id}: retorna os dados do usuário com o ID informado.

POST /users: cria um novo usuário com os dados informados no corpo da requisição.

PUT /users/{id}: atualiza os dados do usuário com o ID informado, com base nos dados enviados no corpo da requisição.

DELETE /users/{id}: exclui o usuário com o ID informado.

Conclusão

Este projeto apresenta uma implementação simples do padrão Factory Method em uma aplicação Java com Spring Boot e Spring Data JPA.
O objetivo é mostrar como é possível utilizar esse padrão para criar objetos de forma dinâmica, delegando a responsabilidade de criação para uma classe específica,
e como isso pode simplificar o código e tornar a aplicação mais modular e fácil de manter.
