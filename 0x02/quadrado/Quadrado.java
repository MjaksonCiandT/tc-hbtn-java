public class Quadrado {
    public static double area(double lado) {
        double calcArea = 0;
        if(lado > 0){
            calcArea = lado * lado;
        }else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        };
        return calcArea;
    }
}
