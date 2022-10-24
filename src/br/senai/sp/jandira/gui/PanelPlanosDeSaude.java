
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanosDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoSaude;


public class PanelPlanosDeSaude extends javax.swing.JPanel {
    
    private int linhaPlanos;

   
    public PanelPlanosDeSaude() {
        initComponents();
         PlanosDeSaudeDAO.CriarPlanoDeSaude();
         ajustarTabela();
         preencherTabela();
         

    }
    private int getLinha (){
    linhaPlanos = jTablePlanosDeSaude.getSelectedRow();
    return linhaPlanos;
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        jTablePlanosDeSaude = new javax.swing.JTable();
        buttonDeletePlanosDeSaude = new javax.swing.JButton();
        buttonEditarPlanosDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanosDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Planos De Saúde"));
        setLayout(null);

        jTablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanosDeSaude.setViewportView(jTablePlanosDeSaude);

        add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(20, 40, 820, 200);

        buttonDeletePlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete32.png"))); // NOI18N
        buttonDeletePlanosDeSaude.setToolTipText("Delete");
        buttonDeletePlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletePlanosDeSaudeActionPerformed(evt);
            }
        });
        add(buttonDeletePlanosDeSaude);
        buttonDeletePlanosDeSaude.setBounds(680, 260, 38, 40);

        buttonEditarPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png"))); // NOI18N
        buttonEditarPlanosDeSaude.setToolTipText("Editar");
        buttonEditarPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanosDeSaudeActionPerformed(evt);
            }
        });
        add(buttonEditarPlanosDeSaude);
        buttonEditarPlanosDeSaude.setBounds(740, 260, 38, 40);

        buttonAdicionarPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        buttonAdicionarPlanosDeSaude.setToolTipText("Adicionar");
        buttonAdicionarPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanosDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanosDeSaude);
        buttonAdicionarPlanosDeSaude.setBounds(800, 260, 38, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeletePlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletePlanosDeSaudeActionPerformed
       //pegar a linha e a coluna que está selecionada  e excluir 
        
        if(getLinha() != -1){//linha for diferente de -1
            PlanosDeSaudeDAO.excluir(WIDTH);
        }else{ //se nada for selecionado aparece uma mensagem de atenção
            // JOptionPane.showMessageDialog(null, "Por favor,selecione o Plano de Saúde que deseja excluir!"
                 //   ,"Atenção",
                 //   JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeletePlanosDeSaudeActionPerformed

    private void buttonEditarPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanosDeSaudeActionPerformed
        if(getLinha()!= -1){
          // editarEspecialidade();
       // }else{
          //  JOptionPane.showMessageDialog(
             //   this,
             //   "Por favor,selecione a Especialidade que você deseje editar",
             //   "Especialidades",
             //   JOptionPane.WARNING_MESSAGE);
      //  }

        //        EspecialidadeJDialog especialidadeDialog =
        //         new EspecialidadeJDialog(null, true,OperacaoEnum.EDITAR);
        //        //rever
        //        especialidadeDialog.setVisible(true);
        //        preencherTabela();
    }//GEN-LAST:event_buttonEditarPlanosDeSaudeActionPerformed

    private void buttonAdicionarPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanosDeSaudeActionPerformed
       /// EspecialidadeJDialog especialidade = new EspecialidadeJDialog(null, true, OperacaoEnum.ADICIONAR);//criando a tela modal de adicionar especialidades
       // especialidade.setVisible(true); //fazendo a tela aparecer quando apertamos o botão adicionar de especialidades
       // preencherTabela();
    }//GEN-LAST:event_buttonAdicionarPlanosDeSaudeActionPerformed
    
    private void editarPlanoDeSaude(){
           
           PlanoSaude planoSaude = PlanosDeSaudeDAO.getPlanoSaude(getCodigo());
           PlanoDeSaudeJDialog planoDeSaudeDialog =
                   new PlanoDeSaudeJDialog()
           new EspecialidadeJDialog(null, true,especialidade, OperacaoEnum.EDITAR);
        
           especialidadeDialog.setVisible(true);
           
           preencherTabela();
           
       }
   
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanosDeSaude;
    private javax.swing.JButton buttonDeletePlanosDeSaude;
    private javax.swing.JButton buttonEditarPlanosDeSaude;
    private javax.swing.JTable jTablePlanosDeSaude;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    // End of variables declaration//GEN-END:variables

      
        
        private void preencherTabelaPlanos(){
            jTablePlanosDeSaude.setModel(PlanosDeSaudeDAO.getPlanosModeL());
            
     
  
    }

}
