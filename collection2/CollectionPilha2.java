package collection2;

import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha2 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*******************************");
            System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("*******************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeLivro = scanner.nextLine();
                    pilha.push(nomeLivro);
                    for (String livro : pilha) {
                        System.out.println("- " + livro); 
                    }                    
                    System.out.println("Livro adicionado!");
                    
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } 
                        for (String livro : pilha) {
                            System.out.println("- " + livro); 
                        }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("Um livro foi retirado da Pilha!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

}