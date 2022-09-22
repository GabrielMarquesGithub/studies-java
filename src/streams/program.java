package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class program {
	public static void main(String[] args) {

		List<String> teste = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			teste.add("Conteudo " + (i + 1));
		}

		// para manipular listas com funções de stream devem haver conversões
		teste = teste.stream().map(x -> x + " Passei no map").toList();

		for (String linha : teste) {
			System.out.println(linha);
		}

		// criar streams diretamente
		Stream<String> stream = Stream.of("Primeiro", "Segundo", "Terceiro");

		System.out.println(Arrays.toString(stream.toArray()));

		// criar streams dinamicamente, seqüência de Fibonacci
		Stream<Long> fibonacci = Stream.iterate(new Long[] { 0L, 1L }, f -> new Long[] { f[1], f[0] + f[1] })
				.map(p -> p[0]);

		// sendo potencialmente infinita o ideal é usar o limit para limitar
		System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));

	}
}
