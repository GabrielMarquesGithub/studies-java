package ContratoDeParcela.entities;

import java.time.LocalDate;

import ContratoDeParcela.application.Program;

public class Installment {
	private LocalDate dueDate;
	private Double amount;

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Data da parcela: " + dueDate.format(Program.formatter) + " Valor: " + amount;
	}
}
