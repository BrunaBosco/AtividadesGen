package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner ler =  new Scanner(System.in);
		
        float salario,abono,novo_salario;
		
		System.out.println("Qual o valor do seu salario? ");
		salario = ler.nextFloat();
		
		System.out.println("Qual o valor do seu abono? ");
		abono = ler.nextFloat();
		
		novo_salario = salario + abono;
								
		System.out.println(novo_salario);
		
		ler.close();

	}

}
