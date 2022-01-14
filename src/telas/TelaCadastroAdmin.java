/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import users.*;
import banco.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henri
 */
public class TelaCadastroAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroPaciente
     */
    public TelaCadastroAdmin() throws Exception {
        super("Gerenciamento de administradores");
        initComponents();
        setLocationRelativeTo(null);
        readJTable();
    }

    public void readJTable() throws Exception {
        DefaultTableModel adminstradores = (DefaultTableModel) jTableAdministradores.getModel();
        DAO dao = new DAO();
        adminstradores.setNumRows(0);
        for (Usuario u : dao.mostraUsuarioAdm()) {

            adminstradores.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getEmail(),});

        }
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
        jButtonVoltar = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelConfirmaSenha = new javax.swing.JLabel();
        jPasswordFieldConfirmaSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelNomePesquisa = new javax.swing.JLabel();
        jTextFieldProcurar = new javax.swing.JTextField();
        jButtonPesquisarNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdministradores = new javax.swing.JTable();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jButtonTrocarSenha = new javax.swing.JButton();
        jLabelFundo2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmailEditar = new javax.swing.JTextField();
        jTextFieldNomeEditar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabelFundoTabEditar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPasswordFieldEditarConfirmarNovaSenha = new javax.swing.JPasswordField();
        jPasswordFieldEditarNovaSenha = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        LimparEditarSenha = new javax.swing.JButton();
        jLabelFundo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Central de Administradores");

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Retornarzinho2.png"))); // NOI18N
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logoutizinho.png"))); // NOI18N
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 60);

        jPanel2.setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");
        jPanel2.add(jLabelNome);
        jLabelNome.setBounds(10, 60, 50, 30);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNome);
        jTextFieldNome.setBounds(60, 60, 220, 30);

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(60, 110, 220, 30);

        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(430, 60, 150, 30);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        jPanel2.add(jLabelSenha);
        jLabelSenha.setBounds(380, 60, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("*");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(590, 60, 31, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("*");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(290, 60, 31, 30);

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setText("Email:");
        jPanel2.add(jLabelEmail);
        jLabelEmail.setBounds(10, 110, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("*");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 20, 20, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(290, 110, 31, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Campos Obrigatórios!");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 23, 130, 20);

        jLabelConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelConfirmaSenha.setText("Confirmar Senha:");
        jPanel2.add(jLabelConfirmaSenha);
        jLabelConfirmaSenha.setBounds(310, 110, 120, 30);

        jPasswordFieldConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jPasswordFieldConfirmaSenha);
        jPasswordFieldConfirmaSenha.setBounds(430, 110, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("*");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(590, 110, 31, 30);

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonSalvar);
        ButtonSalvar.setBounds(180, 210, 90, 25);

        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonLimpar);
        ButtonLimpar.setBounds(50, 210, 90, 25);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/design-de-modelo-de-papel-de-parede-medico-abstrato_53876-61805.jpg"))); // NOI18N
        jPanel2.add(jLabelFundo);
        jLabelFundo.setBounds(0, -30, 660, 300);

        jTabbedPane1.addTab("Cadastrar Administrador", jPanel2);

        jPanel3.setLayout(null);

        jLabelNomePesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNomePesquisa.setText("Nome:");
        jPanel3.add(jLabelNomePesquisa);
        jLabelNomePesquisa.setBounds(20, 20, 60, 30);

        jTextFieldProcurar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProcurarKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldProcurar);
        jTextFieldProcurar.setBounds(70, 20, 180, 30);

        jButtonPesquisarNome.setText("Pesquisar");
        jButtonPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarNomeActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPesquisarNome);
        jButtonPesquisarNome.setBounds(260, 20, 90, 30);

        jTableAdministradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAdministradores);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 590, 140);

        ButtonEditar.setText("Editar");
        ButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonEditarMouseClicked(evt);
            }
        });
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonEditar);
        ButtonEditar.setBounds(50, 210, 90, 25);

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(ButtonExcluir);
        ButtonExcluir.setBounds(180, 210, 90, 25);

        jButtonTrocarSenha.setText("Trocar Senha");
        jButtonTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrocarSenhaActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTrocarSenha);
        jButtonTrocarSenha.setBounds(490, 210, 100, 25);

        jLabelFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/design-de-modelo-de-papel-de-parede-medico-abstrato_53876-61805.jpg"))); // NOI18N
        jPanel3.add(jLabelFundo2);
        jLabelFundo2.setBounds(-10, -10, 760, 270);

        jTabbedPane1.addTab("Consultar Administrador", jPanel3);

        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(140, 110, 50, 30);
        jPanel4.add(jTextFieldEmailEditar);
        jTextFieldEmailEditar.setBounds(190, 110, 220, 30);
        jPanel4.add(jTextFieldNomeEditar);
        jTextFieldNomeEditar.setBounds(190, 60, 220, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nome:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(140, 60, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("*");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 170, 20, 22);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("*");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(420, 110, 60, 30);

        buttonOk.setText("OK");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        jPanel4.add(buttonOk);
        buttonOk.setBounds(190, 150, 220, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("*");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(420, 60, 60, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Campos Obrigatórios!");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(30, 170, 130, 20);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLimpar);
        jButtonLimpar.setBounds(50, 210, 90, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Editar Informações de Administrador");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(170, 10, 290, 30);

        jLabelFundoTabEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/design-de-modelo-de-papel-de-parede-medico-abstrato_53876-61805.jpg"))); // NOI18N
        jPanel4.add(jLabelFundoTabEditar);
        jLabelFundoTabEditar.setBounds(-4, -3, 660, 270);

        jTabbedPane1.addTab("Editar Administrador", jPanel4);

        jPanel5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Confirmar Senha:");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(110, 110, 120, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Nova Senha:");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(140, 70, 90, 30);
        jPanel5.add(jPasswordFieldEditarConfirmarNovaSenha);
        jPasswordFieldEditarConfirmarNovaSenha.setBounds(230, 110, 180, 30);
        jPanel5.add(jPasswordFieldEditarNovaSenha);
        jPasswordFieldEditarNovaSenha.setBounds(230, 70, 180, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Atualização de Senha Administradora");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(180, 10, 280, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("*");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(20, 160, 36, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("*");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(420, 70, 36, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("*");
        jPanel5.add(jLabel23);
        jLabel23.setBounds(420, 110, 36, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Campos Obrigatórios!");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(40, 160, 120, 30);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(230, 150, 180, 30);

        LimparEditarSenha.setText("Limpar");
        LimparEditarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparEditarSenhaActionPerformed(evt);
            }
        });
        jPanel5.add(LimparEditarSenha);
        LimparEditarSenha.setBounds(50, 210, 90, 25);

        jLabelFundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/design-de-modelo-de-papel-de-parede-medico-abstrato_53876-61805.jpg"))); // NOI18N
        jPanel5.add(jLabelFundo3);
        jLabelFundo3.setBounds(-20, -10, 630, 270);

        jTabbedPane1.addTab("Atualizar Senha", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 610, 280);

        setSize(new java.awt.Dimension(621, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipalAdmin tela2 = new TelaPrincipalAdmin();
        tela2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed

        Usuario adm = new Usuario();
        int pegarSelecao = jTableAdministradores.getSelectedRow();
        Object iddd = jTableAdministradores.getValueAt(pegarSelecao, 0);
        String idd = iddd.toString();
        int id = Integer.parseInt(idd);
        
        if (jTextFieldEmailEditar.getText().equals("") || jTextFieldNomeEditar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");
        } else {
        
        adm.setEmail(jTextFieldEmailEditar.getText());
        adm.setNome(jTextFieldNomeEditar.getText());
        adm.setId(id);
        DAO dao = new DAO();
        try {
            dao.atualizarAdm(adm);

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            readJTable();
            jTextFieldEmailEditar.setText("");
            jTextFieldNomeEditar.setText("");
            jTabbedPane1.setSelectedIndex(1);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha técnica, verifique se seu email já não está cadastrado. Caso não esteja, consulte o suporte!", "Falha no Cadastro", JOptionPane.WARNING_MESSAGE);
        }
        }

    }//GEN-LAST:event_buttonOkActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        int pegarSelecao = jTableAdministradores.getSelectedRow();
        int escolha = JOptionPane.showConfirmDialog(null, "Remover Administrador?");
        if (escolha == JOptionPane.YES_OPTION) {

            try {
                Object iddd = jTableAdministradores.getValueAt(pegarSelecao, 0);
                String idd = iddd.toString();
                int id = Integer.parseInt(idd);
                Usuario adm = new Usuario(id);
                DAO dao = new DAO();
                dao.removerAdm(adm);
                JOptionPane.showMessageDialog(null, "Administrador removido com sucesso!");
                readJTable();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        jTabbedPane1.setSelectedIndex(2);

        jTextFieldNomeEditar.setText(jTableAdministradores.getValueAt(jTableAdministradores.getSelectedRow(), 1).toString());
        jTextFieldEmailEditar.setText(jTableAdministradores.getValueAt(jTableAdministradores.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditarMouseClicked

    }//GEN-LAST:event_ButtonEditarMouseClicked

    private void jTextFieldProcurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProcurarKeyReleased
        // Insert Code here:
    }//GEN-LAST:event_jTextFieldProcurarKeyReleased

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmaSenha.setText("");
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        String nomeAdm = jTextFieldNome.getText();
        String emailAdm = jTextFieldEmail.getText();
        String senha = new String(jPasswordFieldSenha.getPassword());
        String confirmaSenha = new String(jPasswordFieldConfirmaSenha.getPassword());
       
        if (nomeAdm == null || nomeAdm.length() == 0
                || emailAdm == null || emailAdm.length() == 0 || senha == null || senha.length() == 0
                || confirmaSenha == null || confirmaSenha.length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
        } else if (confirmaSenha.equals(senha)) {
            try {
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro de novo administador?");
                if (escolha == JOptionPane.YES_OPTION) {
                    Usuario user = new Usuario(nomeAdm, emailAdm, senha, true);//true pq é um administrador
                    DAO dao = new DAO();
                    dao.inserirAdmin(user);
                    JOptionPane.showMessageDialog(null, "Usuario administrador cadastrado com sucesso");
                    jTextFieldNome.setText("");
                    jTextFieldEmail.setText("");
                    jPasswordFieldSenha.setText("");
                    jPasswordFieldConfirmaSenha.setText("");
                    readJTable();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha técnica, verifique se seu email já não está cadastrado. Caso não esteja, consulte o suporte!", "Falha no Cadastro", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            } 
        } else {
            JOptionPane.showMessageDialog(null, "Os campos de senha devem ser os mesmos!");
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNomeEditar.setText("");
        jTextFieldEmailEditar.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarNomeActionPerformed
        String nome = "%" + jTextFieldProcurar.getText() + "%";

        DAO dao = new DAO();
        ArrayList<Usuario> admin = new ArrayList<Usuario>();
        try {
            admin = dao.buscarAdmPorNome(nome);
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel adm = (DefaultTableModel) jTableAdministradores.getModel();
        adm.setNumRows(0);

        for (Usuario u : admin) {
            adm.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getEmail(),});

        }
    }//GEN-LAST:event_jButtonPesquisarNomeActionPerformed

    private void jButtonTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrocarSenhaActionPerformed
        jTabbedPane1.setSelectedIndex(3);

    }//GEN-LAST:event_jButtonTrocarSenhaActionPerformed

    private void LimparEditarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparEditarSenhaActionPerformed
        jPasswordFieldEditarNovaSenha.setText("");
        jPasswordFieldEditarConfirmarNovaSenha.setText("");
    }//GEN-LAST:event_LimparEditarSenhaActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        Usuario adm = new Usuario();
        int pegarSelecao = jTableAdministradores.getSelectedRow();
        Object iddd = jTableAdministradores.getValueAt(pegarSelecao, 0);
        String idd = iddd.toString();
        int id = Integer.parseInt(idd);

        String senha = new String(jPasswordFieldEditarNovaSenha.getPassword());
        String CSenha = new String(jPasswordFieldEditarConfirmarNovaSenha.getPassword());
        
        if(senha == null || senha.length() == 0 || CSenha == null || CSenha.length() == 0){
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios!");
        } else if (senha.equals(CSenha)) {
            adm.setSenha(senha);
            adm.setId(id);
            DAO dao = new DAO();
            try {
                dao.atualizarSenhaAdm(adm);

                JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso!");
                readJTable();
                jPasswordFieldEditarNovaSenha.setText("");
                jPasswordFieldEditarConfirmarNovaSenha.setText("");
                jTabbedPane1.setSelectedIndex(1);
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos de senha devem ser os mesmos!");
        }
                        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton LimparEditarSenha;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonPesquisarNome;
    private javax.swing.JButton jButtonTrocarSenha;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConfirmaSenha;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundo2;
    private javax.swing.JLabel jLabelFundo3;
    private javax.swing.JLabel jLabelFundoTabEditar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomePesquisa;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordFieldConfirmaSenha;
    private javax.swing.JPasswordField jPasswordFieldEditarConfirmarNovaSenha;
    private javax.swing.JPasswordField jPasswordFieldEditarNovaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAdministradores;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailEditar;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeEditar;
    private javax.swing.JTextField jTextFieldProcurar;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            try {
                new TelaCadastroAdmin().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}