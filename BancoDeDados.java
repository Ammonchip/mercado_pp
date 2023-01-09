import java.sql.*;

public class BancoDeDados {
  private static String url = "jdbc:mysql://localhost";
  private static String user = "root";
  private static String pass = "root";
  //private static String sql = "CREATE DATABASE IF NOT EXISTS citacoesbd";

  public BancoDeDados() {
    if (conexao == null) conecta();
    
  }

  private static boolean conecta() {
    try (Connection conexao = DriverManager.getConnection(url, user, pass));
      //Statement st = conexao.createStatement();
      //st.executeQuery("CREATE DATABASE IF NOT EXISTS citacoesbd");
      //st.executeQuery("USE citacoesbd");
      //st.executeQuery("pass")
      
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
