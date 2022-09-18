package oo.order.program;

import java.util.Scanner;

import oo.order.entites.Client;
import oo.order.entites.Order;
import oo.order.entites.OrderItem;
import oo.order.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Enter client data: ");

		System.out.print("Name: ");
		String clientName = key.nextLine();
		System.out.print("Email: ");
		String clientEmail = key.nextLine();
		System.out.print("Birth date: ");
		String clientBirthDate = key.nextLine();

		Client client1 = new Client(clientName, clientEmail, clientBirthDate);
		Order order1 = new Order(client1);

		System.out.println("Enter order data:");

		System.out.print("Status: ");
		order1.setStatus(OrderStatus.valueOf(key.nextLine()));
		System.out.print("How many items to this order: ");
		int itemsQuantity = key.nextInt();
		key.nextLine();

		for (int i = 0; i < itemsQuantity; i++) {

			System.out.print("Product name: ");
			String productName = key.nextLine();
			System.out.print("Product price: ");
			double productPrice = key.nextDouble();
			key.nextLine();
			System.out.print("Product quantity: ");
			int productQuantity = key.nextInt();
			key.nextLine();

			order1.addItem(new OrderItem(productName, productPrice, productQuantity));
		}

		key.close();

		System.out.println("ORDER SUMARY: ");

		System.out.println("Order moment: " + order1.getMoment());
		System.out.println("Order status: " + order1.getStatus());
		System.out.println("Order client: " + order1.getClient().getName());

		System.out.println("ORDER ITEMS: ");

		for (OrderItem item : order1.getItems()) {
			String stringProduct = String.format("%s, R$%.2f, %d, R$%.2f", item.getProduct().getName(),
					item.getProduct().getPrice(), item.getQuantity(), item.getSubtotal());
			System.out.println(stringProduct);
		}
		System.out.println("Total price: R$" + order1.totalPrice());

	}
}
