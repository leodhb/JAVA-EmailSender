/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailsendtest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author LeodboyBR
 */
public class MainJF extends javax.swing.JFrame {

    /**
     * Creates new form MainJF
     */
    String nome, email_adress, pass;
    String hostname;
    int porta;
    public MainJF() {
        initComponents();
        
        //servidores suportados pelo programa
        String[] servers =
        {
          "Gmail",
          "Live/Hotmail",
          "Yahoo!",
          "UOL"
        };
        
        nome         = JOptionPane.showInputDialog("[LOGIN] Seu primeiro nome: ");
        email_adress = JOptionPane.showInputDialog("[LOGIN] Insira seu email: ");
        pass         = JOptionPane.showInputDialog("[LOGIN] Insira sua senha: ");
        
        JComboBox jcb = new JComboBox();
        jcb.setModel(new javax.swing.DefaultComboBoxModel<>(servers));
        JOptionPane.showMessageDialog(null, jcb, "[LOGIN] Seu provedor", JOptionPane.QUESTION_MESSAGE);
        
        
        //ele pega a opção que voce escolheu no provedor e seta o hostname e a porta
        //a lista de hostnames:portas voce encontra em:
        //https://jeitodigital.com.br/artigo/lista-de-servidores-de-e-mail
        switch(jcb.getSelectedIndex())
        {
            case 0:
                hostname = "smtp.gmail.com";
                porta    = 465;
                break;
            case 1:
                hostname = "smtp.live.com";
                porta    = 587;
                break;
            case 2:
                hostname = "smtp.mail.yahoo.com.br";
                porta    = 465;
                break;
            case 3:
                hostname = "smtps.bol.com.br";
                porta    = 465;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "This email adress is successfully owned\nMsg.: CDG HASKIOU ESSA PORRA\nexploit by: leodboy_br_programmer@yandex.ru\nO resto é cópia");
        JOptionPane.showMessageDialog(null, "troslei ksjksjsksj");
        logged_into.setText("Logado em: " + email_adress);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Enviar email em java");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        to = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        assunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensagem = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logged_into = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        feed = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendButton.setText("enviar");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        mensagem.setColumns(20);
        mensagem.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        mensagem.setRows(5);
        jScrollPane1.setViewportView(mensagem);

        jLabel1.setText("Assunto");

        jLabel2.setText("Mensagem");

        logged_into.setText("Logado como: henrikleod@gmail.com");

        jLabel4.setText("Email: ");

        feed.setText("Envie a mensagem...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logged_into, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assunto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(feed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(logged_into)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendButton)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        try {
            // TODO add your handling code here:
            enviar();
        } catch (EmailException ex) {
            Logger.getLogger(MainJF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    
    
    //metodo para enviar emails usando o Apache
   public void enviar() throws EmailException
   {
        
   SimpleEmail email = new SimpleEmail();
   feed.setText("Configurando host...");
   progress.setValue(25);
   email.setHostName(hostname);
   email.setSmtpPort(porta);
   email.addTo(to.getText(), "User");
   email.setFrom(email_adress, nome);
   email.setSubject(assunto.getText());
   email.setMsg(mensagem.getText());
   feed.setText("Autenticando com o servidor...");
   progress.setValue(50);
   email.setSSL(true);
   email.setTLS(true);
   email.setAuthentication(email_adress, pass);
   feed.setText("Enviando...");
   progress.setValue(75);
   email.send();
   feed.setText("Enviado!");
   progress.setValue(100);
    
   }
    
    
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
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assunto;
    private javax.swing.JLabel feed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logged_into;
    private javax.swing.JTextArea mensagem;
    private javax.swing.JProgressBar progress;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
