public class Numero {
    public static int dividir(int a, int b) {
        int divisao = 0;

        try {
            divisao = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        }
        finally {
            System.out.print("%d / %d = %d \n", a, b, divisao);
        }
        return divisao;
    }
}
