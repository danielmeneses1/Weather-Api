# API de Gerenciamento de Clima

Esta é uma API desenvolvida com Spring Boot para gerenciamento de dados climáticos. A API permite que os administradores insiram dados climáticos e que os usuários visualizem a previsão do tempo para os próximos dias.

## Funcionalidades

- **Inserção de Dados Climáticos:** Endpoint para administradores inserirem dados climáticos, incluindo temperatura, umidade, descrição do clima e data/hora.
- **Visualização da Previsão do Tempo:** Endpoint para usuários visualizarem a previsão do tempo para os próximos dias, excluindo os dados já passados.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL

## Configuração do Banco de Dados

Para executar a aplicação localmente, é necessário configurar um banco de dados MySQL. Utilize as seguintes configurações no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados?sslMode=DISABLED
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
