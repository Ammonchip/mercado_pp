import java.sql.*;

public class BancoDeDados {
  private static String url = "jdbc:mysql://localhost";
  private static String user = "root";
  private static String pass = "root";
  private static String sql = "CREATE DATABASE IF NOT EXISTS citacoesbd";
  protected static Connection conexao = null;

  public BancoDeDados() {
    if (conexao == null) conecta();
  }

  private static boolean conecta() {
    try {
      conexao = DriverManager.getConnection(url, user, pass);
      PreparedStatement stmt = conexao.prepareStatement(sql); 
      stmt.execute();
      
      return true;
    }
    catch (SQLException e) {
      //e.printStackTrace(); 
        return false; 
    }
     
  }

  public static boolean desconecta() {
    try {
      conexao.close();
      return true;
    } catch (SQLException e) { return false; }
  }
}
