import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe VendasDAO - usada para acessar a base de dados referente as vendas
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class VendasDAO extends BancoDeDados {
	/**
     * retorna uma lista de produtos da base de dados
     * @return ArrayList<Produto>
     */
	public ArrayList<Produto> listaProduto(ListaDeVendas listadevendas) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM vendas where listadevendas_id="+Integer.toString(listadevendas.getId())+";");
			ArrayList<Produto> listadeprodutos = new ArrayList<Produto>();
			while (rs.next()) {
				Produto produto = new Produto(rs.getString(3), rs.getString(4), rs.getString(7), rs.getInt(6), rs.getFloat(5), rs.getFloat(8));
		        listadeprodutos.add(produto);
		    }
			return listadeprodutos;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
		
	}
	/**
     * adiciona um produto na base de dados
     * @return Boolean
     */
	public Boolean addProduto(Produto produto, ListaDeVendas listadevendas) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.executeUpdate("insert into vendas values(NULL" +
					", '" + listadevendas.getId() + 
					"', '" + produto.getCodigo() + 
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

}
