public class Cliente extends Pessoa {
    private int cod_cliente;
    private static int count = 0;

    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
        this.cod_cliente = ++count; 
    }
    

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

   
}
