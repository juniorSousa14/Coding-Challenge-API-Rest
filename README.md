# API de Transações

API RESTful para gerenciamento de transações financeiras com estatísticas em tempo real.

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.x
- Maven
- JUnit 5 (para testes)

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

## 🛠️ Instalação

1. Clone o repositório:
   ```bash
   git clone git@github.com:juniorSousa14/Coding-Challenge-API-Rest.git
   cd Coding-Challenge-API-rest
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em: `http://localhost:8080`

## 📚 Endpoints

### 1. Criar Transação
- **POST** `/transacao`
- **Corpo da Requisição**:
  ```json
  {
    "valor": 100.50,
    "dataHora": "2025-10-06T16:35:09.843-03:00"
  }
  ```
- **Respostas**:
  - `201 Created`: Transação criada com sucesso
  - `400 Bad Request`: JSON inválido
  - `422 Unprocessable Entity`: Data futura ou valor inválido

### 2. Obter Estatísticas
- **GET** `/estatistica`
- **Resposta de Sucesso** (200 OK):
  ```json
  {
    "count": 5,
    "sum": 1500.0,
    "avg": 300.0,
    "max": 500.0,
    "min": 100.0
  }
  ```
  - `count`: Número de transações
  - `sum`: Soma dos valores
  - `avg`: Média dos valores
  - `max`: Valor máximo
  - `min`: Valor mínimo

### 3. Limpar Transações
- **DELETE** `/transacao`
- **Respostas**:
  - `200 OK`: Transações removidas com sucesso

## ⚙️ Configuração

A aplicação roda na porta `8080` por padrão. Para alterar, modifique o arquivo `application.properties`.

## 🧪 Testes

Para executar os testes:
```bash
mvn test
```

## 📝 Notas

- As estatísticas são calculadas apenas para transações dos últimos 60 segundos
- A data/hora deve estar no formato ISO-8601
- Valores negativos não são permitidos

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.
