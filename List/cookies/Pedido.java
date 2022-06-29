import java.util.ArrayList;

public class Pedido {
    public static ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public static ArrayList<PedidoCookie> getListaPedido() {
        return cookies;
    }

    static public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
    }

    static public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie pedido: cookies){
            total += pedido.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int excluisao = 0;
        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getSabor().equalsIgnoreCase(sabor)) {
                excluisao += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(cookies.get(i));
            }
        }
        return excluisao;
    }
}
