package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicosDAO {


    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo,
    excluir um plano de saude, etc.
    
     */
//   senai private final static String URL
//            = "C:\\Users\\22282179\\java\\Medico.txt";
//    private final static Path PATH = Paths.get(URL);
//
//    private final static String URL_TEMP
//            = "C:\\Users\\22282179\\java\\Medico-temp.txt";
//    private final static Path PATH_TEMP = Paths.get(URL_TEMP)senai;
    private final static String URL
            = "C:\\Users\\lua\\Desktop\\java\\Medico.txt";
    private final static Path PATH = Paths.get(URL);

    private final static String URL_TEMP
            = "C:\\Users\\lua\\Desktop\\java\\Medico-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico m) { //CREATE
        medico.add(m);
        //** GRAVAR EM ARQUIVO **
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSepadaradaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(
                    null,
                    "OCORREU UM ERRO!!");
        }

    }

    public static ArrayList<Medico> getMedico() { // READ
        return medico;
    }

    public static Medico getMedico(Integer codigo) { // READ

        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
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
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { // DELETE

        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                medico.remove(m);
                break;
            }
        }
        atualizarArquivo();

    }

    public static void atualizarArquivo() {
        File arquivoAtual = new File(URL);

        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();
            //Abrir o arquivo temporario para a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medico) {
                bwTemp.write(m.getMedicoSepadaradaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            //Excluir o arquivo atual
            arquivoAtual.delete();

            //Renomear o arquivo
            arquivoTemp.renameTo(arquivoAtual);
            bwTemp.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void criarListaDeMedico() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");

                String[] data = vetor[5].split("-");
                Medico m = new Medico(Integer.valueOf(vetor[0]),
                        vetor[2],
                        vetor[4],
                        vetor[3],
                        vetor[1],
                        LocalDate.of(Integer.parseInt(data[0]),
                                Integer.parseInt(data[1]),
                                Integer.parseInt(data[2])));
                //guardar o medico na lista
                medico.add(m);
                //ler a proxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }
    }

    public static DefaultTableModel getTabelaMedicos() {

        System.out.println("teste" + medico.size());

        String[] titulo = {"Codigo", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medico.size()][4];

        for (Medico m : medico) {
            int i = medico.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            // celso me ajuda ;( dados[i][4] = m.getDataNascimento();

        }

        return new DefaultTableModel(dados, titulo);
    }

//    primeiro codigo public static DefaultListModel<String> getListaDeMedico() {
//        DefaultListModel<String> listaMedico = new DefaultListModel<>();
//        for (Medico medico : medico) {
//            listaMedico.addElement(medico.getCodigo() + " - " + medico.getNome());
//        }
//        return listaMedico;
//    }
    
    public static DefaultListModel<Especialidade> getEspecialidadeDoMedicoModel(){
         
         DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<>();
         try {
              BufferedReader leitor = Files.newBufferedReader(PATH);
              String linha = leitor.readLine();
              
              for(Especialidade sequenciaListaMedico : apenasEspecialidadeDoMedico(linha)){
                  especialidadeLista.addElement(sequenciaListaMedico);
              }
              leitor.close();
              
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ocorreu  na adição da lista do médico");
         }
         return especialidadeLista;
     }

    public static ArrayList<Especialidade> apenasEspecialidadeDoMedico(String linha) {
        String[] vetor = linha.split(";");
        int codigoEspecialidade = 20;

        ArrayList<Especialidade> codigos = new ArrayList<>();
        while (codigoEspecialidade < vetor.length) {
            codigos.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor(codigoEspecialidade))));
            codigoEspecialidade++;
        }
        return codigos;
    }

    private static String vetor(int codigoEspecialidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
