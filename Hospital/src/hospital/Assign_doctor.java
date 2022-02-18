package hospital;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

    

public class Assign_doctor extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	/**
	 * Creates new form PatientAdmit_Room
	 */
	public Assign_doctor() {
		initComponents();
		setLocationRelativeTo(null);
//        fillcombo();
		Get_Data1();
		GetRecord();
	}

//private void fillcombo(){
//    
//    try{
//        con=Connect.ConnectDB();
//        String sql= "select distinct RoomNo from Room order by RoomNo";
//        pst=con.prepareStatement(sql);
//        rs=pst.executeQuery();
//        while(rs.next()){
//          String add=rs.getString("RoomNo");
//          cmbRoomNo.addItem(add);
//          }
//       }catch(HeadlessException | SQLException ex){
//           JOptionPane.showMessageDialog(this,ex); 
//       }
//}
	private void GetRecord() {
		String sql = "select DoctorID as 'Doctor ID', DoctorName as 'Doctor Name' from Doctor order by DoctorName";
		try {
			con = Connect.ConnectDB();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			jTable2.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private void Get_Data1() {
		String sql = "select PatientID as 'Patient ID', PatientName as 'Patient Name',Gen as 'Gender',BG as 'Blood Group' from Patientregistration order by PatientName";
		try {
			con = Connect.ConnectDB();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private void Reset() {
		txtDoctorID.setText("");
		txtDoctorName.setText("");
		PatientID.setText("");
		txtPatientName.setText("");
		txtBloodGroup.setText("");
		txtGender.setText("");
		txtDisease.setText("");
		txtAdmitDate.setText("");

		txtRemarks.setText("");
//    cmbRoomNo.setSelectedIndex(-1);
		btnSave.setEnabled(true);
		btnUpdate.setEnabled(false);
		btnDelete.setEnabled(false);
	
	}

	    
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		PatientID = new javax.swing.JTextField();
		txtPatientName = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		txtGender = new javax.swing.JTextField();
		txtBloodGroup = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		txtDoctorID = new javax.swing.JTextField();
		txtDoctorName = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtAdmitDate = new javax.swing.JTextField();
		txtDisease = new javax.swing.JTextField();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		btnNew = new javax.swing.JButton();
		btnSave = new javax.swing.JButton();
		btnUpdate = new javax.swing.JButton();
		btnGetData = new javax.swing.JButton();
		btnDelete= new javax.swing.JButton();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Admit Info"));

		jLabel1.setText("Patient ID");

		jLabel2.setText("Patient Name");

		jLabel9.setText("Blood Group");

		jLabel10.setText("Remarks");

		PatientID.setEditable(false);

		txtPatientName.setEditable(false);

		jLabel11.setText("Gender");

		jLabel22.setText("(YYYY-MM-DD)");

		txtGender.setEditable(false);

		txtBloodGroup.setEditable(false);

		jLabel12.setText("Disease");

		jLabel13.setText("Admit Date");

		jLabel16.setText("Doctor ID");

		jLabel17.setText("Doctor Name");

		txtDoctorID.setEditable(false);

		txtDoctorName.setEditable(false);

		txtAdmitDate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtAdmitDateActionPerformed(evt);
			}
		});
		txtRemarks = new javax.swing.JTextArea();

		txtRemarks.setColumns(20);
		txtRemarks.setRows(5);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(33)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel10).addContainerGap())
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel1)
										.addComponent(jLabel2).addComponent(jLabel9).addComponent(jLabel11)
										.addComponent(jLabel13).addComponent(jLabel12).addComponent(jLabel16)
										.addComponent(jLabel17))
								.addGap(62)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDoctorName, 194, 194, 194)
										.addComponent(txtDoctorID, GroupLayout.PREFERRED_SIZE, 75,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(txtRemarks, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(txtAdmitDate, GroupLayout.PREFERRED_SIZE, 120,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(jLabel22))
												.addComponent(PatientID, GroupLayout.PREFERRED_SIZE, 89,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtPatientName, GroupLayout.PREFERRED_SIZE, 193,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtBloodGroup).addComponent(txtGender))
										.addComponent(txtDisease, GroupLayout.PREFERRED_SIZE, 120,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(20, Short.MAX_VALUE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(
						PatientID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(19)
				.addGroup(jPanel1Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(txtPatientName,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel11).addComponent(
						txtGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout
						.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(txtBloodGroup,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel12).addComponent(
						txtDisease, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(20)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel13)
								.addComponent(jLabel22))
						.addComponent(txtAdmitDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel16)
						.addComponent(txtDoctorID, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout
						.createParallelGroup(Alignment.LEADING).addComponent(jLabel17).addComponent(txtDoctorName,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel10)
								.addComponent(txtRemarks, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(156, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jTable2.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable2MouseClicked(evt);
			}
		});
		jScrollPane3.setViewportView(jTable2);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		btnNew.setText("New");
		btnNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewActionPerformed(evt);
			}
		});

		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnUpdate.setText("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		btnGetData.setText("Get Data");
		btnGetData.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnGetDataActionPerformed(evt);
			}
		});
		
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnGetData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnNew, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnDelete, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNew)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnUpdate)
					.addGap(11)
					.addComponent(btnDelete)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(btnGetData))
		);
		jPanel2.setLayout(jPanel2Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(45).addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(148, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(21).addComponent(jPanel2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable2MouseClicked
		try {
			con = Connect.ConnectDB();
			int row = jTable2.getSelectedRow();
			String table_click = jTable2.getModel().getValueAt(row, 0).toString();
			String sql = "select * from Doctor where DoctorID = '" + table_click + "'";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if (rs.next()) {
				String add1 = rs.getString("DoctorID");
				txtDoctorID.setText(add1);
				String add2 = rs.getString("Doctorname");
				txtDoctorName.setText(add2);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}// GEN-LAST:event_jTable2MouseClicked

	private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNewActionPerformed
		Reset();
	}// GEN-LAST:event_btnNewActionPerformed

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
		try {
			con = Connect.ConnectDB();
			if (PatientID.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please retrieve Patient ID", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtPatientName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please retrieve Patient Name", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtGender.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please retrieve Gender", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (txtBloodGroup.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please retrieve blood group", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtDisease.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter disease", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtAdmitDate.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter admit date", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (txtDoctorID.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please retrieve doctor id", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtDoctorName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter retrieve doctor name", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtRemarks.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter Remarks", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}

			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select * from AdmitPatient_Room where PatientID= '" + PatientID.getText() + "'";
	
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Record already exists", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
            else {
            	 String sql= "insert into admitpatient_room(PatientID,Disease,AdmitDate,DoctorID,AP_Remarks)values('"+ PatientID.getText() + "','"+ txtDisease.getText() + "','"+ txtAdmitDate.getText() + "','" + txtDoctorID.getText() + "','"+ txtRemarks.getText() + "')";

                 pst=con.prepareStatement(sql);
                 pst.execute();
                
                 JOptionPane.showMessageDialog(this,"Successfully admitted","Patient",JOptionPane.INFORMATION_MESSAGE);
                Reset();
                 btnSave.setEnabled(false);
            	
            }

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}// GEN-LAST:event_btnSaveActionPerformed

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed

		try {
			con = Connect.ConnectDB();

			String sql = " update AdmitPatient_Room set  PatientID='" + PatientID.getText() + "',Disease='"
					+ txtDisease.getText() + "',AdmitDate='" + txtAdmitDate.getText() + "',DoctorID='"
					+ txtDoctorID.getText() + "',AP_Remarks='" + txtRemarks.getText() + "' where PatientID= "
					+ PatientID.getText() + "";
			pst = con.prepareStatement(sql);
			pst.execute();

			JOptionPane.showMessageDialog(this, "Successfully updated", "Patient Record",
					JOptionPane.INFORMATION_MESSAGE);
			btnUpdate.setEnabled(false);

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}
	}// GEN-LAST:event_btnUpdateActionPerformed
	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from AdmitPatient_Room where PatientID = " + PatientID.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
	private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGetDataActionPerformed
		this.hide();
		Patient_Admit_Rec frm = new Patient_Admit_Rec();
		frm.setVisible(true);
	}// GEN-LAST:event_btnGetDataActionPerformed

	private void txtAdmitDateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtAdmitDateActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtAdmitDateActionPerformed

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
			java.util.logging.Logger.getLogger(Assign_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Assign_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Assign_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Assign_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Assign_doctor().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JTextField PatientID;
	private javax.swing.JButton btnGetData;
	private javax.swing.JButton btnNew;
	public javax.swing.JButton btnSave;
	public javax.swing.JButton btnDelete;
	public javax.swing.JButton btnUpdate;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	public javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTable jTable2;
	public javax.swing.JTextField txtAdmitDate;
	public javax.swing.JTextField txtBloodGroup;
	public javax.swing.JTextField txtDisease;
	public javax.swing.JTextField txtDoctorID;
	public javax.swing.JTextField txtDoctorName;
	public javax.swing.JTextField txtGender;
	public javax.swing.JTextField txtPatientName;
	public javax.swing.JTextArea txtRemarks;
}
