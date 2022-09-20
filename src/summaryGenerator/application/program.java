package summaryGenerator.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		String purchasesPath = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\purchases";
		Scanner key = new Scanner(System.in);

		// pegando o diretório dos pedidos
		File purchasesFolder = new File(purchasesPath);
		// filtrando os pedidos
		File[] purchases = purchasesFolder.listFiles(File::isFile);

		System.out.println("Pedidos salvos:");
		for (File file : purchases) {
			System.out.println(file.getName());
		}

		System.out.print("Pedido para se criar um resumo: ");
		String chosenFile = key.nextLine();

		key.close();

		boolean invalidFile = true;
		for (File file : purchases) {
			if (file.getName().equals(chosenFile))
				invalidFile = false;
		}

		if (invalidFile) {
			throw new IllegalArgumentException("Arquivo invalido");
		}

		String chosenFilePath = purchasesPath + "\\" + chosenFile;
		String chosenFilePathOut = purchasesPath + "\\out\\" + chosenFile;

		try (BufferedReader br = new BufferedReader(new FileReader(chosenFilePath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(chosenFilePathOut))) {

			// ler arquivo
			String line = br.readLine();
			while (line != null) {
				String[] data = line.split(",");

				// escrevendo
				bw.write(data[0] + ", " + (Double.parseDouble(data[1])) * Integer.parseInt(data[2]));
				bw.newLine();

				// chamando próxima linha
				line = br.readLine();
			}

			System.out.println("Resumo do pedido criado com sucesso");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
