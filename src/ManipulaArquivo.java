import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipulaArquivo {

    public static ArrayList<Caminhao> leituraCaminhao(String path) throws IOException {
        File arq1 = new File(path);
        Scanner input = new Scanner(System.in);
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String line;
        while ((line = buffRead.readLine()) != null) {
            String[] lista = line.split("\\s+");
            Caminhao caminhao = new Caminhao(Integer.parseInt(lista[0]), lista[1], lista[2], lista[3], lista[4], Integer.parseInt(lista[5]), Integer.parseInt(lista[6]), Integer.parseInt(lista[7]), Double.parseDouble(lista[8]), Integer.parseInt(lista[9]), Integer.parseInt(lista[10]), Boolean.parseBoolean(lista[11]));
            caminhoes.add(caminhao);

        }
        buffRead.close();
        return caminhoes;
    }
    public static ArrayList<Motorista> leituraMotorista(String path) throws IOException {
        File arq2 = new File(path);
        Scanner input = new Scanner(System.in);
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String line;
        while ((line = buffRead.readLine()) != null) {
            String[] lista = line.split("\\s+");
            Motorista motorista = new Motorista(lista[0], lista[1], lista[2], lista[3], Boolean.parseBoolean(lista[4]), Boolean.parseBoolean(lista[5]));
            motoristas.add(motorista);
        }
        buffRead.close();
        return motoristas;
    }
}