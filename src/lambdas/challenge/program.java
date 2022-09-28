package lambdas.challenge;

import java.util.function.Predicate;

public class program {
	public static void main(String[] args) {
		Product p1 = new Product("Carro", 2500.252, 10.00);
		CityTaxService cts1 = new CityTaxService();

		Predicate<Double> condition = value -> value >= 2500;

		Double productPrice = cts1.calculateTaxAmount(p1.getRealPrice(), condition);

		productPrice = Double.parseDouble(String.format("%.2f", productPrice).replace(',', '.'));
		System.out.println(productPrice);
	}
}
