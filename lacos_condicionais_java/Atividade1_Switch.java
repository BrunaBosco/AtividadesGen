package lacos_condicionais_java;

import java.util.Scanner;

public class Atividade1_Switch {

	public static void main(String[] args) {
		
		int codigo,quantidade;
		String produto = "";
		Double preco = 0.00;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------Menu-----------");
		System.out.println("\n -- Digite o código do produto--");
		codigo = leia.nextInt();

		System.out.println("-- Digite a quantidade do produto--");
		quantidade = leia.nextInt();
		
        switch (codigo) {
		
		case 1: 
			produto = "cachorro-quente";
			preco = 10.00;
			break;
		case 2: 
			produto = "X-Salada";
			preco = 15.00;
			break;
		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 08.00;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00;
			break;
			
			default:
			System.out.println("Selecione uma opção válida!");
			break;
		}
	
        double total = preco * quantidade;
        
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Valor total: R$ %.2f%n", total);

        leia.close();

	}

}
