import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> filtrar) {
        List<Produto> listaProdutos = new ArrayList<>();

        produtos.forEach(produto -> {
            if(filtrar.test(produto)) {
                listaProdutos.add(produto);
            }
        });
        return listaProdutos;
    }
}
