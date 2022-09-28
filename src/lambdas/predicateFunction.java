package lambdas;

import java.util.Scanner;
import java.util.function.Predicate;

public class predicateFunction {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> haveTwoDigits = num -> num > 9 && num < 100;

		Scanner key = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = key.nextInt();
		key.nextLine();
		key.close();

		System.out.println();
		System.out.println("Número é par? " + isPar.test(num));

		System.out.println();
		System.out.println("Tem dois digitos? " + haveTwoDigits.test(num));

		System.out.println();
		System.out.println("E par e tem dois digitos? " + haveTwoDigits.and(isPar).test(num));

		System.out.println();
		System.out.println("E par ou tem dois digitos? " + haveTwoDigits.or(isPar).test(num));

	}
}
