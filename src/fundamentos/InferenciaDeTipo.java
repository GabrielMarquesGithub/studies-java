package fundamentos;

public class InferenciaDeTipo {
	public static void main(String[] args) {
		//o Java permite inferência de tipos na inicialização de uma variável
		//basta utilizar o VAR e atribuir um valor
		//porém o tipo atribuindo é permanente 
		var a = 12;
		var b = "teste";
		// a = 2 // a foi inferida como int então pode receber 2
		// a = "string" // a foi inferida como int então não pode receber um string
		System.out.println(a);
		System.out.println(b);
	}
}
