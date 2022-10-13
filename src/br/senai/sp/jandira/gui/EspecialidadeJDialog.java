/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282179
 */
public class EspecialidadeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form EspecialidadeJDialog
     */
    public EspecialidadeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/paciente.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        jLabel1.setText(" Especialidade - ADICIONAR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 410, 40);

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
        //criar um objeto especialidade//fazer o botao salvar da especialidade funcionar
        
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(jTextFieldNomeEspecialidade.getText());
        especialidade.setDescricao(jTextFieldDescricaoEspecialidade.getText());
        //Grava o objeto atraves do DAO
        EspecialidadeDAO.gravar(especialidade);
        JOptionPane.showMessageDialog(this, "Especialidade gravada com sucesso!", "Especialidades", JOptionPane.INFORMATION_MESSAGE);
        
        dispose();//pra fechar a janela
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadeJDialog dialog = new EspecialidadeJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigoEspecialidade;
    private javax.swing.JLabel jLabelDescricaoEspecialidade;
    private javax.swing.JLabel jLabelNomeEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricaoEspecialidade;
    private javax.swing.JTextField jTextFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}