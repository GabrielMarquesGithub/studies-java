package oo.order.entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	private String name;
	private String email;

	private String birthDate;
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Client(String name, String email, String birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return LocalDate.parse(birthDate, dateFormat).format(dateFormat);
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
