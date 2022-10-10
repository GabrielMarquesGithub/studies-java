package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
	public static Connection getConnection() {
		try {
			Properties prop = getProperties();

			final String url = prop.getProperty("db.url");
			// string user e password
			final String user = prop.getProperty("db.user");
			final String password = prop.getProperty("db.password");

			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	// utilizando as props
	private static Properties getProperties() throws IOException {
		// instanciando props
		Properties prop = new Properties();
		InputStream stream = new FileInputStream(
				"C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Estudos\\java\\exercicios\\assets\\local.properties");
		// dando load na properties
		prop.load(stream);
		return prop;
	}
}
