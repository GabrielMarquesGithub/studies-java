package oo.composição;

public class UmPraUm {
	public static void main(String[] args) {
		Carro car = new Carro();
		System.out.println(car.estaLigado());

		car.togle();

		System.out.println(car.estaLigado());

		System.out.println(car.motor.giros());

		car.acelerar();
		car.acelerar();
		car.frear();

		System.out.println(car.motor.giros());

	}
}
