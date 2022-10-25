package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
//import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int [] a = {6,9,87,35,96};
        int[] b = new int [4];
        b[0] = 55;
        b[1] = 55;
        b[2] = 11;
        b[3] = 99;
        
        int [][] c = { 
            {4,6,5},
            {5,9,7},
            {1,2,3},
            {5,5,8}
        }; // Matriz = uma lista de vetores
        System.out.println(c[2][1]);//mostrar no console o valor 2
        //do vetor c eu quero a posição dois,deste vetor quero a posição um que é o 2
        
        String [][] quitanda = {
            {"Banana" , "Maça" , "Uva" , "Morango"}, //posição zero
            {"Alface", "Couve","Pepino", "Salsinha", "Pimentão", "Brocolis"},
            {"Abacate","Tomate", "Jiló" , "Abobrinha"},
            
            };
        System.out.println(quitanda[1][4]);//imprimindo do vetor 1 a posição 4 que é o Pimentão
        
        //int [][][] teste = {{{1,2,3},{4,5,6},{11,11,33}},{{1,1},{9,6,7},{6,2,1,4},{6,444,5,1}},{{1,2,3,6},{5,7,7}
        
        
        
        
        System.out.println("---Vetores Aula 06/10---");

        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setDescricao("Descricao do cardio");

        Especialidade e2 = new Especialidade("Gastro");
        e2.setDescricao("Descricao do Gastro");

        Especialidade e3 = new Especialidade("testee3");
        e3.setDescricao("Descricao e3");

        //Especialidade e3 = e1; //e3 está apontando para a referencia na memoria e não é um objeto
        e3.setNome("Qualquer coisa");
        JOptionPane.showMessageDialog(null, e1.getNome());

        Especialidade e4 = new Especialidade("otorrino", "descrição do otorrino");
        
        Especialidade e5 = new Especialidade("testee5");
        e5.setDescricao("Descricao e5");
        
        //04/06
        
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        System.out.println(EspecialidadeDAO.getEspecialidades().size());
         
        EspecialidadeDAO.gravar(e3);
        EspecialidadeDAO.gravar(e4);     
        System.out.println(EspecialidadeDAO.getEspecialidades().size());
        
        System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
        
        EspecialidadeDAO.excluir(102); //excluindo
        System.out.println(EspecialidadeDAO.getEspecialidades().size());
        
        //Atualizar
         Especialidade correta = new Especialidade("Dermatologia", "Estuda a doença da pele");
         correta.setCodigo(e4.getCodigo()); //atualizando/mudando o nome 
         EspecialidadeDAO.atualizar(correta);
        
         System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
         
        

        //exibir a quantidade de especialidades
        System.out.println(e1.getContador());

        System.out.println(e1.getCodigo() + "-" + e1.getNome());
        System.out.println(e2.getCodigo() + "-" + e2.getNome());
        System.out.println(e3.getCodigo() + "-" + e3.getNome());
        System.out.println(e4.getCodigo() + "-" + e4.getNome());
        System.out.println(e5.getCodigo() + "-" + e5.getNome());

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());//size mostra quantos elementos tem dentro da arraylist

        //Imprimir no consoloe o nome das especialidades que estão dentro da ArrayList
        //pra um looping preciso de um contator que é o i
        System.out.println("------------While---------");
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;

        }

        System.out.println("----------------- FOR-------------------------");
        //Utilização do for para iteração da arraylist
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        //FOR EACH -> para cada
        System.out.println("-------------FOR-EACH-------------------------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());

        }
        //criar 3 planos de saúde,armazenar em um ArrayListe exibir o nome da operadora de cada um deles usando o for each

       // PlanoSaude p1 = new PlanoSaude("Amil");
       // PlanoSaude p2 = new PlanoSaude("Notredame");
       // PlanoSaude p3 = new PlanoSaude("Bradesco");

       // ArrayList<PlanoSaude> planos = new ArrayList<>();
       // planos.add(p1);
     //   planos.add(p2);
       // planos.add(p3);

        System.out.println("---------------------");
       // for (PlanoSaude e : planos) {
         //   System.out.println(e.getOperadora());
            //System.out.println(e.getQuantidade());
        }

     //   PlanoSaude xpto = new PlanoSaude();
    //    PlanoSaude xpt2 = new PlanoSaude();
      //  PlanoSaude xpt3 = new PlanoSaude();

        //System.out.println("---------------------");
//        System.out.println("---" + PlanoSaude.getQuantidade());
//
//        AgendaApp.main(args);
//
//        System.out.println("---" + PlanoSaude.getQuantidade());

    }

//}
