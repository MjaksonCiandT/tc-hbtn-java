public class Retangulo extends FormaGeometrica{
    protected double largura;
    protected double altura;

    @Override
    public double area() {
        return largura * altura;
    }

    public String toString() {
        return String.format("[Retangulo] " + largura + " / " + altura);
    }

    public double getLargura() {
        return largura;
    }
    public double setLargura(double largura) {
        if(largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else {
            return this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double setAltura(double altura) {
        if(altura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else {
            return this.altura = altura;
        }
    }
}
