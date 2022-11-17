import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        Path caminho = Paths.get("caminhoes.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            System.out.println(leitura);
        } catch(Exception erro){

        }


    }
}
