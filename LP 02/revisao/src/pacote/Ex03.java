package pacote;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int n;
		
		System.out.println("Digte um numero inteiro");
		n = ler.nextInt();
		
		ler.nextLine();
		System.out.println("Digite uma frase");
		nome = ler.nextLine();
		
		for(int i=1; i<n; i++) {
			
			System.out.println(nome);	
		}

	}

}
