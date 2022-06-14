import java.util.Locale;
public class Main {
    public static void main(String[] args) { float pi = 3.14159f;
        Locale.setDefault(Locale.US);
        System.out.println(String.format("Valor de pi: %.3f", pi));}
}
