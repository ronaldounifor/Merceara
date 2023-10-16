package state;

import model.Comprador;

public class Visitante extends Estado {
    private final static int PONTOS = 0;

    public Visitante(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public void tratar() {}

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public double getDesconto() {
        return 1;
    }
    
}
