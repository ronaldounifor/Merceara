package model;
public abstract class Pagamento {

    private int idade = 3;

    public abstract void pagar();
    public void imprimirComprovante() {
        System.out.println("COMPROVANTE DE PAGAMENTO!");
    }
}
