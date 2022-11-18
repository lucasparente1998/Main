import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



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
            System.out.print("| Opção 3 - Caminhões disponiveis |\n");
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
                        System.out.println("\n");
                    break;
                case 2:
                        System.out.println("");
                        if(clientes.isEmpty()){
                            System.out.println("Não pode realizar um pedido sem ter um cliente.\n");
                            break;
                        } else {
                            System.out.println("Digite o Código do Cliente:");
                            cod_cliente = input.nextInt();
                            input.nextLine();
                            System.out.println("\n");
                            for (int i = 0; i < clientes.size(); i++){
                                if(cod_cliente == clientes.get(i).getCod_cliente()){
                                    System.out.println("Digite as informações da carga.");
                                    System.out.println("Digite o peso da carga em quilos: ");
                                    peso = input.nextInt();
                                    input.nextLine();
                                    System.out.println("\nDigite a distância que a carga irá percorrer em quilômetros:");
                                    distancia = input.nextInt();
                                    input.nextLine();
                                    System.out.println("\nDigite o tempo que a carga tem que chegar no destino em minutos:");
                                    tempo_entrega = input.nextInt();
                                    input.nextLine();
                                    System.out.println("\nDigite o tipo da carga (Verduras, carga viva, eletrodomesticos):");
                                    tipo = input.nextLine();
                                    System.out.println("\nDigite a Data que a carga será transportada (XX/XX/XX):");
                                    data_transporte = input.nextLine();
                                    System.out.println("\nA carga é especial? 0 = falso/1 = verdadeiro");
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
                                
                            }
                        }
                        break;
                case 3:
                        System.out.println("\n\nLista de caminhões disponiveis:\n");
                        for(int j = 0; j < caminhoes.size(); j++){
                            if(caminhoes.get(j).getStatus() == true){
                                System.out.print(caminhoes.get(j).getCod_caminhao() + " - ");
                                System.out.print(caminhoes.get(j).getMarca() + " ");
                                System.out.print(caminhoes.get(j).getModelo() + " ");
                                System.out.println("com a placa " + caminhoes.get(j).getPlaca());    
                            }
                        }
                        System.out.println("\n\n");
                        break;
            }


        } while (opcao != 0);
        



    }
}
