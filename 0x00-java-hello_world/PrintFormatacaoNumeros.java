import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale.setDefault(Locale.US);
        System.out.printf("Valor: R$ %,3.2f%nTaxa: %.2f%%", valor, taxa);
    }
}
