package fundamentos;

import java.util.Scanner;

public class ConverteStringParaNumero {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Primeiro salario?");
		double sal1 = Double.parseDouble(keyboard.next().replace(',', '.'));

		System.out.print("Segundo salario?");
		double sal2 = Double.parseDouble(keyboard.next().replace(',', '.'));

		System.out.print("Terceiro salario?");
		double sal3 = Double.parseDouble(keyboard.next().replace(',', '.'));

		double media = (sal1 + sal2 + sal3) / 3;

		keyboard.close();

		System.out.println(media);
	}
}
