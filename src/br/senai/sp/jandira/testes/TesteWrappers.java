package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a =5;
		
		Integer b = 5; // b é objeto Integer
		
		
		Double x =2.9;
		
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setNome("Cardiologia");
		e1.setDescricao("Descricao do cardio");
		
		Especialidade e2 = new Especialidade("Gastro");
		e2.setDescricao("Descricao do Gastro");
		
		
		especialidades.add(e1);//adicionando na arraylist
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		e3.setDescricao("Descrição da fisioterapia");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade("Clinico Geral");		
		e4.setDescricao("Descrição do clinico geral");
		
		
		//Especialidade [] especialidade = {e1,e2,e3,e4};
		
	    Especialidade e5 = new Especialidade("Pediatria");
		e5.setDescricao("Descrição da Pediatria");
		
		
		//especialidade [4] = e5;
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size()); //.size retorna o tamanho de elementos da lista
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(10);
		notas.add(20);
		notas.add(30);
		notas.add(40);
		System.out.println(notas.size()); 
		notas.add(50);
		System.out.println(notas.size());
		
		
		//ver o nome da especialidade que está na posição 3 do arraylist especialidade
		System.out.println(especialidades.get(3).getNome());
		
		//trocar o nome da especialidade que está na posição 1 do arraylist especialidades para "teste",exibir logo em seguida
		
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		//extrai um elemento do array 
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		
		nova.setNome("Não é mais fisio");
		System.out.println(nova.getNome());
		
		e3.setNome("Senai Jandira");
		System.out.println(nova.getNome());
		System.out.println(especialidades.get(2).getNome());
		
		
		Especialidade xy = new Especialidade(null, null);//(); = é um construtor
		System.out.println(xy.getNome());
	
	}

}
