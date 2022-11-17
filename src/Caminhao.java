import java.io.File;
import java.io.PrintStream;
public class Caminhao {
    private int cod_caminhao, potencia, ano, qtd_eixos, capacidade_carga, tanque;
    private String placa, cor, modelo, marca;
    private float km_por_litro;

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

    public float getKm_por_litro() {
        return km_por_litro;
    }

    public void setKm_por_litro(float km_por_litro) {
        this.km_por_litro = km_por_litro;
    }
}
