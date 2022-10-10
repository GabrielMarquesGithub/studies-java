package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionCreator.getConnection();

		String sql = "SELECT * FROM pessoas";

		Statement stmt = connection.createStatement();
		// executeQuery retorna um result
		ResultSet res = stmt.executeQuery(sql);

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

		stmt.close();
		connection.close();
	}
}
