# Contribuindo / Contributing

Obrigado por seu interesse em contribuir com o Gerenciador de Funcionários! / Thank you for your interest in contributing to the Employee Manager!

[English version below](#english-version)

## Português

### Como Contribuir

1. **Fork** o repositório
2. **Clone** seu fork localmente
3. Crie uma **branch** para sua funcionalidade: `git checkout -b feature/nova-funcionalidade`
4. **Commit** suas mudanças: `git commit -m 'feat: adiciona nova funcionalidade'`
5. **Push** para a branch: `git push origin feature/nova-funcionalidade`
6. Abra um **Pull Request**

### Diretrizes de Código

- Siga as convenções do **Java** e **Spring Boot**
- Use nomes descritivos para variáveis e métodos
- Adicione comentários quando necessário em código complexo
- Mantenha os métodos pequenos e focados
- Siga os padrões definidos no `.editorconfig`

### Padrões de Commit

Usamos [Conventional Commits](https://www.conventionalcommits.org/). Exemplos:

- `feat: adiciona funcionalidade de relatórios`
- `fix: corrige cálculo de salário`
- `docs: atualiza README`
- `style: formata código`
- `refactor: reestrutura service layer`
- `test: adiciona testes para controller`
- `chore: atualiza dependências`

### Reportando Bugs

Use nossos [templates de issue](.github/ISSUE_TEMPLATE/) para reportar bugs. Inclua:

- Descrição clara do problema
- Passos para reproduzir
- Comportamento esperado vs atual
- Ambiente (OS, Java version, etc.)
- Screenshots se aplicável

### Sugerindo Funcionalidades

Use o [template de feature request](.github/ISSUE_TEMPLATE/feature_request.md). Inclua:

- Descrição clara da funcionalidade
- Justificativa para a funcionalidade
- Possível implementação
- Exemplos de uso

### Configuração do Ambiente de Desenvolvimento

1. **Pré-requisitos:**
   - Java 11 ou superior
   - Maven 3.6+
   - IDE (recomendado: IntelliJ IDEA, Eclipse, VSCode)

2. **Configuração:**
   ```bash
   git clone https://github.com/JacksonMiranda/GerenciadorDeFuncionario.git
   cd GerenciadorDeFuncionario
   ./mvnw clean install
   ```

3. **Executar testes:**
   ```bash
   ./mvnw test
   ```

4. **Executar aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```

### Processo de Review

- Todo PR será revisado pelo mantenedor
- Feedbacks serão dados via comentários no PR
- Mudanças podem ser solicitadas antes do merge
- Testes devem passar antes do merge

### Código de Conduta

Este projeto segue o [Contributor Covenant](CODE_OF_CONDUCT.md). Seja respeitoso e inclusivo.

---

## English Version

### How to Contribute

1. **Fork** the repository
2. **Clone** your fork locally
3. Create a **branch** for your feature: `git checkout -b feature/new-feature`
4. **Commit** your changes: `git commit -m 'feat: add new feature'`
5. **Push** to the branch: `git push origin feature/new-feature`
6. Open a **Pull Request**

### Code Guidelines

- Follow **Java** and **Spring Boot** conventions
- Use descriptive names for variables and methods
- Add comments when necessary for complex code
- Keep methods small and focused
- Follow patterns defined in `.editorconfig`

### Commit Standards

We use [Conventional Commits](https://www.conventionalcommits.org/). Examples:

- `feat: add reporting functionality`
- `fix: correct salary calculation`
- `docs: update README`
- `style: format code`
- `refactor: restructure service layer`
- `test: add controller tests`
- `chore: update dependencies`

### Reporting Bugs

Use our [issue templates](.github/ISSUE_TEMPLATE/) to report bugs. Include:

- Clear problem description
- Steps to reproduce
- Expected vs actual behavior
- Environment (OS, Java version, etc.)
- Screenshots if applicable

### Suggesting Features

Use the [feature request template](.github/ISSUE_TEMPLATE/feature_request.md). Include:

- Clear feature description
- Justification for the feature
- Possible implementation
- Usage examples

### Development Environment Setup

1. **Prerequisites:**
   - Java 11 or higher
   - Maven 3.6+
   - IDE (recommended: IntelliJ IDEA, Eclipse, VSCode)

2. **Setup:**
   ```bash
   git clone https://github.com/JacksonMiranda/GerenciadorDeFuncionario.git
   cd GerenciadorDeFuncionario
   ./mvnw clean install
   ```

3. **Run tests:**
   ```bash
   ./mvnw test
   ```

4. **Run application:**
   ```bash
   ./mvnw spring-boot:run
   ```

### Review Process

- All PRs will be reviewed by the maintainer
- Feedback will be given via PR comments
- Changes may be requested before merge
- Tests must pass before merge

### Code of Conduct

This project follows the [Contributor Covenant](CODE_OF_CONDUCT.md). Please be respectful and inclusive.