package state;

import model.Comprador;

public class Prata extends Estado {
    private final static int PONTOS = 5;

    public Prata(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public void tratar() {
        if(comprador.getNumeroPontos() >= 1000)
            comprador.setEstado(new Ouro(comprador));
        else if(comprador.getNumeroPontos() < 500)
            comprador.setEstado(new Visitante(comprador));
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public double getDesconto() {
        return 0.9;
    }
    
}
