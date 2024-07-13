package PassosCriarCRUD;

public class PassosCRUD {
/*
	 
1º - Após criar o projeto no Eclipse importar as dependência Maven e postgresql no arquivo pom.xml
	 
	 Dependencias junit
	 <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
    
    Dependencias postgresql
    
     <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
	<dependency>
	    <groupId>org.postgresql</groupId>
	    <artifactId>postgresql</artifactId>
	    <version>9.4-1200-jdbc41</version>
	</dependency>
	
-------------------------------------------------------------------------------------------------------------
2º - Criar o banco de dados no postgresql, pode criar pelo próprio gerenciador ou utilizar o comando abaixo:
	
		CREATE DATABASE posjava
	    WITH OWNER = postgres
	       ENCODING = 'UTF8'
	       TABLESPACE = pg_default
	       LC_COLLATE = 'Portuguese_Brazil.1252'
	       LC_CTYPE = 'Portuguese_Brazil.1252'
	       CONNECTION LIMIT = -1;
	
-------------------------------------------------------------------------------------------------------------
3º - Criar um Package conexaojdbc dentro da pasta src/main/java e criar a classe de conexão "ConexaoBD"
	
	package conexaojdbc;

    import java.sql.Connection;
    import java.sql.DriverManager;

    public class ConexaoBD {

	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	private static String password = "admin";
	private static String user = "postgres";
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

	
-------------------------------------------------------------------------------------------------------------
4º - Criar uma classe "TesteBancojdbc" dentro da pasta src/teste/java para teste da conexão do banco com o eclipse e faezer o teste
	
	package ProjetoJDBC_CRUD.ProjetoJDBC_CRUD;
	
	import org.junit.Test;
	
	import conexaojdbc.ConexaoBD;
	
	public class TesteBancojdbc {
	
		@Test
		public void initBanco() {
			ConexaoBD.getConnection();
	}
	}

	
    
    
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

}
