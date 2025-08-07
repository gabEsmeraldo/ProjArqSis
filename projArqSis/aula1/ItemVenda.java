public class ItemVenda extends Produto{
    private int quantidade;
    private Produto produto;
    ItemVenda(int quantidade, Produto produto){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public float getSubTotal(){
        return produto.getPreco() * getQuantidade();
    }
    public Produto getProduto(){
        return produto;
    }
}
