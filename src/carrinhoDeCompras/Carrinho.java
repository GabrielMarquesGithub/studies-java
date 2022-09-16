package carrinhoDeCompras;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Produto> itens = new ArrayList<>();
	Cliente client;

	Carrinho(String clientName) {
		this(new Cliente(clientName));
	}

	Carrinho(Cliente client) {
		this.client = client;
	}

	void addItemToCart(String nome, double price) {
		this.addItemToCart(new Produto(nome, price));
	}

	void addItemToCart(Produto item) {
		itens.add(item);
	}

	void removeItemToCart(String itemName) {
		for (Produto item : itens) {
			if (item.nome.equals(itemName)) {
				this.removeItemToCart(item);
				return;
			}
		}
		System.out.println("Item inexistente no carrinho");
	}

	void removeItemToCart(Produto item) {
		if (itens.contains(item)) {
			itens.remove(item);
			System.out.println("Item removido");
		} else {
			System.out.println("Item inexistente no carrinho");
		}

	}

	void totalValue() {
		if (itens.isEmpty()) {
			System.out.println("O carrinho está vazio");
		} else {
			double total = 0;
			for (Produto item : itens) {
				total += item.price;
			}
			System.out.printf("\nO valor total é de R$ %.2f", (total * (1 - client.desconto)));
		}
	}

	void showCartItens() {
		if (itens.isEmpty()) {
			System.out.println("O carrinho está vazio");
		} else {
			System.out.println("Produtos");
			for (Produto item : itens) {
				System.out.println(item.nome);
			}
		}

	}
}
