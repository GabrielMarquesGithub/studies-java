package erros;

import java.util.Scanner;

public class testesErros {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		try {

			System.out.print("Digite o primeiro número: ");
			double num1 = key.nextDouble();
			key.nextLine();
			System.out.print("Digite o segundo número: ");
			double num2 = key.nextDouble();
			key.nextLine();

			System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + dividir(num1, num2));

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			key.close();
		}

	}

	public static double dividir(Double num1, Double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Não é possivel realizar um divisão por 0");
		}
		return num1 / num2;

	}

}
