package collection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n***************Menu****************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("*******************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeCliente = scanner.nextLine();
                    fila.add(nomeCliente);
                    System.out.println("- " + fila);
                    System.out.println("\nCliente adicionado!");
                    
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Lista de clientes na fila: ");
                        for (String cliente : fila) {
                        	System.out.println("- " + cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        String clienteRetirado = fila.poll();
                        System.out.println("- " + fila);
                        System.out.println("O Cliente " + clienteRetirado + " foi chamado.");
                    }
                    break;

                case 0:
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
     }
}
