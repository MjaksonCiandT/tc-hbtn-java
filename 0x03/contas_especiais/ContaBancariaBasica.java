import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;
    private double tarifa = 10.00;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual){
        this.numeracao=numeracao;
        this.taxaJurosAnual=taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 ){
            saldo += valor;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 && saldo >= valor ){
            saldo -= valor;
        }else if(valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    public double calcularTarifaMensal(){
        double tarifaFinal;
        double tarifa = 0.10*this.saldo;
        if (tarifa<10) {
            double tarifaMensal = 0.10*this.saldo;
            tarifaFinal = tarifaMensal;
        } else {
            tarifaFinal = 10;
        }
        return tarifaFinal;
    }

    public double calcularJurosMensal(){
        double jurosMensal = getTaxaJurosAnual();
        if (this.saldo <= 0){
            jurosMensal=0;
        }
            return ((jurosMensal / 12) * this.saldo) / 100;
    }

    public void aplicarAtualizacaoMensal(){
        saldo = (this.saldo-calcularTarifaMensal())+calcularJurosMensal();
    }
}
