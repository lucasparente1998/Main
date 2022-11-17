public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }
    private int cod_cliente;
    private Localidade loc;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Localidade getLoc() {
        return loc;
    }

    public void setLoc(Localidade loc) {
        this.loc = loc;
    }
}
