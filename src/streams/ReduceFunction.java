package streams;

import java.util.Arrays;
import java.util.List;

public class ReduceFunction {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int total = nums.stream().reduce(0, (ac, n) -> n + ac);
		System.out.println(total);
	}
}
