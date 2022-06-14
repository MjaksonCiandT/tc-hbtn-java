import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale.setDefault(Locale.US);
        System.out.println("Valor: R$ 7,654.32");
        System.out.println("Taxa: 0.25%");
    }
}
