package oo.composição;

public class Motor {
	boolean ligado = false;
	double fatorDeInjecao = 1;

	int giros() {
		return ligado ? (int) Math.round(fatorDeInjecao * 3000) : 0;
	}
}
