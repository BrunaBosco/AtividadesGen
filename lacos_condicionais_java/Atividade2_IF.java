package lacos_condicionais_java;

import java.util.Scanner;

public class Atividade2_IF {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		int Numero;
		
		System.out.println("Digite um número: ");
        Numero = escrever.nextInt();
        
        if(Numero % 2 ==0) {
			System.out.println("O Número é par");			
		} else {
			System.out.println("O Número é impar");
		}
        
        if(Numero >=0) {
        	System.out.println("O Número é positivo");
        } else {
        	System.out.println("O Número é negativo");
        }
        

	}

}
