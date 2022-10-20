/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class EspecialidadeJDialog extends javax.swing.JDialog {
    
    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    

    
    public EspecialidadeJDialog(
            //construtor add
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        
            super(parent, modal);
            initComponents();
            
            this.operacao = operacao;
            preencherTitulo();
            
    }
    public EspecialidadeJDialog( //segundo construtor pro botão editar
            java.awt.Frame parent,
            boolean modal,
            Especialidade e, OperacaoEnum operacao) {
        
            super(parent, modal);
            initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/paciente.png")));
            especialidade = e;
            this.operacao = operacao;
            
            preencherFormulario();
            preencherTitulo();

    }
            private void preencherFormulario(){
                
              //pra quando apertarmos no editar estar os dados da especialidade selecionada no jTextField 
             jTextFieldCodigo.setText(especialidade.getCodigo().toString());
             jTextFieldNomeEspecialidade.setText(especialidade.getNome());
             jTextFieldDescricaoEspecialidade.setText(especialidade.getDescricao());
    
}
            private void preencherTitulo(){ //rever esse contrutor
                 labelTitulo.setText("Especialidades - "+ operacao);
                 if(operacao == OperacaoEnum.EDITAR){
                     labelTitulo.setIcon( new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png")));
                 }else{
                     labelTitulo.setIcon( new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png")));
                 }
                
            }
    
  
 
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCodigoEspecialidade = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeEspecialidade = new javax.swing.JLabel();
        jTextFieldNomeEspecialidade = new javax.swing.JTextField();
        jLabelDescricaoEspecialidade = new javax.swing.JLabel();
        jTextFieldDescricaoEspecialidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        labelTitulo.setText(" Especialidade - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(20, 10, 410, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes da Especialidade"));
        jPanel2.setLayout(null);

        jLabelCodigoEspecialidade.setText("Código");
        jPanel2.add(jLabelCodigoEspecialidade);
        jLabelCodigoEspecialidade.setBounds(30, 30, 50, 16);

        jTextFieldCodigo.setEditable(false);
        jPanel2.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(30, 50, 90, 22);

        jLabelNomeEspecialidade.setText("Nome da especialidade:");
        jPanel2.add(jLabelNomeEspecialidade);
        jLabelNomeEspecialidade.setBounds(30, 90, 150, 16);
        jPanel2.add(jTextFieldNomeEspecialidade);
        jTextFieldNomeEspecialidade.setBounds(30, 110, 300, 20);

        jLabelDescricaoEspecialidade.setText("Descrição da especialidade:");
        jPanel2.add(jLabelDescricaoEspecialidade);
        jLabelDescricaoEspecialidade.setBounds(30, 140, 160, 16);
        jPanel2.add(jTextFieldDescricaoEspecialidade);
        jTextFieldDescricaoEspecialidade.setBounds(30, 170, 420, 20);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 100, 590, 280);

        setSize(new java.awt.Dimension(645, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
          if(operacao == OperacaoEnum.ADICIONAR) {
              adicionar();
          }else{
              editar();
          }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed
    private void editar(){
        especialidade.setNome(jTextFieldNomeEspecialidade.getText());
        especialidade.setDescricao(jTextFieldDescricaoEspecialidade.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, "Especialidade Atualizada!", "Especialidades", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
       
        
        
    }
   private void adicionar(){
       //criar um objeto especialidade//fazer o botao salvar da especialidade funcionar
        
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(jTextFieldNomeEspecialidade.getText());
        novaEspecialidade.setDescricao(jTextFieldDescricaoEspecialidade.getText());
        //Grava o objeto atraves do DAO
        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();//pra fechar a janela
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabelCodigoEspecialidade;
    private javax.swing.JLabel jLabelDescricaoEspecialidade;
    private javax.swing.JLabel jLabelNomeEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricaoEspecialidade;
    private javax.swing.JTextField jTextFieldNomeEspecialidade;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
