package ContratoDeParcela.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ContratoDeParcela.entities.Contract;
import ContratoDeParcela.entities.Installment;
import ContratoDeParcela.services.ContractService;
import ContratoDeParcela.services.PaypalService;

public class Program {

	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Digite os dados do contrato:");
		System.out.print("Número: ");
		int contractNumber = key.nextInt();
		key.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		String contractDate = key.nextLine();

		System.out.print("Valor: ");
		double contractValue = key.nextDouble();
		key.nextLine();
		System.out.print("Número de parcelas: ");
		int installmentNumber = key.nextInt();
		key.nextLine();
		Contract c1 = new Contract(contractNumber, LocalDate.parse(contractDate, formatter), contractValue);
		ContractService cs1 = new ContractService(new PaypalService(1.00, 2.00));

		key.close();

		cs1.createInstallment(c1, installmentNumber);

		for (Installment installment : c1.getInstallments()) {
			System.out.println(installment);
		}
	}
}
