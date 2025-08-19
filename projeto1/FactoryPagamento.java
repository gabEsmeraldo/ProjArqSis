public class FactoryPagamento {
    public FactoryPagamento(){
    }
    public Pagamento getInstance(int metodoPagamento, double valorRecebido){
        Pagamento pagamento;
        switch(metodoPagamento) {
			default:
				pagamento = new Pagamento(valorRecebido);
				break;
			case 1:
				pagamento = new PagamentoCartao(valorRecebido);
				break;
			case 2:
				pagamento = new PagamentoPix(valorRecebido);
				break;
			case 3:
				pagamento = new PagamentoCheque(valorRecebido);
				break;
		}
        return pagamento;
    }
}
