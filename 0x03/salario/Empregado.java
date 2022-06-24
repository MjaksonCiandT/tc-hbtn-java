public class Empregado {
    protected double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo=salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        double valorBonus = 0;
        if (departamento.alcancouMeta() == true){
            return valorBonus = (salarioFixo * 0.1);
        }else {
            return valorBonus;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        double valorsalarioTotal = 0;
        if (departamento.alcancouMeta() == true){
            return valorsalarioTotal = ((salarioFixo * 0.1) + salarioFixo);
        }else {
            return salarioFixo;
        }
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }
}
