package br.com.pagamento.receiver;

public class PagamentoService {

    public void processarPagamento(double valor) {
        System.out.println(
                "Pagamento de R$ " + valor + " processado com sucesso."
        );
    }

    public void estornarPagamento(double valor) {
        System.out.println(
                "Pagamento de R$ " + valor + " estornado."
        );
    }

    public void consultarPagamento(Long id) {
        System.out.println(
                "Consultando pagamento de ID: " + id
        );
    }
}