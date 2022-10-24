/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanosDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import javax.swing.JOptionPane;


public class PlanoDeSaudeJDialog extends javax.swing.JPanel {
    
    private PlanoSaude planoSaude;
    private OperacaoEnum operacao;

    
    public PlanoDeSaudeJDialog() {
           //construtor add
           java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
            super(parent, modal);
            initComponents();
            
            this.operacao = operacao;
            preencherTitulo();
            
    }
            public  PlanoDeSaudeJDialog( //segundo construtor pro botão editar
            java.awt.Frame parent,
            boolean modal,
            PlanoSaude p, OperacaoEnum operacao) {
        
            super(parent, modal);
            initComponents();
           // setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/paciente.png")));
            planoSaude = p;
            this.operacao = operacao;
            
            preencherFormulario();
            preencherTitulo();

    }
             private void preencherFormulario(){
                
              //pra quando apertarmos no editar estar os dados da especialidade selecionada no jTextField 
             jTextFieldCodigo.setText(planoSaude.getCodigo().toString());
             jTextFieldCodigo.setText(planoSaude.getOperadora());
             jTextFieldCategoria.setText(planoSaude.getCategoria());
             
        
       
        
    }
              private void preencherTitulo(){ //rever esse contrutor
                 labelTitulo.setText("Plano de Saúde - "+ operacao);
                 if(operacao == OperacaoEnum.EDITAR){
                     labelTitulo.setIcon( new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png")));
                 }else{
                     labelTitulo.setIcon( new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png")));
                 }
                
            }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCodigoPlanoSaude = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeOperadora = new javax.swing.JLabel();
        jTextFieldNomeEspecialidade = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        jTextFieldNomeEspecialidade1 = new javax.swing.JTextField();
        jTextFieldNomeEspecialidade2 = new javax.swing.JTextField();
        jLabelNumeroDaCarteira = new javax.swing.JLabel();

        setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        labelTitulo.setText(" Plano de Saúde - ADICIONAR");
        add(labelTitulo);
        labelTitulo.setBounds(20, 10, 410, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes dos Planos de Saúde"));
        jPanel2.setLayout(null);

        jLabelCodigoPlanoSaude.setText("Código:");
        jPanel2.add(jLabelCodigoPlanoSaude);
        jLabelCodigoPlanoSaude.setBounds(30, 30, 120, 16);

        jTextFieldCodigo.setEditable(false);
        jPanel2.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(30, 50, 110, 22);

        jLabelNomeOperadora.setText("Operadora:");
        jPanel2.add(jLabelNomeOperadora);
        jLabelNomeOperadora.setBounds(30, 140, 100, 16);

        jTextFieldNomeEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNomeEspecialidade);
        jTextFieldNomeEspecialidade.setBounds(30, 170, 140, 20);

        jLabelCategoria.setText("Categoria:");
        jPanel2.add(jLabelCategoria);
        jLabelCategoria.setBounds(30, 200, 160, 16);

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCategoria);
        jTextFieldCategoria.setBounds(30, 230, 140, 20);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancel32.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(440, 230, 50, 40);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save32_1.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(510, 230, 50, 40);

        jTextFieldNomeEspecialidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeEspecialidade1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNomeEspecialidade1);
        jTextFieldNomeEspecialidade1.setBounds(30, 170, 140, 20);
        jPanel2.add(jTextFieldNomeEspecialidade2);
        jTextFieldNomeEspecialidade2.setBounds(30, 110, 140, 20);

        jLabelNumeroDaCarteira.setText("Número da carteira:");
        jPanel2.add(jLabelNumeroDaCarteira);
        jLabelNumeroDaCarteira.setBounds(30, 90, 150, 16);

        add(jPanel2);
        jPanel2.setBounds(20, 100, 590, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

          if(operacao == OperacaoEnum.ADICIONAR){
              adicionar();
          }else{
              editar();
          }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void jTextFieldNomeEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeEspecialidadeActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jTextFieldNomeEspecialidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeEspecialidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeEspecialidade1ActionPerformed
  
     private void editar(){
        planoSaude.setNumero(jTextFieldNomeEspecialidade2.getText());
        planoSaude.setOperadora(jTextFieldNomeEspecialidade2.getText());
        
        PlanosDeSaudeDAO.atualizar(planoSaude); 
        JOptionPane.showMessageDialog(null, "Plano de Saúde Atualizado!", "Plano de Saúde", JOptionPane.INFORMATION_MESSAGE);   
      //  dispose();     
    }
     
    private void adicionar(){
         //criar um objeto planodeSaude//fazer o botao salvar do planodeSaude funcionar
         PlanoSaude novoPlanoSaude = new PlanoSaude();
         novoPlanoSaude.setNumero(jTextFieldNomeEspecialidade2.getText());
         novoPlanoSaude.setOperadora(jTextFieldNomeEspecialidade.getText());
         //Gravar atraves do DAO
         PlanosDeSaudeDAO.gravar(planoSaude);
         JOptionPane.showMessageDialog(this,
                "Plano de Saúde gravado com sucesso!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);
        
        //dispose();//pra fechar a janela
                 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigoPlanoSaude;
    private javax.swing.JLabel jLabelNomeOperadora;
    private javax.swing.JLabel jLabelNumeroDaCarteira;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNomeEspecialidade;
    private javax.swing.JTextField jTextFieldNomeEspecialidade1;
    private javax.swing.JTextField jTextFieldNomeEspecialidade2;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
