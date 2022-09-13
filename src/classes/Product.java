package classes;

public class Product {
	String nome;
	double preço;
	boolean revenda;
	// com o static o 'desconto' é padrão em todas as instâncias da classe product
	static double desconto = 0.25;

	Product(String nome, double preço, boolean revenda) {
		this.nome = nome;
		this.preço = preço;
		this.revenda = revenda;
	};
	Product(String nome, double preço) {
		//this para construtor só pod ser chamado dentro deu m construtor
		this(nome, preço, false);
	};

	// método
	double preçoComDesconto() {
		return preço * (1 - desconto);
	};

	// sobrecarga de método
	// o java não permite que um método possa ser iniciado com parâmetros diferentes
	// mas ele permite métodos com mesmo nome, já que o identificador leva em conta
	// os tipos de parâmetros recebidos também
	double preçoComDesconto(double descontoDoGerente) {
		return preço * (1 - (desconto + descontoDoGerente));
	};
	
}
