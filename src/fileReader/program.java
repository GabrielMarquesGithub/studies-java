package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {
	public static void main(String[] args) {

		String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\assets\\file.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// recebe o caminho do arquivo para ler e cria um stream
			fr = new FileReader(path);

			// recebe já uma stream e implementa um esquema de buffer
			br = new BufferedReader(fr);

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
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// imprime o erro em um formato completo
				// vai ser utilizada pois um erro ao dar close é algo que realmente não pod
				// ocorrer
				e.printStackTrace();
			}

		}

	}
}
