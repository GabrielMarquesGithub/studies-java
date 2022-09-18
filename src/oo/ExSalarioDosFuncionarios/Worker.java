package oo.ExSalarioDosFuncionarios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departament departament;
	// listas não são iniciadas no construtor.
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContracts(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContracts(HourContract contract) {
		this.contracts.remove(contract);
	}

	public double income(int year, int mounth) {
		double total = this.baseSalary;
		// como getYear foi depreciado devemos usar Calendar para obtenção de valores de
		// datas
		// criando uma instância
		Calendar cal = Calendar.getInstance();
		for (HourContract contract : contracts) {
			// setando o valor da instância pra data dentro do contrato
			cal.setTime(contract.getDate());
			// obtendo os valores presentes na instância
			int contract_year = cal.get(Calendar.YEAR);
			int contract_mounth = cal.get(Calendar.MONTH);
			if (contract_year == year && contract_mounth == mounth) {
				total += contract.totalValue();
			}

		}

		return total;
	}

}
