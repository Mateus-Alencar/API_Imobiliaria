# Projeto RealEstateAPI

Este projeto tem como objetivo a criação de uma API para o gerenciamento de dados relacionados ao setor imobiliário, com foco na gestão de imobiliárias e imóveis. Desenvolvido utilizando **Spring Boot** e **JPA**, ele oferece uma solução eficiente para operações como cadastro, consulta e relacionamento entre imóveis e imobiliárias.

## Funcionalidades principais:

- **Gerenciamento de Imobiliárias**: Cadastro e consulta de imobiliárias, incluindo informações como nome, CNPJ, telefone e cidade.
- **Cadastro de Imóveis**: Criação de registros de imóveis, com dados como cidade, bairro e valor. Cada imóvel é vinculado a uma imobiliária.
- **Relação entre Entidades**: Utiliza o **JPA** (Java Persistence API) para mapear as entidades Java para o banco de dados **H2**, permitindo uma comunicação eficiente com o banco de dados relacional.
- **Banco de Dados H2**: Integração com o banco de dados **H2**, um banco de dados local em memória, garantindo performance e simplicidade no ambiente de desenvolvimento.

## Tecnologias utilizadas:

- **Spring Boot**: Framework para desenvolvimento da aplicação, facilitando a configuração e gerenciamento de dependências.
- **JPA (Java Persistence API)**: Utilizado para mapear as classes Java para o banco de dados relacional, fazendo uso do **ORM** (Object-Relational Mapping) para simplificar a persistência de dados.
- **Lombok**: Biblioteca que reduz a verbosidade do código, gerando automaticamente métodos como `getters`, `setters`, `toString`, `equals` e `hashCode` para as entidades, tornando o código mais limpo e fácil de manter.
- **Banco de Dados H2**: Banco de dados local utilizado para armazenar as informações de imobiliárias e imóveis de forma eficiente durante o desenvolvimento.

## Aprendizado:

Este projeto me proporcionou uma experiência significativa em **modelagem de dados** e **ORM**, além de me permitir aprofundar no uso de **Spring Boot** para criação de **APIs RESTful**. Ao mapear as entidades para o banco de dados e realizar operações **CRUD** (Create, Read, Update, Delete), pude consolidar conhecimentos em persistência de dados, além de entender melhor o funcionamento do **JPA** no contexto de aplicações Java. Também tive a oportunidade de utilizar o **Lombok** para reduzir a boilerplate code e tornar o desenvolvimento mais ágil e limpo.

Este projeto é uma excelente base para qualquer aplicação que precise gerenciar dados imobiliários de forma simples e eficiente, podendo ser expandido com novas funcionalidades no futuro.
