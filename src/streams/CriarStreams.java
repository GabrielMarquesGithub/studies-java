package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriarStreams {
	public static void main(String[] args) {

		Consumer<String> print = System.out::println;

		String[] langs = { "Java", "Python", "Ruby", "Go" };
		// criando stream a partir de um array
		Arrays.stream(langs).forEach(print);
		// criando e limitando uma stream
		Arrays.stream(langs, 2, 4).forEach(print);

		// skip tem a função de pular elementos e o limit defini o limite
		// esse combinação funciona bem para uma paginação
		Stream.iterate(1, n -> n + 1).skip(5).limit(30).forEach(System.out::println);

	}
}
