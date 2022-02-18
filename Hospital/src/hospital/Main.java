package hospital;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

 
public class Main extends javax.swing.JFrame {
	public static String userType = "";
	public static String user = "";

	/**
	 * Creates new form Main
	 */
	public Main(String Title) {
		userType = Title;
		setTitle(Title + " Dashboard");
		initComponents();
	}

	   
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jMenuItem11 = new javax.swing.JMenuItem();
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setForeground(Color.WHITE);
		jLabel2 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenu8 = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenu9 = new javax.swing.JMenu();
		jMenuItem12 = new javax.swing.JMenuItem();

		jMenuItem11.setText("jMenuItem11");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(Color.LIGHT_GRAY);

		jLabel2.setFont(new Font("Arial", Font.BOLD, 36)); // NOI18N
		jLabel2.setForeground(Color.BLACK);
		jLabel2.setText("Hospital Management System");
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\java Office\\Hospital\\Image\\hospital.jpg"));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(145)
							.addComponent(jLabel2))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 786, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addComponent(jLabel2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		jPanel1.setLayout(jPanel1Layout);
		if (userType.equals("Admin")) {

			jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N,
					java.awt.event.InputEvent.CTRL_MASK));
			jMenuItem1.setText("New " + userType);
			jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItem1ActionPerformed(evt);
				}
			});
			jMenu1.add(jMenuItem1);

			jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S,
					java.awt.event.InputEvent.CTRL_MASK));
			jMenuItem7.setText("Assign Doctor");
			jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItem7ActionPerformed(evt);
				}
			});
			jMenu2.add(jMenuItem7);

		}

		jMenuItem2.setAccelerator(
				javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Change Password");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Patients");
		jMenu2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		jMenu2.setPreferredSize(new Dimension(90, 25));
		if (userType.equals("Admin")) {
			jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R,
					java.awt.event.InputEvent.CTRL_MASK));
			jMenuItem6.setText("Register/update");
			jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItem6ActionPerformed(evt);
				}
			});
			jMenu2.add(jMenuItem6);
			jMenu2.add(jMenuItem7);

		} else {
			jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R,
					java.awt.event.InputEvent.CTRL_MASK));
			jMenuItem6.setText("View Patients");
			jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItem6ActionPerformed(evt);
				}
			});
			jMenu2.add(jMenuItem6);

			mntmNewMenuItem_1 = new JMenuItem("Medicine Report");
			mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
			jMenu2.add(mntmNewMenuItem_1);
			mntmNewMenuItem_1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItemDActionPerformed(evt);
				}
			});
			
			mntmMedicineReportView = new JMenuItem("Medicine Report View");
			mntmMedicineReportView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
			jMenu2.add(mntmMedicineReportView);
			mntmMedicineReportView.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItemVfActionPerformed(evt,"Medicine");
				}
			});

			mntmNewMenuItem_2 = new JMenuItem("Lab Report");
			mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
			jMenu2.add(mntmNewMenuItem_2);
			mntmNewMenuItem_2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItemfActionPerformed(evt);
				}
			});
			mntmLabReportView = new JMenuItem("lab Report View");
			mntmLabReportView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
			jMenu2.add(mntmLabReportView);
			mntmLabReportView.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuItemVfActionPerformed(evt,"Lab");
				}
			});

		}
		jMenuBar1.add(jMenu2);
		
		mntmSearch = new JMenuItem("Search");
		mntmSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSearchPerformed(evt);
			}
		});
		jMenu2.add(mntmSearch);
		
		

		if (userType.equals("Admin")) {

			jMenu3.setText("Add Staff");
			jMenu3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
			jMenu3.setPreferredSize(new Dimension(90, 25));

			jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
			jMenuItem4.setText(" Add Doctor");
			jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					user = "Doctor";
					jMenuItem4ActionPerformed(evt);
				}
			});
			jMenu3.add(jMenuItem4);

			jMenuBar1.add(jMenu3);

			mntmNewMenuItem = new JMenuItem("Add Nurse");
			mntmNewMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					user = "Nurse";
					jMenuItem44ActionPerformed(evt);
				}
			});
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
			jMenu3.add(mntmNewMenuItem);
		}
		
		jMenu5.setText("Admitted Report");
		jMenu5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
 if(userType.equals("Admin")) {
	jMenu7.setText("Add rooms");

	jMenuItem8.setText("Room");
	jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenuItem8ActionPerformed(evt);
		}
	});
	jMenu7.add(jMenuItem8);

	jMenu5.add(jMenu7);

	jMenu8.setText("Admit");

	jMenuItem9.setText("Room");
	jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenuItem9ActionPerformed(evt);
		}
	});
	jMenu8.add(jMenuItem9);

	jMenu5.add(jMenu8);

	jMenu9.setText("Discharge");

	jMenuItem12.setText("Room");
	jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenuItem12ActionPerformed(evt);
		}
	});
	jMenu9.add(jMenuItem12);

	jMenu5.add(jMenu9);
		}


jMenuBar1.add(jMenu5);
mntmNewMenuItem_3 = new JMenuItem("Report");
mntmNewMenuItem_3.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		
		jMenuItemPPActionPerformed(evt);
	}
});
jMenu5.add(mntmNewMenuItem_3);

setJMenuBar(jMenuBar1);
JLabel lblNewLabel = new JLabel("   Log out");
lblNewLabel.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		MainPage mp = new MainPage();
		mp.setVisible(true);
		dispose();
	}
});
lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
jMenuBar1.add(lblNewLabel);
		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		ChangePassword ob1 = new ChangePassword();
		ob1.setVisible(true); // TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		NewUser ob1 = new NewUser();
		ob1.setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
	

		Entry ob1 = new Entry(user);
		ob1.setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem4ActionPerformed

	private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
		

		Entry ob1 = new Entry(user);
		ob1.setVisible(true);
		// TODO add your handling code here:
	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed

		Registration ob1 = new Registration(user);
		ob1.setVisible(true);

// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem6ActionPerformed

	private void jMenuItemDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed

		MedicineReg ob1 = new MedicineReg(user);
		ob1.setVisible(true);
	}
	private void jMenuItemfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
		
		Lab_report ob1 = new Lab_report(user);
		ob1.setVisible(true);
	}
private void jMenuItemVfActionPerformed(java.awt.event.ActionEvent evt,String type) {// GEN-FIRST:event_jMenuItem6ActionPerformed
		
		ShowTable ob1 = new ShowTable(type);
		ob1.setVisible(true);
	}
private void jMenuItemSearchPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem6ActionPerformed
	
	Search_Patient ob1 = new Search_Patient();
	ob1.setVisible(true);
}


	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem7ActionPerformed
		Assign_doctor ob1 = new Assign_doctor();
		ob1.setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem7ActionPerformed

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem8ActionPerformed
		Room obj1 = new Room();
		obj1.setVisible(true);
// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem8ActionPerformed

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem9ActionPerformed
		Patient_Admit_Room obj1 = new Patient_Admit_Room();
		obj1.setVisible(true);
// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem9ActionPerformed

	private void jMenuItemPPActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem10ActionPerformed
		ShowAdmitted obj1 = new ShowAdmitted();
		obj1.setVisible(true);
// TODO add your handling code here:
	}
	
	private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem12ActionPerformed
		Patient_Discharge_room obj1 = new Patient_Discharge_room();
		obj1.setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem12ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main("title").setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JPanel jPanel1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmMedicineReportView;
	private JMenuItem mntmLabReportView;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmSearch;
	private JLabel lblNewLabel_1;
}
