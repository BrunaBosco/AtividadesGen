package Vetores;

import java.util.Scanner;

public class AtividadeVetor2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int vetorInteiros[] = new int [10];
		
		System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorInteiros[i] = scanner.nextInt();
        }
        
        System.out.println("\nElementos nos índices ímpares: ");
        for (int i = 1; i < vetorInteiros.length; i += 2) {
            System.out.print(vetorInteiros[i] + " ");
        }
        
        System.out.println("\n\nElementos pares:");
        for (int numero : vetorInteiros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        
        int soma = 0;
        for (int numero : vetorInteiros) {
            soma += numero;
        }
        
        double media = (double) soma / vetorInteiros.length;
        
        System.out.println("\n\nSoma de todos os elementos do vetor: " + soma);
        System.out.printf("Média de todos os elementos do vetor: %.2f\n", media);
        
        scanner.close();

	}

}
