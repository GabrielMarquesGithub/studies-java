package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		// tudo em Java são objetos com exceção dos tipos primitivos
		// então eles não possuem notação de pontos, para facilitar alguma
		// manipulação dos tipos primitivos existem os Wrappers
		// que basicamente são classes que envolvem os tipos primitivos

		Byte b = 100; // byte
		Short s = 1000; // short
		Integer i = 10000; // int
		Long l = 100000L; // long

		System.out.println(b);
		System.out.println(s.shortValue());
		System.out.println(i);
		System.out.println(l);

		// saltar linha
		System.out.println("\n\n");

		Boolean bo = true;

		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
	}
}
