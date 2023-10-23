package strategy;

public class PrimeiraCompra extends EstrategiaDesconto {
    private static final int VALOR = 50;

    @Override
    public void aplicarDesconto() {
        // venda.setValorFinal(venda.getValorFinal() < VALOR? 0 : venda.getValorFinal() - VALOR);

        if(venda.getValorFinal() < VALOR)
            venda.setValorFinal(0);
        else
            venda.setValorFinal(venda.getValorFinal() - VALOR);
    }
    
}
