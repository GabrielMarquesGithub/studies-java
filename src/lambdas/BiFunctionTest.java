package lambdas;

import java.util.function.BiFunction;

public class BiFunctionTest {
	public static void main(String[] args) {
		BiFunction<MoneyType, Double, String> test = (type, value) -> "O valor é de " + value + " " + type;

		System.out.println(test.apply(MoneyType.BRL, 2000.00));

	}
}
