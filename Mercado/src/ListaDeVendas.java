
public class ListaDeVendas {
	private int id;
	private String forma_pagamento;
	private float total_pagamento;
	private float preco_total;
	private float troco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTotal_pagamento() {
		return total_pagamento;
	}
	public void setTotal_pagamento(float total_pagamento) {
		this.total_pagamento = total_pagamento;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public float getPreco_total() {
		return preco_total;
	}
	public void setPreco_total(float preco_total) {
		this.preco_total = preco_total;
	}
	public float getTroco() {
		return troco;
	}
	public void setTroco(float troco) {
		this.troco = troco;
	}
	
}
