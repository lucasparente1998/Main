import java.sql.Struct;

public class Pedido {
    private int cod_pedido;
    private String data_pedido;
    private boolean status;
    private float custo_frete;

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getCusto_frete() {
        return custo_frete;
    }

    public void setCusto_frete(float custo_frete) {
        this.custo_frete = custo_frete;
    }
}
