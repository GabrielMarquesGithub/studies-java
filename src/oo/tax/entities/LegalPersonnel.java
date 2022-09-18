package oo.tax.entities;

public class LegalPersonnel extends Taxpayer {
	private int employeeNumbers;

	public LegalPersonnel(String name, double annualIncome, int employeeNumbers) {
		super(name, annualIncome);
		this.employeeNumbers = employeeNumbers;
	}

	public int getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(int employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	@Override
	public double calculateTax() {
		if (this.employeeNumbers > 10) {
			return super.getAnnualIncome() * 0.14;
		} else {
			return super.getAnnualIncome() * 0.16;
		}
	}

}
