package strategy;

public class CompraAVista extends EstrategiaDesconto {

    @Override
    public void aplicarDesconto() {
        venda.setValorFinal(venda.getValorFinal()*0.95);
    }
    
}
