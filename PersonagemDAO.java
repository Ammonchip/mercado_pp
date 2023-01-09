import java.sql.*;

public class PersonagemDAO extends BancoDeDados {

  public void listarPersonagens() {
    try {
      Statement st = conexao.createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM personagens");
      while (rs.next()) {
        System.out.println("Personagem " + rs.getString(2) + 
                           " (" + rs.getString(3) + ")" +
                           " do filme " + rs.getString(4));
      }
    }
    catch (SQLException e) { }
  }

  public boolean adicionarPersonagem(Personagem p) {
    try {
      Statement st = conexao.createStatement();
      st.executeUpdate("INSERT INTO personagens VALUES (NULL, '"
                       + p.getApelido() + "'," + " '" + p.getNome()
                       + "', '" + p.getFilme() + "')");
      return true;
    } catch (SQLException e) { return false; }
  }



  public static void main(String args[]) {
    PersonagemDAO personagemDAO = new PersonagemDAO();
    Personagem personagem = new Personagem("Drax", "Drax the Destroyer", "Guardians of the Galaxy");
    personagemDAO.adicionarPersonagem(personagem);
    personagemDAO.listarPersonagens();
  }
}



