public class Numero {
    public static int dividir(int a, int b) {
        int divisao = 0;

        try {
            divisao = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("\n"+"Nao eh possivel dividir por zero");
        }
        finally {
            System.out.printf("%d / %d = %d", a, b, divisao);
        }
        return divisao;
    }
}