package hospital;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 328);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnSetting = new JMenu("Settings");
		menuBar.add(mnSetting);

		JMenuItem mntmFitnessCertificate = new JMenuItem("Password Reset");
		mntmFitnessCertificate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		mnSetting.add(mntmFitnessCertificate);

		JSeparator separator = new JSeparator();
		mnSetting.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnSetting.add(mntmExit);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHospitalManagmentSystem = new JLabel("Hospital Managment System");
		lblHospitalManagmentSystem.setBounds(70, 0, 425, 79);
		lblHospitalManagmentSystem.setFont(new Font("Arial", Font.BOLD, 28));
		lblHospitalManagmentSystem.setForeground(Color.BLACK);
		contentPane.add(lblHospitalManagmentSystem);

		JButton btnDoctor = new JButton("Admin Login");
		btnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lo= new login("Admin Login");
				lo.setVisible(true);
				//dispose();

			}
		});
		btnDoctor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDoctor.setBounds(20, 194, 140, 23);
		contentPane.add(btnDoctor);

		JButton btnNewButton = new JButton("Doctor Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login lo= new login("Doctor Login");
				lo.setVisible(true);
				//dispose();

			}
		});
		btnNewButton.setBounds(355, 194, 140, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Nurse Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login lo= new login("Nurse Login");
				lo.setVisible(true);
				//dispose();


			}
		});
		btnNewButton_1.setBounds(185, 194, 140, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\java Office\\Hospital\\Image\\admin.png"));
		lblNewLabel.setBounds(20, 90, 140, 105);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\java Office\\Hospital\\Image\\doctor.jpg"));
		lblNewLabel_1.setBounds(185, 90, 140, 105);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\java Office\\Hospital\\Image\\nurse.png"));
		lblNewLabel_2.setBounds(355, 90, 140, 105);
		contentPane.add(lblNewLabel_2);
		
	}
}
