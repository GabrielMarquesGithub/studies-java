package classes;

public class Pessoa {
	String nome;
	Float peso;
	
	Pessoa (String nome, Float peso){
		this.nome = nome;
		this.peso = peso;
	};
	
	void comer(Comida pesoComida) {
		peso = peso + pesoComida.peso;
	}
}
