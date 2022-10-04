/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

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
               if(correta.getCodigo() == e.getCodigo());
               int posicao = especialidades.indexOf(e);
               especialidades.set(posicao, correta);
               
           }
           
       }
       
   }
