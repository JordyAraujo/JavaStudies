package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		String arquivo = "time.ser";
		Pessoa p = new Pessoa("Lars", "Vogel");
		
		// Salva o objeto em arquivo
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(arquivo);
			out = new ObjectOutputStream(fos);
			out.writeObject(p);
			
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(arquivo);
			in = new ObjectInputStream(fis);
			p = (Pessoa) in.readObject();
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(p);
	}
}
