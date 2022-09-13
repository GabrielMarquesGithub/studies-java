package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// No java existem 8 tipos primitivos
		// 6 para números e 1 para caracteres 1 para boolean

		// 1 byte == 8 bits

		// tipos para números inteiros
		// o byte armazena 1 byte tem um intervalo de +-128
		byte a = 127;
		// o short armazena 2 bytes tem um intervalo de +-32000
		short b = 32000;
		// o int armazena 4 bytes tem um intervalo de +-2 bilhões
		int c = 2_000_000_000;
		// o long armazena 8 bytes tem um intervalo que você não vai conseguir encher
		long d = 3_000_000_000L;
		// quando se escreve um literals para long deve-se utilizar o L no final

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// tipos para números flutuantes
		// o float armazena 4 bytes tem um intervalo de +-2 bilhões
		float e = 1000.11F; //deve-se usar F em literals float
		// o double armazena 8 bytes tem um intervalo que você não vai conseguir encher
		double f = 32000.3333;

		System.out.println(e);
		System.out.println(f);

		// tipo boolean
		// o boolean só pode ser true or false
		boolean x = true;

		System.out.println(x);

		// tipo caractere
		// o char é representa qualquer caractere
		char z = 'c'; // pode ser '', 'c', '1', '?'
		//aspas simples para char e aspas duplas pra Strings

		System.out.println(z);

	}
}
