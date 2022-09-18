package oo.tax.entities;

public class PhysicalPersonnel extends Taxpayer {
	private double healthExpenses;

	public PhysicalPersonnel(String name, double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double calculateTax() {
		if (super.getAnnualIncome() < 20000) {
			return super.getAnnualIncome() * 0.15;
		} else {
			return (super.getAnnualIncome() * 0.25) - (this.healthExpenses * 0.5);
		}
	}

}
