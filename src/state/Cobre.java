package state;

import model.Comprador;

public class Cobre extends Estado {
    private final static int PONTOS = 1;

    public Cobre(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public void tratar() {
        if(comprador.getNumeroPontos() > 300)
            comprador.setEstado(new Bronze(comprador));
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public double getDesconto() {
        return 1;
    }
    
}
