import java.util.ArrayList;

public class Pedido {
    private static ArrayList<PedidoCookie> listaPedido = new ArrayList<>();

    public static ArrayList<PedidoCookie> getListaPedido() {
        return listaPedido;
    }

    static public void adicionarPedidoCookie(PedidoCookie pedido) {
        listaPedido.add(pedido);
    }

    static public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedido: listaPedido){
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int excluisao = 0;
        for (int i = 0; i < listaPedido.size(); i++) {
            if (listaPedido.get(i).getSabor().equalsIgnoreCase(sabor)) {
                excluisao += listaPedido.get(i).getQuantidadeCaixas();
                listaPedido.remove(listaPedido.get(i));
            }
        }
        return excluisao;
    }
}


