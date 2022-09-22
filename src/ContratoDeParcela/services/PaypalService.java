package ContratoDeParcela.services;

public class PaypalService implements PaymentInterface {
	Double simpleInterest;
	Double tax;

	public PaypalService(Double simpleInterest, Double tax) {
		this.simpleInterest = simpleInterest;
		this.tax = tax;
	}

	public Double getSimpleInterest() {
		return simpleInterest;
	}

	public void setSimpleInterest(Double simpleInterest) {
		this.simpleInterest = simpleInterest;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public double calculateInstallmentValue(double value, int portion) {
		value += value * ((simpleInterest / 100) * portion);
		return value += value * (tax / 100);
	}
}
