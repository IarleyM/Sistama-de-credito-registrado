package Lab6;

import java.sql.Date;

public class Compra {
	Compra(){}
	
	private Long id;
	private Date date;
	private String statusPagamento;
	
	public String mostraDescrição() {
		return null;
	}
	
	public boolean verificaEstoque(){
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	
}
