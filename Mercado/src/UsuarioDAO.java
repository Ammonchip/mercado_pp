import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO extends BancoDeDados{
	
	public Usuario getUsuario(String nome) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM usuariosdb WHERE usuario='"+ nome +"';");
			if (rs.next()) {
				return new Usuario(rs.getString(2), rs.getString(3));
			} else return null;
			
		} catch(SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
	}
}
