public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }
    private int cod_cliente;
    private Localidade loc;

}
