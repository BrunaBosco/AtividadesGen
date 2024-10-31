package lacos_repeticao_java;

import java.util.Scanner;

public class Atividade1DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numero;
        int somaPositivos = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + somaPositivos);

        scanner.close();
    }

	}

