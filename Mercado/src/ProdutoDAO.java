import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe ProdutoDAO - usada para acessar o banco de dados relaciodaos aos produtos
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class ProdutoDAO extends BancoDeDados {

	/**
     * Adiciona um produto a base de dados
     * @return Boolean
     */
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
	/**
     * retorna uma lista de produtos da base de dados
     * @return ArrayList<Produto>
     */
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
	/**
     * remove um produto a base de dados
     * @return Boolean
     */
	public Boolean remProduto(Produto produto) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.executeUpdate("DELETE FROM produtos WHERE codigo = '"+produto.getCodigo()+"';");
			return true;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return false;
		}
	}

	/**
     * Atualiza um produto a base de dados
     * @return Boolean
     */
	public boolean atuProduto(Produto produto) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.execute("UPDATE produtos SET descricao='"+produto.getDescricao()+
														 "', venda="+Float.toString(produto.getVenda())+
														 ", quantidade="+Integer.toString(produto.getQuantidade())+
														 ", medida='"+produto.getMedida()+
														 "', compra="+Float.toString(produto.getCompra())+
														 " WHERE codigo = '"+produto.getCodigo()+"';");
			return true;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return false;
		}
	}
	/**
     * Busca um produto a base de dados
     * @return Boolean
     */
	public Produto BuscaProduto(String codigo) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM produtos where codigo='"+codigo+"';");
			Produto produto = null;
			while (rs.next()) {
				produto = new Produto(rs.getString(2), rs.getString(3), rs.getString(6), rs.getInt(5), rs.getFloat(7), rs.getFloat(4));
		    }
			return produto;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
	}
}
