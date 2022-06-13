import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        double pi = 3.1415;
        Locale.setDefault(Locale.US);
        System.out.printf("Valor de pi: %.3f", pi);
    }
}