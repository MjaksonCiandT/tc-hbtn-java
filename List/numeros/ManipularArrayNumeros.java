import java.util.List;

public class ManipularArrayNumeros {
    private static int numeros;

    public static int buscarPosicaoNumero(List<Integer>  lista, int numeros){
        return lista.indexOf(numeros);
    }
    public static void adicionarNumero(List<Integer> lista, int numero) throws IllegalArgumentException{
            int listInteiros = buscarPosicaoNumero(lista, numero);
            if(listInteiros < 0){
                lista.add(numero);
            }else {
                throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int numero) throws IllegalArgumentException {
        int listInteiros = buscarPosicaoNumero(lista, numero);
        if(listInteiros != -1){
            lista.remove(Integer.valueOf(numero));
        }else
            throw new IllegalArgumentException("Numero nao encontrado na lista");
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        int listInteiros = buscarPosicaoNumero(lista, numeroSubstituir);
        if(listInteiros < 0){
            lista.add(numeroSubstituto);
        }else{
            lista.set(listInteiros, numeroSubstituto);
        }
    }
}
