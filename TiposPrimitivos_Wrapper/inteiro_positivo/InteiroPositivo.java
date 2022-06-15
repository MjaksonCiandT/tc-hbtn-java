public class InteiroPositivo {

    private int valor;

    public InteiroPositivo(String valor) {
        int inteiro = Integer.valueOf(valor);
        this.setValor(inteiro);
    }

    public InteiroPositivo(int valor) {
        this.setValor(valor);
    }

    public int getValor() {
        return this.valor;
    }
    public void setValor(int valor) {
        if (valor < 0 ){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor=valor;
    }

    public  boolean ehPrimo(){
        if (valor % 2 == 0 || valor ==1)
            return false;
        return true;
    }
}
