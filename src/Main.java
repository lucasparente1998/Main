import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        File arq1 = new File("caminhoes.txt");
        Scanner input = new Scanner(System.in);
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

        int opcao, cod_cliente, peso, distancia, tempo_entrega, yesno;
        String nome, cpf, telefone, tipo, data_transporte;
        boolean especial;
        
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
      
        do {
            System.out.println("1 - Registrar Cliente.");
            System.out.println("2 - Realizar pedido.");
            System.out.println("3 - ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                        System.out.println("Digite o nome:");
                        nome = input.nextLine();
                        System.out.println("Digite o CPF:");
                        cpf = input.nextLine();
                        System.out.println("Digite o telefone:");
                        telefone = input.nextLine();
                        Cliente aux = new Cliente(nome, cpf, telefone);
                        clientes.add(aux);
                        break;
                case 2:
                        if(clientes.isEmpty()){
                            System.out.println("Não pode realizar um pedido sem ter um cliente.");
                            break;
                        } else {
                            System.out.println("Digite o Código do Cliente.");
                            cod_cliente = input.nextInt();
                            input.nextLine();
                            for (int i = 0; i < clientes.size(); i++){
                                if(cod_cliente == clientes.get(i).getCod_cliente()){
                                    System.out.println("Digite as informações da carga.");
                                    System.out.println("Digite o peso da carga");
                                    peso = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Digite a distância que a carga irá percorrer.");
                                    distancia = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Digite o tempo que a carga tem que chegar no destino.");
                                    tempo_entrega = input.nextInt();
                                    input.nextLine();
                                    System.out.println("Digite o tipo da carga.");
                                    tipo = input.nextLine();
                                    System.out.println("Digite a Data que a carga será transportada.");
                                    data_transporte = input.nextLine();
                                    System.out.println("A carga é especial? 0 = falso/1 = verdadeiro");
                                    yesno = input.nextInt();
                                    if(yesno == 1){
                                        especial = true;
                                    }
                                    else{
                                        especial = false;
                                    }
                                    Caminhao.alocaCaminhao(peso,distancia,especial,caminhoes);
                                }
                                break;
                            }
                        }
            }


        } while (opcao != 5);




    }
}
