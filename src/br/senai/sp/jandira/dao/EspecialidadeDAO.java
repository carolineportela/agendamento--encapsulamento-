package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
     */
    private final static String URL
            = "C:\\Users\\22282179\\java\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
   
    private final static String URL_TEMP
            = "C:\\Users\\22282179\\java\\Especialidade-temp.txt";
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { //CREATE
        especialidades.add(e);

        //** GRAVAR EM ARQUIVO **
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSepadaradaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(
                    null,
                    "OCORREU UM ERRO!!");
        }
    }

    public static ArrayList<Especialidade> getEspecialidades() { //READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //READ
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) { //UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
//               e = especialidadeAtualizada;
                //especialidades.remove(e);
                //especialidades.add(especialidadeAtualizada);
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }

        atualizarAquivo();
    }

    //instancia de um objeto
    public static void excluir(Integer codigo) { //DELETE

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }

        atualizarAquivo();

    }
     
//        Especialidade especialidade1 = new Especialidade();
//        Especialidade especialidade2 = new Especialidade();
//        Especialidade especialidade3 = new Especialidade(); 
//        Especialidade especialidade4 = new Especialidade();
//        Especialidade especialidade5 = new Especialidade();
       


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
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSepadaradaPorPontoEVirgula());
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

    //criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guardar a especialidade na lista
                especialidades.add(e);

                //ler a próxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }

        System.out.println(especialidades.size());
    }

    public static DefaultTableModel getTabelaEspecialidades() {

        System.out.println("montando " + especialidades.size());

        String[] titulo = {
            "CÓDIGO",
            "NOME DA ESPECIALIDADE",
            "DESCRIÇÃO"
        };
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {

            int i = especialidades.indexOf(e);

            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();

        }

        return new DefaultTableModel(dados, titulo);

    }
    public static DefaultListModel<String> getListaEspecialidade(){
        DefaultListModel<String> listaEspecialidade = new DefaultListModel<>();
        for (Especialidade especialidade : especialidades){
            listaEspecialidade.addElement(especialidade.getCodigo()+ " - "+ especialidade.getNome());
        }
        return listaEspecialidade;
    }

}
