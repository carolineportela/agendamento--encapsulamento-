package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanosDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanosDeSaude extends javax.swing.JPanel {

    private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        preencherTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonNovoPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Planos De Saúde"));
        setLayout(null);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(20, 40, 820, 200);

        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete32.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Delete");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(680, 260, 38, 40);

        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar");
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(740, 260, 38, 40);

        buttonNovoPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        buttonNovoPlanoDeSaude.setToolTipText("Adicionar");
        buttonNovoPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonNovoPlanoDeSaude);
        buttonNovoPlanoDeSaude.setBounds(800, 260, 38, 40);
    }// </editor-fold>//GEN-END:initComponents
     
     private int getLinha() {
     linha = tablePlanosDeSaude.getSelectedRow();
     return linha;
     }
      private Integer getCodigo() {
      String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
      Integer codigo = Integer.valueOf(codigoStr);
      return codigo;
    
    
    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
       if (getLinha()!=-1){
           excluirPlanoDeSaude();
       } else{
           JOptionPane.showMessageDialog(this,
                   "Por favor,selecione o Plano que deseja excluir!", 
                   "Ateção", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed
        if(getLinha()!= -1){
           editarPlanoDeSaude();
        }else{
            JOptionPane.showMessageDialog(
                this,
                "Por favor,selecione o Plano  que você deseje editar",
                "Planos de Saúde",
                JOptionPane.WARNING_MESSAGE);
        }
        private void editarPlanoDeSaude(){
               

     PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

     PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);

     planoDeSaudeDialog.setVisible(true);
     preencherTabela();
}
        
        

        
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed

    private void buttonNovoPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoPlanoDeSaudeActionPerformed
       /// EspecialidadeJDialog especialidade = new EspecialidadeJDialog(null, true, OperacaoEnum.ADICIONAR);//criando a tela modal de adicionar especialidades
       // especialidade.setVisible(true); //fazendo a tela aparecer quando apertamos o botão adicionar de especialidades
       // preencherTabela();
    }//GEN-LAST:event_buttonNovoPlanoDeSaudeActionPerformed
    
    private void editarPlanoDeSaude(){
           
           PlanoSaude planoSaude = PlanosDeSaudeDAO.getPlanoSaude(getCodigo());
           PlanoDeSaudeJDialog planoDeSaudeDialog =
                   new PlanoDeSaudeJDialog()
           new EspecialidadeJDialog(null, true,especialidade, OperacaoEnum.EDITAR);
        
           especialidadeDialog.setVisible(true);
           
           preencherTabela();
           
       }
   
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JButton buttonNovoPlanoDeSaude;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

      
        
        private void preencherTabelaPlanos(){
            jTablePlanosDeSaude.setModel(PlanosDeSaudeDAO.getPlanosModeL());
            
     
  
    }

}
