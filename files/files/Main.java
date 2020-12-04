package files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		String input = FilesUtil.lerArquivoTexto("file.txt");
		System.out.println(input);
		FilesUtil.escreveArquivoDeTexto("copy.txt", input);
		
		System.out.println(FilesUtil.lerArquivoTexto("copy.txt"));
		
		FilesUtil.lerArquivoTextoPorLinha("file.txt");
		Path path = Paths.get("file.txt");
		System.out.println(path);
	}
}
