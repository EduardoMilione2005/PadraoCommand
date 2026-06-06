package br.com.pagamento;

import br.com.pagamento.command.ConsultarPagamentoCommand;
import br.com.pagamento.command.EstornarPagamentoCommand;
import br.com.pagamento.command.ProcessarPagamentoCommand;
import br.com.pagamento.invoker.PagamentoInvoker;
import br.com.pagamento.receiver.PagamentoService;

public class Main {

    public static void main(String[] args) {

        PagamentoService service = new PagamentoService();
        PagamentoInvoker invoker = new PagamentoInvoker();

        ProcessarPagamentoCommand processar =
                new ProcessarPagamentoCommand(service, 250.00);

        ConsultarPagamentoCommand consultar =
                new ConsultarPagamentoCommand(service, 1L);

        EstornarPagamentoCommand estornar =
                new EstornarPagamentoCommand(service, 250.00);

        invoker.executar(processar);
        invoker.executar(consultar);
        invoker.executar(estornar);
    }
}