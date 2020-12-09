package pets.streams;

public class Pet {
	private TipoPet tipo;
	private String nome;
	private int idade;
	
	public Pet(TipoPet tipo, String nome, int idade) {
		this.tipo = tipo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public TipoPet getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
