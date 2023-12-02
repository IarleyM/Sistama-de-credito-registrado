package com.sistema_info.dao;

import java.util.Objects;

import com.sistema_info.entities.Usuario;

public class ClienteDao {
	private Long id;
	private String nome;
	private int idade;
	private String CPF;
	
	public ClienteDao() {}

	public ClienteDao(Usuario usuario) {
		id = usuario.getId();
		nome = usuario.getNome();
		idade = usuario.getIdade();
		CPF = usuario.getCPF();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteDao other = (ClienteDao) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
