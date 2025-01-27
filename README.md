# DSList

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/conradoftnt/dslist/blob/main/LICENSE)

## Sobre o projeto

Esse projeto foi desenvolvido durante os meus estudos no intensivão Java Spring lesionado pelo professor Nelio Alves entre os dias 20 e 26 de janeiro de 2025.

O DSList é uma aplicação back-end com a funcionalidade de gerir uma lista de jogos eletrônicos permitindo que o usuário realize chamadas API’s como:

- Buscar todos os jogos (GET "/games")
- Buscar um jogo pelo ID (GET "/games/{id}")
- Buscar todas as listas (GET "/lists")
- Buscar uma lista pelo ID (GET "/lists/id")
- Alterar a posição de um jogo em uma lista (POST "/lists/{id}/replacement" body:{
    "sourceIndex": int,
    "destinationIndex": int
})

Além disso, o projeto foi desenvolvido com divisão de ambientes de testes, homologação e desenvolvimento (apenas configurado)

## Tecnologias utilizadas
- Java
- Spring boot
- Maven
- H2
- PostgreSQL
- pgAdmin

## Modelo de domínio
![Modelo de domínio](https://github.com/user-attachments/assets/d3e255b5-a49a-433c-b5d8-771cb863a9c3)

## Script Docker Compose
https://gist.github.com/acenelio/5e40b27cfc40151e36beec1e27c4ff71

## Como executar o projeto
Pré-requisitos: Java 21
```bash
# Clonar repositório
git clone https://github.com/conradoftnt/dslist

# Entrar na pasta do projeto
cd dslist

# Executar o projeto
./mvnw spring-boot:run
```

## Autor
Conrado Fortunato

https://www.linkedin.com/in/conrado-fortunato/
