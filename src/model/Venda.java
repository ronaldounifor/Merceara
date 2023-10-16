package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Comprador comprador;
    private List<Produto> produtos;
    
    public Venda() {
        produtos = new ArrayList<>();
        
    }
    
    public Venda(Comprador comprador) {
        this.comprador = comprador;
        produtos = new ArrayList<>();
    }

    public void finalizarVenda() {
        comprador.pontuar();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double getTotal() {
        double total = 0;
        for (Produto produto : produtos)
            total += produto.getPreco();
        
        return total;
    }

    public double getTotalComDesconto() {  
        return getTotal() * comprador.getEstado().getDesconto();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
