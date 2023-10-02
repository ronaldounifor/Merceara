package template;

public class MistoQuente extends Sanduiche {

    @Override
    public void servir() {
        System.out.println("Partir na diagonal");
        System.out.println("Posicionar no prato");
    }

    @Override
    public void preparar() {
        System.out.println("Coloca o sanduiche na sanduicheira");
    }

    @Override
    public void colocarIngredientes() {
        System.out.println("Colocar queijo");
        System.out.println("Colocar presunto");
    }
    
}
