
import java.awt.Color;
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hawk
 */
public class UserHome extends javax.swing.JFrame {
    
    AnimationClass ac=new AnimationClass();
    
    
    User user;
public void slideshow()
    {
        new Thread()
        { int count;
        @Override
        public void run()
        {
        try
        {
        while(true)
        {
        switch(count)
        {
            case 0:
               
               
                
                Thread.sleep(3000);
                ac.jLabelXLeft(0, -987, 20, 7,jLabel3 );
               
                count=1;
               
                break;
                
                
//                case 1:
//                     
//                
//                Thread.sleep(3000);
//                ac.jLabelXRight(-840, 0, 20, 7, jLabel1);
//               
//                count=2;
//                break;
// 
//                case 2:
//               ImageIcon ii=new ImageIcon(getClass().getResource("/test/Death Stranding.jpg"));
//                jLabel1.setIcon(ii);
//                Thread.sleep(3000);
//                ac.jLabelXLeft(0, -840, 20, 7, jLabel1);
//                
//                count=3;
//                break;
//                
//                
//                case 3:
//                Thread.sleep(3000);
//                ac.jLabelXRight(-840, 0, 20, 7, jLabel1);
//               
//                count=4;
//                break;
//                
//                 case 4:
//               
//                Thread.sleep(3000);
//                ac.jLabelXLeft(0, -840, 20, 7, jLabel1);
//                
//                count=5;
//                break;
//                
//                
//                case 5:
//                Thread.sleep(3000);
//               ac.jLabelXRight(-840, 0, 20, 7, jLabel1);
//               
//                count=0;
//                break;
        
        }
        
        
        }
        
        
        }
        catch(Exception e)
        {
        
        
        
        
        }
        
        
        }
        
        }.start();
    
    
    
    
    }
    /**
     *
     */
    public UserHome(User user) {
        this.user = user; //storing the received object from prev class to object of this class so that it can be passed
        initComponents();
        //set transparent text field
//    scroll1.setOpaque(false);
//    scroll1.getViewport().setOpaque(false);
//    scroll1.setBackground(new Color(0,0,0,0));
//    scroll1.setBorder(null);
//    scroll1.setViewportBorder(null);
//    
//    TA1.setOpaque(false);
//    TA1.setBackground(new Color(0,0,0,0));
//    TA1.setBorder(null);
//    TA1.setEditable(false);
        
        
        
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
        Logout = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        accountDetails = new javax.swing.JMenuItem();
        changePassword = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ViewCart = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jPanel1.setMaximumSize(new java.awt.Dimension(847, 489));
        jPanel1.setPreferredSize(new java.awt.Dimension(847, 489));
        jPanel1.setLayout(null);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(760, 460, 90, 30);

        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TA1.setForeground(new java.awt.Color(242, 15, 15));
        TA1.setRows(5);
        TA1.setText("\t                 Welcome to GameREP!\n You're one-stop solution to Video Game Information is just a click away!\n\n");
        scroll1.setViewportView(TA1);

        jPanel1.add(scroll1);
        scroll1.setBounds(40, 180, 750, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1574338674_tmp_Homeimg.jpg"))); // NOI18N
        jLabel3.setText("dasd");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 850, 490);

        jMenu1.setText("Find");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Game");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account Settings");

        accountDetails.setText("Account Details");
        accountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountDetailsActionPerformed(evt);
            }
        });
        jMenu2.add(accountDetails);

        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jMenu2.add(changePassword);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Cart");

        ViewCart.setText("View Cart");
        ViewCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCartActionPerformed(evt);
            }
        });
        jMenu5.add(ViewCart);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("About Us");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("FAQ");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here://Find-->Game
        FindGame f = new FindGame(user);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void accountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountDetailsActionPerformed
        // TODO add your handling code here:
      
        AccountDetails ad = new AccountDetails(user); //passing the user object to the next class
        ad.setVisible(true);
        this.setVisible(false);
     
        
    }//GEN-LAST:event_accountDetailsActionPerformed

    private void ViewCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCartActionPerformed
        // TODO add your handling code here:
        CartFrame cf = new CartFrame(user);
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewCartActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        // TODO add your handling code here:
        changePass pass = new changePass(user);
        pass.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JTextArea TA1;
    private javax.swing.JMenuItem ViewCart;
    private javax.swing.JMenuItem accountDetails;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll1;
    // End of variables declaration//GEN-END:variables
}
