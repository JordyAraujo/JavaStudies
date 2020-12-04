package serialization;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", sobrenome = " + sobrenome + "]";
	}
}
