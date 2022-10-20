
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoSaude;
import java.util.ArrayList;


public class PlanosDeSaudeDAO {
    
    
    private static ArrayList<PlanoSaude> planos = new ArrayList<>();
    
    public static ArrayList<PlanoSaude> getPlanos (){
     return planos;   
    }
     public static PlanoSaude getPlanoSaude (String numero){
         for (PlanoSaude p : planos){ // planos esta sendo guardado no p
             if ( numero == p.getNumero()){
                 return p;
                 
             }
         }
         return null;        
     }
     public static void gravar(PlanoSaude p){
         planos.add(p); //adicionando os planos na ArrayList PlanoSade
     }
     
     public static void excluir(Integer codigo){
         for ( PlanoSaude p :planos ){
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
     
     //Criar lista de Planos De Saúde
    public static void CriarPlanoDeSaude(){
        
        PlanoSaude plano1 = new PlanoSaude("1111-1111");
        PlanoSaude plano2 = new PlanoSaude("2222-2222");
        PlanoSaude plano3 = new PlanoSaude("3333-3333");
        PlanoSaude plano4 = new PlanoSaude("4444-4444");
        
        planos.add(plano1);
        planos.add(plano2);
        planos.add(plano3);
        
    }
     //Default tabelModel 
    //
//       public static DefaultTableModel getEspecialidadeModel(){
//           String [] titulos = {"CÓDIGO","NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
//           
//           String [][] dados = new String[especialidades.size()][3];
//           
//           int i =0;
//           for (Especialidade e : especialidades){
//               dados [i][0] = e.getCodigo().toString();
//               dados [i][1] = e.getNome();
//               dados [i][2] = e.getDescricao();
//               i++;
//               
//           }
//           
//           DefaultTableModel model = new DefaultTableModel(dados, titulos);
//                   return model;
//       }
//         
    
}
