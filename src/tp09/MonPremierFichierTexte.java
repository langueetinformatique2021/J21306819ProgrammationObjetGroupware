package tp09;
import java.io.*;

public class MonPremierFichierTexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("src/tp09/Nom.txt");
			String p = f.getAbsolutePath();
			System.out.println(p);
			PrintWriter pr = new PrintWriter(f);
			pr.println("Philippe Nguyen Vien Thanh");
			pr.close();
			System.out.println("Fin écriture fichier");
		}
		catch (IOException e) {e.printStackTrace();}
		verifier();
	}
	
	
	
	public static void verifier() {
		String ligne;
		try {
			File f = new File("src/tp09/Nom.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((ligne=br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close();
		}
		catch (IOException e) {e.printStackTrace();}
	}

}
