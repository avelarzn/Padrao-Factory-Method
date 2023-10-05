package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCarrinhoTest {

    @Test
    void deveAdicionarCarrinho() {
        IServico servico = ServicoFactory.obterServico("Carrinho");
        assertEquals("Adicionado ao carrinho", servico.executar());
    }

    @Test
    void deveRemoverCarrinho() {
        IServico servico = ServicoFactory.obterServico("Carrinho");
        assertEquals("Removido do carrinho", servico.cancelar());
    }
}