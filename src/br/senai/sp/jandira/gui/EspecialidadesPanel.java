
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class EspecialidadesPanel extends javax.swing.JPanel {

    
    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        ajustarTabela();
        preencherTabela();
        
    }

    private int getLinha() {
        
        linha = jTableEspecialidades.getSelectedRow();//ver qual linha está selecionada 
        return linha;
        
    }
       
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollListaEspecialidades = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();
        buttonDeleteEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(880, 320));
        setLayout(null);

        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollListaEspecialidades.setViewportView(jTableEspecialidades);

        add(scrollListaEspecialidades);
        scrollListaEspecialidades.setBounds(20, 40, 820, 200);

        buttonDeleteEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete32.png"))); // NOI18N
        buttonDeleteEspecialidade.setToolTipText("Delete");
        buttonDeleteEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonDeleteEspecialidade);
        buttonDeleteEspecialidade.setBounds(680, 260, 38, 40);

        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar");
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(740, 260, 38, 40);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(800, 260, 38, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteEspecialidadeActionPerformed
       //pegar a linha e a coluna que está selecionada  e excluir 
        
        if(getLinha() != -1){//linha for diferente de -1
            excluirEspecialidade();
        }else{ //se nada for selecionado aparece uma mensagem de atenção
            JOptionPane.showMessageDialog(this, "Por favor,selecione a especialidade que deseja excluir!"
                    ,"Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_buttonDeleteEspecialidadeActionPerformed
       private void editarEspecialidade(){
           
           Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
           EspecialidadeJDialog especialidadeDialog =
           new EspecialidadeJDialog(null, true,especialidade, OperacaoEnum.EDITAR);
        
           especialidadeDialog.setVisible(true);
           
           preencherTabela();
           
       }
       
       
      private void excluirEspecialidade(){
        String codigoStr = jTableEspecialidades.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        
        
        int resposta = JOptionPane.showConfirmDialog(
                this, 
                "Você confirma a exclusão ?", "Atenção",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE); 
        
        
        EspecialidadeDAO.excluir(codigo);
        if(resposta== 0){
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
            
        }
       
        
         
}
      private Integer getCodigo(){
          String codigoStr = jTableEspecialidades.getValueAt(getLinha(), 0).toString();
          Integer codigo = Integer.valueOf(codigoStr);
          return codigo;
          
      } 
      
      
      
    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
        EspecialidadeJDialog especialidade = new EspecialidadeJDialog(null, true, OperacaoEnum.ADICIONAR);//criando a tela modal de adicionar especialidades
        especialidade.setVisible(true); //fazendo a tela aparecer quando apertamos o botão adicionar de especialidades
        preencherTabela();
        //tela de adicionar especialidades
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed
        if(getLinha()!= -1){
            editarEspecialidade();
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor,selecione a Especialidade que você deseje editar",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);     
        }
        
        EspecialidadeJDialog especialidadeDialog = 
        new EspecialidadeJDialog(null, true,OperacaoEnum.EDITAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonDeleteEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JTable jTableEspecialidades;
    private javax.swing.JScrollPane scrollListaEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        jTableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadeModel());
        ajustarTabela();
     
  
    }
    private void ajustarTabela(){
        //Impedir o úsuario de movimentar as colunas
        jTableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        //bloquear a edição das células da tabela
        jTableEspecialidades.setDefaultEditor(Object.class, null);
        
        //Definir a largura das colunas
        jTableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(496);
        
    }
    

}
