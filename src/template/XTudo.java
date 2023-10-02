package template;

public class XTudo extends Sanduiche {

    @Override
    public void servir() {
        System.out.println("Colocar um palitinho pra segurar");
        System.out.println("Colocar dentro de um saco");
    }

    @Override
    public void preparar() {
        System.out.println("Usar a chapa");
        System.out.println("Usar a chapa para o outro lado do sanduiche");
    }

    @Override
    public void colocarIngredientes() {
        System.out.println("Colocar ovos");
        System.out.println("Colocar bacon");
        System.out.println("Colocar azeitona");
        System.out.println("Colocar milho");
        System.out.println("Colocar alface");
        System.out.println("Colocar tomate");
        System.out.println("Colocar cebola");
        System.out.println("Colocar queijo");
    }
    
}
