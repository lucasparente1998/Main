import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int cod_pedido;
    private Date data_pedido;
    private boolean status;
    private static int count = 0;
    private Carga carga;
    private Caminhao caminhao;
    private Motorista motorista;

    public Pedido(boolean status, Carga carga){
        this.data_pedido = new Date();
        this.status = status;
        this.cod_pedido = count++;
        this.carga = carga;
        this.caminhao = null;
        this.motorista = null;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCarga(Carga carga){
        this.carga = carga;
    }

    public Carga getCarga(){
        return carga;
    }

    public void setCaminhao(Caminhao caminhao){
        this.caminhao = caminhao;
    }

    public Caminhao getCaminhao(){
        return caminhao;
    }

    public void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }

    public Motorista getMotorista(){
        return motorista;
    }


    public void pedido(Pedido aux_pedido, ArrayList<Motorista> motoristas, ArrayList<Caminhao> caminhoes){
        aux_pedido.setMotorista(carga.alocaMotorista(carga, motoristas));
        aux_pedido.setCaminhao(carga.alocaCaminhao(carga, caminhoes)); 
        System.out.println("O codigo de seu pedido é:" + aux_pedido.getCod_pedido());
        System.out.println("A data que foi realizada seu pedido é :" + aux_pedido.getData_pedido());
    }

    public void recusarPedido(Pedido aux_pedido, ArrayList<Motorista> motoristas, ArrayList<Caminhao> caminhoes){
        for(int j = 0; j < caminhoes.size(); j++){
            if (aux_pedido.getCaminhao().getCod_caminhao() == caminhoes.get(j).getCod_caminhao()){
                caminhoes.get(j).setStatus(true);
            }
        }
        
        for (int m = 0; m < motoristas.size(); m++){
            if (aux_pedido.getMotorista().getCod_motorista() == motoristas.get(m).getCod_motorista()){
                motoristas.get(m).setStatus(true);
            }
        }
    }
}
