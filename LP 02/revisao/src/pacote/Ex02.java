package pacote;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int n;
		
		System.out.println("Digite uma frase");
		nome = ler.nextLine();
		
		System.out.println("Digte um numero inteiro");
		n = ler.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println(nome);	
		}
		
		
		
	}

}
