package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionsHashMap {
	public static void main(String[] args) {
		Map<Integer, Usuario> users = new HashMap<>();

		for (int i = 0; i < 15; i++) {
			// o método push recebe uma chave e um valor
			// pode ser usado tanto para adicionar quanto para alterar
			// para alterar basta passar uma chave igual outra existente
			// ele substituir o valor relacionado a chave com o novo passado
			users.put(i, new Usuario(String.format("User %d", i + 1)));
		}

		System.out.println("Todos os usuarios");
		// da pra utilizar o for tanto nas keys quanto nos values
		for (Usuario user : users.values()) {
			System.out.println(user);
		}

		System.out.println("");

		// isEmpty retorna um boolean testando se a collection está vazia
		System.out.println("Objeto esta vazio? " + users.isEmpty());

		// keySet retorna um array com as chaves dos objetos
		System.out.println("Chaves " + users.keySet());

		// values retorna um array com os valores dos objetos
		System.out.println("Valores " + users.values());

		// entrySet retorna um array com as chaves e os valores dos objetos
		System.out.println("Chaves e Valores " + users.entrySet());

		// containsKey é uma condicional se existe a chave pesquisada
		System.out.println("Chaves e Valores " + users.containsKey(1));

		// containsValue é uma condicional se existe o valor pesquisado
		System.out.println("Chaves e Valores " + users.containsValue(new Usuario("User test")));

		// for nas chaves e nos valores ao mesmo tempo
		for (Entry<Integer, Usuario> user : users.entrySet()) {
			System.out.println(user.getValue());
			System.out.println(user.getKey());
		}
	}
}
