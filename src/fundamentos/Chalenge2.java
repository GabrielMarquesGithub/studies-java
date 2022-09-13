package fundamentos;

import java.util.Scanner;

public class Chalenge2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Primeiro numero: ");
		double num1 = Double.parseDouble(keyboard.next().replace(',', '.'));

		System.out.print("Segundo numero: ");
		double num2 = Double.parseDouble(keyboard.next().replace(',', '.'));

		System.out.print("Operação: ");
		String ope = keyboard.next();

		double response = 0;
		response = ope.equals("+") ? num1 + num2 : response;
		response = ope.equals("-") ? num1 - num2 : response;
		response = ope.equals("*") ? num1 * num2 : response;
		response = ope.equals("/") ? num1 / num2 : response;

		System.out.println(response);

	}
}
