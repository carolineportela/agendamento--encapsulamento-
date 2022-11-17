package br.senai.sp.jandira.model;

import java.time.LocalDate;



public class PlanoDeSaude {

private static int contador = 99;
private String operadora;
private String categoria;
private String numero;
private LocalDate validade;
private Integer codigo;
private static int quantidade;

    public PlanoDeSaude(String numero, String categoria, String operadora, LocalDate validade) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            gerarCodigo();

    }
    
     public PlanoDeSaude( Integer codigo,                                                                                                     String numero, String categoria, String operadora, LocalDate validade) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            

    }

public PlanoDeSaude(String operadora) {
	this.operadora = operadora;
	gerarCodigo();
}

public PlanoDeSaude() {
        	gerarCodigo();
}

public void setOperadora(String operadora) {
	this.operadora = operadora;
}
public String getOperadora() {
	return operadora;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public String getCategoria() {
	return categoria;
}


public void setNumero(String numero) {
	this.numero = numero;
}
public String getNumero() {
	return numero;
}

public void setValidade(LocalDate validade) {
	this.validade = validade;
}
public LocalDate getValidade() {
	return validade;
}

public static int getQuantidade() {
	return quantidade;
}

    public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}
public Integer getCodigo() {
	return codigo;
}

    private void gerarCodigo() {
    this.contador++;
    this.codigo = contador;
}
     public String getPlanoDeSaudeSeparadaPorPontoEVirgula(){
       return this.numero + ";" + this.categoria + ";" + this.operadora + ";" + this.validade;
    }
}