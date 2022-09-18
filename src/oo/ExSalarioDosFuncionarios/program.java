package oo.ExSalarioDosFuncionarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner key = new Scanner(System.in);

		System.out.print("Enter departament's name: ");
		String departamentName = key.nextLine();

		System.out.print("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = key.nextLine();
		System.out.print("Level: ");
		String workerLevel = key.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = key.nextDouble();

		Worker worker1 = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Departament(departamentName));

		System.out.print("How many contracts to this worker? ");
		int n = key.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(key.next());
			System.out.print("Value per hour: ");
			double valuePerHour = key.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = key.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker1.addContracts(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = key.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker1.getName());
		System.out.println("Department: " + worker1.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker1.income(year, month)));

		key.close();
	}
}
