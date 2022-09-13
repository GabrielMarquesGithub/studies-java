package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		//para definições de constantes no JAVA se utiliza da palavra 'final'
		//basicamente referencia que este é o valor final da palavra
		
		//não é algo imposto pela linguagem mas temos como convenção 
		//a utilização de palavras maiúsculas para constantes
		final double PI = 3.14159;

		/*
		 * java é uma linguagem fortemente tipada, sendo assim é necessário
		 * a declaração do tipo antes do nome da variável
		*/
		double area = raio * raio * PI;
		System.out.println(area);

		raio = 10;
		area = raio * raio * PI;
		//como no JS o Java permite a concatenação de palavras e variareis
		System.out.println("Area = " + area);

	}
}
