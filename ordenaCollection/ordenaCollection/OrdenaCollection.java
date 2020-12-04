package ordenaCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenaCollection {

	public static void main(String[] args) {
		List<Integer> listSort = Arrays.asList(5, 4, 3, 7, 2, 1);
		Collections.sort(listSort);
		listSort.forEach(System.out::println);
		
		List<Integer> listComparador = Arrays.asList(5, 4, 3, 7, 2, 1);
		// Comparador customizado:
		Collections.sort(listComparador, (o1, o2) -> (o1 > o2 ? -1 : (o1 == o2 ? 0 : 1)));
		// Alternativamente, é possivel utilizar o comparador de inteiros:
		// Collections.sort(list, Integer::);
		listComparador.forEach(System.out::println);
	}

}