package strategy;

import model.ProdutoVenda;

public class CompreDoisLeveTres extends EstrategiaDesconto {

    @Override
    public void aplicarDesconto() {
        for (ProdutoVenda produtoVenda : venda.getProdutos())
            if(venda.temDoisOuMais(produtoVenda.getProduto()))
                venda.adicionarProduto(produtoVenda.getProduto());
    }

}
