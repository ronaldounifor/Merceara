package state;

import model.Comprador;

public abstract class Estado {
    protected Comprador comprador;

    public abstract void tratar();
    public abstract int getPontos();
    public abstract double getDesconto();
}
