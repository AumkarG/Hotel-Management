import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anish
 */
public class Gym extends javax.swing.JFrame {
    static String pass;
    /**
     * Creates new form Gym
     */
    public Gym(String s) {
        pass=s;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        std1 = new javax.swing.JRadioButton();
        del1 = new javax.swing.JRadioButton();
        std2 = new javax.swing.JRadioButton();
        del2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 102, 255));
        kGradientPanel1.setkTransparentControls(false);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel1.setText("GYM SERVICES");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel2.setText("These are the available packages, please select one");

        std1.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(std1);
        std1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        std1.setText("ONE HOUR STANDARD PACKAGE (Rs. 200)");

        del1.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(del1);
        del1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        del1.setText("ONE HOUR DELUXE PACKAGE (TRAINER INCLUSIVE) (Rs. 300)");
        del1.setToolTipText("");
        del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del1ActionPerformed(evt);
            }
        });

        std2.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(std2);
        std2.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        std2.setText("TWO HOUR STANDARD PACKAGE (Rs. 350) ");

        del2.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(del2);
        del2.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        del2.setText("TWO HOUR DELUXE PACKAGE (TRAINER INCLUSIVE) (Rs. 500)");
        del2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(208, 208, 208))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(del1)
                            .addComponent(std1)
                            .addComponent(std2)
                            .addComponent(del2)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(std1)
                .addGap(33, 33, 33)
                .addComponent(del1)
                .addGap(34, 34, 34)
                .addComponent(std2)
                .addGap(31, 31, 31)
                .addComponent(del2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Guestservices g=new Guestservices(pass);
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int bill;
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {
      System.out.println("Yes button clicked");
    
      if(std1.isSelected())
          bill=200;
      else if(std2.isSelected())
          bill=350;
      else if(del1.isSelected())
          bill=300;
      else bill=500;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            Statement st=cn.createStatement();
            PreparedStatement stmt=cn.prepareStatement("select * from occrooms where pass = ?");
            stmt.setString(1,pass);
            ResultSet rs=stmt.executeQuery();

            while(rs.next())
                    {
            bill+=rs.getInt("gym");
            stmt=cn.prepareStatement("update occrooms set gym= ? where pass= ?");
            stmt.setInt(1,bill);
            stmt.setString(2,pass);
            stmt.executeUpdate();
                    }
            Guestservices o=new Guestservices(pass);
            o.setVisible(true);
            setVisible(false);
            
            
        }
        catch(Exception e)
        {
            jOptionPane1.showMessageDialog(null,"NOT CONNECTED");
        }
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_del1ActionPerformed

    private void del2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_del2ActionPerformed

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
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gym(pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton del1;
    private javax.swing.JRadioButton del2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton std1;
    private javax.swing.JRadioButton std2;
    // End of variables declaration//GEN-END:variables
}
