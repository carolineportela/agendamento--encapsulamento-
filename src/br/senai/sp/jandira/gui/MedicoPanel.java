package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.MedicosDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    private int linha;

    public MedicoPanel() {
        initComponents();
        MedicosDAO.criarListaDeMedico();
        //ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codString = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codString);
        return codigo;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollListaMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonDeleteMedicos = new javax.swing.JButton();
        buttonEditarMedicos = new javax.swing.JButton();
        buttonAdicionarMedicos = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 320));
        jPanel1.setLayout(null);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollListaMedicos.setViewportView(tableMedicos);

        jPanel1.add(scrollListaMedicos);
        scrollListaMedicos.setBounds(20, 50, 820, 200);

        buttonDeleteMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/delete32.png"))); // NOI18N
        buttonDeleteMedicos.setToolTipText("Delete");
        buttonDeleteMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDeleteMedicos);
        buttonDeleteMedicos.setBounds(680, 260, 38, 40);

        buttonEditarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png"))); // NOI18N
        buttonEditarMedicos.setToolTipText("Editar");
        buttonEditarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditarMedicos);
        buttonEditarMedicos.setBounds(740, 260, 38, 40);

        buttonAdicionarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        buttonAdicionarMedicos.setToolTipText("Adicionar");
        buttonAdicionarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarMedicos);
        buttonAdicionarMedicos.setBounds(800, 260, 38, 40);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteMedicosActionPerformed
        //pegar a linha e a coluna que está selecionada  e excluir
        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor,selecione o Médico que deseja excluir!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttonDeleteMedicosActionPerformed

    private void buttonEditarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicosActionPerformed
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor,selecione o Médico que você deseje editar",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }      
        
    }//GEN-LAST:event_buttonEditarMedicosActionPerformed

    private void buttonAdicionarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicosActionPerformed
        MedicoJDialog medico = new MedicoJDialog(null, true,
                OperacaoEnum.ADICIONAR); //criando a tela modal de adicionar medicos
        medico.setVisible(true);//fazendo a tela aparecer quando apertamos o botão adicionar de medicos
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarMedicosActionPerformed
    private void preencherTabela() {
        tableMedicos.setModel(MedicosDAO.getTabelaMedicos());
        ajustarTabela();

    }

    private void ajustarTabela() {
        //Impedir o usuario de movimentar as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        //bloquear a edição das células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);

        //Definir a largura das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(330);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(150);
        //tableMedicos.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    private void excluirMedico() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão ?", "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0) {
            MedicosDAO.excluir(getCodigo());
            preencherTabela();

        }

    }

    private void editarMedico() {

        Medico medicos = MedicosDAO.getMedico(getCodigo());
        MedicoJDialog medicoDialog
                = new MedicoJDialog(null, true, medicos, OperacaoEnum.EDITAR);

        medicoDialog.setVisible(true);

        preencherTabela();

    }
//         


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedicos;
    private javax.swing.JButton buttonDeleteMedicos;
    private javax.swing.JButton buttonEditarMedicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollListaMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
}
