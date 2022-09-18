package oo.heritage.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oo.heritage.entites.Employee;
import oo.heritage.entites.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int employeesNumber = key.nextInt();
		key.nextLine();

		for (int i = 0; i < employeesNumber; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");

			System.out.print("Outsourced (y/n)? ");
			boolean outsourced = key.nextLine().contains("y") ? true : false;

			System.out.print("Name: ");
			String name = key.nextLine();

			System.out.print("Hours: ");
			int hours = key.nextInt();
			key.nextLine();

			System.out.print("Value per hours: ");
			double valuePerHours = key.nextDouble();
			key.nextLine();

			if (!outsourced) {
				employees.add(new Employee(name, hours, valuePerHours));
			} else {
				System.out.print("Additional charge: ");
				double additionalCharge = key.nextDouble();

				employees.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
			}

		}

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - " + employee.payment());
		}

		key.close();
	}
}
