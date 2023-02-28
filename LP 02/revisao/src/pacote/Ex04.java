package pacote;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
	
		int base, altura;
		
		System.out.println("Digte a altura");
		altura = ler.nextInt();
		System.out.println("Digte o numero da base");
	    base = ler.nextInt();
		
		 System.out.println("A area de um retangulo de base: " + base);
		 System.out.println("e altura: " + altura);
		 System.out.println("A area é: "+base*altura);
		 System.out.println("O perimetro é:" + 2* (base +altura));
		 
		 }
	}


