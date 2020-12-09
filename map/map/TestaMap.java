package map;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class TestaMap {
	public static void main(String[] args) {
		// Usado com maps pequenos:
		Map<String, String> map = Map.of("chave1", "valor1", "chave2", "valor2");
		System.out.println(map);
		
		// Inicializar maps não modificáveis:
		Map<String, String> mapEntries = Map.ofEntries(Map.entry("chave1", "valor1"), Map.entry("chave2", "valor2"));
		System.out.println(mapEntries);
		
		// Inicializar map por new:
		Map<String, String> mapNew = new HashMap<>();
		mapNew.put("chave1",  "valor1");
		mapNew.put("chave2",  "valor2");
		
		// Remove entradas do map:
		Map<String, String> mapRemove = mapNew;
		mapRemove.remove("chave1");
		
		// Processa todos os elementos no map. Recebe um lambda como parâmetro:
		Map<String, String> mapForEach = Map.of("chave1", "valor1", "chave2", "valor2");
		mapForEach.forEach((c, v) -> System.out.printf("%s%s%n",  c, v));
		
		// Converte as chaves em um mapa para um array ou lista:
		Map<String, String> mapConvert = Map.of("chave1", "valor1", "chave2", "valor2");
		// Converte as chaves para um array:
		String[] chaves = mapConvert.keySet().toArray(new String[mapConvert.keySet().size()]);
		for (String string : chaves) {
			System.out.println(string);
		}
		// Converte as chaves para uma list
		List<String> list = new ArrayList<String>(mapConvert.keySet());
		for (String string : list) {
			System.out.println(string);
		}
		
		// Retorna o valor de uma chave ou um valor default se não existir:
		Map<String, Integer> mapDefault = new HashMap<>();
		mapDefault.put("Android",  1 + mapDefault.getOrDefault("Android",  0));
		mapDefault.forEach((c, v) -> System.out.printf("%s%s%n",  c, v));
		
		// Adiciona uma entrada no map, se já não existir
		Map<String, Integer> mapAbsent = new HashMap<>();
		mapAbsent.put("chave1",  1);
		mapAbsent.put("chave2",  2);
		Integer valorCalculado = mapAbsent.computeIfAbsent("Java",  it -> 0);
		System.out.println(valorCalculado);
		
		map.keySet().forEach(key -> System.out.println(key + " " + map.get(key)));
	}
}
