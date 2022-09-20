package readingFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		File file = new File(
				"C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\workWithFiles\\assets\\file.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			// hasNextLine testa se existe um próxima linha a ser lida automaticamente
			while (sc.hasNextLine()) {
				// vai dar print na próxima linha
				System.out.println(sc.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			// o erro pod acontecer antes da então para evitar null pointer testamos se o
			// scanner não é null
			if (sc != null) {
				// para evitar o corta na execução do try com erro o ideal é fechar no finally
				sc.close();
			}
		}
	}
}
