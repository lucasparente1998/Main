import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) throws IOException {

        int opcao, cod_cliente, peso, distancia, tempo_entrega, yesno;
        String nome, cpf, telefone, tipo, data_transporte;
        boolean especial;

        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        System.out.println("");
        caminhoes = ManipulaArquivo.leituraCaminhao("caminhoes.txt");
        motoristas = ManipulaArquivo.leituraMotorista("motoristas.txt");
        System.out.println("Arquivos carregados.");

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("##--            MENU           --##\n\n");
            System.out.print("|---------------------------------|\n");
            System.out.print("| Opção 1 - Novo Cliente          |\n");
            System.out.print("| Opção 2 - Novo Pedido           |\n");
            System.out.print("| Opção 3 - x                     |\n");
            System.out.print("| Opção 0 - Sair                  |\n");
            System.out.print("|---------------------------------|\n");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                        System.out.println("");
                        System.out.println("Digite o nome:");
                        nome = input.nextLine();
                        System.out.println("Digite o CPF:");
                        cpf = input.nextLine();
                        System.out.println("Digite o telefone:");
                        telefone = input.nextLine();
                        Cliente aux = new Cliente(nome, cpf, telefone);
                        clientes.add(aux);
                        System.out.println("Cliente registrado com sucesso!");
                        System.out.println("O id do cliente "+nome+" é: "+clientes.get(clientes.size()-1).getCod_cliente());
                    break;
                case 2:
                        System.out.println("");
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
                                    Carga aux_carga = new Carga(peso, distancia, tempo_entrega, tipo, data_transporte, especial);
                                    aux_carga.alocaCaminhao(aux_carga, caminhoes);

                                }
                                break;
                            }
                        }
            }


        } while (opcao != 5);




    }
}
