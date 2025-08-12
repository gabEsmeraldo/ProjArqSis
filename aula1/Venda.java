import java.util.ArrayList;
public class Venda{
    ArrayList<ItemVenda> itens = new ArrayList<>();
    private float totalVenda;
    Venda(){
        totalVenda = 0;
    }
    public float getTotal(){
        for (ItemVenda itemVenda : itens) {
            totalVenda += itemVenda.getSubTotal();
        }
        return totalVenda;
    }
    public void addItemVenda(ItemVenda item){
        itens.add(item);
    }
    public void removeItemVenda(ItemVenda item){
        itens.remove(item);
    }
}