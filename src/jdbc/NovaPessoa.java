package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner key = new Scanner(System.in);
		System.out.println("Pessoa a ser adiconada: ");
		String nome = key.nextLine();

		key.close();

		Connection connection = ConnectionCreator.getConnection();

		String sql = "INSERT INTO pessoas (nome) VALUES(?)";

		// para evitar SQL injections usamos o PreparedStatement
		PreparedStatement stmt = connection.prepareStatement(sql);
		// ele garante que o que foi digitado será tratado como string impossibilitando
		// SQL injections
		stmt.setString(1, nome);

		stmt.execute();

		System.out.println("Dado inserido com sucesso");

		connection.close();
	}
}
