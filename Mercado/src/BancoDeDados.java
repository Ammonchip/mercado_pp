import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe BancoDeDados - usada para inicializar o banco de dados e fazer conexão em suas classes filhas
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class BancoDeDados {
	
	protected static String dbURL = "jdbc:mysql://localhost:3306/";
	protected static String username = "root";
	protected static String password = "root";
	
	public static void Inicializa() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				ResultSet resultSet = conn.getMetaData().getCatalogs();
				Statement statement = conn.createStatement();){
			Boolean achou = false;
			System.out.println("procurando base de dados mercadodb...");
			while (resultSet.next() && !achou) {
				// Get the database name, which is at position 1
				String databaseName = resultSet.getString(1);
				System.out.println(databaseName);
				if(databaseName.equals("mercadodb")) achou = true;
			}
			
			if(!achou) {
				System.out.println("database não encontrada! criando nova base de dados...");
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
				
				statement.execute("CREATE TABLE listadevendas (\r\n"
						+ "						id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,\r\n"
						+ "                        forma_pagamento VARCHAR(20),\r\n"
						+ "                        total_pagamento float,\r\n"
						+ "                        preco_total float,\r\n"
						+ "                        troco float);");
				
				statement.execute("insert into listadevendas values (null, null, null, null, null);");
				
				statement.execute("CREATE TABLE vendas (\r\n"
						+ "  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,\r\n"
						+ "  listadevendas_id int,\r\n"
						+ "  codigo varchar(20) DEFAULT NULL,\r\n"
						+ "  descricao varchar(100) DEFAULT NULL,\r\n"
						+ "  venda float DEFAULT NULL,\r\n"
						+ "  quantidade int DEFAULT NULL,\r\n"
						+ "  medida varchar(10) DEFAULT NULL,\r\n"
						+ "  compra float DEFAULT NULL,\r\n"
						+ "  FOREIGN KEY (listadevendas_id) REFERENCES listadevendas(id)\r\n"
						+ ")");
				
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
