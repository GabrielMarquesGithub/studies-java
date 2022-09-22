package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipeline {
	public static void main(String[] args) {
		// pipeline só é a representação de linha de produção onde nas streams
		// existem operações intermediárias e terminais sendo as intermediárias
		// lazy ou seja só executam quando 'chamadas' por uma operação terminal

		Stream<Integer> stream = Stream.of(1, 4, 1, 6, 8, 3, 65, 63, 64, 525, 326, 252, 4, 262, 5);

		// temos as operação de filter e map
		List<Integer> teste = stream.filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

		for (Integer num : teste) {
			System.out.println(num);
		}
	}
}
