package lacos_repeticao_java;

import java.util.Scanner;

public class Atividade1While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean continua;
		int idade;
        int menores21 = 0;
        int maiores50 = 0;
		
		while(true) {
			
			System.out.print("\nDigite uma idade: ");
            idade = scanner.nextInt();
            
            if (idade < 0) {
                break;
            }
            
            if (idade < 21) {
                menores21++;
            } else if (idade > 50) {
                maiores50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + menores21);
        System.out.println("Total de pessoas com mais de 50 anos: " + maiores50);

        scanner.close();
			
		}
	}

