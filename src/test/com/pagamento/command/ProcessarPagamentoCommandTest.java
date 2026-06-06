package test.com.pagamento.command;

import br.com.pagamento.command.ProcessarPagamentoCommand;
import br.com.pagamento.receiver.PagamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ProcessarPagamentoCommandTest {

    @Test
    void deveExecutarProcessamento() {

        PagamentoService service = new PagamentoService();

        ProcessarPagamentoCommand command =
                new ProcessarPagamentoCommand(service, 100.0);

        assertDoesNotThrow(command::executar);
    }
}
