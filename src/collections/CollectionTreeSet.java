package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTreeSet {
	public static void main(String[] args) {

		// o TreeSet cria uma lista set com ordenação
		SortedSet<String> ListaDePessoas = new TreeSet<>();

		ListaDePessoas.add("Ana");
		ListaDePessoas.add("Carlos");
		ListaDePessoas.add("Julia");
		ListaDePessoas.add("Cecilia");
		ListaDePessoas.add("Tamires");

		System.out.println("Lista ordenada");

		// a lista será exibida de maneira ordenada
		for (String pessoa : ListaDePessoas) {
			System.out.println(pessoa);
		}

		SortedSet<String> OutraListaDePessoas = new TreeSet<>();

		OutraListaDePessoas.add("Clara");
		OutraListaDePessoas.add("Alice");
		OutraListaDePessoas.add("Julia");
		OutraListaDePessoas.add("Cecilia");
		OutraListaDePessoas.add("Aghata");

		// para união de listas
		ListaDePessoas.addAll(OutraListaDePessoas);

		System.out.println("Lista depois da união");

		for (String pessoa : ListaDePessoas) {
			System.out.println(pessoa);
		}

		// intercessão união de listas
		// intercessão só matem items igauis na duas listas
		ListaDePessoas.retainAll(OutraListaDePessoas);

		System.out.println("Lista depois da intercessão");

		for (String pessoa : ListaDePessoas) {
			System.out.println(pessoa);
		}
	}
}
