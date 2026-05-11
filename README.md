# Sistema de Usuários JDBC

Sistema simples de gerenciamento de usuários desenvolvido em Java puro utilizando JDBC e MySQL.

---

## 🚀 Tecnologias utilizadas

- Java
- JDBC
- MySQL
- SQL

---

## 📚 Conceitos praticados

- Programação Orientada a Objetos (POO)
- Conexão com banco de dados usando JDBC
- Operações CRUD
- Consultas SQL
- Separação em camadas
- Tratamento de exceções
- Collections com ArrayList

---

## 📁 Estrutura do projeto

```bash
src
├── connection
│   └── ConnectionDb.java
├── entity
│   └── User.java
├── repository
│   └── UserRepository.java
├── service
│   └── UserServices.java
│   └── MainCl.java
└── sql
    └── usersystem.sql
````

---

## ⚙️ Funcionalidades

- ✅ Cadastrar usuários
- ✅ Atualizar nome
- ✅ Atualizar email
- ✅ Atualizar CPF
- ✅ Remover usuários
- ✅ Listar todos os usuários
- ✅ Buscar usuários por nome
- ✅ Buscar usuários por ID

---

## 🔌 Configuração da conexão

Classe responsável pela conexão com o banco:

```java
public class ConnectionDb {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/usersystem";
        String userName = "root";
        String passWord = "sua_senha";

        return DriverManager.getConnection(url, userName, passWord);
    }
}
```
---

▶️ Como executar o projeto
1. Clonar o repositório
git clone <url-do-repositorio>
2. Configurar usuário e senha do banco

Altere as credenciais na classe:

ConnectionDb.java

 3. Executar o projeto

Execute a classe:

```bash
MainCl.java
```

---

## 📌 Exemplos de operações

### Salvar usuário

```java
User u1 = new User(1, "Jakson", "jakson@gmail.com", "12345678900");
UserServices.save(u1);
```

### Atualizar email

```java
UserServices.updateEmail(1, "novoemail@gmail.com");
```

### Buscar usuários

```java
System.out.println(UserServices.listAll());
```

---

## 📷 Exemplo de saída

```bash
Saved successfully!
Update successful!
Removed successfully!
```

---

## 🧠 Objetivos de aprendizado

Este projeto foi desenvolvido com o objetivo de praticar:

* JDBC
* SQL
* CRUD em Java
* Manipulação de banco de dados
* Arquitetura em camadas
* Fundamentos do Java sem frameworks

---


## 👨‍💻 Autor

Desenvolvido por Jakson Jose.

```
```

