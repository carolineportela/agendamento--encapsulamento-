package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanosDeSaudeDAO {
    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo,
    excluir um plano de saude, etc.
    
     */
    
    private final static String URL = "C:\\Users\\22282179\\java\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282179\\java\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    private static CharSequence validade;

    public static void gravar(PlanoDeSaude p) { // CREATE
        planosDeSaude.add(p);
          // **GRAVAR EM ARQUIVO**
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(
                    null, 
                    "OCORREU UM ERRO!!");
        }
        
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() { // READ
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // READ

            for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo()== codigo) {
                return p;
            }

        }

        return null;

    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizada) { // UPDATE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo()== planoDeSaudeAtualizada.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizada);
                break;
            }

        }

        atualizarAquivo();
        
    }

    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }

        atualizarAquivo();
        
    }
    
    public static void atualizarAquivo() {
        // Passo 1 - Criar uma representação dos arquivos que serão manipulados
        //referencia para o objeto que está no local(caminho)
        File arquivoAtual = new File(URL);

        //representação do arquivo temporario
        File arquivoTemp = new File(URL_TEMP);

        try {
            //criar o arquivo temporario
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporario para a escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar(fazer ou dizer novamente; repetir) na lista para 
            //adicionar as especialidades no arquivo temporario, exceto o 
            //registro que não queremos mais
            for (PlanoDeSaude p : planosDeSaude) {
                bwTemp.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();

            //Excluir o arquivo atual
            arquivoAtual.delete();

            //Renomear o arquivo
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDePlanoDeSaude(){
        
        
         try {
             BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while(linha != null){
                String[] vetor = linha.split(";");

                String[] data = vetor[3].split("-");

                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[0], //numero
                        vetor[2], //Operadora
                        vetor[1], //categoria
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]))); //validade

                planosDeSaude.add(p);

                linha = leitor.readLine(); 
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um erro ao ler o arquivo");
        }
        
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



