public class Carga {
    private int cod_carga, peso, ditância, tempo_entrega;
    private String tipo, data_transporte;

    private boolean especial;

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

    public int getDitância() {
        return ditância;
    }

    public void setDitância(int ditância) {
        this.ditância = ditância;
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

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
