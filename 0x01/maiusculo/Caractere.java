public class Caractere {
    public static boolean EhMaiusculo(char c) {
        if (Character.toString(c).matches("[a-z?]")) {
            return false;
        }
        return true;
    }
}
