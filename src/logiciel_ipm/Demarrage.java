
package logiciel_ipm;


public class Demarrage extends javax.swing.JFrame {

    
    public Demarrage() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        chargement = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pourcentage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(562, 370));
        jPanel2.setLayout(null);

        progressBar.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(progressBar);
        progressBar.setBounds(0, 400, 550, 10);

        chargement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chargement.setForeground(new java.awt.Color(255, 255, 255));
        chargement.setText("chargement...");
        jPanel2.add(chargement);
        chargement.setBounds(10, 360, 230, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/planet.gif"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(-20, 20, 570, 350);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/ispm.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 96, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/logo_ipm.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(450, 0, 100, 85);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logiciel_ipm/demarrage.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 420);

        pourcentage.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        pourcentage.setForeground(new java.awt.Color(255, 255, 255));
        pourcentage.setText("%");
        jPanel2.add(pourcentage);
        pourcentage.setBounds(260, 170, 62, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   public static void main(String args[]) {
        Demarrage MyDemarrage = new Demarrage();
        MyDemarrage.setVisible(true);
        try{
          for(int i = 0; i<=100; i++){
              Thread.sleep(80);
              MyDemarrage.progressBar.setValue(i);
              MyDemarrage.pourcentage.setText(Integer.toString(i)+"%");
              if(i == 10)
                  MyDemarrage.chargement.setText("activation des modules...");
              if(i == 20)
                  MyDemarrage.chargement.setText("installation des modules...");
              if(i == 50)
                  MyDemarrage.chargement.setText("connexion à la base de données...");
              if(i == 70)
                  MyDemarrage.chargement.setText("connexion réussie !");
              if(i == 80)
                  MyDemarrage.chargement.setText("lancement de l'application...");
              
          }
        }catch(Exception e){}
        new Login().setVisible(true);
        MyDemarrage.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chargement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pourcentage;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
