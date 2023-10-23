package model;

import java.util.ArrayList;
import java.util.List;

import strategy.EstrategiaDesconto;

public class Venda {

    private double valorFinal;
    private Comprador comprador;
    private List<ProdutoVenda> produtos;
    private List<EstrategiaDesconto> estrategias;
    
    public Venda() {
        produtos = new ArrayList<>();
        estrategias = new ArrayList<>();

        
    }
    
    public Venda(Comprador comprador) {
        this.comprador = comprador;
        produtos = new ArrayList<>();
        estrategias = new ArrayList<>();
    }

    public void adicionarEstrategia(EstrategiaDesconto estrategia) {
        estrategia.setVenda(this);
        estrategias.add(estrategia);
    }

    public void aplicarDesconto() {
        valorFinal = getTotal();
        for (EstrategiaDesconto estrategia : estrategias)
            estrategia.aplicarDesconto();
    }

    public void finalizarVenda() {
        comprador.pontuar();
    }

    public void adicionarProduto(Produto produto) {
        for (ProdutoVenda produtoVenda : produtos)
            if(produto.getId() == produtoVenda.getProduto().getId()) {
                produtoVenda.setQuantidade(produtoVenda.getQuantidade() + 1);
                return;
            }

        produtos.add(new ProdutoVenda(produto));
    }

    public double getTotal() {
        double total = 0;
        for (ProdutoVenda produto : produtos)
            total += produto.getProduto().getPreco() * produto.getQuantidade();
        
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

    public List<ProdutoVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoVenda> produtos) {
        this.produtos = produtos;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public boolean temDoisOuMais(Produto produto) {
        for (ProdutoVenda produtoVenda : produtos)
            if(produto.getId() == produtoVenda.getProduto().getId()
                                && produtoVenda.getQuantidade() >= 2)
                return true;

        return false;
    }
}
