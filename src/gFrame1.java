
import java.awt.Color;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hawk
 */
public class gFrame1 extends javax.swing.JFrame {
    User user;
    Game game;
    /**
     * Creates new form gFrame1
     */
    public gFrame1(User user) {
        initComponents();
        this.user=user;
        GameSto gt = new GameSto();
        game = gt.getGame("Cyberpunk 2077");
        n.setText(game.getName());
        p.setText(game.getPlatform());
        r.setText(game.getReleaseDate());
        a.setText(Integer.toString(game.getAgeRating()));
        d.setText(game.getDeveloper());
        g.setText(game.getGenre());
        pr.setText(Integer.toString(game.getPrice()));
        TA1.setText(game.getSynopsis());
        
    n.setBackground(new Color(0,0,0,0));
    p.setBackground(new Color(0,0,0,0));
    r.setBackground(new Color(0,0,0,0));
    a.setBackground(new Color(0,0,0,0));
    d.setBackground(new Color(0,0,0,0));
    g.setBackground(new Color(0,0,0,0));
    pr.setBackground(new Color(0,0,0,0));
    
    
        
        
    scroll1.setOpaque(false);
    scroll1.getViewport().setOpaque(false);
    scroll1.setBackground(new Color(0,0,0,0));
    scroll1.setBorder(null);
    scroll1.setViewportBorder(null);
    
    TA1.setOpaque(false);
    TA1.setBackground(new Color(0,0,0,0));
    TA1.setBorder(null);
    TA1.setEditable(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Next = new javax.swing.JButton();
        AddToCart = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        trailerOnline = new javax.swing.JButton();
        detailsOnline = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        r = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        pr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel2.add(Next);
        Next.setBounds(770, 530, 55, 23);

        AddToCart.setText("Add to Cart");
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });
        jPanel2.add(AddToCart);
        AddToCart.setBounds(420, 320, 100, 23);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);
        backButton.setBounds(10, 20, 80, 23);

        trailerOnline.setText("Watch Trailer");
        trailerOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trailerOnlineActionPerformed(evt);
            }
        });
        jPanel2.add(trailerOnline);
        trailerOnline.setBounds(730, 320, 100, 23);

        detailsOnline.setText("View Details Online");
        detailsOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsOnlineActionPerformed(evt);
            }
        });
        jPanel2.add(detailsOnline);
        detailsOnline.setBounds(560, 320, 150, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1cp77_ps4_2d_en-namco.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(120, 40, 210, 260);

        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        TA1.setForeground(new java.awt.Color(255, 255, 255));
        TA1.setLineWrap(true);
        TA1.setRows(5);
        TA1.setWrapStyleWord(true);
        scroll1.setViewportView(TA1);

        jPanel2.add(scroll1);
        scroll1.setBounds(120, 380, 560, 160);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Synopsis :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 380, 100, 20);

        r.setEditable(false);
        r.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        r.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(r);
        r.setBounds(570, 240, 250, 30);

        a.setEditable(false);
        a.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(a);
        a.setBounds(570, 200, 250, 30);

        d.setEditable(false);
        d.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(d);
        d.setBounds(570, 160, 250, 30);

        p.setEditable(false);
        p.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(p);
        p.setBounds(570, 120, 250, 30);

        g.setEditable(false);
        g.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        g.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(g);
        g.setBounds(570, 80, 250, 30);

        n.setEditable(false);
        n.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(n);
        n.setBounds(570, 40, 250, 30);

        pr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pr.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(pr);
        pr.setBounds(570, 280, 250, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Price:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(370, 280, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Release Date :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(370, 240, 210, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Min. Age Requirement :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(370, 200, 230, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Developer :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(370, 160, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Platform :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(370, 120, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genre :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(370, 80, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(370, 40, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_l4dosh4ghh311.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 560);

        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(350, 170, 34, 14);

        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(160, 190, 40, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        FindGame f = new FindGame(user);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void detailsOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsOnlineActionPerformed
        // TODO add your handling code here:
        try
        {
            String url = "https://www.cyberpunk.net/bd/en/";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"invalid url");
                }
    }//GEN-LAST:event_detailsOnlineActionPerformed

    private void trailerOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trailerOnlineActionPerformed
        // TODO add your handling code here:
        try
        {
            String url = "https://www.youtube.com/watch?v=8X2kIfS6fb8";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"invalid url");
                }
        
    }//GEN-LAST:event_trailerOnlineActionPerformed

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
        // TODO add your handling code here:
        CartSto sto = new CartSto();
        sto.insertCart(user,game);
        JOptionPane.showMessageDialog(this,"Added to cart");
        
    }//GEN-LAST:event_AddToCartActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
                    gFrame2 f2 = new gFrame2(user);
                    f2.setVisible(true);
                    this.setVisible(false);
        
    }//GEN-LAST:event_NextActionPerformed

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
            java.util.logging.Logger.getLogger(gFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton Next;
    private javax.swing.JTextArea TA1;
    private javax.swing.JTextField a;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField d;
    private javax.swing.JButton detailsOnline;
    private javax.swing.JTextField g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField n;
    private javax.swing.JTextField p;
    private javax.swing.JTextField pr;
    private javax.swing.JTextField r;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JButton trailerOnline;
    // End of variables declaration//GEN-END:variables
}
