# Changelog

Todas as mudanças notáveis neste projeto serão documentadas neste arquivo.

All notable changes to this project will be documented in this file.

O formato é baseado em [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
e este projeto adere ao [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added / Adicionado
- Repository polish with professional documentation and CI/CD
- Comprehensive README with C4 architecture diagrams
- GitHub issue and PR templates (bilingual PT-BR/EN)
- CI/CD workflows with conditional Java/Node.js support
- CodeQL security analysis
- Dependabot configuration for automated dependency updates
- Release Drafter for automated release notes
- EditorConfig for consistent code formatting
- Git attributes for proper file handling
- Enhanced .gitignore with Java and Node.js support
- CODEOWNERS file for code ownership
- Community documentation (CONTRIBUTING, CODE_OF_CONDUCT, SECURITY, SUPPORT)
- MIT License
- Architecture documentation and ADR

### Changed / Modificado
- Fixed test configuration (moved from wrong package)
- Updated project structure for better organization
- Enhanced documentation with bilingual support

### Fixed / Corrigido
- Test class package mismatch that prevented proper Spring Boot test execution

## [1.0.0] - 2025-01-XX

### Added / Adicionado
- Employee management system with Spring Boot
- CRUD operations for employees
- Web interface with HTML/CSS/JavaScript
- Bootstrap styling for modern UI
- Employee operations:
  - Insert all employees
  - Remove specific employee
  - List all employees with formatted data
  - Apply 10% salary increase
  - Group employees by function
  - Find employees with birthdays in specific months
  - Find oldest employee
  - Calculate total salaries
  - List employees alphabetically
  - Calculate salaries in minimum wage units

### Technical Features / Funcionalidades Técnicas
- Java 11 with Spring Boot 2.5.4
- Spring Web for REST API
- Thymeleaf for templating (configured)
- DevTools for development
- In-memory data storage with Repository pattern
- RESTful API endpoints
- Responsive web interface
- Date and currency formatting
- Age calculation functionality

### Project Structure / Estrutura do Projeto
- Model: Pessoa (abstract), Funcionario
- Service: FuncionarioService with business logic
- Controller: FuncionarioController with REST endpoints
- Repository: FuncionarioRepository for data access
- Static assets: HTML, CSS, JavaScript files
- Maven configuration with Spring Boot parent

---

## Tipos de Mudanças / Types of Changes

- **Added / Adicionado** para novas funcionalidades / for new features
- **Changed / Modificado** para mudanças em funcionalidades existentes / for changes in existing functionality
- **Deprecated / Descontinuado** para funcionalidades que serão removidas / for soon-to-be removed features
- **Removed / Removido** para funcionalidades removidas / for now removed features
- **Fixed / Corrigido** para correções de bugs / for any bug fixes
- **Security / Segurança** em caso de vulnerabilidades / in case of vulnerabilities