package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setDescricao("Descricao do cardio");

        Especialidade e2 = new Especialidade("Gastro");
        e2.setDescricao("Descricao do Gastro");

        Especialidade e3 = new Especialidade("testee3");
        e3.setDescricao("Descricao e3");

        //Especialidade e3 = e1; //e3 está apontando para a referencia na memoria e não é um objeto
        e3.setNome("Qualquer coisa");
        JOptionPane.showMessageDialog(null, e1.getNome());

        Especialidade e4 = new Especialidade("otorrino", "ouvido");
        
        Especialidade e5 = new Especialidade("testee5");
        e5.setDescricao("Descricao e5");
        
        
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

        PlanoSaude p1 = new PlanoSaude("Amil");
        PlanoSaude p2 = new PlanoSaude("Notredame");
        PlanoSaude p3 = new PlanoSaude("Bradesco");
        
        ArrayList<PlanoSaude> planos = new ArrayList<>();
        planos.add(p1);
        planos.add(p2);
        planos.add(p3);

        System.out.println("---------------------");
        for (PlanoSaude e : planos) {
            System.out.println(e.getOperadora());
            //System.out.println(e.getQuantidade());
        }

        PlanoSaude xpto = new PlanoSaude();
        PlanoSaude xpt2 = new PlanoSaude();
        PlanoSaude xpt3 = new PlanoSaude();

        System.out.println("---------------------");
        System.out.println("---" + PlanoSaude.getQuantidade());

        AgendaApp.main(args);

        System.out.println("---" + PlanoSaude.getQuantidade());
        
        

    }

}
