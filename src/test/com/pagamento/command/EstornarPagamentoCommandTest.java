package test.com.pagamento.command;

import br.com.pagamento.command.EstornarPagamentoCommand;
import br.com.pagamento.receiver.PagamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EstornarPagamentoCommandTest {

    @Test
    void deveExecutarEstorno() {

        PagamentoService service = new PagamentoService();

        EstornarPagamentoCommand command =
                new EstornarPagamentoCommand(service, 100.0);

        assertDoesNotThrow(command::executar);
    }
}