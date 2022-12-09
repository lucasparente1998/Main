public class Motorista extends Pessoa {
    private int cod_motorista;
    private String cnh;
    private boolean aet, status;

    public Motorista(int cod_motorista, String nome, String cpf, String telefone, String cnh, boolean aet, boolean status){
        super(nome, cpf, telefone);
        this.cnh = cnh;
        this.aet = aet;
        this.status = status;
        this.cod_motorista = cod_motorista;
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

    public boolean getAet() {
        return aet;
    }

    public void setAet(boolean aet) {
        this.aet = aet;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void imprimeMotorista(Motorista motorista){
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Cpf: " + motorista.getCpf());
        System.out.println("Codigo do motorista" + motorista.getCod_motorista());
        System.out.println("Possui Aet: " + motorista.getAet());
    }
}
