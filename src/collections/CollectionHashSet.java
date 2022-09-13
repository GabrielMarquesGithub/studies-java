package collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSet {
	public static void main(String[] args) {

		// embora não necessite de tipagem, pode ser tipado
		// a tipagem ajuda na manutenção da homogeneidade
		HashSet<Float> conjunto = new HashSet<Float>();

		// método add adiciona
		conjunto.add(1.2f);
		conjunto.add(1.5f);
		conjunto.add(2f);

		// método size mostra quantidade de items na lista
		System.out.println(conjunto.size());

		// set não adiciona items repetidos
		conjunto.add(2f);
		conjunto.add(2f);

		System.out.println(conjunto.size());

		// para remover um item
		// vale que o método remove retorna um boolean true se remover
		// false se não encontrar
		conjunto.remove(2f);

		// mostra quantidade atualizada
		System.out.println(conjunto.size());
		// retorna um boolean a collection conter o item buscado
		System.out.println(conjunto.contains(1.2f));

		// outra forma de declarar um conjunto set
		Set<Integer> conjunto2 = new HashSet<>();
		System.out.println(conjunto2.size());
	}
}
