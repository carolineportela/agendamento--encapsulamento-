package br.senai.sp.jandira;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoSaude;

//import javax.swing.JOptionPane;

public class AgendaApp {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome ("Cardiologia");
		especialidade1.setDescricao ("Cuida do seu coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrino");
		especialidade2.setDescricao("Cuida do seu ouvido");
		
		
		Especialidade especialidade3 = new Especialidade ();
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao("Cuida da sua barriga");
		
		
		Especialidade especialidade4 = new Especialidade ();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Cuida dos seus ossos");
		
		Especialidade especialidade5 = new Especialidade ();
		especialidade5.setNome("Clinico Geral");
		especialidade5.setDescricao("Cuida de tudo");
		
		  
          //Criar 2medicos com as seguintes caracteristicas utilizando vetores
		 //medico 1 clinico geral e cardiologista
	     // medico 2 fisio,cardio e clinico
		
	     Medico medico1 = new Medico ();
		medico1.setNome("Doutora Erika");
		medico1.setTelefone("11 4141-6323");
		medico1.setEmail("erika@gmail.com");
		medico1.setCrm("3711");
		medico1.getEspecialidades();
		Especialidade [] especialidades1 = {especialidade1, especialidade5};
		medico1.setEspecialidades(especialidades1);
		
		
		
		Medico medico2 = new Medico ();
		medico2.setNome("Doutor Carlos");
		medico2.setTelefone("11964697310");
		medico2.setEmail("carlos@gmail.com");
		medico2.setCrm("4000");
		Especialidade [] especialidades2 = {especialidade4,especialidade1,especialidade5};
		medico2.setEspecialidades(especialidades2);
		
		//Exibir dados dos dois medicos
		// Nome do medico :
		//CRM do medico:
		//Especialidade:
		  
		
		
		//dados do medico1
		System.out.println("Nome do médico: " + medico1.getNome());
		System.out.println("CRM do médico:" + medico1.getCrm());
		
		
		int i = 0;
		while (i < medico1.getEspecialidades().length) {
			System.out.println("Especialidades:" + medico1.getEspecialidades()[i].getNome());
			i++;	
		}
		
		
		//criar dois endereços
		Endereco endereco = new Endereco();
	    endereco.setlogradouro("Rua ana claudina");
	    endereco.setbairro("Cardoso");
	    endereco.setCidade("Itapevi");
	    endereco.setEstado("SP");
	    endereco.setCep("06654480");
	    endereco.setComplemento("Escola");
		
		Endereco endereco2 = new Endereco();
		endereco.setlogradouro("Rua Pedro Valadares");
		endereco.setbairro("Vitapolis");
		endereco.setCidade("Barueri");
		endereco.setEstado("RJ");
		endereco.setCep("9494-494");
		endereco.setComplemento("Empresa");
		
		
		//criar dois planos de saude
		PlanoSaude plano1 = new PlanoSaude();
		plano1.setOperadora("Unimed");
		plano1.setValidade(LocalDate.of(2023, 12, 31));
		plano1.setCategoria("Exclusivo");
		plano1.setNumerodacarteira("888-888");
		
		PlanoSaude plano2 = new PlanoSaude();
		plano2.setOperadora("NotreDrame");
		plano2.setValidade(LocalDate.of(2024, 8, 20));
		plano2.setCategoria("Básico");
		plano2.setNumerodacarteira("999-999");
		
		//criar dois paciente
		
		Paciente Luiz = new Paciente();
		Luiz.setNome("Luiz");
		Luiz.setDataDeNascimento(LocalDate.of(2006, 2, 15));
		Luiz.setTelefone("4002-8922");
		Luiz.setRg("9489484-4");
		Luiz.setCpf("111122-3");
		Luiz.setEndereco(endereco);
		Luiz.setPlanoSaude(plano1);
		
		Paciente carol = new Paciente();
		carol.setNome("Caroline");
		carol.setDataDeNascimento(LocalDate.of(2003, 8, 24));
		carol.setTelefone("4141-6323");
		carol.setRg("9489484-4");
		carol.setCpf("222-222");
		carol.setEndereco(endereco2);
		carol.setPlanoSaude(plano2);
		
		
		//Exibir um relátorio com os dados dos pacientes
		//Nome dos pacientes
		//data de nas
		//telefone
		//cidade
		//estado de res
		//operadora do plano
		
		System.out.println();
		
		System.out.println("Nome:" + Luiz.getNome());
		System.out.println("Data de Nascimento : "+ Luiz.getDataDeNascimento());
		System.out.println("Telefone:" + Luiz.getTelefone());
		System.out.println("Cidade: " + Luiz.getEndereco().getEstado());
		System.out.println("UF: " + Luiz.getEndereco().getEstado());
		System.out.println("Plano de saúde:" + Luiz.getPlanoSaude().getCategoria());
		
		
		
		//Agendar para o paciente1 uma consulta com fisiot
		//para o dia 27/09/2023 as 15;45
		
		
		Agenda consulta1 = new Agenda();
	    consulta1.setDataDaConsulta(LocalDate.of(2022,9, 27));
	    consulta1.setHoraDaConsulta(LocalTime.of(15, 45));
	    consulta1.setMedico(medico2);
	    consulta1.setEspecialidade(especialidade4);
	    consulta1.setPaciente(Luiz);
	    
	    
	    System.out.println("----------");
	    System.out.println("Data da consulta: " + consulta1.getDataDaConsulta() );
	    System.out.println("Hora da consulta: " + consulta1.getHoraDaConsulta());
	    System.out.println("Nome do Médico:" + consulta1.getMedico().getNome());
	    System.out.println("Descrição :" + consulta1.getEspecialidade().getDescricao());
	    System.out.println("Especialidade:" + consulta1.getEspecialidade().getNome());
	    
	    
	   
		

		
		
		
		
			
		
		
		
		
		
		
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		//Especialidade especialidade = new Especialidade();
		//especialidade.setNome("Cardiologia"); 
		//especialidade.setDescricao("A cardiologia cuida do coração");
		
		//Especialidade especialidade2 = new Especialidade();
		//especialidade2.setNome("Otorrino");
		//especialidade2.setDescricao("Otorrino cuida da garganta");

		//JOptionPane.showMessageDialog(null, especialidade2.getNome());
		//System.out.println(especialidade.getNome());
		//System.out.println(especialidade.getDescricao());
		
		
		
		
		
		
	}

}
