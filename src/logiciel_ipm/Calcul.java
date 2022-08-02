
package logiciel_ipm;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Calcul extends javax.swing.JFrame {

    Statement stm;
    Connecteur connexion;
    
    
    
    public Calcul() {
        initComponents();
        
        String rqt = "select IdEch from Echantillons where IdTech = "+Login.Id;
            
        try {
            stm = connexion.obtenirconnexion().createStatement();
            ResultSet resultat = stm.executeQuery(rqt);
                   
            //System.out.println(resultat.getString("IdTech")); 
            
            while(resultat.next()){
                select_ech.addItem(resultat.getString("IdEch"));
            }
            
            //select_ech.setSelectedItem(resultat.getString("IdTech"));
            
    
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            try{
                stm.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Fd_ec = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Fd_ma = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Somme_ec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Somme_ma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        SLM = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Somme_st = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fd_st = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        select_ech = new javax.swing.JComboBox();
        select_nb_boite = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(680, 30));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 542, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 570, 30);

        Fd_ec.setBackground(new java.awt.Color(51, 255, 255));
        Fd_ec.setForeground(new java.awt.Color(255, 255, 255));
        Fd_ec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.1", "0.01", "0.001", "0.0001", "0.00001", "0.000001", "0.0000001" }));
        jPanel1.add(Fd_ec);
        Fd_ec.setBounds(120, 120, 80, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("F.D");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 120, 60, 30);

        Fd_ma.setBackground(new java.awt.Color(51, 255, 255));
        Fd_ma.setForeground(new java.awt.Color(255, 255, 255));
        Fd_ma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.1", "0.01", "0.001", "0.0001", "0.00001", "0.000001", "0.0000001" }));
        jPanel1.add(Fd_ma);
        Fd_ma.setBounds(410, 120, 80, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F.D");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 120, 60, 30);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,97));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EC");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(134, 11, 33, 22);

        Somme_ec.setBackground(new java.awt.Color(51, 255, 255));
        jPanel3.add(Somme_ec);
        Somme_ec.setBounds(120, 50, 80, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Somme C");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 50, 60, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 30, 270, 140);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,97));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MA");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(134, 11, 33, 22);

        Somme_ma.setBackground(new java.awt.Color(51, 255, 255));
        jPanel4.add(Somme_ma);
        Somme_ma.setBounds(130, 50, 80, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Somme C");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(60, 50, 60, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(280, 30, 290, 140);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0,97));
        jPanel5.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SLM");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(134, 11, 40, 22);

        SLM.setBackground(new java.awt.Color(51, 255, 255));
        SLM.setForeground(new java.awt.Color(255, 255, 255));
        SLM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "positif", "négatif" }));
        jPanel5.add(SLM);
        SLM.setBounds(110, 80, 80, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(280, 180, 290, 140);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0,97));
        jPanel6.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ST");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(134, 11, 33, 22);

        Somme_st.setBackground(new java.awt.Color(51, 255, 255));
        jPanel6.add(Somme_st);
        Somme_st.setBounds(110, 40, 80, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Somme C");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(40, 40, 60, 30);

        Fd_st.setBackground(new java.awt.Color(51, 255, 255));
        Fd_st.setForeground(new java.awt.Color(255, 255, 255));
        Fd_st.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.1", "0.01", "0.001", "0.0001", "0.00001", "0.000001", "0.0000001" }));
        jPanel6.add(Fd_st);
        Fd_st.setBounds(110, 80, 80, 30);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F.D");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(40, 80, 60, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 180, 270, 140);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0,97));
        jPanel7.setLayout(null);

        select_ech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_echActionPerformed(evt);
            }
        });
        jPanel7.add(select_ech);
        select_ech.setBounds(300, 10, 90, 20);

        select_nb_boite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        select_nb_boite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_nb_boiteActionPerformed(evt);
            }
        });
        jPanel7.add(select_nb_boite);
        select_nb_boite.setBounds(300, 40, 90, 20);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Séléctionner un échantillon");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(129, 11, 160, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de boite(s)");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(129, 40, 160, 20);

        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Valider");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(244, 71, 90, 40);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 330, 570, 130);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/calcul.jpg"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 580, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int x,y;


    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //eto le calcul;
        Double N_ec = 0.0;
        Double N_st = 0.0;
        Double N_ma = 0.0;
        Double FdEc = Double.parseDouble(Fd_ec.getSelectedItem().toString());
        Double FdMa = Double.parseDouble(Fd_ma.getSelectedItem().toString());
        Double FdSt = Double.parseDouble(Fd_st.getSelectedItem().toString());
        //calcul ec
        int condition = Integer.parseInt(select_nb_boite.getSelectedItem().toString());
        if(condition == 2){
            N_ec = Integer.parseInt(Somme_ec.getText()) / (1.1 * FdEc);
            N_st = Integer.parseInt(Somme_st.getText()) / (1.1 * FdSt);
            N_ma = Integer.parseInt(Somme_ma.getText()) / (1.1 * FdMa);
        }else{
            N_ec = Integer.parseInt(Somme_ec.getText()) /  FdEc;
            N_st = Integer.parseInt(Somme_st.getText()) /  FdSt;
            N_ma = Integer.parseInt(Somme_ma.getText()) /  FdMa;
        }
        
        String ST ="";
        String EC ="";
        String MA ="";
        String slm = SLM.getSelectedItem().toString();
        String conclusion ="";
        
        if (N_ec < 100){
            EC = "négatif";
        }else{
            EC = "positif";
        }
        
        if (N_ma < 100000){
            MA = "négatif";
        }else{
            MA = "positif";
        }
        
        if (N_st < 1000){
            ST = "négatif";
        }else{
            ST = "positif";
        }
        
        if(ST.equals("négatif") && EC.equals("négatif") && MA.equals("négatif") && slm.equals("négatif")){
            conclusion = "consommable";
        }else if(ST.equals("négatif") && EC.equals("positif") && MA.equals("négatif") && slm.equals("négatif")){
            conclusion = "consommable";
        }else if(ST.equals("négatif") && EC.equals("négatif") && MA.equals("positif") && slm.equals("négatif")){
            conclusion = "consommable";
        }else if(ST.equals("négatif") && EC.equals("négatif") && MA.equals("négatif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("positif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("négatif") && MA.equals("positif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("négatif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("positif") && slm.equals("négatif")){
            conclusion = "non-consommable";
        }else if(ST.equals("négatif") && EC.equals("négatif") && MA.equals("positif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("négatif") && EC.equals("positif") && MA.equals("négatif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("négatif") && MA.equals("négatif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("négatif") && slm.equals("négatif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("positif") && slm.equals("négatif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("positif") && MA.equals("négatif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("positif") && EC.equals("négatif") && MA.equals("positif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }else if(ST.equals("négatif") && EC.equals("positif") && MA.equals("positif") && slm.equals("positif")){
            conclusion = "non-consommable";
        }
       
        
        String select_id = select_ech.getSelectedItem().toString();
        try{    
            stm = connexion.obtenirconnexion().createStatement();
       
            stm.executeUpdate("UPDATE or ignore Resultats SET IdReslt  ='"+select_id+
            "',ST= '"+ST+"',EC ='"+EC+"',MA ='"+MA+"' ,SLM ='"+slm+
            "' ,Conclusion ='"+conclusion+"' where IdReslt= '"+select_id+"'");
            JOptionPane.showMessageDialog(null, "Calcul effectuézouz!");
            Somme_ec.setText("");
            Somme_ma.setText("");
            Somme_st.setText("");
            
            
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
            System.err.println(e);
        }finally{
        try{
        stm.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        }    
                
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void select_echActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_echActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_echActionPerformed

    private void select_nb_boiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_nb_boiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_nb_boiteActionPerformed

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
            java.util.logging.Logger.getLogger(Calcul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Fd_ec;
    private javax.swing.JComboBox Fd_ma;
    private javax.swing.JComboBox Fd_st;
    private javax.swing.JComboBox SLM;
    private javax.swing.JTextField Somme_ec;
    private javax.swing.JTextField Somme_ma;
    private javax.swing.JTextField Somme_st;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JComboBox select_ech;
    private javax.swing.JComboBox select_nb_boite;
    // End of variables declaration//GEN-END:variables
}
