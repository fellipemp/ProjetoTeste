import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class ManipularArquivo {
	
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
 
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
        in.close();
    }
    
    public static void editor(String path, String novaHora) throws IOException {
    	BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = buffRead.readLine();
        buffRead.close();
    	
        linha = linha + novaHora; 
    	InputStream is = new FileInputStream(path);
		OutputStream os = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter buffWrite = new BufferedWriter(osw);
		buffWrite.write("\n");
		buffWrite.write(linha);

		
		buffWrite.close();
		is.close();
    }
 
}
