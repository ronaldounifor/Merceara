package adapter;

public class AdaptadorHexagono extends Forma {

    FormaHexagonal forma = new FormaHexagonal();

    @Override
    public void calcularArea() {
        forma.gerarValorArea();
    }
    
}
