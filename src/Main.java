import java.util.ArrayList;
import java.util.List;

import adapter.AdaptadorHexagono;
import adapter.Circulo;
import adapter.Forma;
import adapter.FormaHexagonal;
import adapter.Triangulo;
import template.MistoQuente;
import template.Sanduiche;
import template.XTudo;

public class Main {
    public static void main(String[] args) {

        // Uso do template method
        // Sanduiche sanduiche = new XTudo();
        // sanduiche.fazer();

        // Uso do adapter

        List<Forma> formasGeometricas = new ArrayList<>();

        formasGeometricas.add(new Circulo());
        formasGeometricas.add(new Triangulo());
        formasGeometricas.add(new AdaptadorHexagono());

        for (Forma forma : formasGeometricas)
            forma.calcularArea();

    }
}