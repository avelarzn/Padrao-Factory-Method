package factorymethod;

public class ServicoCarrinho implements IServico{
    public String executar() {
        return "Adicionado ao carrinho";
    }

    public String cancelar(){
        return "Removido do carrinho";
    }
}