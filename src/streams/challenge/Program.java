package streams.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\assets\\produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			// armazenar na lista os produtos
			while (line != null) {
				String[] productPrev = line.split(",");
				products.add(new Product(productPrev[0], Double.parseDouble(productPrev[1])));
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		double average = products.stream().reduce(0.00, (x, e) -> x + e.getPrice(), Double::sum) / products.size();
		products = products.stream().filter(x -> x.getPrice() < average)
				.sorted((e1, e2) -> e1.getName().toLowerCase().compareTo(e2.getName().toLowerCase()))
				.collect(Collectors.toList());

		// list recebem funções de interação
		products.forEach(System.out::println);
	}
}
