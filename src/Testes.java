import java.util.Arrays;
import java.util.List;

public class Testes {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Luca", "Gui", "Ga", "Lua", "Ana", "Leo");

		System.out.println("Método contains default de list");
		System.out.println(list.contains("Luca"));

		System.out.println("Todos se chamam Luca ?");
		System.out.println(list.stream().allMatch(n -> n == "Luca"));
		System.out.println("Alguem se chamam Luca ?");
		System.out.println(list.stream().anyMatch(n -> n == "Luca"));
		System.out.println("Ninguém se chamam Luca ?");
		System.out.println(list.stream().noneMatch(n -> n == "Luca"));
	}
}
