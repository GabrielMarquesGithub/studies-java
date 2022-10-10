package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesquisarPessoa {
	public static void main(String[] args) throws SQLException {

		Scanner key = new Scanner(System.in);
		System.out.println("Pessoa a ser retornada: ");
		String search = key.nextLine();

		Connection connection = ConnectionCreator.getConnection();

		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%" + search + "%");

		ResultSet res = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		// retorna verdadeiro sempre enquanto ainda houver registros
		// retorna uma linha por vez
		while (res.next()) {
			// podemos pegar a coluna pelo index ou pelo nome
			int id = res.getInt("codigo");
			String nome = res.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}

		pessoas.forEach(p -> System.out.println(p.getId() + " " + p.getNome()));

		key.close();
		stmt.close();
		connection.close();
	}
}
