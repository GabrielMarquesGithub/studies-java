package oo.composição.challengeCar;

public class Carro {
	int velocidadeMaxima = 100;
	double velocidadeAtual = 0.0;

	void verVelocidade() {
		System.out.println("O carro está " + velocidadeAtual);
	}

	void setVelocidadeMaxima(int valocidadeMaxima) {
		if (valocidadeMaxima > 0) {
			this.velocidadeMaxima = valocidadeMaxima;
		} else {
			this.velocidadeMaxima = 100;
		}
	}

	void acelerar() {
		this.acelerar(5);
	}

	void acelerar(int velociadeAcelerada) {
		if (velocidadeAtual + velociadeAcelerada >= velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} else {
			velocidadeAtual += velociadeAcelerada;
		}

	}

	void frear() {
		if (velocidadeAtual - 5 <= 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= 5;
		}
	}
}
