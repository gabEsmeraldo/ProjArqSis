public class Produto {
    private String descricao;
    private float preco;
    Produto(String descricao, float preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    Produto(){
        this.descricao = "";
        this.preco = 0;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
