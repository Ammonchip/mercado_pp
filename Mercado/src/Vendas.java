
public class Vendas {

	private String codigo;
	private String medida;
	private int quantidade;
	private String descricao;
	private float compra;
	private float venda;

	public Vendas(String codigo, String descricao, String medida, int quantidade, float compra, float venda) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setMedida(medida);
		this.setQuantidade(quantidade);
		this.setCompra(compra);
		this.setVenda(venda);
	}

	public float getVenda() {
		return venda;
	}

	public void setVenda(float venda) {
		this.venda = venda;
	}

	public float getCompra() {
		return compra;
	}

	public void setCompra(float compra) {
		this.compra = compra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
