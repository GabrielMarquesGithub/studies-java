package oo.order.entites;

public class OrderItem {
	int quantity;

	Product product;

	public OrderItem(String name, double price, int quantity) {
		this.quantity = quantity;
		this.product = new Product(name, price);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProduct(String name, double price) {
		this.product = new Product(name, price);
	}

	public double getSubtotal() {
		return this.product.getPrice() * this.quantity;
	}

}
