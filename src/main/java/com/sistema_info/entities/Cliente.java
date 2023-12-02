package com.sistema_info.entities;

public class Cliente {
	Cliente(){}
	
	Cliente(long id, String nome, int idade, String cPF) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		CPF = cPF;
	}

	private long id;
	private String nome;
	private int idade;
	private String CPF;
	
	public boolean validaSaldo() {
		return true;
	}
	
	public void realizarCompra() {
		
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
}
