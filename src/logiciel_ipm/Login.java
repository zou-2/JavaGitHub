
package logiciel_ipm;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    Connecteur connexion;
    Statement stm;
    ResultSet resultat;
    public static String Id ="";
    
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 294));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 360));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Se connecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 220, 130, 30);

        UserName.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(UserName);
        UserName.setBounds(190, 70, 130, 30);

        Password.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(Password);
        Password.setBounds(190, 120, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom d'utilisateur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mot de passe");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 120, 120, 30);

        jButton2.setText("Créer un compte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 180, 130, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/login.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-150, -50, 510, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 294);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        try {
            stm = connexion.obtenirconnexion().createStatement();
            
            ResultSet resultat = stm.executeQuery("select * from Techniciens where UserName ='"+UserName.getText().toString()+"'");
            
            Id = resultat.getString("IdTech");
            
            if ((resultat.getString("UserName").equals(UserName.getText().toString())) && (resultat.getString("Password").equals(Password.getText().toString()))){
            
            Principale P = new Principale();
            P.setVisible(true);
            this.hide();
            }
   
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Compte invalide");
            
        }
        finally{
            try{
                stm.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        } 

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Creer_compte c = new Creer_compte();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
