package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program2 {
	public static void main(String[] args) {

		String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\assets\\file.txt";

		// como não vamos usar o finally não é necessário declarar as variareis no bloco
		// superior

		// o try já recebe o recurso de stream
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// retorna null quando não a mais linha para ler
			String line = br.readLine();

			while (line != null) {
				System.out.println(line + " BufferedReader");
				// passando nova linha ao line
				line = br.readLine();
			}

			// IOException I/O Input Output exceptions
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}
}
