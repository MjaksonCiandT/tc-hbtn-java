import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido lista){
        List<Produto> produtosPedidos =  new ArrayList<Produto>(lista.getProdutos());

        return lista.getProdutos().stream().filter(p-> p.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> lista){
        return lista.stream().max(Comparator.comparing(Produto::getPreco)).get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> lista, int precoMinimo){
        return lista.stream().filter(p-> p.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaPedidos) {
        Predicate<Produto> listaProduto = produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO);
        return listaPedidos.stream().filter(pedido -> pedido.getProdutos()
                .stream()
                .anyMatch(listaProduto)).collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .peek(produto -> {
                    if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
                        produto.setPreco(produto.getPreco()* 0.85);
                }).collect(Collectors.toList());
    }
}

