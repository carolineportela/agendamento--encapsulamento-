
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() { //ler todos 
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //ler um so
        for (Especialidade e : especialidades) { //especialidades esta sendo guardado no e
            if (codigo == e.getCodigo()) { //if pra achar o codigo da especialidade que queremos
                return e;
            }
        }
        return null;
    }
    

    public static void gravar(Especialidade e) {
        especialidades.add(e); // adicionando as especialidades na arayList Especialidade

    }
   public static void excluir(Integer codigo){ //excluir uma especialidade
       for (Especialidade e : especialidades){
           if (codigo == e.getCodigo()){
               especialidades.remove(e);
               break; // o break vai parar o looping quando achar oq queremos 
           }
           
       }
   }
       public static void atualizar(Especialidade correta){
           for(Especialidade e : especialidades){
               if(correta.getCodigo() == e.getCodigo()) {
                    int posicao = especialidades.indexOf(e);
                    especialidades.set(posicao, correta);
                    break;
               }
               
               
           }
           
       }
       
       
       //Criar lista inicial de especialidades
       public static void criarListaDeEspecialidades(){
           Especialidade e1 = new Especialidade("Cardgiologia", "Cuida do coração");
           Especialidade e2 = new Especialidade("Nefrologia", "Estuda as doencas");
           Especialidade e3 = new Especialidade("Otorrino", "Cuida do ouvido");
           Especialidade e4 = new Especialidade("Pediatra", "Cuida de criança");
           
           
           especialidades.add(e1); //adicionando na arrayList especialidades
           especialidades.add(e2);
           especialidades.add(e3);
           especialidades.add(e4);
       }
       
       //Default tabelModel 
       public static DefaultTableModel getEspecialidadeModel(){
           String [] titulos = {"CÓDIGO","NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
           
           String [][] dados = new String[especialidades.size()][3];
           
           int i =0;
           for (Especialidade e : especialidades){
               dados [i][0] = e.getCodigo().toString();
               dados [i][1] = e.getNome();
               dados [i][2] = e.getDescricao();
               i++;
               
           }
           
           DefaultTableModel model = new DefaultTableModel(dados, titulos);
                   return model;
       }
       
   }

