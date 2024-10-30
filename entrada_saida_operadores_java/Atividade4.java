package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
        Scanner ler =  new Scanner(System.in);
		
        float numero1, numero2, numero3,numero4,resultado;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = ler.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = ler.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		numero4 = ler.nextFloat();
		
		resultado = (numero1*numero2)-(numero3*numero4);
		
        System.out.println(resultado);
		
		ler.close();
	}

}
