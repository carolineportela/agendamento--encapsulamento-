package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicosDAO {

    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo,
    excluir um plano de saude, etc.
    
     */
    private static ArrayList<Medico> medico = new ArrayList<>();

    public static ArrayList<Medico> getMedico() { // READ
        return medico;
    }

    public static Medico getMedico(Integer codigo) { // READ

        for (Medico m : medico) {
            if (m.getCodigo() == codigo) {
                return m;
            }

        }

        return null;

    }

    public static void atualizar(Medico medicoAtualizado) { // UPDATE

        for (Medico m : medico) {
            if (m.getCodigo() == medicoAtualizado.getCodigo()) {
                medico.set(medico.indexOf(m), medicoAtualizado);
                break;
            }

        }

    }

    public static void excluir(Integer codigo) { // DELETE

        for (Medico m : medico) {
            if (m.getCodigo() == codigo) {
                medico.remove(m);
                break;
            }
        }

    }

    public static void criarListaDeMedico() {
        Medico m1 = new Medico("Carol", "(11)4141-6323", "carol@gmail.com", "888-7632-0/");
        Medico m2 = new Medico("Kevin", "(11)94656788", "kevin@gmail.com", "133344-9/");
        Medico m3 = new Medico("Laís", "(11)1111-1111", "lais@gmail.com", "1889675-5/");
        Medico m4 = new Medico("Milena", "(11)95942-5432", "milena@gmail.com", "4545765-4/");

        medico.add(m1);
        medico.add(m2);
        medico.add(m3);
        medico.add(m4);

        System.out.println(medico.size());
    }

    public static DefaultTableModel getTabelaMedicos() {

        System.out.println("teste" + medico.size());

        String[] titulo = {"TESTE", "TESTE", "TESTE", "TESTE", "TESTE"};
        String[][] dados = new String[medico.size()][4];

        for (Medico m : medico) {
            int i = medico.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getTelefone();
            dados[i][3] = m.getCrm();

        }

        return new DefaultTableModel(dados, titulo);
    }

}
