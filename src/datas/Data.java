package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		// instanciar uma data de agora
		LocalDate data1 = LocalDate.now();
		// Instância o horário junto a data
		LocalDateTime data2 = LocalDateTime.now();
		// Instância o horário com timezone
		Instant data3global = Instant.now();

		// O método parse converte de um texto para uma data
		LocalDate data4 = LocalDate.parse("2020-07-22");

		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3global);

		System.out.println(data4);

		System.out.println("");

		// é possível criar um padrão de formato para datas
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dataFormatada = LocalDate.parse("22/10/2021", formato1);

		System.out.println(dataFormatada);
		// já uma data pode ser formatada utilizando o método format
		System.out.println(dataFormatada.format(formato1));
		// Outra maneira é usar o método condo do formato criado
		System.out.println(formato1.format(dataFormatada));

		System.out.println("");

		// Fermentando a data usando o zoneId para retornar o fuso horário da minha
		// maquina
		LocalDateTime dataLocal = LocalDateTime.ofInstant(data3global, ZoneId.systemDefault());

		System.out.println(dataLocal);
	}
}
