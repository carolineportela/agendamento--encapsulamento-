package br.senai.sp.jandira.model;

public class Medico {
	
	//atributos
        private static int contador = 999;
        private Integer codigo;
	private String nome;
	private Especialidade[] especialidades;
	private String telefone;
	private String email;
	private String crm;
	
        
	
        //construtor
	public Medico(String nome, String telefone, String email, String crm){
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            gerarCodigo();
        }
        
	//metodos
        private void gerarCodigo(){
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
	
	
	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidades = especialidade;
	}
	public Especialidade[] getEspecialidade() {
		return especialidades;
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

    public void set(int indexOf, Medico medicoAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}