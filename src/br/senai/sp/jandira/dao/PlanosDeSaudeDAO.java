package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanosDeSaudeDAO {
    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo,
    excluir um plano de saude, etc.
     */
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { // CREATE
        planosDeSaude.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() { // READ
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // READ

            for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                return p;
            }

        }

        return null;

    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizada) { // UPDATE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getNumero() == planoDeSaudeAtualizada.getNumero()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizada);
                break;
            }

        }
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }

    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDePlanoDeSaude(){
        PlanoDeSaude p1 = new PlanoDeSaude("158344","Bronze","Amil",LocalDate.of(2025, 10, 15));
        PlanoDeSaude p2 = new PlanoDeSaude("125312","Ouro","NotreDame",LocalDate.of(2024, 9, 12));
        PlanoDeSaude p3 = new PlanoDeSaude("147444","Prata","Bradesco",LocalDate.of(2027, 11, 30));
        PlanoDeSaude p4 = new PlanoDeSaude("178543","Prata","Unimed",LocalDate.of(2029, 7, 5));
        
       
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
        planosDeSaude.add(p4);
        
    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {
        
        System.out.println(planosDeSaude.size());
        
        String[] titulo = {"CÓDIGO", "NÚMERO", "OPERADORA", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][6];
        
        
            for(PlanoDeSaude p : planosDeSaude){
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);
           
            
        }
        
        return new DefaultTableModel(dados, titulo);
    }
    

}



