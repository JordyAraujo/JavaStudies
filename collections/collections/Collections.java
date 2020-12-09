package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		// Cria e popula diretamente a List:
		List<String> list = Arrays.asList("Lars", "Simon");
		
		// Cria a List com new e popula com add():
		List<String> listNew = new ArrayList<>();
		listNew.add("Lars");
		listNew.add("Simon");
		
		// Imprime cada elemento no console usando referências por método:
		list.forEach(System.out::println);
		listNew.forEach(System.out::println);
		
		// Usa inferência de tipo com ArrayList:
		List<Integer> listInferencia = Arrays.asList(3, 2, 1, 4, 5, 6, 6);
		for (Integer inteiro : listInferencia) {
            System.out.println(inteiro);
        }
		
		// Ordenando listas:
		System.out.println("Ordenando com ordem natural:");
		List<String> l1 = criaList();
		l1.sort(null);
		l1.forEach(System.out::println);
		
		System.out.println("Ordenando com expressão lambda para comparação:");
		List<String> l2 = criaList();
		l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		l2.forEach(System.out::println);
		
		System.out.println("Ordenando com referência por método:");
		List<String> l3 = criaList();
		l3.sort(String::compareToIgnoreCase);
		l3.forEach(System.out::println);
		
		System.out.println("Demonstração removeIf:");
		List<String> l4 = criaList();
		l4.removeIf(s->s.toLowerCase().contains("x"));
		l4.forEach(s->System.out.println(s));
	}
		
	private static List<String> criaList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
}
