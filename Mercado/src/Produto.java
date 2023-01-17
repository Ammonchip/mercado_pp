
/**
 * Classe Produto - Representa os produtos do super mercado
 * @author Paulo Freitas &lt;paulo.freitas@icomp.ufam.edu.br&gt;
 * @version 1.00, 2023-01-15
 */

public class Produto {
	private String 
		codigo,
		descricao,
		medida;
	private int 
		quantidade;
	private float 
		compra, 
		venda;
	
	/**
     * Construtor da classe.
     * @param codigo 
     * @param descricao
     * @param medida 
     * @param quantidade
     * @param compra
     * @param venda
     */
	public Produto(String codigo, String descricao, String medida, int quantidade, float compra, float venda) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.medida = medida;
		this.quantidade = quantidade;
		this.compra = compra;
		this.venda = venda;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getCompra() {
		return compra;
	}
	public void setCompra(float compra) {
		this.compra = compra;
	}
	public float getVenda() {
		return venda;
	}
	public void setVenda(float venda) {
		this.venda = venda;
	}
	
	
}
