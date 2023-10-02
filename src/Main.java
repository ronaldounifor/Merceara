import composite.ArquivoPDF;
import composite.ArquivoPNG;
import composite.ArquivoTexto;
import composite.Pasta;
import singleton.ConectorBD;

public class Main {
    public static void main(String[] args) {

        // Uso do singleton:
        // ConectorBD conectorBD = ConectorBD.getInstancia();

        // Uso do composite:
        ArquivoPDF provaAV1 = new ArquivoPDF();
        ArquivoTexto anotacoes = new ArquivoTexto();
        ArquivoPNG fotoAula = new ArquivoPNG();

        Pasta pastaPAS = new Pasta();
        pastaPAS.adicionarArquivo(provaAV1);
        pastaPAS.adicionarArquivo(anotacoes);
        pastaPAS.adicionarArquivo(fotoAula);

        Pasta estudosUNIFOR = new Pasta();
        estudosUNIFOR.adicionarArquivo(pastaPAS);

    }
}