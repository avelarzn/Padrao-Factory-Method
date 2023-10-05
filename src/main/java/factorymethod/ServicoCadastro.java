package factorymethod;

public class ServicoCadastro implements IServico{
    public String executar() {
        return "Cadastro efetivado";
    }

    public String cancelar(){
        return "Cadastro cancelado";
    }
}
