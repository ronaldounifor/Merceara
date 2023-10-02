// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoBoleto();
        PagamentoBoleto pagamento2 = new PagamentoBoleto();
        Pagamento pagamento3 = new PagamentoCC();
        PagamentoCC pagamento4 = new PagamentoCC();

        registrarPagamento(pagamento1);
        registrarPagamento(pagamento2);

        pagamento1.imprimirComprovante();
        pagamento2.imprimirComprovante();
        pagamento3.imprimirComprovante();
        pagamento4.imprimirComprovante();
    }

    public static void registrarPagamento(Pagamento pagamento) {

    }
}