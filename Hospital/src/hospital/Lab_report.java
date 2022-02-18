package hospital;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Lab_report extends javax.swing.JFrame {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	public static String userType;

	/**
	 * Creates new form Registration
	 */
	public Lab_report(String user) {
		setAutoRequestFocus(false);
		
		initComponents(user);
		userType = user;
	}

	private void Reset() {
		txtId.setText("");
		txtName.setText("");
		txtFname.setText("");
		txtContact.setText("");
		txtAdd.setText("");
		txtAge.setText("");
		txtEmail.setText("");

		cmbBG.setSelectedIndex(-1);
		cmbGender.setSelectedIndex(-1);
		btnSave.setEnabled(true);
		btnUpdate.setEnabled(false);
		btnDelete.setEnabled(false);
		txtId.requestDefaultFocus();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents(String name) {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		txtId = new javax.swing.JTextField();
		txtName = new javax.swing.JTextField();
		txtFname = new javax.swing.JTextField();
		txtAdd = new javax.swing.JTextField();
		txtContact = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtAge = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		cmbGender = new javax.swing.JComboBox();
		cmbBG = new javax.swing.JComboBox();
		jScrollPane1 = new javax.swing.JScrollPane();
		jPanel2 = new javax.swing.JPanel();
		btnSave = new javax.swing.JButton();
		btnNew = new javax.swing.JButton();
		btnUpdate = new javax.swing.JButton();
		btnDelete = new javax.swing.JButton();
		btnGetData = new javax.swing.JButton();

		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Detail's"));

		jLabel1.setText("Patient ID");

		jLabel2.setText("Name");

		jLabel3.setText("Father's Name");

		jLabel4.setText("Address");

		jLabel5.setText("Contact No.");

		jLabel6.setText("Email-id");

		jLabel7.setText("Age");

		txtEmail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtEmailActionPerformed(evt);
			}
		});

		jLabel8.setText("Gender");

		jLabel9.setText("Blood Group");

		cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

		cmbBG.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

		JLabel lblNewLabel = new JLabel("Blood Pressure");

		JLabel lblBodytemperature = new JLabel("Body Temperature");

		JLabel lblBloodsugarlevel = new JLabel("Blood Sugar Level");

		JLabel lblHeartrate = new JLabel("Heart Rate");

		JLabel lblDiagnosis = new JLabel("Diagnosis");

		textField_bp = new JTextField();

		textField_bt = new JTextField();

		textField_bs = new JTextField();

		textField_hr = new JTextField();

		textField_d = new JTextField();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1))
								.addComponent(jLabel3).addComponent(jLabel5)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2))
								.addComponent(jLabel4).addComponent(jLabel6).addComponent(lblBloodsugarlevel)
								.addComponent(lblHeartrate).addComponent(lblDiagnosis).addComponent(lblBodytemperature))
						.addGap(27)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_d, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_hr, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAge, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtId, Alignment.LEADING).addComponent(txtName, Alignment.LEADING,
												GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtFname, Alignment.LEADING)
												.addComponent(txtAdd, Alignment.LEADING)
												.addComponent(txtContact, Alignment.LEADING)
												.addComponent(txtEmail, Alignment.LEADING)
												.addComponent(textField_bp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														147, Short.MAX_VALUE)
												.addComponent(textField_bt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														147, Short.MAX_VALUE)
												.addComponent(textField_bs, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														147, Short.MAX_VALUE))
										.addGap(106).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9).addComponent(lblNewLabel))
				.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(24)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(
						txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(14)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
				.addGap(12)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel3).addComponent(
						txtFname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel5).addComponent(
						txtContact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel6).addComponent(
						txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel7).addComponent(
						txtAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel8).addComponent(
						cmbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(
						cmbBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(lblNewLabel)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(49).addComponent(
												jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(18)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblBodytemperature)
														.addComponent(textField_bt, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(11)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblBloodsugarlevel).addComponent(textField_bs,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblHeartrate)
														.addComponent(textField_hr, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblDiagnosis).addComponent(textField_d,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))))
						.addComponent(textField_bp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(161, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnNew.setText("New");
		btnNew.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNewActionPerformed(evt);
			}
		});

		btnUpdate.setText("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		btnDelete.setText("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});

		btnGetData.setText("GetData");
		btnGetData.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnGetDataActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(43, 43, 43)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
						.addContainerGap(18, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(btnSave)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnNew)
						.addGap(18, 18, 18).addComponent(btnUpdate).addGap(18, 18, 18).addComponent(btnDelete)
						.addGap(18, 18, 18).addComponent(btnGetData).addContainerGap(34, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jPanel2,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(69)
						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(22, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 647, GroupLayout.PREFERRED_SIZE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtEmailActionPerformed

	private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNewActionPerformed
		Reset(); // TODO add your handling code here:
	}// GEN-LAST:event_btnNewActionPerformed

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
		try {
			con = Connect.ConnectDB();
			if (txtId.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter patient id", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtName.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter patient name", "Error", JOptionPane.ERROR_MESSAGE);
				return;

			}
			if (txtFname.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter Father's name", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtAdd.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter address", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (txtContact.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter contact no.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			if (txtAge.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter age", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (cmbGender.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(this, "Please select gender", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (cmbBG.getSelectedItem().equals("")) {
				JOptionPane.showMessageDialog(this, "Please select blood group", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (textField_bp.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter medicine", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (textField_bt.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter medicine", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (textField_bs.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter medicine", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (textField_hr.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter medicine", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (textField_d.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Please enter medicine", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select PatientID from patientlab where PatientID= '" + txtId.getText() + "'";
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Patient lab report already exists", "Error",
						JOptionPane.ERROR_MESSAGE);
				txtId.setText("");
				txtId.requestDefaultFocus();
				return;
			}
			String sql = "insert into patientlab(PatientID,Patientname,FatherName,Email,ContactNo,Age,Gen,BG,Address,blood_pressure,body_temperature,blood_sugar_level,heart_rate,diagnosis)values('"
					+ txtId.getText() + "','" + txtName.getText() + "','" + txtFname.getText() + "','"
					+ txtEmail.getText() + "','" + txtContact.getText() + "'," + txtAge.getText() + ",'"
					+ cmbGender.getSelectedItem() + "','" + cmbBG.getSelectedItem() + "','" + txtAdd.getText() + "','"
					+ textField_bp.getText() + "','" + textField_bt.getText() + "','" + textField_bs.getText() + "','"
					+ textField_hr.getText() + "','" + textField_d.getText() + "')";
		
			pst = con.prepareStatement(sql);
			pst.execute();
			JOptionPane.showMessageDialog(this, "Successfully Registered", "Patient", JOptionPane.INFORMATION_MESSAGE);
			btnSave.setEnabled(false);

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		}

		// TODO add your handling code here:
	}// GEN-LAST:event_btnSaveActionPerformed

	private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGetDataActionPerformed
		this.hide();
		PatientRec frm = new PatientRec("Lab");
		frm.setVisible(true); // TODO add your handling code here:
	}// GEN-LAST:event_btnGetDataActionPerformed

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
		try {
			con = Connect.ConnectDB();
			Statement stmt;
			stmt = con.createStatement();
			String sql1 = "Select PatientID from PatientLab where PatientID= '" + txtId.getText() + "'";
			
			rs = stmt.executeQuery(sql1);
			if (rs.next()) {
				con = Connect.ConnectDB();
				String sql = "update PatientMedicine set Patientname='" + txtName.getText() + "',Fathername='"
						+ txtFname.getText() + "',Email='" + txtEmail.getText() + "',ContactNo='" + txtContact.getText()
						+ "',Age=" + txtAge.getText() + ",Medicine='" + "',Gen='" + cmbGender.getSelectedItem()
						+ "',BG='" + cmbBG.getSelectedItem() + "',Address='" + txtAdd.getText() + "' where PatientID='"
						+ txtId.getText() + "'";
				pst = con.prepareStatement(sql);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Successfully updated", "Record", JOptionPane.INFORMATION_MESSAGE);
				btnUpdate.setEnabled(false);
				return;
			}
			JOptionPane.showMessageDialog(this, "Patient ID  does not exists please save first", "Error",
					JOptionPane.ERROR_MESSAGE);
			txtId.setText("");
			txtId.requestDefaultFocus();

		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		} // TODO add your handling code here:
	}// GEN-LAST:event_btnUpdateActionPerformed

	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
		try {
			int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation",
					JOptionPane.YES_NO_OPTION);
			if (P == 0) {
				con = Connect.ConnectDB();
				String sql = "delete from patientregistration where PatientID = '" + txtId.getText() + "'";
				pst = con.prepareStatement(sql);
				pst.execute();
				JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

				Reset();
			}
		} catch (HeadlessException | SQLException ex) {
			JOptionPane.showMessageDialog(this, ex);
		} // TODO add your handling code here:
	}// GEN-LAST:event_btnDeleteActionPerformed

	private void formWindowClosed(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosed

		;// TODO add your handling code here:
	}// GEN-LAST:event_formWindowClosed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Lab_report.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Lab_report.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Lab_report.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Lab_report.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Lab_report("").setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	public javax.swing.JButton btnDelete;
	public javax.swing.JButton btnGetData;
	public javax.swing.JButton btnNew;
	public javax.swing.JButton btnSave;
	public javax.swing.JButton btnUpdate;
	public javax.swing.JComboBox cmbBG;
	public javax.swing.JComboBox cmbGender;
	private javax.swing.JLabel jLabel1;
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
	private javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTextField txtAdd;
	public javax.swing.JTextField txtAge;
	public javax.swing.JTextField txtContact;
	public javax.swing.JTextField txtEmail;
	public javax.swing.JTextField txtFname;
	public javax.swing.JTextField txtId;
	public javax.swing.JTextField txtName;
	private JTextField textField_bp;
	private JTextField textField_bt;
	private JTextField textField_bs;
	private JTextField textField_hr;
	private JTextField textField_d;
}
