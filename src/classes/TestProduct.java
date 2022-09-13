package classes;

public class TestProduct {
	public static void main(String[] args) {
		//o construtor deve fornecer os dados pedidos 
		Product p1 = new Product("Televisão", 1000, true);
		//Sendo um dado static 'desconto' deve ser manipulado na própria classe
		Product.desconto = 0.1;
		System.out.println(p1.preçoComDesconto());
		System.out.println(p1.preçoComDesconto(0.2));
		System.out.println(p1.revenda);
	}
}
