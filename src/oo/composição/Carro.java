package oo.composição;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorDeInjecao < 3) {
			motor.fatorDeInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorDeInjecao > 0.5) {
			motor.fatorDeInjecao -= 0.4;
		}
	}

	void togle() {
		motor.ligado = !motor.ligado;
	}

	boolean estaLigado() {
		return motor.ligado;
	}

}
