import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdutoDAO extends BancoDeDados {

	public Boolean addProduto(Produto produto) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.executeUpdate("insert into produtos values(NULL" +
					", '" + produto.getCodigo() + 
					"', '" + produto.getDescricao() +
					"', '" + produto.getVenda() +
					"', '" + produto.getQuantidade() +
					"', '" + produto.getMedida() +
					"', '" + produto.getCompra() + "');");
			return true;
			
		} catch(SQLException e) {
			System.out.println("Falha na conexão");
			return false;
		}
	}
	
	public ArrayList<Produto> listaProduto() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM produtos");
			ArrayList<Produto> listadeprodutos = new ArrayList<Produto>();
			while (rs.next()) {
				Produto produto = new Produto(rs.getString(2), rs.getString(3), rs.getString(6), rs.getInt(5), rs.getFloat(7), rs.getFloat(4));
		        listadeprodutos.add(produto);
		    }
			return listadeprodutos;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
		
	}
}
