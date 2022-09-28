package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class mapChallenge {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// convertendo para binário
		Function<Integer, String> convertToBinary = num -> Integer.toBinaryString(num);
		// dando reverse em uma string
		Function<String, String> invertString = word -> new StringBuilder(word).reverse().toString();
		// convertendo de binário para int
		Function<String, Integer> binaryToInteger = word -> Integer.parseInt(word, 2);

		nums.stream().map(convertToBinary).map(invertString).map(binaryToInteger).forEach(System.out::println);
		;

	}
}
