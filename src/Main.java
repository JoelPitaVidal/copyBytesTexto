import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        lecturaEscritura.leerArquivo("C:\\inteliji\\copybytestexto\\texto1.txt");
        lecturaEscritura.escribirNoArquivo("C:\\inteliji\\copybytestexto\\texto1.txt","C:\\inteliji\\copybytestexto\\texto2.txt");
    }
}