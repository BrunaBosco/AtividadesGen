package lacos_condicionais_java;

import java.util.Scanner;

public class Atividade2_Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite o nome do funcionário: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		int codigoCargo = scanner.nextInt();

		System.out.println("Digite o salario do funcionário: ");
		float salarioatual = scanner.nextInt();
		
		String cargo = "";
        float Reajuste = 0;
        
        switch (codigoCargo) {
		
		case 1: 
			cargo = "Gerente";
            Reajuste = 10;
            break;
		case 2: 
			cargo = "Vendedor";
			Reajuste = 7;
            break;
		case 3:
			cargo = "Supervisor";
			Reajuste = 9;
            break;
		case 4:
			cargo = "Motorista";
			Reajuste = 6;
            break;
		case 5:
			cargo = "Estoquista";
			Reajuste = 5;
            break;
		case 6:
			cargo = "Técnico de TI";
			Reajuste = 8;
            break;
			
			default:
			System.out.println("Selecione uma opção válida!");
			break;
		}
        
        float novoSalario = salarioatual + (salarioatual * Reajuste / 100);
        
        System.out.printf("Colaborador: %s%n", nome);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Novo Salário: R$ %.2f%n", novoSalario);

        scanner.close();


	}

}
