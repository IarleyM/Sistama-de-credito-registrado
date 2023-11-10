package Lab6;

import java.util.List;

public class Estoque {
	Estoque(){}
	
	private Long id;
	private List<ItemProduto> ItemProduto;
	
	void listarProdutos(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemProduto> getItemProduto() {
		return ItemProduto;
	}

	public void setItemProduto(List<ItemProduto> itemProduto) {
		ItemProduto = itemProduto;
	}
	
	
}
