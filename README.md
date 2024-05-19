# TDD - Test-Driven Development
Test-Driven Development (TDD) é uma abordagem de desenvolvimento de software onde os testes são escritos antes do código de produção. O processo TDD segue três etapas 

- **Red:** Escreva um teste que falha.
- **Green:** Escreva o código mínimo necessário para passar o teste.
- **Refactor:** Refatore o código para melhorar sua estrutura sem alterar seu comportamento.
 
## Benefícios do TDD
- **Qualidade do Código:** TDD força o desenvolvedor a considerar os requisitos antes de escrever o código, resultando em um código mais bem pensado e com menos bugs.
- **Feedback Rápido:** Os testes automatizados fornecem feedback imediato sobre a funcionalidade do código, facilitando a detecção e correção de erros.
- **Confiança nas Mudanças:** Com uma suíte de testes abrangente, os desenvolvedores podem refatorar e melhorar o código com a confiança de que as mudanças não introduzirão novos bugs.
- **Documentação:** Os testes servem como documentação viva do código, explicando como ele deve se comportar em diferentes cenários.
- **Desenvolvimento Orientado a Testes:** Promove uma abordagem disciplinada de desenvolvimento, onde cada funcionalidade é testada e validada antes de ser implementada.

## Exemplo de TDD com Tela de Login

Neste projeto, aplicamos TDD para criar uma tela de login em Java. Primeiro, escrevemos testes unitários que verificam diferentes cenários de login (credenciais inválidas, válidas, campos vazios). Em seguida, implementamos a lógica de autenticação para passar esses testes, seguindo o ciclo Red-Green-Refactor.

## Ferramentas Utilizadas ⚙️

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit&logoColor=white)