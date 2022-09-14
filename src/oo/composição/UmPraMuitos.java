package oo.composição;

public class UmPraMuitos {
	public static void main(String[] args) {
		Compra c1 = new Compra("José");

		c1.addItem("Caneta", 3, 5.00);
		c1.addItem("Caderno", 2, 15.00);
		c1.addItem("Mochila", 1, 52.00);

		c1.showItens();
	}
}
