package br.senai.sp.jandira.model;

public class Endereco {
	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String complemento;
	private String estado;
	private String cep;
	
	public void setlogradouro(String logradouro) {
		this.logradouro = logradouro;
			
	}
	public String getlogradouro () {
		return logradouro;
	}
	
	public void setnumero ( String numero) {
		this.numero = numero;
		
	}
	public String getnumero () {
		return numero;
	}
	
	public void setbairro (String bairro) {
		this.bairro = bairro;
	}
	
	public String getbairro() {
		return bairro;
		
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return complemento;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCep() {
		return cep;
	}

}
