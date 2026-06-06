package br.com.pagamento.command;

import br.com.pagamento.receiver.PagamentoService;

public class ConsultarPagamentoCommand implements Command {

    private final PagamentoService pagamentoService;
    private final Long idPagamento;

    public ConsultarPagamentoCommand(
            PagamentoService pagamentoService,
            Long idPagamento) {

        this.pagamentoService = pagamentoService;
        this.idPagamento = idPagamento;
    }

    @Override
    public void executar() {
        pagamentoService.consultarPagamento(idPagamento);
    }
}