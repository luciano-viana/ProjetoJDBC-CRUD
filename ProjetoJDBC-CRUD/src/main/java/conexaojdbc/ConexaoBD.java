package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	//private static String url = "jdbc:sqlserver://localhost:1433;databaseName=Automacao";//String de conexão do Java com o SQL Server
	private static String user = "postgres";
	private static String password = "admin";
	private static Connection connection = null;
	

	static {
		conectar();
	}

	public ConexaoBD() {
		conectar();
	}

	private static void conectar() {
		try {

			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou com Sucesso!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
