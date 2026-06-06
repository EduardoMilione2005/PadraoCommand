package br.com.pagamento.command;

import br.com.pagamento.receiver.PagamentoService;

public class ProcessarPagamentoCommand implements Command {

    private final PagamentoService pagamentoService;
    private final double valor;

    public ProcessarPagamentoCommand(
            PagamentoService pagamentoService,
            double valor) {

        this.pagamentoService = pagamentoService;
        this.valor = valor;
    }

    @Override
    public void executar() {
        pagamentoService.processarPagamento(valor);
    }
}