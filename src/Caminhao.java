import java.util.ArrayList;

public class Caminhao {
    private int cod_caminhao, potencia, ano, qtd_eixos, capacidade_carga, tanque;
    private String placa, cor, modelo, marca;
    private double km_por_litro;
    private boolean status;

    public Caminhao(int cod_caminhao, String placa, String cor, String modelo, String marca, int potencia, int ano, int qtd_eixos, double km_por_litro, int tanque, int capacidade_carga, boolean status){
        this.cod_caminhao = cod_caminhao;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.ano = ano;
        this.qtd_eixos = qtd_eixos;
        this.km_por_litro = km_por_litro;
        this.tanque = tanque;
        this.capacidade_carga = capacidade_carga;
        this.status = status;
    }
    public int getCod_caminhao() {
        return cod_caminhao;
    }

    public void setCod_caminhao(int cod_caminhao) {
        this.cod_caminhao = cod_caminhao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtd_eixos() {
        return qtd_eixos;
    }

    public void setQtd_eixos(int qtd_eixos) {
        this.qtd_eixos = qtd_eixos;
    }

    public int getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(int capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm_por_litro() {
        return km_por_litro;
    }

    public void setKm_por_litro(float km_por_litro) {
        this.km_por_litro = km_por_litro;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    public static void alocaCaminhao(int peso, int distancia, boolean especial, ArrayList caminhoes){
        double tabela_antt = 0.0;

        if (distancia < 500){
            tabela_antt = 1.3;
        } else if (distancia >= 500 && distancia < 1000) {
            tabela_antt = 1.11;
        } else if (distancia >= 1000 && distancia < 1500) {
            tabela_antt = 0.97;
        } else if (distancia >= 1500 && distancia < 2000) {
            tabela_antt = 0.83;
        } else if (distancia >= 2000 && distancia < 2500) {
            tabela_antt = 0.72;
        }else{
            tabela_antt = 0.67;
        }
        double calc = qtd_eixos * distancia * tabela_antt;
        double calc2 = potencia * km_litro / tanque;


    }
}
