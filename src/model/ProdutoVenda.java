package model;

public class ProdutoVenda {
    private Produto produto;
    private int quantidade;
    
    public ProdutoVenda(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }
    
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
