package oo.order.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oo.order.enums.OrderStatus;

public class Order {
	private Date moment = new Date();
	private OrderStatus status = OrderStatus.PENDING;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public Client getClient() {
		return client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public double totalPrice() {
		double total = 0;
		for (OrderItem item : this.items) {
			total += item.getSubtotal();
		}
		return total;
	}

}
