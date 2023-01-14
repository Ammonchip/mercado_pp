import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VendasDAO extends BancoDeDados {
	
	public ArrayList<Vendas> listaProduto() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM vendas");
			ArrayList<Vendas> listadeprodutos = new ArrayList<Vendas>();
			while (rs.next()) {
				Vendas produto = new Vendas(rs.getString(2), rs.getString(3), rs.getString(6), rs.getInt(5), rs.getFloat(7), rs.getFloat(4));
		        listadeprodutos.add(produto);
		    }
			return listadeprodutos;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
		
	}

}
