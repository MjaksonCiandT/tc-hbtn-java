public class InteiroPositivo {

        public int valor;

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
            throw new IllegalArgumentException("Valor nao eh um valor inteiro");
        }
        this.valor=valor;
    }

    public boolean ehPrimo() {
        if (valor % 2 == 0 || valor == 1) {
            return true;

        }else {
            return false;
        }
    }
}



















/*
public class InteiroPositivo {

    public int Valor;

    public InteiroPositivo(String valor) {
    }

    public boolean getValor(int 1) {

        return false;
    }

    public Object ehPrimo() {
        int valor = 0;
        if(getValor(valor / 0 || valor / valor) )
            return true;
        else
            System.out.print("Odd Number");


        return null;
    }
}


 */