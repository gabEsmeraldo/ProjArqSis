public class PagamentoPix extends Pagamento{
    public PagamentoPix(double valorPago){
		super(valorPago);
    }
    @Override
    public void autorizar(){
        System.out.println("Pagamento autorizado via: Pix");
    }
}
