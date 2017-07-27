import java.io.File;

public class ClasseTeste {
	
	static int tabulador = 0;
	public static void main(String[] args) throws Exception {
		File raiz = new File("D:\\Users\\fmarp\\git");
		listaDiretorio(raiz);
	}
	public static void listaDiretorio(File raiz) {
		tabulador++;
		System.out.println(tabulacao()+"+ "+raiz.getName());
		for(File f: raiz.listFiles()) {
			if(f.isFile()) 
				System.out.println(tabulacao()+f.getName());
			else
				listaDiretorio(f);
		}
		tabulador--;
	}
	static String tabulacao() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<tabulador; i++)
			sb.append("\t");
		return sb.toString(); 
	}
}