# Gerenciamento de Funcionários - Aplicação Spring Boot

![image](https://github.com/JacksonMiranda/TesteProthera/assets/10747842/e6707702-5705-40e0-8c23-822f7ad8b313)


Este projeto é uma aplicação Java Spring Boot que gerencia funcionários em uma empresa. Ele inclui operações CRUD básicas e várias funcionalidades adicionais conforme especificado nos requisitos. A aplicação possui uma interface web amigável desenvolvida com HTML, CSS e JavaScript, e segue os princípios de arquitetura limpa e orientação a objetos.

## Funcionalidades Implementadas

1. **Inserir Todos os Funcionários**: Insere uma lista de funcionários predefinidos na aplicação, evitando duplicações ao verificar se um funcionário já existe pelo nome.
2. **Remover Funcionário**: Remove um funcionário específico (João) da lista de funcionários.
3. **Listar Todos os Funcionários**: Exibe todos os funcionários com informações formatadas (data no formato dd/MM/yyyy e salário no formato de ponto como separador de milhar e vírgula como separador decimal).
4. **Aplicar Aumento de 10%**: Aplica um aumento de 10% ao salário de todos os funcionários.
5. **Agrupar Funcionários por Função**: Agrupa os funcionários por sua função e exibe-os em uma tabela.
6. **Aniversariantes**: Exibe os funcionários que fazem aniversário nos meses de outubro e dezembro.
7. **Funcionário Mais Velho**: Encontra e exibe o funcionário com a maior idade.
8. **Total dos Salários**: Calcula e exibe o total dos salários de todos os funcionários.
9. **Funcionários em Ordem Alfabética**: Exibe a lista de funcionários em ordem alfabética.
10. **Salários em Mínimos**: Calcula e exibe quantos salários mínimos (R$1212.00) cada funcionário ganha.

## Estrutura do Projeto

**Modelo**
- **Pessoa**: Classe base com os atributos nome e data de nascimento.
- **Funcionario**: Classe que estende Pessoa, adicionando os atributos salário e função.

**Repositório**
- **FuncionarioRepository**: Repositório que armazena os dados dos funcionários em uma lista e fornece métodos para operações CRUD.

**Serviço**
- **FuncionarioService**: Serviço que contém a lógica de negócios para gerenciar funcionários, incluindo inserção, remoção, aplicação de aumento, agrupamento por função, e cálculos de salários.

**Controlador**
- **FuncionarioController**: Controlador REST que expõe endpoints para as operações de gerenciamento de funcionários.

**Frontend**
- **HTML/CSS/JavaScript**: Interface web para interagir com a aplicação, permitindo que os usuários executem as operações listadas acima de forma amigável e visualmente agradável.

## Tecnologias Utilizadas

- **Java 11**: Linguagem de programação.
- **Spring Boot**: Framework para simplificação da criação de aplicações Java.
- **HTML/CSS/JavaScript**: Tecnologias para criação da interface web.
- **Eclipse IDE**: Ambiente de desenvolvimento integrado.
- **Spring Tools Suite (STS)**: Conjunto de ferramentas para desenvolvimento Spring no Eclipse.
- **Bootstrap**: Framework CSS para criação de interfaces web responsivas e modernas.

## Instruções para Rodar o Projeto

1. **Configurar o Ambiente**: Instalar Eclipse IDE for Enterprise Java Developers e Spring Tools Suite (STS).
2. **Criar o Projeto**: Criar um novo projeto Spring Starter no Eclipse e adicionar as dependências `Spring Web`, `Spring Boot DevTools`, `Thymeleaf`.
3. **Executar a Aplicação**: Rodar a aplicação Spring Boot.
4. **Acessar a Interface Web**: Abrir o navegador e acessar `http://localhost:8080` para interagir com a aplicação.

## Estrutura de Pastas

```plaintext
my-spring-boot-app
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── myapp
│   │   │               ├── MySpringBootApplication.java
│   │   │               ├── controller
│   │   │               │   └── FuncionarioController.java
│   │   │               ├── model
│   │   │               │   ├── Funcionario.java
│   │   │               │   └── Pessoa.java
│   │   │               ├── repository
│   │   │               │   └── FuncionarioRepository.java
│   │   │               └── service
│   │   │                   └── FuncionarioService.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   ├── index.html
│   │   │   │   ├── styles.css
│   │   │   │   └── scripts.js
│   │   ├── templates
│   │   └── application.properties
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── myapp
│   │                   └── MySpringBootApplicationTests.java
└── pom.xml

```

## Conclusão
O projeto foi desenvolvido para demonstrar conhecimentos em Java, Spring Boot, e desenvolvimento web. As funcionalidades foram implementadas de acordo com os requisitos, utilizando boas práticas de programação orientada a objetos e arquitetura limpa.
A interface foi modernizada utilizando Bootstrap para garantir uma melhor experiência do usuário.
