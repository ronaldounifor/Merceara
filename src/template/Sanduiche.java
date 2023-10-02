package template;

public abstract class Sanduiche {
    public void fazer() {
        pegarFatias();
        separarFatias();
        colocarIngredientes();
        fechar(); 
        preparar();
        servir();
    }

    public abstract void servir();

    public abstract void preparar();

    public abstract void colocarIngredientes();

    private void fechar() {
        System.out.println("Fechar o sanduiche");
    }

    private void separarFatias() {
        System.out.println("Abrir o sanduiche");
    }

    private void pegarFatias() {
        System.out.println("Pegar duas fatias de pão");
    }
}
