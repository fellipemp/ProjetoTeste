import java.util.Scanner;

public class ClasseTeste {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		String palavra;
		int qtd, num=0, numtotal=0;
		float avg;
		
		
		System.out.println("Escreva uma frase:");
		palavra = ler.nextLine();
		
		System.out.println(palavra);
		
		
		
		System.out.println("Escreva a quantidade de entradas:");
		qtd = ler.nextInt();
		
		for(int i = 0; i < qtd ; i++) {
			System.out.println("Digite o numero " + (i+1) + ": ");
			num = ler.nextInt();
			numtotal = numtotal + num;
		}
		
		avg = numtotal/qtd;
		
		System.out.println("A media �: " + avg);
		
		
		
	}

}
