public class Motorista extends Pessoa {
    public Motorista(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }
    private int cod_motorista;
    private String cnh;
    private boolean possui_aet, status;
}
