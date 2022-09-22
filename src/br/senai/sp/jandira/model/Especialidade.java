package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	//os atributos de uma classe sempre devem ser privados.
	private String nome;
	private String descricao;
	
	
	//Construtores da classe
	public Especialidade (String nome) {
		this.nome = nome; //forma de quando o objeto especialidade for criado,devemos sempre dar um nome
		
		//construtor que exige algo
	}
	
	public Especialidade (String nome , String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		 
	}
	
	public Especialidade (){
	
		
	}
		
      //métodos de acesso aos atributos que estão na outra classe set e get	
       public void setNome(String nome) {
    	   
    	if(nome.length()>=3) { //definindo o tamanho do nome
    		this.nome = nome;
    	} else {
    		JOptionPane.showMessageDialog(null, nome + "não é um nome válido \ndeve conter três letras");
    	}
    	
    	
    }
    
    public String getNome() {
    	return nome;
    }
    
    
    public void setDescricao (String descricao) {
    	if(descricao.length()>=10) {
    		this.descricao = descricao;  		
    	} else {
    		JOptionPane.showMessageDialog(null, descricao + "Deve conter 10 caracteres");
    	}
    }
    public String getDescricao() {
    	return this.descricao;
    }
}

//this.nome está indicando que o nome dessa classe irá receber o nome que esta vindo pelo argumento