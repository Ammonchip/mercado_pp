import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe UsuarioDAO - usada para acessar a base de dados dos usuarios do sistema
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class UsuarioDAO extends BancoDeDados{
	
	public Usuario getUsuario(String nome) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM usuarios WHERE usuario='"+ nome +"';");
			if (rs.next()) {
				return new Usuario(rs.getString(2), rs.getString(3));
			} else return null;
			
		} catch(SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
	}
}
