package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesUtil {
	public static String lerArquivoTexto(String arquivo) throws IOException {
		String conteudo = new String(Files.readAllBytes(Paths.get(arquivo)));
		return conteudo;
	}
	
	public static List<String> lerArquivoTextoPorLinha(String arquivo) throws IOException {
		List<String> linhas = Files.readAllLines(Paths.get(arquivo));
		return linhas;
	}
	
	public static void escreveArquivoDeTexto(String arquivo, String conteudo) throws IOException {
		Files.write(Paths.get(arquivo), conteudo.getBytes(), StandardOpenOption.CREATE);
	}
}
