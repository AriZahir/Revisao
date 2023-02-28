package pacote;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		System.out.println("opção 01: Ex01");
		System.out.println("opção 02: Ex02");
		System.out.println("opção 03: Ex03");
		System.out.println("opção 04: Ex04");
		System.out.println("opção 05: Ex05");
		
		
		int op =ler.nextInt();
		ler.nextLine();
		switch (op) {
		
		case 1:
			String nome;
			
			System.out.println("OLÁ, Qual o seu nome?");
			nome = ler.nextLine();
			System.out.println("OLÁ,"+nome);
			break;
		
		case 2:
			String frase;
			int n;
			
			System.out.println("Digite uma frase");
			frase = ler.nextLine();
			
			System.out.println("Digte um numero inteiro");
			n = ler.nextInt();
			
			for(int i=0; i<n; i++) {
				
				System.out.println(frase);	
			}
			break;
		
		case 3:
			
			System.out.println("Digte um numero inteiro");
			n = ler.nextInt();
			
			ler.nextLine();
			System.out.println("Digite uma frase");
			nome = ler.nextLine();
			
			for(int i=1; i<n; i++) {
				
				System.out.println(nome);	
			}
			break;
		
		case 4:
			int base, altura;
			
			System.out.println("Digte a altura");
			altura = ler.nextInt();
			System.out.println("Digte o numero da base");
		    base = ler.nextInt();
			
			 System.out.println("A area de um retangulo de base: " + base);
			 System.out.println("e altura: " + altura);
			 System.out.println("A area é: "+base*altura);
			 System.out.println("O perimetro é:" + 2*(base +altura));
			break;
		
		case 5:
			
			System.out.println("Digte qnt linhas:");
			int k = ler.nextInt();
			System.out.println("Digte qnt colunas:");
			int l = ler.nextInt();
	
			System.out.println("Digte frase:");
			ler.nextLine();
			String w = ler.nextLine();
			
		
		
			for (int i = 0; i < k; i++) {
				System.out.println("");
				for (int j = 0; j < l; j++) {
					System.out.print(w+"|"); 
			 }
			}
			break;
		}
		
	}

}
