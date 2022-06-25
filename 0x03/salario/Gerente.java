public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        double valorBonus = 0;
        if (departamento.alcancouMeta() == true){
            return ((salarioFixo * 0.20) + (departamento.getValorMeta() * 0.001));
        }else {
            return valorBonus;
        }
    }
}
