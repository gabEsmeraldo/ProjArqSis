import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Venda {
	private Collection<ItemVenda> itemsVenda;
	private double total;
	private String dataVenda; //simplificacao
	
	private Pagamento pagamento; //simplificacao para forma de pagamento
		
	public Venda(String dataVenda){
		itemsVenda = new ArrayList<ItemVenda>();
		this.dataVenda = dataVenda;
	}
	
	public double getTotal(){
		total = 0;
		Iterator<ItemVenda> iteratorItemsVenda = this.itemsVenda.iterator();
		while  (iteratorItemsVenda.hasNext()){
			ItemVenda itemVenda = iteratorItemsVenda.next();
			total = total + itemVenda.calcularSubTotal();
		}
		return total;
	}
	
	public void criarItemVenda(int quantidade, Produto produto){
		ItemVenda itemVenda = new ItemVenda(quantidade, produto);
		this.itemsVenda.add(itemVenda);
	}
	
	
	public Collection<ItemVenda> getItemsVenda() {
		return itemsVenda;
	}

	public String getDataVenda() {
		return dataVenda;
	}
	
	public void efetuarPagamento(double valorRecebido, int metodoPagamento){
		//pagamento = new Pagamento(valorRecebido);
		switch(metodoPagamento) {
			case 1:
				pagamento = new Pagamento(valorRecebido);
				break;
			case 2:
				pagamento = new PagamentoCartao(valorRecebido);
				break;
			case 3:
				pagamento = new PagamentoPix(valorRecebido);
				break;
			case 4:
				pagamento = new PagamentoCheque(valorRecebido);
				break;
		}
		pagamento.autorizar();
	}
	
	public double getTroco(){
		return pagamento.getValorPago() - getTotal();
	}
	
}
