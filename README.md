**Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO) – PROVA 1, PERIODO 2.**

O sistema representa funcionários de uma empresa, permitindo cadastrar departamentos e cargos, criar funcionários, alterar seus dados, aplicar reajustes salariais e realizar demissões.

**Tecnologias utilizadas**
-Java 21
-NetBeans
-Execução pelo console
-Nenhum framework ou biblioteca externa foi utilizado.

**Estrutura do projeto
POO_PROVA_1/
├── src/
│   ├── Departamento.java
│   ├── Cargo.java
│   ├── Funcionario.java
│   └── TesteSistema.java
├── .gitignore
└── README.md**

**Classes**

**Departamento**
-Representa um departamento da empresa.

-Possui o atributo privado:
-nome — nome do departamento.
-Possui construtor parametrizado, getter e setter.

**Cargo**
-Representa o cargo de um funcionário.

-Possui o atributo privado:
-nome — nome do cargo.
-Possui construtor parametrizado, getter e setter.

**Funcionario**
-Representa um funcionário da empresa.
Possui os atributos:
nome
cpf
departamento
cargo
salaRio
ativo

A classe possui:
Construtor parametrizado
Construtor default
Getters e setters
Método alteRarDados
Método aplicarReajuste
Método demitir

**TesteSistema**

Classe responsável pelo método main.
Realiza os testes solicitados na avaliação
Criação do departamento Compras
Criação do departamento Vendas
Criação do cargo Comprador
Criação do cargo Vendedor
Criação de três funcionários
Impressão dos funcionrios
Alteração dos dados do terceiro funcionário
Aplicação de reajuste de 15% no primeiro funcionário
Demissão do terceiro funcionário
Impressão final de todos os funcionários

**Como executar**
1.  Baixar o projeto
Após obter o projeto, abra a pasta POO_PROVA_1 no terminal.

2. Acessar a pasta com os arquivos Java
POO_PROVA_1/src

3. Compilar os arquivos
javac *.java

4. Executar o programa
java TesteSistema


O sistema exibirá no console os dados dos funcionários e as alterações realizadas durante os testes.

Exemplo do reajuste
O primeiro funcionário possui salário inicial de R$ 2.500,00.
Após a aplicação de um reajuste de 15%:
R$ 2.875,00

Aluno **ANDRE PINTO ALVARENGA**

Turma:**2º PERIODO DO CURSO TECNICO DE INFORMATICA, ANO 2026, CEFET CAMPO BELO - MG**

**Disciplina:** Programação Orientada a Objetos (POO)

**Professor:** MSc Rodrigo de Lima Cunha

**Avaliação:** 1ª Avaliação Prática DE POO
