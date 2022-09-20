package fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {
	public static void main(String[] args) {

		String[] lines = { "Primeria escrita", "Segunda escrita", "Terceira escrita" };

		String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\assets\\saida.txt";

		// ao passar true como segundo argumento de FileWriter o arquivo não será
		// recriado e sim editado
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String line : lines) {
				// ao escrever não ocorre a quebra de linhas automaticamente
				bw.write(line);
				// para quebrar linha
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
