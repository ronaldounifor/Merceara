package model;

import singleton.ConectorBD;

public class PagamentoBoleto extends Pagamento{
    @Override
    public void pagar() {
        ConectorBD conectorBD = ConectorBD.getInstancia();
        conectorBD.registrarPagamento(this);
    }

    @Override
    public void imprimirComprovante() {
        System.out.println("COMPROVANTE BOLETO!!!!");
    }
}
