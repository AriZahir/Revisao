package pacote;

import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
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
	}
}
