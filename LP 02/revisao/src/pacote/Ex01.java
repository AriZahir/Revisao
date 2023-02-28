package pacote;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.println("OLÁ, Qual o seu nome?");
		nome = ler.nextLine();
		System.out.println("OLÁ,"+nome);
	}

}
