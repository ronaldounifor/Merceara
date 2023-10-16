package state;

import model.Comprador;

public class Ouro extends Estado {
    private final static int PONTOS = 10;

    public Ouro(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public void tratar() {
        if(comprador.getNumeroPontos() < 1000)
            comprador.setEstado(new Visitante(comprador));
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public double getDesconto() {
        return 0.8;
    }
    
}
