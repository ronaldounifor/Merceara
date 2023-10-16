import model.Comprador;
import model.Produto;
import model.Venda;

public class Main {
    public static void main(String[] args) {
        Comprador francisco = new Comprador(2, "Chico", 985);

        Produto tomate = new Produto(1, "Tomate", 10);
        Produto batata = new Produto(2, "Batata", 2);
        Produto ovo = new Produto(3, "Ovo de Avestruz", 200);
        
        Venda venda1 = new Venda(francisco);
        venda1.adicionarProduto(ovo);
        venda1.finalizarVenda();
        System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        System.out.println("Valor com desconto: "+venda1.getTotalComDesconto());

        Venda venda2 = new Venda(francisco);
        venda2.adicionarProduto(ovo);
        venda2.finalizarVenda();
        System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        System.out.println("Valor com desconto: "+venda2.getTotalComDesconto());

        Venda venda3 = new Venda(francisco);
        venda3.adicionarProduto(ovo);
        venda3.finalizarVenda();
        System.out.println("Quantidade atual de pontos: "+francisco.getNumeroPontos());
        System.out.println("Valor com desconto: "+venda3.getTotalComDesconto());
        
    }
}