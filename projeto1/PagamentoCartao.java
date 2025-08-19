public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(double valorPago){
		super(valorPago);
    }
    @Override
    public void autorizar(){
        System.out.println("Pagamento autorizado via: Cartão");
    }
}
