package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLoginTest {
    @Test
    void deveExecutarLogin() {
        IServico servico = ServicoFactory.obterServico("Login");
        assertEquals("Login efetivado", servico.executar());
    }

    @Test
    void deveCancelarLogin() {
        IServico servico = ServicoFactory.obterServico("Login");
        assertEquals("Login cancelado", servico.cancelar());
    }
}