package Lab6;

public class ItemProduto {
	ItemProduto(){}
	
	private int quantidade;
	private Double preco;
	
	Double subTotal() {
		return 0.0;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
