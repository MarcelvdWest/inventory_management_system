package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SignUp {

	private JFrame frmSignUpWindow;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmSignUpWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUpWindow = new JFrame();
		frmSignUpWindow.setTitle("Sign Up Window");
		frmSignUpWindow.getContentPane().setBackground(UIManager.getColor("CheckBox.highlight"));
		frmSignUpWindow.setBounds(100, 100, 653, 411);
		frmSignUpWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUpWindow.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 88, 65, 24);
		frmSignUpWindow.getContentPane().add(lblNewLabel);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblSurname.setBounds(34, 121, 65, 24);
		frmSignUpWindow.getContentPane().add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblAddress.setBounds(34, 156, 65, 24);
		frmSignUpWindow.getContentPane().add(lblAddress);
		
		JLabel lblSurname_1_1 = new JLabel("Cell Number:");
		lblSurname_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblSurname_1_1.setBounds(34, 191, 93, 24);
		frmSignUpWindow.getContentPane().add(lblSurname_1_1);
		
		JLabel lblSurname_1_1_1 = new JLabel("Email:");
		lblSurname_1_1_1.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblSurname_1_1_1.setBounds(34, 226, 65, 24);
		frmSignUpWindow.getContentPane().add(lblSurname_1_1_1);
		
		JLabel lblSurname_1_1_2 = new JLabel("Password:");
		lblSurname_1_1_2.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblSurname_1_1_2.setBounds(34, 261, 65, 24);
		frmSignUpWindow.getContentPane().add(lblSurname_1_1_2);
		
		JLabel lblSurname_1_1_3 = new JLabel("Confirm Password:");
		lblSurname_1_1_3.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		lblSurname_1_1_3.setBounds(34, 296, 112, 24);
		frmSignUpWindow.getContentPane().add(lblSurname_1_1_3);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		lblSignUp.setBounds(258, 23, 125, 41);
		frmSignUpWindow.getContentPane().add(lblSignUp);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 617, 67);
		frmSignUpWindow.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 617, 350);
		frmSignUpWindow.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));
		btnNewButton.setBounds(494, 302, 113, 37);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(162, 80, 298, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 113, 298, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 144, 298, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(162, 180, 298, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(162, 211, 298, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(162, 251, 298, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 288, 298, 20);
		panel_1.add(textField_6);
	}
}
