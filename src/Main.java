import model.Comprador;
import model.Produto;
import model.Venda;
import strategy.CompraAVista;
import strategy.CompreDoisLeveTres;
import strategy.PrimeiraCompra;

public class Main {
    public static void main(String[] args) {
        Comprador francisco = new Comprador(2, "Chico", 985);

        Produto tomate = new Produto(1, "Tomate", 10);
        Produto batata = new Produto(2, "Batata", 2);
        Produto ovo = new Produto(3, "Ovo de Avestruz", 200);
        
        Venda venda = new Venda(francisco);
        venda.adicionarEstrategia(new CompraAVista());
        venda.adicionarEstrategia(new PrimeiraCompra());
        venda.adicionarEstrategia(new CompreDoisLeveTres());

        venda.adicionarProduto(tomate);
        System.out.println(venda.getTotal());
        venda.adicionarProduto(ovo);
        System.out.println(venda.getTotal());
        venda.adicionarProduto(batata);
        System.out.println(venda.getTotal());
        
        venda.aplicarDesconto();
        System.out.println("TOTAL APOS ESTRATEGIAS DE DESCONTO: "+venda.getValorFinal());

        // venda.finalizarVenda();
        // System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        // System.out.println("Valor com desconto: "+venda.getTotalComDesconto());

        // Venda venda2 = new Venda(francisco);
        // venda2.adicionarProduto(ovo);
        // venda2.finalizarVenda();
        // System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        // System.out.println("Valor com desconto: "+venda2.getTotalComDesconto());

        // Venda venda3 = new Venda(francisco);
        // venda3.adicionarProduto(ovo);
        // venda3.finalizarVenda();
        // System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        // System.out.println("Valor com desconto: "+venda3.getTotalComDesconto());
        
    }
}