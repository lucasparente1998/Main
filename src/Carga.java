import java.util.ArrayList;

public class Carga {
    private int cod_carga, peso, distancia, tempo_entrega;
    private String tipo, data_transporte;
    private boolean especial;

    public Carga(int peso, int distancia, int tempo_entrega, String tipo, String data_transporte, boolean especial){
        this.peso = peso;
        this.distancia = distancia;
        this.tempo_entrega = tempo_entrega;
        this.tipo = tipo;
        this.data_transporte = data_transporte;
        this.especial = especial;
        
    }

    public int getCod_carga() {
        return cod_carga;
    }

    public void setCod_carga(int cod_carga) {
        this.cod_carga = cod_carga;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTempo_entrega() {
        return tempo_entrega;
    }

    public void setTempo_entrega(int tempo_entrega) {
        this.tempo_entrega = tempo_entrega;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData_transporte() {
        return data_transporte;
    }

    public void setData_transporte(String data_transporte) {
        this.data_transporte = data_transporte;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Motorista alocaMotorista(Carga aux_carga, ArrayList<Motorista> motoristas){
        Motorista aux_motorista = null;
        ArrayList<Motorista> lista_motorista = new ArrayList<Motorista>();
        for (int i = 0; i < motoristas.size(); i++){
            if (motoristas.get(i).getStatus() == true){
                if(aux_carga.getEspecial() == true){
                    if(motoristas.get(i).getAet() == true){
                        lista_motorista.add(motoristas.get(i));
                    }
                } else{
                    lista_motorista.add(motoristas.get(i));
                }
                
            }
        }
        if (lista_motorista.size() > 0){
            aux_motorista = lista_motorista.get(0);
            aux_motorista.imprimeMotorista(aux_motorista);
            aux_motorista.setStatus(false);
        }
        return aux_motorista;   
    }

    public Caminhao alocaCaminhao(Carga aux_carga, ArrayList<Caminhao> caminhoes){
        double tabela_antt = 0.0;
        ArrayList<Caminhao> caminhoes_aux = new ArrayList<Caminhao>();
        ArrayList<Double> valor_frete_aux = new ArrayList<Double>();
        ArrayList<Double> calc2_aux = new ArrayList<Double>();


        if (aux_carga.getDistancia() < 500){
            tabela_antt = 1.3;
        } else if (aux_carga.getDistancia() >= 500 && aux_carga.getDistancia() < 1000) {
            tabela_antt = 1.11;
        } else if (aux_carga.getDistancia() >= 1000 && aux_carga.getDistancia() < 1500) {
            tabela_antt = 0.97;
        } else if (aux_carga.getDistancia() >= 1500 && aux_carga.getDistancia() < 2000) {
            tabela_antt = 0.83;
        } else if (aux_carga.getDistancia() >= 2000 && aux_carga.getDistancia() < 2500) {
            tabela_antt = 0.72;
        }else{
            tabela_antt = 0.67;
        }
        
        for (int i = 0; i < caminhoes.size(); i++){
            if(caminhoes.get(i).getStatus() == true){
                if(caminhoes.get(i).getCapacidade_carga() > aux_carga.getPeso()){
                    double valor_frete = caminhoes.get(i).getQtd_eixos() * aux_carga.getDistancia() * tabela_antt;
                    double calc2 = aux_carga.getPeso() / caminhoes.get(i).getPotencia();
                    caminhoes_aux.add(caminhoes.get(i));
                    valor_frete_aux.add(valor_frete);
                    calc2_aux.add(calc2);  
                }
            }
        }
        double aux = valor_frete_aux.get(0) / calc2_aux.get(0);
        int aux_cod = caminhoes_aux.get(0).getCod_caminhao();
        for (int k = 0; k < caminhoes_aux.size(); k++){
            if(aux > (valor_frete_aux.get(k) / calc2_aux.get(k))){
                aux =  valor_frete_aux.get(k) / calc2_aux.get(k);
                aux_cod = caminhoes_aux.get(k).getCod_caminhao();
            }
        }
        double aux_valor_frete = 0;
        Caminhao aux_caminhao = null;
        for (int l = 0; l < caminhoes.size(); l++){
            if (aux_cod == caminhoes.get(l).getCod_caminhao()){
                caminhoes.get(l).setStatus(false);
                caminhoes.get(l).imprimeCaminhao(caminhoes.get(l), aux_carga);
                aux_caminhao = caminhoes.get(l);
                aux_valor_frete = valor_frete_aux.get(l);
                System.out.println("O valor do frete é : R$" + aux_valor_frete);
            }
        }
        return aux_caminhao;
    }
}
