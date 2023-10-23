package strategy;

import model.Venda;

public abstract class EstrategiaDesconto {
    protected Venda venda;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public abstract void aplicarDesconto();
}
