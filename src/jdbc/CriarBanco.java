package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	// getConnection lança uma exceção
	public static void main(String[] args) throws SQLException {

		Connection conexao = ConnectionCreator.getConnection();

		// criar um Statement
		Statement stmt = conexao.createStatement();
		// executando linhas de SQL via java
		// IF NOT EXISTS linha de comando SQL para criar apenas se não existir
		stmt.execute("CREATE DATABASE IF NOT EXISTS via_java");

		System.out.println("Linhas executadas com sucesso");
		// para encerrar a conexão
		conexao.close();
	}
}
