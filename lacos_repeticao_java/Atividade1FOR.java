package lacos_repeticao_java;

import java.util.Scanner;

public class Atividade1FOR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
		
		System.out.println("Digite 10 números:");
		
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println((i)+"º numero: ");
			int numero = scanner.nextInt();
			
			if (numero % 2 == 0) {pares++;
            } else {
                impares++;
            }
			
		}
		
		System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        scanner.close();

	}

}
