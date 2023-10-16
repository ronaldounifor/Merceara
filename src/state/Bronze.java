package state;

import model.Comprador;

public class Bronze extends Estado {
    private final static int PONTOS = 3;

    public Bronze(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public void tratar() {
        if(comprador.getNumeroPontos() >= 500)
            comprador.setEstado(new Prata(comprador));
        else if(comprador.getNumeroPontos() < 300)
            comprador.setEstado(new Visitante(comprador));
    }

    @Override
    public int getPontos() {
        return PONTOS;
    }

    @Override
    public double getDesconto() {
        return 0.95;
    }
    
}
