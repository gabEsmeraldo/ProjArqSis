public class PagamentoCheque extends Pagamento{
    public PagamentoCheque(double valorPago){
		super(valorPago);
    }
    @Override
    public void autorizar(){
        System.out.println("Pagamento autorizado via: Cheque");
    }
}
