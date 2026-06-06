package br.com.pagamento.invoker;

import br.com.pagamento.command.Command;

public class PagamentoInvoker {

    public void executar(Command command) {
        command.executar();
    }
}