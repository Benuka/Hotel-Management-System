
package login;


import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    private int count=0;
    
    
    
    public LoginGUI() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(300, 190, 150, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 160, 150, 21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 150, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 180, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 150, 90, 30);

        jButton1.setFont(new java.awt.Font("Bodoni MT Black", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Button.png"))); // NOI18N
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
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 250, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/login screen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
          //conn=MySqlConnect.ConnectDB();
             Class.forName("com.mysql.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ivory","root","");
            String sql="select * from Users";
            String username=jTextField1.getText();
            String password=jPasswordField1.getText();
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("UserName").equals(username)&&rs.getString("Password").equals(password)){
                    count=1; 
           // JOptionPane.showMessageDialog(null,"Welcome User");
             MainDashboard MD=new MainDashboard();
        MD.setVisible(true);
        this.setVisible(false);
                }
                
            }
            if(count==0){
           JOptionPane.showMessageDialog(null,"Invalid Username or Password","Access Denied",JOptionPane.ERROR_MESSAGE); 
           
           jTextField1.setText("");
           jPasswordField1.setText("");
            
            }
        }catch(Exception e){
            
              
            
            
            
            /*****************************************/
            /*    if((jTextField1.getText().equals("Benuka")) && (jTextField2.getText().equals("1234")))
            jLabel4.setText("Login Successfull");
            else 
          jLabel4.setText("Login Failed");*/
   /*     } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);*/
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            
          //conn=MySqlConnect.ConnectDB();
             Class.forName("com.mysql.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ivory","root","");
            String sql="select * from Users";
            String username=jTextField1.getText();
            String password=jPasswordField1.getText();
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("UserName").equals(username)&&rs.getString("Password").equals(password)){
                    count=1; 
           // JOptionPane.showMessageDialog(null,"Welcome User");
             MainDashboard MD=new MainDashboard();
        MD.setVisible(true);
        this.setVisible(false);
                }
                
            }
            if(count==0){
           JOptionPane.showMessageDialog(null,"Invalid Username or Password","Access Denied",JOptionPane.ERROR_MESSAGE); 
           
           jTextField1.setText("");
           jPasswordField1.setText("");
            
            }
        }catch(Exception e){
            
              
            
            
            
            /*****************************************/
            /*    if((jTextField1.getText().equals("Benuka")) && (jTextField2.getText().equals("1234")))
            jLabel4.setText("Login Successfull");
            else 
          jLabel4.setText("Login Failed");*/
   /*     } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);*/
        }

            
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
          //conn=MySqlConnect.ConnectDB();
             Class.forName("com.mysql.jdbc.Driver");
              Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ivory","root","");
            String sql="select * from Users";
            String username=jTextField1.getText();
            String password=jPasswordField1.getText();
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("UserName").equals(username)&&rs.getString("Password").equals(password)){
                    count=1; 
           // JOptionPane.showMessageDialog(null,"Welcome User");
             MainDashboard MD=new MainDashboard();
        MD.setVisible(true);
        this.setVisible(false);
                }
                
            }
            if(count==0){
           JOptionPane.showMessageDialog(null,"Invalid Username or Password","Access Denied",JOptionPane.ERROR_MESSAGE); 
           
           jTextField1.setText("");
           jPasswordField1.setText("");
            
            }
        }catch(Exception e){
            
              
            
            
            
            /*****************************************/
            /*    if((jTextField1.getText().equals("Benuka")) && (jTextField2.getText().equals("1234")))
            jLabel4.setText("Login Successfull");
            else 
          jLabel4.setText("Login Failed");*/
   /*     } catch (SQLException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);*/
        }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
         
    });
                 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
