public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    protected double calcularBonus(Departamento departamento){
        double valorBonus = 0;
        if (departamento.alcancouMeta() == true){
            return ((salarioFixo * 0.2) + (departamento.getValorAtingidoMeta() * 0.001));
        }else {
            return valorBonus;
        }
    }

    double calcularSalarioTotal(Departamento departamento){
        double valorsalarioTotal = 0;
        if (departamento.alcancouMeta() == true){
            return ((salarioFixo * 0.2) + (departamento.getValorAtingidoMeta() * 0.001) + salarioFixo);
        }else {
            return salarioFixo;
        }
    }
}
