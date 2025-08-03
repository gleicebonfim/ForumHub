# 📚 FórumHub API

Uma API REST desenvolvida em Java com Spring Boot para gerenciar tópicos de um fórum, permitindo a criação, visualização, atualização e exclusão de tópicos — com autenticação via JWT.

---

## 🚀 Funcionalidades

- ✅ Criar um novo tópico (`POST /topicos`)
- ✅ Listar todos os tópicos (`GET /topicos`)
- ✅ Visualizar um tópico específico (`GET /topicos/{id}`)
- ✅ Atualizar um tópico (`PUT /topicos/{id}`)
- ✅ Excluir um tópico (`DELETE /topicos/{id}`)
- 🔐 Login de usuário com autenticação JWT (`POST /auth`)

---

## ⚙️ Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- JWT (Autenticação)
- Maven

---

## 🛠️ Requisitos para rodar o projeto

- JDK 17+
- Maven
- Git (opcional)

---

## ▶️ Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/forumhub-api.git
cd forumhub-api
