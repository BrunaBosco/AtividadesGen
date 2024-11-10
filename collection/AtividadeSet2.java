package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet2 {

	public static void main(String[] args) {
		
        Set<Integer> numeros = new HashSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha o Set com 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.println("Set preenchido: " + numeros);

        System.out.println("Digite um número inteiro para procurar no Set:");
        int numeroProcurado = scanner.nextInt();

        if (numeros.contains(numeroProcurado)) {
            System.out.println("Número " + numeroProcurado + " Encontrado!");
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        scanner.close();
    
	}
}
