package carrinhoDeCompras;

public class Mercado {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jorge", 0.1);
		Carrinho cart = new Carrinho(cliente1);

		cart.addItemToCart("Arroz 5kg", 19.50);
		cart.addItemToCart("Feijão 1kg", 8.90);
		cart.addItemToCart("Macarrão 1kg", 5.00);
		cart.addItemToCart("Carne 1kg", 23.60);

		cart.showCartItens();
		cart.totalValue();

	}
}
