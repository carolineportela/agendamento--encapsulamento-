package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicosDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MedicoJDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoJDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        adicionandoNaList();
    }

    public MedicoJDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {

        textFieldCodigoMedico.setText(medico.getCodigo().toString());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldCRM.setText(medico.getCrm());
        textFieldEmail.setText(medico.getEmail());
        textFieldTelefone.setText(medico.getTelefone());
        formattedTextFieldDataDeNascimento.setText(medico.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelMedicosAdicionar.setText("Medicos - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelMedicosAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit32.png")));
        } else {
            labelMedicosAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMedicosAdicionar = new javax.swing.JLabel();
        panelDetalhesMedicos = new javax.swing.JPanel();
        labelCodigoMedico = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        labelEspecialidadesDosMedicos = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        buttonCancelarMedico = new javax.swing.JButton();
        buttonSalvarMedico = new javax.swing.JButton();
        textFieldEmail = new javax.swing.JTextField();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        labelCRM = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textFieldCRM = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        scrollPaneListaDeEspecialidades = new javax.swing.JScrollPane();
        jListListaDeEspecialidades = new javax.swing.JList<>();
        scrollEspecialidadesDosMedicos = new javax.swing.JScrollPane();
        jListListaEspecialidadesDosMedicos = new javax.swing.JList<>();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        buttonEsquerdo = new javax.swing.JButton();
        buttonDireito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        labelMedicosAdicionar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelMedicosAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus32.png"))); // NOI18N
        labelMedicosAdicionar.setText(" Médicos - ADICIONAR");
        jPanel1.add(labelMedicosAdicionar);
        labelMedicosAdicionar.setBounds(30, 20, 410, 40);

        panelDetalhesMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes dos Médicos"));
        panelDetalhesMedicos.setLayout(null);

        labelCodigoMedico.setText("Código:");
        panelDetalhesMedicos.add(labelCodigoMedico);
        labelCodigoMedico.setBounds(30, 20, 120, 16);

        textFieldCodigoMedico.setEditable(false);
        textFieldCodigoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(textFieldCodigoMedico);
        textFieldCodigoMedico.setBounds(30, 40, 110, 22);

        labelEspecialidadesDosMedicos.setText(" Especialidades dos Médicos:");
        panelDetalhesMedicos.add(labelEspecialidadesDosMedicos);
        labelEspecialidadesDosMedicos.setBounds(260, 140, 180, 16);

        labelDataDeNascimento.setText("Data de Nascimento:");
        panelDetalhesMedicos.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(460, 80, 110, 16);

        buttonCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancel32.png"))); // NOI18N
        buttonCancelarMedico.setToolTipText("Cancelar");
        buttonCancelarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(buttonCancelarMedico);
        buttonCancelarMedico.setBounds(440, 230, 50, 40);

        buttonSalvarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save32_1.png"))); // NOI18N
        buttonSalvarMedico.setToolTipText("Salvar");
        buttonSalvarMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(buttonSalvarMedico);
        buttonSalvarMedico.setBounds(510, 230, 50, 40);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(textFieldEmail);
        textFieldEmail.setBounds(200, 100, 240, 20);
        panelDetalhesMedicos.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(250, 40, 310, 20);

        labelNomeDoMedico.setText("Nome do Médico:");
        panelDetalhesMedicos.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(250, 20, 100, 16);

        labelCRM.setText("CRM:");
        panelDetalhesMedicos.add(labelCRM);
        labelCRM.setBounds(160, 20, 40, 16);

        labelEmail.setText("Email:");
        panelDetalhesMedicos.add(labelEmail);
        labelEmail.setBounds(200, 80, 50, 16);

        textFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCRMActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(textFieldCRM);
        textFieldCRM.setBounds(154, 40, 80, 22);

        labelTelefone.setText("Telefone:");
        panelDetalhesMedicos.add(labelTelefone);
        labelTelefone.setBounds(30, 80, 120, 16);

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(textFieldTelefone);
        textFieldTelefone.setBounds(30, 100, 140, 20);

        labelListaDeEspecialidades.setText("Lista de Especialidades:");
        panelDetalhesMedicos.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(30, 140, 150, 16);

        scrollPaneListaDeEspecialidades.setViewportView(jListListaDeEspecialidades);

        panelDetalhesMedicos.add(scrollPaneListaDeEspecialidades);
        scrollPaneListaDeEspecialidades.setBounds(20, 170, 150, 150);

        scrollEspecialidadesDosMedicos.setViewportView(jListListaEspecialidadesDosMedicos);

        panelDetalhesMedicos.add(scrollEspecialidadesDosMedicos);
        scrollEspecialidadesDosMedicos.setBounds(260, 170, 150, 150);

        formattedTextFieldDataDeNascimento.setText("jFormattedTextField1");
        formattedTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        panelDetalhesMedicos.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(460, 100, 126, 22);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();}

    buttonEsquerdo.setBackground(new java.awt.Color(255, 0, 0));
    buttonEsquerdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda.png"))); // NOI18N
    buttonEsquerdo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonEsquerdoActionPerformed(evt);
        }
    });
    panelDetalhesMedicos.add(buttonEsquerdo);
    buttonEsquerdo.setBounds(190, 250, 50, 40);

    buttonDireito.setBackground(new java.awt.Color(51, 255, 51));
    buttonDireito.setForeground(new java.awt.Color(51, 255, 51));
    buttonDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita.png"))); // NOI18N
    buttonDireito.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonDireitoActionPerformed(evt);
        }
    });
    panelDetalhesMedicos.add(buttonDireito);
    buttonDireito.setBounds(190, 190, 50, 40);

    jPanel1.add(panelDetalhesMedicos);
    panelDetalhesMedicos.setBounds(20, 80, 640, 340);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
    );

    setSize(new java.awt.Dimension(722, 446));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoMedicoActionPerformed

    private void buttonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarMedicoActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarMedicoActionPerformed

    private void buttonSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarMedicoActionPerformed
        CharSequence s = " ";

        if (textFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o número do CRM");
            textFieldCRM.requestFocus();
        } else if (textFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o nome do Médico");
            textFieldNomeDoMedico.requestFocus();
        } else if (textFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o Telefone do Médico");
            textFieldTelefone.requestFocus();
        } else if (textFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite o e-mail do Médico");
            textFieldEmail.requestFocus();
        } else if (formattedTextFieldDataDeNascimento.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(this, "Por favor, digite a data de nascimento");
            formattedTextFieldDataDeNascimento.requestFocus();
        } else {
            if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editar();
            }

        }
    }//GEN-LAST:event_buttonSalvarMedicoActionPerformed
    //evento do button salvar

    private ArrayList<Especialidade> pegarEspecialidades(JList<String> lista) {
        int tamanho = lista.getModel().getSize();

        ArrayList<Especialidade> listaNova = new ArrayList();

        for (int i = 0; i < tamanho; i++) {

            int codigo = Integer.valueOf(lista.getModel().getElementAt(i).substring(0, 3));// 100 - Cardiologia
            Especialidade e = EspecialidadeDAO.getEspecialidade(codigo);
            listaNova.add(e);
        }
        return listaNova;
    }

    //evento do button editar
