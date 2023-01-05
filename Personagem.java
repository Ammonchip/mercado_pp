public class Personagem {
    private int id;
    private String apelido;
    private String nome;
    private String filme;
    private Citacao[] citacoes;
  
    public Personagem(String apelido, String nome, String filme) {
      this.apelido = apelido;
      this.nome = nome;
      this.filme = filme;
    }
  
    // Getters e Setters ...
    public String getApelido() {
        return apelido;
    }

    public String getNome() {
        return nome;
    }

    public String getFilme() {
        return filme;
    }
}
  