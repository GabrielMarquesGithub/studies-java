package oo.tax.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oo.tax.entities.LegalPersonnel;
import oo.tax.entities.PhysicalPersonnel;
import oo.tax.entities.Taxpayer;

public class Program {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		List<Taxpayer> taxpayers = new ArrayList<>();

		System.out.print("Enter the number of taxpayers: ");
		int taxpayersNumber = key.nextInt();
		key.nextLine();

		for (int i = 0; i < taxpayersNumber; i++) {
			System.out.println("Taxpayer #" + (i + 1) + " data:");

			System.out.print("Person or entity (p/e)? ");
			boolean person = key.nextLine().contains("p") ? true : false;

			System.out.print("Name: ");
			String name = key.nextLine();

			System.out.print("Annual income: ");
			double annualIncome = key.nextDouble();
			key.nextLine();

			if (person) {
				System.out.print("Health Expenses: ");
				double healthExpenses = key.nextDouble();
				key.nextLine();

				taxpayers.add(new PhysicalPersonnel(name, annualIncome, healthExpenses));
			} else {
				System.out.print("Employee Numbers: ");
				int employeeNumbers = key.nextInt();
				key.nextLine();

				taxpayers.add(new LegalPersonnel(name, annualIncome, employeeNumbers));

			}
		}

		double total = 0;
		for (Taxpayer taxpayer : taxpayers) {
			total += taxpayer.calculateTax();
			System.out.println(taxpayer.getName() + " - R$" + taxpayer.calculateTax());
		}

		System.out.println("Total income R$" + total);

		key.close();

	}
}
