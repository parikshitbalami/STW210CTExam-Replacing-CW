package hospital;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;

 
public class login extends javax.swing.JFrame {
	public static String name="";
	public static String data="";


    /**
     * Creates new form login
     */
    public login(String name) {
        initComponents(name);
        this.name=name;
        data="name";
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String Title) {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        JLabel lblAdminLogin = new JLabel(Title);
        lblAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(txtUsername)
        				.addComponent(jPassword, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        			.addContainerGap(61, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(208, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addGap(24))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(127)
        			.addComponent(lblAdminLogin, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblAdminLogin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(44)
        			.addComponent(jButton1)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement pst=null;
       if (txtUsername.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter user name");
           return;
        }
    
        if (jPassword.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Please enter password");
           return;
          
            }
        con=Connect.ConnectDB();
        if(name.equals("Admin Login")) {
            String sq1= "select * from users where user_name= '" + txtUsername.getText() + "' and password ='" + jPassword.getText() + "'";
            try{
                pst=con.prepareStatement(sq1);
                rs= pst.executeQuery();
                if (rs.next()){
                 this.hide();
                 Main frm=new Main("Admin");
                 frm.setVisible(true);
               }
               else{
                  JOptionPane.showMessageDialog(null, "Login Failed.. for ADMIN \nTry again !");
              }
            }catch(SQLException | HeadlessException e){
             JOptionPane.showMessageDialog(null, e); 
                      // TODO add your handling code here:
        }//GEN-LAST:event_jButton1ActionPerformed Doctor 
        } else if (name.equals("Doctor Login")) {
        	 String sq1= "select * from doctor where DoctorName= '" + txtUsername.getText() + "' and Password ='" + jPassword.getText() + "'";
             try{
                 pst=con.prepareStatement(sq1);
                 rs= pst.executeQuery();
                 if (rs.next()){
                  this.hide();
                  Main frm=new Main("Doctor");
                  frm.setVisible(true);
                }
                else{
                   JOptionPane.showMessageDialog(null, "Login Failed.. for DOCTOR \nTry again !");
               }
             }catch(SQLException | HeadlessException e){
              JOptionPane.showMessageDialog(null, e); 
                       // TODO add your handling code here:
         }
			
		}else if (name.equals("Nurse Login")) {
			 String sq1= "select * from nurse where NurseName= '" + txtUsername.getText() + "' and Password ='" + jPassword.getText() + "'";
	            try{
	                pst=con.prepareStatement(sq1);
	                rs= pst.executeQuery();
	                if (rs.next()){
	                 this.hide();
	                 Main frm=new Main("Nurse");
	                 frm.setVisible(true);
	               }
	               else{
	                  JOptionPane.showMessageDialog(null, "Login Failed.. for NURSE \nTry again !");
	              }
	            }catch(SQLException | HeadlessException e){
	             JOptionPane.showMessageDialog(null, e); 
	                      // TODO add your handling code here:
	        }
			
		}
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login("title").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField txtUsername;
    
    static public int logindata(String type,String username,String password) {
    	 Connection con=null;
         ResultSet rs=null;
         PreparedStatement pst=null;
         int count=0;
       
          con=Connect.ConnectDB();
          if(type.equals("admin")) {
              String sq1= "select * from users where user_name= '" + username + "' and password ='" + password + "'";
              try{
                  pst=con.prepareStatement(sq1);
                  rs= pst.executeQuery();
                  if (rs.next()){
                   
                count++;
                 }
                 else{
                   count=0;
                }
              }catch(SQLException | HeadlessException e){
               JOptionPane.showMessageDialog(null, e); 
                        // TODO add your handling code here:
          }
              
          }
		return count;
}
}