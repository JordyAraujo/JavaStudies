package pets.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private List<Pet> pets = new ArrayList<>();
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa addPet(TipoPet tipoPet, String nome, int idade) {
		pets.add(new Pet(tipoPet, nome, idade));
		return this;
	}
	
	public boolean temPet(TipoPet tipoPet) {
		return pets.stream().anyMatch(p->p.getTipo().equals(tipoPet));
	}
	
	public boolean temNome(String string) {
		return (getNome() + " " + getSobrenome()).equals(string);
	}
	
	public List<Pet> getPets() {
		return pets;
	}
	
	public Collection<TipoPet> getTiposPets() {
		return pets.stream().map(pet->pet.getTipo()).collect(Collectors.toSet());
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
}