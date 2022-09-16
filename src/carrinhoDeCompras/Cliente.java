package carrinhoDeCompras;

public class Cliente {
	String nome;
	double desconto;

	Cliente(String nome) {
		this(nome, 0.0);
	}

	Cliente(String nome, double desconto) {
		this.nome = nome;
		if (desconto > 0.0 && desconto < 0.9) {
			int temp = (int) (desconto * 1000.0);
			this.desconto = ((double) temp) / 1000.0;
		} else {
			this.desconto = 0.0;
		}
	}

	@Override
	public String toString() {
		return String.format("O cliente %s tem %d%% de desconto", this.nome, (int) (this.desconto * 100));
	}
}
