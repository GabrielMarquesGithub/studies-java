package collections;

import java.util.Scanner;

public class chalengeNotas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Quantidade de aluno: ");
		double[] notas = new double[keyboard.nextInt()];

		keyboard.nextLine();

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nNota do %d° aluno: ", i + 1);
			notas[i] = keyboard.nextDouble();
			
			keyboard.nextLine();
		}
		
		int index = 0;
		double notaTotal = 0;
		for(double nota: notas) {
			System.out.printf("\nNota do %d° aluno é %f",  ++index, nota);
			notaTotal += nota;
		}
		System.out.printf("\nA media das notas é de %f",  notaTotal/notas.length);
	}
}
