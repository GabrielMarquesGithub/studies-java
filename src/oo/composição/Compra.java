package oo.composição;

import java.util.ArrayList;

public class Compra {
	String nomeCliente;

	Compra(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	ArrayList<Item> itens = new ArrayList<>();

	void addItem(String name, int quantity, double price) {
		itens.add(new Item(name, quantity, price));
	}

	void showItens() {
		for (Item item : itens) {
			System.out.println("Item: " + item.name);
			System.out.println("Quantity: " + item.quantity);
			System.out.println("Price: " + item.price);

			System.out.println("");
		}
	}
}
