package Vetores;

import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vetorInteiro[] = {2,5,1,3,4,9,7,8,10,6};
        boolean encontrado = false;

		
		System.out.print("Digite o número que você deseja encontrar: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i < vetorInteiro.length; i++) {
            if (vetorInteiro[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break; 
            }
       
          }
        
        if (!encontrado) {
            System.out.println("Não foi encontrado!");
                 
            scanner.close();
        
        }

	}

}
