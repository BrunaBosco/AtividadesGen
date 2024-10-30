package lacos_condicionais_java;

import java.util.Scanner;

public class Atividade1_IF {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
        int  A, B, C = 0;
        
        System.out.println("Digite um número referente a A: ");
        A = escrever.nextInt();
        System.out.println("Digite um número referente a B: ");
        B = escrever.nextInt();
        System.out.println("Digite um número referente a C: ");
        C = escrever.nextInt();
        
        
		if(C < (A + B)) {
			System.out.println("A Soma de A + B é Maior do que C!");			
		}
		
		if(C > (A + B)) {
			System.out.println("A Soma de A + B é Menor do que C!");			
		}
		
		if(C == (A + B)) {
			System.out.println("A Soma de A + B é Igual a C!");
			
		}

	}


	}
