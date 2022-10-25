
package br.senai.sp.jandira.gui;

import java.awt.Toolkit;
import java.util.Locale;

public class HomeFrame extends javax.swing.JFrame {
    
    private EspecialidadesPanel especialidadesPanel; //11/10
    private PanelPlanosDeSaude planoDeSaudePanel;
    private final int POS_X = 17;
    private final int POS_Y = 157;
    private final int LARGURA = 880;
    private final int ALTURA = 320;
    
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/paciente.png")));
        initPanels();
    }
    
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonPlanosSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        sisacon = new javax.swing.JLabel();
        sistemaAgendamento = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        site = new javax.swing.JLabel();
        suporteTecnico = new javax.swing.JLabel();
        linha = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendar32.png"))); // NOI18N
        jLabel1.setText("     Sistema para Agendamento de Consultas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 903, 90);

        buttonAgenda.setBackground(new java.awt.Color(255, 255, 153));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendario-desktop.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(150, 110, 114, 40);

        buttonPaciente.setBackground(new java.awt.Color(255, 255, 153));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setToolTipText("Paciente");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(270, 110, 118, 40);

        buttonMedicos.setBackground(new java.awt.Color(255, 255, 153));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor32.png"))); // NOI18N
        buttonMedicos.setText("Médicos");
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(400, 110, 116, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(255, 255, 153));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/estetoscopio32.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(530, 110, 134, 40);

        buttonSair.setBackground(new java.awt.Color(255, 51, 51));
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair");
        buttonSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(820, 110, 65, 38);

        buttonPlanosSaude.setBackground(new java.awt.Color(255, 255, 153));
        buttonPlanosSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/id-card32.png"))); // NOI18N
        buttonPlanosSaude.setText("Planos de Saúde");
        buttonPlanosSaude.setToolTipText("Planos de Saúde");
        buttonPlanosSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlanosSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosSaude);
        buttonPlanosSaude.setBounds(670, 110, 137, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(102, 102, 102));
        panelHome.setLayout(null);

        sisacon.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        sisacon.setForeground(new java.awt.Color(255, 51, 153));
        sisacon.setText("SISACON");
        panelHome.add(sisacon);
        sisacon.setBounds(30, 20, 400, 70);

        sistemaAgendamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sistemaAgendamento.setText("Sistema para Agendamento de Consultas");
        panelHome.add(sistemaAgendamento);
        sistemaAgendamento.setBounds(30, 70, 230, 40);

        email.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        email.setText("Email: suporte@sisacon.com.br");
        panelHome.add(email);
        email.setBounds(650, 170, 162, 16);

        telefone.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        telefone.setText("Telefone : 5555-5555");
        panelHome.add(telefone);
        telefone.setBounds(650, 190, 120, 20);

        site.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        site.setText("www.sisacon.com.br");
        panelHome.add(site);
        site.setBounds(650, 220, 140, 16);

        suporteTecnico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        suporteTecnico.setText("Suporte técnico:");
        panelHome.add(suporteTecnico);
        suporteTecnico.setBounds(650, 140, 140, 25);

        linha.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout linhaLayout = new javax.swing.GroupLayout(linha);
        linha.setLayout(linhaLayout);
        linhaLayout.setHorizontalGroup(
            linhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        linhaLayout.setVerticalGroup(
            linhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelHome.add(linha);
        linha.setBounds(30, 110, 770, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(17, 157, 880, 320);

        buttonHome.setBackground(new java.awt.Color(102, 255, 51));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home32.png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 110, 110, 40);

        setSize(new java.awt.Dimension(919, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color (255, 255, 153));
        buttonHome.setBackground(new java.awt.Color(102, 255, 51));
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(102, 255, 51)); 
        buttonHome.setBackground(new java.awt.Color(255, 255, 153));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPlanosSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosSaudeActionPerformed
         buttonPlanosSaude.setBackground(new java.awt.Color(102, 255, 51)); 
         buttonHome.setBackground(new java.awt.Color(255, 255, 153));
         panelHome.setVisible(false);
         planoDeSaudePanel.setVisible(true);
        
    }//GEN-LAST:event_buttonPlanosSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanosSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel linha;
    private javax.swing.JPanel panelHome;
    private javax.swing.JLabel sisacon;
    private javax.swing.JLabel sistemaAgendamento;
    private javax.swing.JLabel site;
    private javax.swing.JLabel suporteTecnico;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
         especialidadesPanel = new EspecialidadesPanel();
         especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
         getContentPane().add(especialidadesPanel);
         especialidadesPanel.setVisible(false);
         
         planoDeSaudePanel = new PanelPlanosDeSaude();
         planoDeSaudePanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
         getContentPane().add(planoDeSaudePanel);
         planoDeSaudePanel.setVisible(false);
    }

    

}
