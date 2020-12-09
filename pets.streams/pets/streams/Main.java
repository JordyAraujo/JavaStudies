package pets.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = criarDados();
		
		boolean resultado = pessoas.stream().anyMatch(pessoa -> pessoa.temPet(TipoPet.GATO));
		System.out.println(resultado);
		
		long quantosGatos = pessoas.stream().filter(pessoa -> pessoa.temPet(TipoPet.GATO)).count();
		System.out.println(quantosGatos);
		
		List<Pessoa> pessoasComGatos = pessoas.stream().filter(pessoa -> pessoa.temPet(TipoPet.GATO)).collect(Collectors.toList());
		System.out.println(pessoasComGatos);
		
		List<Pessoa> pessoasSemGatos = pessoas.stream().filter(pessoa -> !pessoa.temPet(TipoPet.GATO)).collect(Collectors.toList());
		System.out.println(pessoasSemGatos);
		
		Map<Boolean, List<Pessoa>> gatosOuNao = pessoas.stream().collect(Collectors.partitioningBy(pessoa -> pessoa.temPet(TipoPet.GATO)));
		System.out.println(gatosOuNao);
		
		Pessoa pessoa = pessoas.stream().filter(cada -> cada.temNome("Tim Maia")).findFirst().get();
		boolean teste = ("Dolly e Spot").equals(pessoa.getPets().stream().map(Pet::getNome).collect(Collectors.joining(" e ")));
		System.out.println("Os gatos Dolly e Spot são de Tim? " + teste);
		
		Set<TipoPet> todosTiposDePet = pessoas.stream().flatMap(p -> p.getTiposPets().stream()).collect(Collectors.toSet());
		System.out.println(todosTiposDePet);
		
		Map<String, List<Pessoa>> porSobrenome = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getSobrenome));
		System.out.println(porSobrenome);
		
		List<Integer> listaIdades = pessoas.stream().flatMap(p -> p.getPets().stream()).map(Pet::getIdade).collect(Collectors.toList());
		IntSummaryStatistics stats = listaIdades.stream().collect(Collectors.summarizingInt(i -> i));
		System.out.println("Min " + stats.getMin() + " Max " + stats.getMax() + " Average " + stats.getAverage());
		
		Map<Integer, Long> quantPorIdade = Collections.unmodifiableMap(pessoas.stream().flatMap(p -> p.getPets().stream()).collect(Collectors.groupingBy(Pet::getIdade, Collectors.counting())));
		System.out.println(quantPorIdade);
	}
	
	private static List<Pessoa> criarDados(){
		return Arrays.asList(
				new Pessoa("Maria", "Silva").addPet(TipoPet.GATO, "Tabby", 2),
				new Pessoa("Tim", "Maia").addPet(TipoPet.GATO, "Dolly", 3).addPet(TipoPet.CACHORRO, "Spot", 2),
				new Pessoa("Ted", "Smith").addPet(TipoPet.CACHORRO, "Spike", 4),
				new Pessoa("Jake", "Cunha").addPet(TipoPet.CACHORRO, "Serpy", 1),
				new Pessoa("Matheus", "Costa").addPet(TipoPet.PASSARO, "Twirly", 1),
				new Pessoa("Harry", "Medeiros").addPet(TipoPet.HAMSTER, "Fuzzy", 1).addPet(TipoPet.HAMSTER, "Wuzzy", 1)
		);
	}
}
