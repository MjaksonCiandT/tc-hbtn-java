public class Quadrado extends Retangulo{
    private double lado;

    public String toString() {
        return String.format("[Quadrado] " + lado);
    }

    public double getLado() {
        return lado;
    }

    public double setLado(double lado) {
        if(lado < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else {
            return this.lado = lado;
        }
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
