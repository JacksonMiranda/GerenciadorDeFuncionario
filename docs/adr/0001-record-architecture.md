# ADR-0001: Decisões de Arquitetura para Gerenciador de Funcionários

## Status / Status
Aceito / Accepted

## Contexto / Context

Precisávamos criar uma aplicação para gerenciar funcionários de uma empresa com as seguintes funcionalidades:
- Operações CRUD básicas
- Interface web amigável
- Cálculos de negócio (aumentos, agrupamentos, etc.)
- Demonstração de conhecimentos em Java e Spring Boot

We needed to create an application to manage company employees with the following features:
- Basic CRUD operations
- User-friendly web interface
- Business calculations (increases, groupings, etc.)
- Demonstration of Java and Spring Boot knowledge

## Decisão / Decision

### 1. Framework Principal / Main Framework
**Decisão:** Spring Boot 2.5.4
**Razões:**
- Configuração automática reduz boilerplate
- Ecossistema maduro e bem documentado
- Facilita desenvolvimento rápido
- Ampla adoção na indústria
- Suporte nativo para web e APIs REST

**Decision:** Spring Boot 2.5.4
**Reasons:**
- Auto-configuration reduces boilerplate
- Mature and well-documented ecosystem
- Facilitates rapid development
- Wide industry adoption
- Native support for web and REST APIs

### 2. Linguagem de Programação / Programming Language
**Decisão:** Java 11
**Razões:**
- LTS (Long Term Support) version
- Boa performance e estabilidade
- Amplo conhecimento da equipe
- Compatibilidade com Spring Boot
- Recursos modernos (var, collections factory methods)

**Decision:** Java 11
**Reasons:**
- LTS (Long Term Support) version
- Good performance and stability
- Broad team knowledge
- Spring Boot compatibility
- Modern features (var, collections factory methods)

### 3. Arquitetura de Camadas / Layered Architecture
**Decisão:** Arquitetura em camadas (MVC + Service + Repository)
**Razões:**
- Separação clara de responsabilidades
- Facilita manutenção e testes
- Padrão bem conhecido
- Escalabilidade futura
- Reutilização de código

**Decision:** Layered architecture (MVC + Service + Repository)
**Reasons:**
- Clear separation of concerns
- Facilitates maintenance and testing
- Well-known pattern
- Future scalability
- Code reusability

### 4. Persistência de Dados / Data Persistence
**Decisão:** Repository pattern com armazenamento em memória
**Razões:**
- Simplicidade para demonstração
- Não requer configuração de banco
- Facilita testes e desenvolvimento
- Abstração permite mudança futura para BD real
- Adequado para escopo do projeto

**Decision:** Repository pattern with in-memory storage
**Reasons:**
- Simplicity for demonstration
- No database configuration required
- Facilitates testing and development
- Abstraction allows future change to real DB
- Suitable for project scope

### 5. Interface de Usuário / User Interface
**Decisão:** HTML/CSS/JavaScript com Bootstrap
**Razões:**
- Interface web acessível
- Bootstrap garante responsividade
- JavaScript permite interatividade
- Não requer framework complexo
- Facilita demonstração das funcionalidades

**Decision:** HTML/CSS/JavaScript with Bootstrap
**Reasons:**
- Accessible web interface
- Bootstrap ensures responsiveness
- JavaScript enables interactivity
- Doesn't require complex framework
- Facilitates feature demonstration

### 6. API Design / API Design
**Decisão:** RESTful APIs com JSON
**Razões:**
- Padrão da indústria
- Facilita integração
- Suporte nativo do Spring Web
- Estrutura clara e previsível
- Facilita testes

**Decision:** RESTful APIs with JSON
**Reasons:**
- Industry standard
- Facilitates integration
- Native Spring Web support
- Clear and predictable structure
- Facilitates testing

### 7. Estrutura do Projeto / Project Structure
**Decisão:** Estrutura padrão Maven + Spring Boot
```
src/
├── main/
│   ├── java/com/example/myapp/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   └── model/
│   └── resources/
│       ├── static/
│       └── application.properties
└── test/java/
```

**Razões:**
- Convenção sobre configuração
- Estrutura familiar para desenvolvedores Java
- Separação clara entre código e recursos
- Facilita navegação e manutenção

**Reasons:**
- Convention over configuration
- Familiar structure for Java developers
- Clear separation between code and resources
- Facilitates navigation and maintenance

## Consequências / Consequences

### Positivas / Positive
1. **Desenvolvimento Rápido:** Spring Boot acelera o desenvolvimento
2. **Manutenibilidade:** Arquitetura clara facilita manutenção
3. **Testabilidade:** Separação de camadas facilita testes unitários
4. **Flexibilidade:** Estrutura permite expansões futuras
5. **Demonstração:** Mostra conhecimento de boas práticas

### Negativas / Negative
1. **Persistência Limitada:** Dados perdidos ao reiniciar aplicação
2. **Escalabilidade:** Arquitetura monolítica pode limitar escala
3. **Segurança:** Implementação básica sem autenticação
4. **Performance:** Sem otimizações para alto volume
5. **Frontend Simples:** Interface básica sem framework moderno

## Alternativas Consideradas / Alternatives Considered

### 1. Framework Backend / Backend Framework
- **Spring MVC sem Boot:** Rejeitado por complexidade de configuração
- **Quarkus:** Rejeitado por ser menos conhecido
- **Micronaut:** Rejeitado por curva de aprendizado

### 2. Persistência / Persistence
- **JPA + H2:** Rejeitado por adicionar complexidade desnecessária
- **MongoDB:** Rejeitado por não ser relacional
- **Arquivo JSON:** Rejeitado por limitações de concorrência

### 3. Frontend / Frontend
- **React/Angular:** Rejeitado por adicionar complexidade
- **Thymeleaf:** Considerado mas rejeitado por preferência por SPA
- **Vue.js:** Rejeitado por escopo limitado

## Decisões Futuras / Future Decisions

### Próximas Melhorias / Next Improvements
1. **Persistência Real:** Migrar para JPA + PostgreSQL/MySQL
2. **Autenticação:** Implementar Spring Security
3. **Cache:** Adicionar Redis para performance
4. **Testes:** Expandir cobertura de testes
5. **API Documentation:** Adicionar OpenAPI/Swagger

### Monitoramento de Decisões / Decision Monitoring
- Avaliar performance com dados reais
- Coletar feedback de usuários
- Monitorar complexidade do código
- Acompanhar facilidade de manutenção

## Notas de Implementação / Implementation Notes

### Padrões Seguidos / Patterns Followed
- **SOLID Principles:** Especialmente SRP e DIP
- **Clean Architecture:** Separação de camadas
- **RESTful Design:** Verbos HTTP apropriados
- **Naming Conventions:** Padrões Java/Spring

### Configurações Específicas / Specific Configurations
- Maven wrapper para build consistente
- DevTools para desenvolvimento rápido
- Bootstrap via CDN para simplicidade
- Formatação PT-BR para datas e moedas

---

**Data:** 2025-01-XX
**Revisor:** Jackson Miranda
**Próxima Revisão:** Quando implementar persistência real ou autenticação