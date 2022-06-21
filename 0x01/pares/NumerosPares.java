public class NumerosPares {
    public static void main(String[] args) {
        for (int cont=0; cont <= 99; cont += 2){
            if (cont < 98){
                System.out.print(cont + ", ");
            } else {
                System.out.print(cont + "\n");
            }
        }
    }
}
