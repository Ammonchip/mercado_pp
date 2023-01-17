import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe ListaDeVendasDAO - usada para acessar a base de dados referente a lista de vendas
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class ListaDeVendasDAO extends BancoDeDados {
	
	/**
     * Adiciona uma lista de vendas na base de dados
     * @return Boolean 
     */
	public Boolean addNewListaDeVendas() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.executeUpdate("insert into listadevendas values(null, null, null, null, null);");
			return true;
			
		} catch(SQLException e) {
			System.out.println("Falha na conexão");
			return false;
		}
	}
	
	/**
     * Retorna uma lista de todas as listas de vendas da base de dados
     * @return  ArrayList<ListaDeVendas>
     */
	public ArrayList<ListaDeVendas> listaVendas() {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			ResultSet rs = statement.executeQuery("SELECT * FROM listadevendas");
			ArrayList<ListaDeVendas> listadelistadevendas = new ArrayList<ListaDeVendas>();
			while (rs.next()) {
				ListaDeVendas listadevendas = new ListaDeVendas(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
		        listadelistadevendas.add(listadevendas);
		    }
			return listadelistadevendas;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return null;
		}
		
	}
	
	/**
     * Atualiza valores de uma lista de venda pelo id
     * @return  Boolean
     */
	public boolean atuListaDeVendas(ListaDeVendas listadevendas) {
		try (Connection conn = DriverManager.getConnection(dbURL, username, password);
				Statement statement = conn.createStatement();) {
			statement.execute("USE mercadodb;");
			statement.execute("UPDATE listadevendas SET forma_pagamento='"+listadevendas.getForma_pagamento()+
														 "', total_pagamento='"+Float.toString(listadevendas.getTotal_pagamento())+
														 "', preco_total='"+Float.toString(listadevendas.getPreco_total())+
														 "', troco='"+listadevendas.getTroco()+
														 "' WHERE id = '"+Integer.toString(listadevendas.getId())+"';");
			return true;

		} catch (SQLException e) {
			System.out.println("Falha na conexão");
			return false;
		}
	}
	
}
