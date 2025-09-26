# Política de Segurança / Security Policy

## Versões Suportadas / Supported Versions

As seguintes versões do projeto são atualmente suportadas com atualizações de segurança:

The following versions of the project are currently supported with security updates:

| Versão / Version | Suportada / Supported |
| ------- | ------------------ |
| 1.0.x   | :white_check_mark: |
| < 1.0   | :x:                |
| main/master branch | :white_check_mark: |
| develop branch | :warning: (apenas para desenvolvimento / development only) |

## Reportando Vulnerabilidades / Reporting Vulnerabilities

### Português

Se você descobriu uma vulnerabilidade de segurança neste projeto, agradecemos seu esforço responsável para divulgá-la de forma privada.

**NÃO** crie uma issue pública para vulnerabilidades de segurança.

Em vez disso, por favor:

1. **Contate-nos diretamente**: Envie um email para o mantenedor do projeto
2. **Forneça detalhes**: Inclua uma descrição detalhada da vulnerabilidade
3. **Aguarde nossa resposta**: Responderemos dentro de 48 horas
4. **Divulgação coordenada**: Trabalharemos juntos para resolver o problema antes da divulgação pública

### Informações para incluir:

- Tipo de vulnerabilidade (ex: SQL injection, XSS, etc.)
- Localização da vulnerabilidade no código
- Qualquer configuração especial necessária para reproduzir o problema
- Instruções passo a passo para reproduzir a vulnerabilidade
- Prova de conceito ou código de exploração (se possível)
- Impacto potencial da vulnerabilidade

### O que esperar:

- **Confirmação de recebimento** dentro de 48 horas
- **Avaliação inicial** dentro de 7 dias
- **Correção e teste** dentro de 30 dias (dependendo da complexidade)
- **Divulgação coordenada** após a correção estar disponível

---

### English

If you have discovered a security vulnerability in this project, we appreciate your responsible effort to disclose it privately.

**DO NOT** create a public issue for security vulnerabilities.

Instead, please:

1. **Contact us directly**: Send an email to the project maintainer
2. **Provide details**: Include a detailed description of the vulnerability
3. **Wait for our response**: We will respond within 48 hours
4. **Coordinated disclosure**: We will work together to resolve the issue before public disclosure

### Information to include:

- Type of vulnerability (e.g., SQL injection, XSS, etc.)
- Location of the vulnerability in the code
- Any special configuration required to reproduce the issue
- Step-by-step instructions to reproduce the vulnerability
- Proof of concept or exploit code (if possible)
- Potential impact of the vulnerability

### What to expect:

- **Receipt acknowledgment** within 48 hours
- **Initial assessment** within 7 days
- **Fix and testing** within 30 days (depending on complexity)
- **Coordinated disclosure** after fix is available

## Melhores Práticas de Segurança / Security Best Practices

### Para Usuários / For Users

- Mantenha o Java atualizado (versão 11 ou superior recomendada)
- Use HTTPS em produção
- Configure adequadamente as variáveis de ambiente
- Monitore logs de aplicação regularmente
- Implemente autenticação e autorização adequadas se necessário

### Para Desenvolvedores / For Developers

- Nunca faça commit de credenciais ou chaves no código
- Use variáveis de ambiente para configurações sensíveis
- Valide e sanitize todas as entradas do usuário
- Mantenha dependências atualizadas
- Execute análises de segurança regularmente
- Siga o princípio do menor privilégio

## Ferramentas de Segurança / Security Tools

Este projeto usa as seguintes ferramentas para manter a segurança:

This project uses the following tools to maintain security:

- **CodeQL**: Análise estática de código / Static code analysis
- **Dependabot**: Atualizações automáticas de dependências / Automatic dependency updates
- **Trivy**: Scanner de vulnerabilidades / Vulnerability scanner
- **Maven Dependency Check**: Verificação de dependências vulneráveis / Vulnerable dependency checking

## Contato / Contact

Para questões de segurança, entre em contato através dos issues do GitHub marcando como "security" ou diretamente com o mantenedor do projeto.

For security questions, contact us through GitHub issues marked as "security" or directly with the project maintainer.

---

**Nota importante**: Este é um projeto educacional/demonstrativo. Em ambientes de produção, implemente medidas de segurança adicionais conforme necessário.

**Important note**: This is an educational/demonstration project. In production environments, implement additional security measures as needed.