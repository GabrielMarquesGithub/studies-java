package lambdas.challenge;

public class Product {
	private String name;
	private Double price;
	private Double discont;

	public Product(String name, Double price, Double discont) {
		this.name = name;
		this.price = price;
		this.discont = discont;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscont() {
		return discont;
	}

	public void setDiscont(Double discont) {
		this.discont = discont;
	}

	public Double getRealPrice() {
		return this.price -= (this.price * (this.discont / 100));
	}
}
