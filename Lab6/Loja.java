package Lab6;

public class Loja {
	Loja(){}
	
	private long id;
	private String nome;
	private CategoriaLoja categoria;
	
	void verificaEstoque() {}
	
	void verificaCliente(Cliente cliente){}
	
	void fazerPedido(){}
	
	void realizarVenda(Cliente cliente, ItemProduto item){}
	
	void adicionaCliente(long id, String nome, int idade, String cPF ){
		Cliente cx = new Cliente( id, nome, idade, cPF);
		System.out.println("Cliente '"+ cx.getNome()+"' cadastrado com sucesso!");
		System.out.println("ID: " + cx.getId());
		System.out.println("Idade: " + cx.getIdade());
		System.out.println("CPF: " + cx.getCPF());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaLoja getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLoja categoria) {
		this.categoria = categoria;
	}
	
	
	
}
