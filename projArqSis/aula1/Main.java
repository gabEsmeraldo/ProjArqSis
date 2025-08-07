public class Main {
    public static void main(String[] args) {
        Produto teste = new Produto("Garrafas", 10);
        ItemVenda Carrinho1 = new ItemVenda(10, teste);
        Produto teste2 = new Produto("Canetas", 15);
        ItemVenda Carrinho2 = new ItemVenda(10, teste2);
        Venda VendaA = new Venda();
        VendaA.addItemVenda(Carrinho1);
        VendaA.addItemVenda(Carrinho2);
        System.out.println(VendaA.getTotal());
    }
}
