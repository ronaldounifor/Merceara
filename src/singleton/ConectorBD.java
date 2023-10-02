package singleton;

import java.util.ArrayList;
import java.util.List;

import model.Pagamento;
import model.Produto;

public class ConectorBD {
    private static ConectorBD instancia;

    private ConectorBD() {
        // conectar com MySQL
    }

    public static synchronized ConectorBD getInstancia() {
        if(instancia == null)
            instancia = new ConectorBD();
            
        return instancia;
    }


    public List<Produto> listarProdutos() {
        //vai até o bd e cria uma lista
        return new ArrayList<>();
    }

    public void inserirProduto(Produto produto) {
        //colocar o produto no bd
    }

    // ...

    public void registrarPagamento(Pagamento pagamento) {
        //insere os dados de um pagamento no bd
    }
}
