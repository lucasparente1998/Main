public class Motorista extends Pessoa {
    public Motorista(String nome, String cpf, String telefone){
        super(nome, cpf, telefone);
    }
    private int cod_motorista;
    private String cnh;
    private boolean possui_aet, status;

    public int getCod_motorista() {
        return cod_motorista;
    }

    public void setCod_motorista(int cod_motorista) {
        this.cod_motorista = cod_motorista;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public boolean isPossui_aet() {
        return possui_aet;
    }

    public void setPossui_aet(boolean possui_aet) {
        this.possui_aet = possui_aet;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
