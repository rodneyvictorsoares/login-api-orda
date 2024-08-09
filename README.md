
# 📋 Login Auth API ORDA

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.0-brightgreen)
![Docker](https://img.shields.io/badge/Docker-20.10-blue)

## 📝 Sobre o Projeto

A **Login Auth API ORDA** é uma API robusta para autenticação e gerenciamento de usuários, desenvolvida com Java e Spring Boot. Ela oferece suporte a autenticação baseada em tokens JWT, manipulação de usuários, e integrações de segurança utilizando Spring Security.

## 🚀 Tecnologias Utilizadas

- **[Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)**: A linguagem principal do projeto.
- **[Spring Boot 2.7.0](https://spring.io/projects/spring-boot)**: Framework para facilitar o desenvolvimento de aplicações Java.
- **[Spring Security](https://spring.io/projects/spring-security)**: Utilizado para configuração de autenticação e autorização.
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)**: Simplifica o acesso aos dados e a persistência no banco de dados.
- **[JWT (JSON Web Tokens)](https://jwt.io/)**: Para autenticação segura com tokens.
- **[Maven](https://maven.apache.org/)**: Gerenciamento de dependências e ciclo de vida do projeto.
- **[Docker](https://www.docker.com/)**: Para criar e rodar containers de forma isolada.

## 🛠️ Funcionalidades

- Registro de novos usuários.
- Login e autenticação via JWT.
- Proteção de endpoints com Spring Security.
- Manipulação de informações dos usuários autenticados.
- Configuração CORS para acesso controlado à API.

## 🏗️ Estrutura do Projeto

```bash
login-auth-api-orda/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/    # Controladores REST
│   │   │   ├── domain/         # Entidades do domínio
│   │   │   ├── dtos/           # Data Transfer Objects
│   │   │   ├── infra/          # Configurações de infraestrutura
│   │   │   └── repositories/   # Repositórios de dados
│   │   └── resources/
│   │       └── application.properties  # Configurações da aplicação
├── target/                     # Diretório de build
├── Dockerfile                  # Configuração do Docker
├── pom.xml                     # Arquivo de configuração do Maven
└── README.md                   # Documentação do projeto
```

## 📦 Instalação

### Pré-requisitos

- **Java 17** ou superior
- **Maven**
- **Docker** e **Docker Compose** (opcional para rodar via container)

### Passos

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/login-auth-api-orda.git
   cd login-auth-api-orda
   ```

2. Construa o projeto com Maven:

   ```bash
   mvn clean install
   ```

3. Execute a aplicação localmente:

   ```bash
   mvn spring-boot:run
   ```

### Usando Docker

1. Construa a imagem Docker:

   ```bash
   docker build -t login-auth-api-orda .
   ```

2. Rode a aplicação em um container:

   ```bash
   docker run -p 8080:8080 login-auth-api-orda
   ```

3. Acesse a aplicação em `http://localhost:8080`.

## 🔍 Como Usar

### Autenticação

- **POST /api/auth/login**: Realiza login e retorna um token JWT.
- **POST /api/auth/register**: Registra um novo usuário.
  
### Endpoints Protegidos

Todos os endpoints que exigem autenticação devem incluir o token JWT no header `Authorization` no formato `Bearer <token>`.

## 🧪 Testes

Para rodar os testes unitários:

```bash
mvn test
```

## 🤝 Contribuições

1. **Fork** este repositório.
2. Crie uma **branch** para sua feature (`git checkout -b feature/nova-feature`).
3. **Commit** suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. **Push** para a branch (`git push origin feature/nova-feature`).
5. Abra um **Pull Request**.

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

**Autor**: [Rodney Victor](https://github.com/rodneyvictorsoares)
