package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoSaude {

	private String operadora;
	private String categoria;
	private String numerodacarteira;
	private LocalDate validade;
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNumerodacarteira() {
		return numerodacarteira;
	}

	public void setNumerodacarteira(String numerodacarteira) {
		this.numerodacarteira = numerodacarteira;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getOperadora() {
		return operadora;
	}
	
	
}
