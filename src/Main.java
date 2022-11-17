import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File arq1 = new File("caminhoes.txt");
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        try {
            try(BufferedReader br  = new BufferedReader(new FileReader(arq1))){
                String line;
                while ((line = br.readLine()) != null){
                    String[] lista = line.split("\\s+");
                    Caminhao caminhao = new Caminhao(Integer.parseInt(lista[0]), lista[1], lista[2], lista[3], lista[4], Integer.parseInt(lista[5]), Integer.parseInt(lista[6]), Integer.parseInt(lista[7]), Double.parseDouble(lista[8]),Integer.parseInt(lista[9]),Integer.parseInt(lista[10]), Boolean.parseBoolean(lista[11]));
                    caminhoes.add(caminhao);
                }
            }
        } catch(Exception erro){

        }
        for (int i = 0; i < caminhoes.size(); i++){
            System.out.println(caminhoes.get(i).getPlaca());
            System.out.println(caminhoes.get(i).getKm_por_litro());
            System.out.println(caminhoes.get(i).getCapacidade_carga());
            System.out.println(caminhoes.get(i).getStatus());

            
        }
        File arq2 = new File("motoristas.txt");
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
        try {
            try(BufferedReader bb  = new BufferedReader(new FileReader(arq2))){
                String line;
                while ((line = bb.readLine()) != null){
                    String[] lista = line.split("\\s+");
                    Motorista motorista = new Motorista(lista[0], lista[1], lista[2], lista[3], Boolean.parseBoolean(lista[4]), Boolean.parseBoolean(lista[5]));
                    motoristas.add(motorista);
                }
            }
        } catch(Exception erro){

        }


    }
}
