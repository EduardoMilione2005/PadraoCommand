# Sistema de Pagamento - Padrão Command

## Descrição

Este projeto demonstra a implementação do padrão de projeto comportamental **Command (GoF)** utilizando o contexto de um Sistema de Pagamento.

O padrão Command encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes operações, registrar solicitações e desacoplar quem faz a requisição de quem executa a ação.

---

## Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── br/com/pagamento/
│
│           ├── command/
│           │   ├── Command.java
│           │   ├── ProcessarPagamentoCommand.java
│           │   ├── EstornarPagamentoCommand.java
│           │   └── ConsultarPagamentoCommand.java
│           │
│           ├── invoker/
│           │   └── PagamentoInvoker.java
│           │
│           ├── receiver/
│           │   └── PagamentoService.java
│           │
│           ├── model/
│           │   └── Pagamento.java
│           │
│           └── Main.java
│
└── test/
    └── java/
        └── br/com/pagamento/command/
            ├── ProcessarPagamentoCommandTest.java
            ├── EstornarPagamentoCommandTest.java
            └── ConsultarPagamentoCommandTest.java
```

---

## Participantes do Padrão Command

### Command

Interface que define a operação comum para todos os comandos.

```java
public interface Command {
    void executar();
}
```

### Concrete Commands

Implementam a interface Command e encapsulam uma ação específica.

- ProcessarPagamentoCommand
- EstornarPagamentoCommand
- ConsultarPagamentoCommand

### Receiver

Classe responsável por executar a lógica real do negócio.

```java
PagamentoService
```

### Invoker

Responsável por disparar a execução dos comandos.

```java
PagamentoInvoker
```

### Client

Classe responsável por criar e configurar os comandos.

```java
Main
```

---

## Funcionalidades

### Processar Pagamento

Realiza o processamento de um pagamento.

Exemplo:

```java
new ProcessarPagamentoCommand(service, 250.00);
```

### Consultar Pagamento

Consulta um pagamento pelo identificador.

Exemplo:

```java
new ConsultarPagamentoCommand(service, 1L);
```

### Estornar Pagamento

Realiza o estorno de um pagamento.

Exemplo:

```java
new EstornarPagamentoCommand(service, 250.00);
```

---

## Execução

Ao executar a classe Main:

```java
public static void main(String[] args) {

    PagamentoService service = new PagamentoService();
    PagamentoInvoker invoker = new PagamentoInvoker();

    invoker.executar(
        new ProcessarPagamentoCommand(service, 250.00));

    invoker.executar(
        new ConsultarPagamentoCommand(service, 1L));

    invoker.executar(
        new EstornarPagamentoCommand(service, 250.00));
}
```

Saída esperada:

```
Pagamento de R$ 250.0 processado com sucesso.
Consultando pagamento de ID: 1
Pagamento de R$ 250.0 estornado.
```

---

## Testes

O projeto contém testes unitários para cada comando:

- ProcessarPagamentoCommandTest
- EstornarPagamentoCommandTest
- ConsultarPagamentoCommandTest

Executar:

```bash
mvn test
```

---

## Benefícios do Padrão Command

- Baixo acoplamento.
- Facilidade para adicionar novos comandos.
- Melhor organização das responsabilidades.
- Possibilidade de implementar histórico de operações.
- Possibilidade de implementar desfazer/refazer (Undo/Redo).

---

## Autor

Projeto acadêmico desenvolvido para demonstração do padrão de projeto Command (GoF) utilizando um Sistema de Pagamento.
