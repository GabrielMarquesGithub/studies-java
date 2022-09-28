package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Percorrer {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Luca", "Gui", "Ga", "Lua", "Ana", "Leo");

		System.out.println("forEach padrão");
		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("Interator");
		// criando iterador de uma lista
		Iterator<String> name = list.iterator();
		// condicional se existe um próximo elemento
		while (name.hasNext()) {
			// imprimindo o element
			System.out.println(name.next());
		}

		System.out.println("forEach direto da lista");
		list.forEach(name2 -> System.out.println(name2));

		System.out.println("forEach a partir de uma stream");
		list.stream().forEach(System.out::println);
	}
}
