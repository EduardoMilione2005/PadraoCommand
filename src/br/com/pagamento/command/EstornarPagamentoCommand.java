package br.com.pagamento.command;

import br.com.pagamento.receiver.PagamentoService;

public class EstornarPagamentoCommand implements Command {

    private final PagamentoService pagamentoService;
    private final double valor;

    public EstornarPagamentoCommand(
            PagamentoService pagamentoService,
            double valor) {

        this.pagamentoService = pagamentoService;
        this.valor = valor;
    }

    @Override
    public void executar() {
        pagamentoService.estornarPagamento(valor);
    }
}