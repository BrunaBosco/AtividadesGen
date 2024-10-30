package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		
        Scanner ler =  new Scanner(System.in);
		
        float salario_bruto,adicional_noturno,horas_extras,descontos,salario_liquido;
		
		System.out.println("Qual é o valor do seu salário? ");
		salario_bruto = ler.nextFloat();
		
		System.out.println("Qual é o valor do seu adicional noturno? ");
		adicional_noturno = ler.nextFloat();
		
		System.out.println("Qual é o valor das suas horas extras? ");
		horas_extras = ler.nextFloat();
		
		System.out.println("Qual é o valor dos seus descontos? ");
		descontos = ler.nextFloat();
		
		salario_liquido = (salario_bruto+adicional_noturno+(horas_extras*5)-descontos); 
		
		System.out.println("Seu salário liquido é de: "+ salario_liquido);
		
		ler.close();
	}
}
