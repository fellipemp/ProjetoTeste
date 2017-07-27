import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ClasseTeste {

	private static Scanner ler;

	public static void main(String[] args) throws FileNotFoundException {
		
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
		
		System.out.println("A media é: " + avg);
		
		
		
		String arquivo = new Scanner(new FileReader("arqteste.txt")).useDelimiter("\\Z").next();
		
		System.out.println(arquivo);
		
		
		// Executando programa externo
		
		String externo = "cmd /c D:/Users/fmarp/Documents/lista.txt";
		
		try {
			Runtime.getRuntime().exec(externo);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String externo1 = "cmd /c start notepad++.exe";
		
		try {
			Runtime r = Runtime.getRuntime();
			r.exec(externo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}