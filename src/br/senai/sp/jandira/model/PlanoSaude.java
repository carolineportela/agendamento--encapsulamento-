package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoSaude {

private  String operadora;
private String categoria;
private String numero;
private LocalDate validade;
    private static int contador = 99;
    private Integer codigo;

public PlanoSaude (String numero , String operadora , String categoria){

            this.numero = numero;
            this.operadora = operadora;
            this.categoria = categoria;


}

public PlanoSaude(){

}



public void setOperadora(String operadora) {
	this.operadora = operadora;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getNumero() {
    return numero;
}

public void setNumero(String numero) {
    this.numero = numero;
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
//Public static  int getQuantidade() {
	//return quantidade;
//}

public static int getContador() {
    return contador;
}

public static void setContador(int contador) {
    PlanoSaude.contador = contador;
}

public Integer getCodigo() {
    return codigo;
}

public void setCodigo(Integer codigo) {
    this.codigo = codigo;
}
}