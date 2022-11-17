public class Motorista extends Pessoa {
    private int cod_motorista;
    private String cnh;
    private boolean aet, status;

    public Motorista(String nome, String cpf, String telefone, String cnh, boolean aet, boolean status){
        super(nome, cpf, telefone);
        this.cnh = cnh;
        this.aet = aet;
        this.status = status;
    }
    

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

    public boolean isAet() {
        return aet;
    }

    public void setAet(boolean aet) {
        this.aet = aet;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
