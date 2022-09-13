package classes;

public class ChalengeVarOutsideMain {
	
	//desafio utilizar essa variável dentro do main
	//o erro decorre do seguinte
	//main é um método static portanto dentro da classe só pode acessar dados estáticos
	//porém o 'int a' é um dado de instância
	int a = 777;
	
	public static void main(String[] args) {
		//para resolver o problema é necessário criar um instância da classe
		ChalengeVarOutsideMain response = new ChalengeVarOutsideMain();
		System.out.println(response.a);
	}
}
