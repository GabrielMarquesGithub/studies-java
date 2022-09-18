package oo.heritage.entites;

public class OutsourcedEmployee extends Employee {
	private double additionalCharge;

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public double payment() {
		return super.payment() + this.additionalCharge;
	}
}
