package fundamentos;

public class TipoString {
	public static void main(String[] args) {

		// string se difere de um tipo primitivo e não é uma palavra reservada
		// Em java tipos não primitivos possuem notação de ponto
		// Que dão acesso a seus métodos
		String s = "Palavra X";// strings devem ser em aspas duplas
		s = s.toUpperCase();// deixar letras maiúsculas
		s = s.replace("X", "nova");// fazer trocas
		s.substring(1, 3);// cortar palavras como o 'slice'

		// startsWith realiza comparação se a palavra
		// inicia com a string passada a ele
		System.out.println(s.startsWith("PALA"));
		// startsWith testa o final da strings
		System.out.println(s.endsWith("nova"));

		// verifica se a string é igual a recebida pelo método
		System.out.println(s.equals("PALAVRA nova"));
		// verifica se a string é igual e ignora letras ou minúsculas
		System.out.println(s.equalsIgnoreCase("palavra nova"));
		// verifica se a string é contem uma outra
		System.out.println(s.contains("ova"));
		System.out.println(s);
	}
}
