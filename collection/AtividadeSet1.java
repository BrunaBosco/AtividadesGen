package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet1 {

	public static void main(String[] args) {
		
        Set<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (numeros.size() < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (!numeros.add(numero)) {
                System.out.println("Número já inserido. Digite um número diferente.");
            }
        }

        System.out.println("\nElementos da Collection Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
	}
}
  
		
		 