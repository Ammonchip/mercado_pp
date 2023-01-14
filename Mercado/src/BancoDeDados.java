import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
	
	protected static String dbURL = "jdbc:mysql://localhost:3306/";
	protected static String username = "root";
	protected static String password = "root";
	
	public static void Inicializa() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				ResultSet resultSet = conn.getMetaData().getCatalogs();
				Statement statement = conn.createStatement();){
			Boolean achou = false;
			while (resultSet.next() && !achou) {
				// Get the database name, which is at position 1
				String databaseName = resultSet.getString(1);
				System.out.println(databaseName);
				if(databaseName.equals("mercadodb")) achou = true;
			}
			
			if(!achou) {
				statement.execute("CREATE DATABASE MercadoDB;");
				statement.execute("USE MercadoDB;");
				statement.execute("CREATE TABLE usuarios (" +
										"id INT NOT NULL PRIMARY KEY AUTO_INCREMENT," +
										"usuario VARCHAR(20)," +
										"senha VARCHAR(20));");
				statement.execute("INSERT INTO usuarios VALUES (NULL, \"admin\", \"admin\"), (NULL, \"operador\", \"1234\");");
				statement.execute("CREATE TABLE produtos ("
						+ "						id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,"
						+ "                        codigo varchar(20),"
						+ "                        descricao varchar(100),"
						+ "                        venda float,"
						+ "                        quantidade int,"
						+ "                        medida varchar(10),"
						+ "                        compra float);");
			}
		     
			System.out.println("Connected!"); 
			} catch (SQLException ex) {
				System.out.println("Connection Failed!");
				ex.printStackTrace();
		}
		
	}
	
	/* 
	} //SELECT * FROM personagens WHERE apelido='groot'*/
}
