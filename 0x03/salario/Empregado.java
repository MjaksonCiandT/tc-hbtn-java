public class Empregado {
    protected double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo=salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        double valorBonus = 0;
        if (departamento.alcancouMeta(departamento.getValorMeta(), departamento.getValorAtingidoMeta()) == true){
            return valorBonus = (salarioFixo * 0.1);
        }else {
            return valorBonus;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        double bonus = 0.10;
        double salarioFixo = getSalarioFixo();
        double meta = departamento.getValorMeta();
        double valorFinal;

        if(departamento.alcancouMeta(meta, salarioFixo)) {
            valorFinal = calcularBonus(departamento) + salarioFixo;
        } else {
            valorFinal = 0 + salarioFixo;
        }
        return valorFinal;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
