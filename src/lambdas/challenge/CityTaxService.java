package lambdas.challenge;

import java.util.function.Predicate;

public class CityTaxService {

	private Double tax = 8.5;

	public Double getTax() {
		return tax;
	}

	public double calculateTaxAmount(double value, Predicate<Double> condition) {
		if (condition.test(value)) {
			return value += (value * (this.tax / 100));
		}
		return value;
	}

}