//    private ArrayList<Especialidade> pegarEspecialidadesDoMedico(JList<String> lista2) {
//        
//        pegarEspecialidadesDoMedico(lista2) == pegarEspecialidades(lista2).add(e);
//        ArrayList<Especialidade> listaNova2 = new ArrayList();
//
//        Especialidade e = EspecialidadeDAO.getEspecialidade(codigo);
//
//    }


    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCRMActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void formattedTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldDataDeNascimentoActionPerformed

    private void buttonDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitoActionPerformed
// primeiro codigo       DefaultListModel<String> listaEspecialidadeMedico = new DefaultListModel<>();
//        for (Especialidade especialidade : EspecialidadeDAO.getEspecialidades()) {
//            listaEspecialidadeMedico.addElement(jListListaDeEspecialidades.getSelectedValue());
//            break;
//        }
//        jListListaEspecialidadesDosMedicos.setModel(listaEspecialidadeMedico);

        if (jListListaEspecialidadesDosMedicos.isSelectionEmpty() == true) {

            ArrayList<String> novaLista = new ArrayList<>();

            int tamanho = jListListaEspecialidadesDosMedicos.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaLista.add(jListListaEspecialidadesDosMedicos.getModel().getElementAt(i));
            }

            if (novaLista.contains(jListListaDeEspecialidades.getSelectedValue()) == false) {
                novaLista.add(jListListaDeEspecialidades.getSelectedValue());

                DefaultListModel<String> listaEspecilidadeMedicoModel = new DefaultListModel<>();

                for (String acaoDoBotaoAvancar : novaLista) {
                    listaEspecilidadeMedicoModel.addElement(acaoDoBotaoAvancar);
                }
                jListListaEspecialidadesDosMedicos.setModel(listaEspecilidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Não é possível adicionar uma especialidade já cadastrada no sistema!",
                        "Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma especialidade",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttonDireitoActionPerformed

    private void buttonEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdoActionPerformed
//        DefaultListModel<String> listaEspecialidadeDosMedicos = new DefaultListModel<>();
//        for (Especialidade especialidade : EspecialidadeDAO.getEspecialidades()) {
//            listaEspecialidadeMedico.removeElement(jListListaDeEspecialidades.getSelectedValue());
//            break;
//        }
//        jListListaDeEspecialidades.setModel(listaEspecialidadeMedico);

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente deletar?",
                "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {

            if (jListListaEspecialidadesDosMedicos.isSelectionEmpty() == false) {
                ArrayList<String> novaListaMedicos = new ArrayList<>();
                int tamanho = jListListaEspecialidadesDosMedicos.getModel().getSize();

                for (int i = 0; i < tamanho; i++) {
                    novaListaMedicos.add(jListListaEspecialidadesDosMedicos.getModel().getElementAt(i));
                }
                novaListaMedicos.remove(jListListaEspecialidadesDosMedicos.getSelectedValue());

                DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<>();
                for (String acaoVoltar : novaListaMedicos) {
                    listaEspecialidadeMedicoModel.addElement(acaoVoltar);
                }
                jListListaEspecialidadesDosMedicos.setModel(listaEspecialidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Não contém nenhuma especialidade na lista",
                        "Editando Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_buttonEsquerdoActionPerformed

    private void editar() {
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setCrm(textFieldCRM.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataNascimento(LocalDate.parse(formattedTextFieldDataDeNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEspecialidades(pegarEspecialidades(jListListaDeEspecialidades));
        MedicosDAO.atualizar(medico);

        JOptionPane.showMessageDialog(null,
                "Médico atualizado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    private void adicionar() {
        Medico novoMedico = new Medico();
        novoMedico.setNome(textFieldNomeDoMedico.getText());
        novoMedico.setCrm(textFieldCRM.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataNascimento(LocalDate.parse(formattedTextFieldDataDeNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        novoMedico.setEspecialidades(pegarEspecialidades(jListListaDeEspecialidades));
        MedicosDAO.gravar(novoMedico);
        JOptionPane.showMessageDialog(this,
                "Medico gravado com sucesso!",
                "Medicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();//pra fechar a janela

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonDireito;
    private javax.swing.JButton buttonEsquerdo;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JList<String> jListListaDeEspecialidades;
    private javax.swing.JList<String> jListListaEspecialidadesDosMedicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadesDosMedicos;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelMedicosAdicionar;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelDetalhesMedicos;
    private javax.swing.JScrollPane scrollEspecialidadesDosMedicos;
    private javax.swing.JScrollPane scrollPaneListaDeEspecialidades;
    private javax.swing.JFormattedTextField textFieldCRM;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
 private void adicionandoNaList() {
        jListListaDeEspecialidades.setModel(EspecialidadeDAO.getListaEspecialidade());
    }
    //private void adicicionandoNaList

}
