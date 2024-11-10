package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArrayList2 {

	public static void main(String[] args) {
		 
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Preencha a lista com 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        
        System.out.println("Lista preenchida: " + numeros);

        System.out.println("Digite um número inteiro para procurar na lista:");
        int numeroProcurado = scanner.nextInt();
   
        if (numeros.contains(numeroProcurado)) {
            int posicao = numeros.indexOf(numeroProcurado);
            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        scanner.close();
    }
}

	
  

