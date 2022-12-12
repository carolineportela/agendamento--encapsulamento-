package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    //atributos
    private static int contador = 999;
    private Integer codigo;
    private String nome;
    private ArrayList<Especialidade> especialidades;
    //private ArrayList<Especialidade> especialidade;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataNascimento;

    //construtor
    public Medico(String nome, String telefone, String email, String crm, LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataNascimento = dataNascimento;
        gerarCodigo();
    }

    public Medico(Integer codigo, String nome, String telefone, String email, String crm, LocalDate dataNascimento) {
        this.codigo = codigo;

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataNascimento = dataNascimento;
        gerarCodigo();
    }

    public Medico(Integer codigo, String nome, String telefone, String email, String crm, LocalDate dataNascimento, ArrayList<Especialidade> especialidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.dataNascimento = dataNascimento;
        this.especialidades = especialidade;
        gerarCodigo();
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;

    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public Medico() {
        gerarCodigo();
    }

    //metodos
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void set(int indexOf, Medico medicoAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMedicoSepadaradaPorPontoEVirgula() {
        
       
        
        
        return this.codigo + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.crm + ";" + this.dataNascimento + ";" + getCodigoEspecialidade();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCodigoEspecialidade() {
        String codigoEspecialidades = "";
        for (Especialidade especialidade : especialidades) {
            codigoEspecialidades += especialidade.getCodigo() + "&";
        }
        System.out.println(codigoEspecialidades);
        return codigoEspecialidades;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";"
                + this.nome + ";"
                + this.telefone + ";"
                + this.email + ";"
                + this.crm + ";"
                + this.dataNascimento + ";"
                + getCodigoEspecialidade();
    }

}
