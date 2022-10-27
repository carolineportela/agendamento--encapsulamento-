
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanosDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class PlanoDeSaudeDialog extends javax.swing.JDialog {

   private PlanoDeSaude planoDeSaude;
   private OperacaoEnum operacao;
   
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        planoDeSaude = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {

        textFieldCodigoPlano.setText(planoDeSaude.getCodigo().toString());
        textFieldOperadoraPlano.setText(planoDeSaude.getOperadora());
        textFieldCategoriaPlano.setText(planoDeSaude.getCategoria());
        textFieldNumeroPlano.setText(planoDeSaude.getNumero());
        textFieldValidadePlano.setText(planoDeSaude.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelPlanoDeSaudeAdicionar.setText("Planos de Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png")));
        } else {
            labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png")));
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPlanoDeSaudeAdicionar = new javax.swing.JLabel();
        panelDetalhesPlanoDeSaude = new javax.swing.JPanel();
        labelCodigoPlano = new javax.swing.JLabel();
        textFieldCodigoPlano = new javax.swing.JTextField();
        labelOperadoraPlano = new javax.swing.JLabel();
        textFieldOperadoraPlano = new javax.swing.JTextField();
        labelCategoriaPlano = new javax.swing.JLabel();
        buttonCancelarPlanoDeSaude = new javax.swing.JButton();
        buttonSalvarPlanoDeSaude = new javax.swing.JButton();
        textFieldCategoriaPlano = new javax.swing.JTextField();
        textFieldNumeroPlano = new javax.swing.JTextField();
        labelNumeroPlano = new javax.swing.JLabel();
        labelValidadePlano = new javax.swing.JLabel();
        textFieldValidadePlano = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        labelPlanoDeSaudeAdicionar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelPlanoDeSaudeAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        labelPlanoDeSaudeAdicionar.setText(" Plano de Saúde - ADICIONAR");
        jPanel1.add(labelPlanoDeSaudeAdicionar);
        labelPlanoDeSaudeAdicionar.setBounds(20, 10, 410, 40);

        panelDetalhesPlanoDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes dos Planos de Saúde"));
        panelDetalhesPlanoDeSaude.setLayout(null);

        labelCodigoPlano.setText("Código:");
        panelDetalhesPlanoDeSaude.add(labelCodigoPlano);
        labelCodigoPlano.setBounds(30, 20, 120, 16);

        textFieldCodigoPlano.setEditable(false);
        textFieldCodigoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoPlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldCodigoPlano);
        textFieldCodigoPlano.setBounds(30, 40, 110, 22);

        labelOperadoraPlano.setText("Operadora do Plano:");
        panelDetalhesPlanoDeSaude.add(labelOperadoraPlano);
        labelOperadoraPlano.setBounds(30, 120, 120, 16);

        textFieldOperadoraPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraPlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldOperadoraPlano);
        textFieldOperadoraPlano.setBounds(30, 140, 140, 20);

        labelCategoriaPlano.setText("Categoria do Plano:");
        panelDetalhesPlanoDeSaude.add(labelCategoriaPlano);
        labelCategoriaPlano.setBounds(30, 170, 160, 16);

        buttonCancelarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancel32.png"))); // NOI18N
        buttonCancelarPlanoDeSaude.setToolTipText("Cancelar");
        buttonCancelarPlanoDeSaude.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancelarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(buttonCancelarPlanoDeSaude);
        buttonCancelarPlanoDeSaude.setBounds(440, 230, 50, 40);

        buttonSalvarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save32_1.png"))); // NOI18N
        buttonSalvarPlanoDeSaude.setToolTipText("Salvar");
        buttonSalvarPlanoDeSaude.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSalvarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(buttonSalvarPlanoDeSaude);
        buttonSalvarPlanoDeSaude.setBounds(510, 230, 50, 40);

        textFieldCategoriaPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCategoriaPlanoActionPerformed(evt);
            }
        });
        panelDetalhesPlanoDeSaude.add(textFieldCategoriaPlano);
        textFieldCategoriaPlano.setBounds(30, 190, 140, 20);
        panelDetalhesPlanoDeSaude.add(textFieldNumeroPlano);
        textFieldNumeroPlano.setBounds(30, 90, 140, 20);

        labelNumeroPlano.setText("Número do plano:");
        panelDetalhesPlanoDeSaude.add(labelNumeroPlano);
        labelNumeroPlano.setBounds(30, 70, 100, 16);

        labelValidadePlano.setText("Validade do plano:");
        panelDetalhesPlanoDeSaude.add(labelValidadePlano);
        labelValidadePlano.setBounds(30, 220, 150, 16);
        panelDetalhesPlanoDeSaude.add(textFieldValidadePlano);
        textFieldValidadePlano.setBounds(30, 240, 64, 22);
        try{
            textFieldValidadePlano.setFormatterFactory(new javax.swing.text.
                DefaultFormatterFactory(new javax.swing.text.MaskFormatter
                    ("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.add(panelDetalhesPlanoDeSaude);
        panelDetalhesPlanoDeSaude.setBounds(20, 100, 590, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoPlanoActionPerformed

    private void textFieldOperadoraPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraPlanoActionPerformed

    private void buttonSalvarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarPlanoDeSaudeActionPerformed

        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{
            editar();
        }
    }//GEN-LAST:event_buttonSalvarPlanoDeSaudeActionPerformed

    private void textFieldCategoriaPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCategoriaPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCategoriaPlanoActionPerformed

    private void buttonCancelarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarPlanoDeSaudeActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarPlanoDeSaudeActionPerformed

   private void editar(){
       planoDeSaude.setOperadora(textFieldOperadoraPlano.getText());
       planoDeSaude.setCategoria(textFieldCategoriaPlano.getText());
       planoDeSaude.setNumero(textFieldNumeroPlano.getText());
       planoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
       PlanosDeSaudeDAO.atualizar(planoDeSaude);
       
       JOptionPane.showMessageDialog(null,
               "Plano De Saúde atualizado com sucesso!",
               "Planos de Saúde",
               JOptionPane.INFORMATION_MESSAGE);
       
       dispose();
   }
   
   private void adicionar (){
       //Criar um objeto Plano De Saude
       
       PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
       novoPlanoDeSaude.setOperadora(textFieldOperadoraPlano.getText());
       novoPlanoDeSaude.setCategoria(textFieldCategoriaPlano.getText());
       novoPlanoDeSaude.setNumero(textFieldNumeroPlano.getText());
       novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidadePlano.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
       //Gravar o objeto atráves do DAO.
       PlanosDeSaudeDAO.gravar(novoPlanoDeSaude);
       
       JOptionPane.showMessageDialog(this,
               "Plano de Saúde adicionado com sucesso!",
               "Plano de Saúde",
               JOptionPane.INFORMATION_MESSAGE);
       
       dispose();
   }
       
    
       
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarPlanoDeSaude;
    private javax.swing.JButton buttonSalvarPlanoDeSaude;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCategoriaPlano;
    private javax.swing.JLabel labelCodigoPlano;
    private javax.swing.JLabel labelNumeroPlano;
    private javax.swing.JLabel labelOperadoraPlano;
    private javax.swing.JLabel labelPlanoDeSaudeAdicionar;
    private javax.swing.JLabel labelValidadePlano;
    private javax.swing.JPanel panelDetalhesPlanoDeSaude;
    private javax.swing.JTextField textFieldCategoriaPlano;
    private javax.swing.JTextField textFieldCodigoPlano;
    private javax.swing.JTextField textFieldNumeroPlano;
    private javax.swing.JTextField textFieldOperadoraPlano;
    private javax.swing.JFormattedTextField textFieldValidadePlano;
    // End of variables declaration//GEN-END:variables
}
