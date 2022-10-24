package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanosDeSaudeDAO {




private static ArrayList<PlanoSaude> planos = new ArrayList<>();

public static ArrayList<PlanoSaude> getPlanos (){
 return planos;
}
 public static PlanoSaude getPlanoSaude (Integer codigo){
     for (PlanoSaude p : planos){ // planos esta sendo guardado no p
         if ( codigo == p.getCodigo()){
             return p;

         }
     }
     return null;
 }
 public static void gravar(PlanoSaude p){
     planos.add(p); //adicionando os planos na ArrayList PlanoSade
 }

 public static void excluir(Integer codigo){
     for ( PlanoSaude p :planos ){ //excluir um plano de saude
         if (codigo == p.getCodigo()){
             planos.remove(p);
             break;
         }
     }
 }

 public static void atualizar(PlanoSaude correta){
     for(PlanoSaude p : planos){
         if(correta.getCodigo() == p.getCodigo()){
             int posicao = planos.indexOf(p);
             planos.set(posicao, correta);
             break;
         }
     }
 }

 //Criar lista inicial de Planos De Saúde
public static void CriarPlanoDeSaude(){


     PlanoSaude plano1 = new PlanoSaude("1111-1111",
             "Bradesco",
             "Simples");

     PlanoSaude plano2 = new PlanoSaude("2222-2222",
             "NotreDame Intermédica",
             "Absoluto");

     PlanoSaude plano3 = new PlanoSaude("3333-3333",
             "Amil",
             "Superior");

     PlanoSaude plano4 = new PlanoSaude("4444-4444",
             "HapVida",
             "Exclusivo");

        planos.add(plano1);
        planos.add(plano2);
        planos.add(plano3);
        planos.add(plano4);
}
    //default tablemodel
    public static DefaultTableModel getPlanosModeL(){
        String [] titulos = {"NÚMERO DA CARTEIRA",
            "OPERADORA",
            "CATEGORIA"};

        String [][] dados = new String[planos.size()][3];
         int i =0;
        for (PlanoSaude p : planos){
           dados [i][0] = p.getNumero().toString();
           dados [i][1] = p.getOperadora();
           dados [i][2] = p.getCategoria();
           i++;
    }

          DefaultTableModel model = new DefaultTableModel(dados, titulos);
          return model;
    }
}