package test.com.pagamento.command;

import br.com.pagamento.command.ConsultarPagamentoCommand;
import br.com.pagamento.receiver.PagamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ConsultarPagamentoCommandTest {

    @Test
    void deveExecutarConsulta() {

        PagamentoService service = new PagamentoService();

        ConsultarPagamentoCommand command =
                new ConsultarPagamentoCommand(service, 1L);

        assertDoesNotThrow(command::executar);
    }
}
