package classes;

public class Jantar {
	public static void main(String[] args) {
		Pessoa Gabriel = new Pessoa("Gabriel", 70f);
		
		Comida arroz = new Comida("arroz", 0.200f);
		Comida feijão = new Comida("feijão", 0.100f);
		Comida carne = new Comida("carne", 0.150f);
		
		System.out.printf("O/A %s pesa %.1fKg", Gabriel.nome, Gabriel.peso);
		
		//comer comer
		Gabriel.comer(arroz);
		Gabriel.comer(feijão);
		Gabriel.comer(carne);
		
		System.out.print("\n\n");
		System.out.printf("O/A %s pesa %.1fKg", Gabriel.nome, Gabriel.peso);
	}
}
