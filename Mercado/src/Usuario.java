
/**
 * Classe Usuarios - representa os usuarios do sistema
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class Usuario {
	private String 
		nome,
		senha;
	/**
     * Construtor da classe.
     * @param nome nome do usuario
     * @param senha senha do usuario
     */
	public Usuario(String nome, String senha) {
		this.setNome(nome);
		this.setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
