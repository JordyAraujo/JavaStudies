package exercicio;


class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, String sobrenome, int idade) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return getNome() + " " + getSobrenome();
    }
}