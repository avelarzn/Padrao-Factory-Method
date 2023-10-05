package factorymethod;

public class ServicoLogin implements IServico{
    public String executar() {
        return "Login efetivado";
    }

    public String cancelar(){
        return "Login cancelado";
    }
}
