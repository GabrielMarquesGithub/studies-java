package fundamentos;

//import no java
import java.util.Scanner;//scanner vem de utils

public class ScannerType {
	public static void main(String[] args) {

		// instanciando um scanner - system.in faz referencia ao teclado
		Scanner keyboard = new Scanner(System.in);

		// usando print normal pois não é necessário quebrar linha
		System.out.print("Qual o sua idade?");
		// byte é o suficiente para guardar idade
		byte age = keyboard.nextByte();// esse método 'pega' p próximo byte digitado
		keyboard.nextLine();// isso foi usado para 'pega' o '/n' deixado quando digitamos enter para
							// confirmar

		System.out.print("Qual o seu nome?");
		String name = keyboard.nextLine();// pega a próxima linha, como pega a linha toda não pe necessário capturar o
											// '/n'

		System.out.print("Qual o seu sobrenome?");
		String lastName = keyboard.nextLine();

		// após usar algumas funcionalidade é necessário as fechar pera evitar
		// desperdício de memorial
		keyboard.close();

		// método format retorna uma string formatada como em um 'printf'
		String response = String.format("Idade: %d\n Nome: %s\n Sobrenome: %s", age, name, lastName);

		System.out.println(response);
	}
}
