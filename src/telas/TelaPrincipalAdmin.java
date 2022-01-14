/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import banco.DAO;
import br.com.parg.viacep.ViaCEPException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import users.Usuario;

/**
 *
 * @author henri
 */
public class TelaPrincipalAdmin extends javax.swing.JFrame{
    
    public TelaPrincipalAdmin(String nome) {
        initComponents();
        jLabelMensagemOla.setText("Olá, " + nome + "!");
    }
    
    public TelaPrincipalAdmin() {
        initComponents();
        jLabelMensagemOla.setText("Boas vindas novamente!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVaciLifeLogo = new javax.swing.JLabel();
        jLabelAdmin = new javax.swing.JLabel();
        jButtonExtracaoRelatorio = new javax.swing.JButton();
        jButtonCasdatroAdm = new javax.swing.JButton();
        jButtonCadastroAtd = new javax.swing.JButton();
        jButtonCadastroPaciente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelMensagemOla = new javax.swing.JLabel();
        jLabelSlogan = new javax.swing.JLabel();
        jLabelExtracaoRelatorios = new javax.swing.JLabel();
        jLabelCadastroAdm = new javax.swing.JLabel();
        jLabelCadastroAtendente = new javax.swing.JLabel();
        jLabelCadastroPacientes = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jLabelImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelVaciLifeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome__1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabelVaciLifeLogo);
        jLabelVaciLifeLogo.setBounds(140, 0, 230, 120);

        jLabelAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/-_Admin__1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabelAdmin);
        jLabelAdmin.setBounds(320, 30, 210, 50);

        jButtonExtracaoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Relatoriozinho.png"))); // NOI18N
        jButtonExtracaoRelatorio.setToolTipText("Extração de Relatórios");
        jButtonExtracaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtracaoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExtracaoRelatorio);
        jButtonExtracaoRelatorio.setBounds(490, 160, 100, 80);

        jButtonCasdatroAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngegg2.png"))); // NOI18N

        jButtonCasdatroAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCasdatroAdmActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCasdatroAdm);
        jButtonCasdatroAdm.setBounds(30, 160, 100, 80);

        jButtonCadastroAtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nurseMaior.png"))); // NOI18N
        jButtonCadastroAtd.setToolTipText("Cadastro de Atendentes");
        jButtonCadastroAtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAtdActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastroAtd);
        jButtonCadastroAtd.setBounds(190, 160, 100, 80);

        jButtonCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PacienteAindaMenor.png"))); // NOI18N
        jButtonCadastroPaciente.setToolTipText("Cadastro de Pacientes");
        jButtonCadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastroPaciente);
        jButtonCadastroPaciente.setBounds(340, 160, 100, 80);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit3.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(590, 20, 20, 20);

        jLabelMensagemOla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMensagemOla.setForeground(new java.awt.Color(0, 102, 102));
        jLabelMensagemOla.setText("Olá, ");
        getContentPane().add(jLabelMensagemOla);
        jLabelMensagemOla.setBounds(30, 90, 380, 40);

        jLabelSlogan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSlogan.setText("VaciLife, transformando vidas para um novo começo!");
        getContentPane().add(jLabelSlogan);
        jLabelSlogan.setBounds(30, 280, 360, 50);

        jLabelExtracaoRelatorios.setText("Extração de Relatórios");
        getContentPane().add(jLabelExtracaoRelatorios);
        jLabelExtracaoRelatorios.setBounds(480, 140, 130, 16);

        jLabelCadastroAdm.setText("Central de Administradores");
        getContentPane().add(jLabelCadastroAdm);
        jLabelCadastroAdm.setBounds(10, 140, 160, 16);

        jLabelCadastroAtendente.setText("Central de Atendentes");
        getContentPane().add(jLabelCadastroAtendente);
        jLabelCadastroAtendente.setBounds(180, 140, 130, 16);

        jLabelCadastroPacientes.setText("Central de Pacientes");
        getContentPane().add(jLabelCadastroPacientes);
        jLabelCadastroPacientes.setBounds(330, 140, 130, 16);

        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logoutizinho.png"))); // NOI18N
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout);
        jButtonLogout.setBounds(20, 20, 30, 30);

        jLabelImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/design-de-modelo-de-papel-de-parede-medico-abstrato_53876-61805.jpg"))); // NOI18N
        getContentPane().add(jLabelImgFundo);
        jLabelImgFundo.setBounds(0, 0, 630, 360);

        setSize(new java.awt.Dimension(640, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExtracaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtracaoRelatorioActionPerformed
        TelaExtrairRelatorio ter = new TelaExtrairRelatorio();
        ter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonExtracaoRelatorioActionPerformed

    private void jButtonCasdatroAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCasdatroAdmActionPerformed
        TelaCadastroAdmin tela1 = null; 
        try {
            tela1 = new TelaCadastroAdmin();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCasdatroAdmActionPerformed

    private void jButtonCadastroAtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAtdActionPerformed
        TelaCadastroAtendente tela1 = null; 
        try {
            tela1 = new TelaCadastroAtendente();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCadastroAtdActionPerformed

    private void jButtonCadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroPacienteActionPerformed
        TelaCadastroPaciente tela1 = null;
        try {
            tela1 = new TelaCadastroPaciente();
        } catch (ViaCEPException ex) {
            Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela1.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonCadastroPacienteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaPrincipalAdmin().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroAtd;
    private javax.swing.JButton jButtonCadastroPaciente;
    private javax.swing.JButton jButtonCasdatroAdm;
    private javax.swing.JButton jButtonExtracaoRelatorio;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelCadastroAdm;
    private javax.swing.JLabel jLabelCadastroAtendente;
    private javax.swing.JLabel jLabelCadastroPacientes;
    private javax.swing.JLabel jLabelExtracaoRelatorios;
    private javax.swing.JLabel jLabelImgFundo;
    private javax.swing.JLabel jLabelMensagemOla;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JLabel jLabelVaciLifeLogo;
    // End of variables declaration//GEN-END:variables
}
