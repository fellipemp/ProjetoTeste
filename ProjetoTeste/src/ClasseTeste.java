import java.util.Scanner;

public class ClasseTeste {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		String palavra;
		int i;
		
		
		System.out.println("Escreva uma frase:");
		palavra = ler.nextLine();
		
		System.out.println("Escreva um numero:");
		i = ler.nextInt();
		
		
		System.out.printf("%s %d\n", palavra, i);
	}

}
