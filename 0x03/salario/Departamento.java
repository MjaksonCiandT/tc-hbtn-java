public class Departamento {
    private double valorMeta;
    private double valorAtingidoMeta;

    public Departamento (double valorMeta, double valorAtingidoMeta){
        this.valorMeta=valorMeta;
        this.valorAtingidoMeta=valorAtingidoMeta;
    }

    public boolean alcancouMeta(double valorMeta, double valorAtingidoMeta){
        if (getValorAtingidoMeta() >= getValorMeta()){
            return true;
        }else {
            return false;
        }
    }
    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }
}
