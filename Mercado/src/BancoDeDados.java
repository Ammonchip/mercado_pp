import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {
	
	protected static String dbURL = "jdbc:mysql://localhost:3306/";
	protected static String username = "root";
	protected static String password = "root";
	
	public static void Inicializa() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();){
			statement.execute("CREATE DATABASE IF NOT EXISTS MercadoDB;");
			statement.execute("USE MercadoDB;");
			statement.execute("CREATE TABLE IF NOT EXISTS usuariosDB (" +
									"id INT NOT NULL PRIMARY KEY AUTO_INCREMENT," +
			                        "usuario VARCHAR(20)," +
			                        "senha VARCHAR(20));");
			//statement.execute("INSERT INTO usuariosDB VALUES (NULL, \"admin\", \"admin\"), (NULL, \"operador\", \"1234\");");
		
			
			
			
		     
		    // code to execute SQL queries goes here...
			System.out.println("Connected!"); 
			} catch (SQLException ex) {
				System.out.println("Connection Failed!");
				ex.printStackTrace();
		}
		
	}
	
	/* 
	} //SELECT * FROM personagens WHERE apelido='groot'*/
}
