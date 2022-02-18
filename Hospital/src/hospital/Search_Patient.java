package hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search_Patient extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	public static String typename = "";

	public Search_Patient() {

		initComponents();
		con = Connect.ConnectDB();
		Get_Data();
		setLocationRelativeTo(null);
	}

	private void Get_Data() {

		String sql = "";

		sql = "Select PatientID as 'Patient ID',PatientName as 'Patient Name',Gen as 'Gender',BG as 'Blood Group',Medicine as 'Medicine'from patientmedicine order by PatientID";

		try {
//			System.out.println(typename + " event " + sql);
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			jTable1.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		  jTable1.setAutoCreateRowSorter(true);

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jScrollPane1MouseClicked(evt);
			}
		});

		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		JPanel panel = new JPanel();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
						.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE).addContainerGap()));
		panel.setLayout(null);

		JLabel lblSearchBy = new JLabel("Search By");
		lblSearchBy.setBounds(10, 11, 74, 14);
		panel.add(lblSearchBy);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Name", "Phone", "Admitted Room ", "Room Number" }));
		comboBox.setBounds(77, 8, 127, 29);
		panel.add(comboBox);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(214, 11, 46, 14);
		panel.add(lblTitle);

		textField = new JTextField();
		textField.setBounds(270, 8, 98, 29);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "";

				if (comboBox.getSelectedItem().equals("Name")) {
					sql = "SELECT * from patientregistration where PatientName=" + "'" + textField.getText() + "';";
				} else if (comboBox.getSelectedItem().equals("Phone")) {
					sql = "SELECT * from patientregistration where ContactNo=" + "'" + textField.getText() + "';";

				} else if (comboBox.getSelectedItem().equals("Room Number")) {
					sql = "SELECT * FROM `patientregistration` WHERE `PatientID`IN (Select PatientID from AdmitPatient_Room where`RoomNo`IN(select room.RoomNo from room where Room.RoomNo='"
							+ textField.getText() + "'))";

				} else {
					

					sql = "SELECT * FROM `patientregistration` WHERE `PatientID`IN (Select PatientID from AdmitPatient_Room where`RoomNo`IN(select room.RoomNo from room where Room.RoomType='"
							+ textField.getText() + "'))";

				}
				 try{
//			    	   System.out.println(typename+" event "+sql);
			          pst=con.prepareStatement(sql);
			          rs= pst.executeQuery();
			          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
			         }catch(Exception ee){
			            JOptionPane.showMessageDialog(null, ee);
			          }

			}
		});
		btnSearch.setBounds(393, 7, 89, 23);
		panel.add(btnSearch);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jScrollPane1MouseClicked

	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {

	}// GEN-LAST:event_jScrollPane1MouseClicked

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
		// TODO add your handling code here:
		try {
			con = Connect.ConnectDB();
			int row = jTable1.getSelectedRow();
			String table_click = jTable1.getModel().getValueAt(row, 0).toString();
			String sql = "Select * from Room,Doctor,PatientRegistration,AdmitPatient_Room where Room.RoomNo=AdmitPatient_Room.RoomNo and Doctor.DoctorID=AdmitPatient_Room.DoctorID and PatientRegistration.PatientID=AdmitPatient_Room.PatientID and PatientRegistration.PatientID="
					+ table_click + "";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				this.hide();
				Patient_Discharge_room frm = new Patient_Discharge_room();
				frm.setVisible(true);
				String add1 = rs.getString("DoctorID");
				frm.txtDoctorID.setText(add1);
				String add2 = rs.getString("Doctorname");
				frm.txtDoctorName.setText(add2);
				String add3 = rs.getString("PatientID");
				frm.PatientID.setText(add3);
				String add5 = rs.getString("PatientName");
				frm.txtPatientName.setText(add5);
				String add6 = rs.getString("Gen");
				frm.txtGender.setText(add6);
				String add7 = rs.getString("BG");
				frm.txtBloodGroup.setText(add7);
				String add9 = rs.getString("Disease");
				frm.txtDisease.setText(add9);
				String add11 = rs.getString("AdmitDate");
				frm.txtAdmitDate.setText(add11);
				String add14 = rs.getString("RoomNo");
				frm.txtRoomNo.setText(add14);

			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}// GEN-LAST:event_jTable1MouseClicked

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
			java.util.logging.Logger.getLogger(Search_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Search_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Search_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Search_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Search_Patient().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTable jTable1;
	private JTextField textField;
}
