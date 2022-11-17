package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    //os atributos de uma classe sempre devem ser privados.
   
    private String nome;
    private String descricao;
    private static int contador = 99; 
    private Integer codigo; 
    

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
       //forma de quando o objeto especialidade for criado,devemos sempre dar um nome
      //construtor que exige algo
     //add um contator
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
      //exigindo que quando o objeto for criado exiga um nome e uma descrição
     

    }
    public Especialidade(String nome, String descricao, Integer codigo) { 
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }


    public Especialidade() {
       gerarCodigo();
      

    }
    
    private void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
        
    }

    //métodos de acesso aos atributos que estão na outra classe set e get
    
    public void setNome(String nome) {

        if (nome.length() >= 3) { //definindo o tamanho do nome
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + "não é um nome válido \ndeve conter três letras");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + "Deve conter 10 caracteres");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }

    public  int getContador() {
        return contador;
    } 

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getEspecialidadeSepadaradaPorPontoEVirgula(){
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }
    
    
}

//this.nome está indicando que o nome dessa classe irá receber o nome que esta vindo pelo argumento
