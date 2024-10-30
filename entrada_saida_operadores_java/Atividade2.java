package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
        Scanner ler =  new Scanner(System.in);
		
        float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Qual é a sua primeira nota? ");
		nota1 = ler.nextFloat();
		
		System.out.println("Qual é a sua segunda nota? ");
		nota2 = ler.nextFloat();
		
		System.out.println("Qual é a sua terceira nota? ");
		nota3 = ler.nextFloat();
		
		System.out.println("Qual é a sua quarta nota? ");
		nota4 = ler.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua média foi: "+ media);
		
		ler.close();
	}

}
