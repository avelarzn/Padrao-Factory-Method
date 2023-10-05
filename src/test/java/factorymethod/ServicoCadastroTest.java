package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCadastroTest {

    @Test
    void deveExecutarCadastro() {
        IServico servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro efetivado", servico.executar());
    }

    @Test
    void deveCancelarCadastro() {
        IServico servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro cancelado", servico.cancelar());
    }
}