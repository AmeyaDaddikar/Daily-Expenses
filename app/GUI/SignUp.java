import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setTitle("SIGN UP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(165, 35, 1000, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(50, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignup = new JLabel("SIGN-UP");
		lblSignup.setBounds(289, 58, 424, 37);
		lblSignup.setForeground(Color.WHITE);
		lblSignup.setFont(new Font("Rockwell", Font.ITALIC, 32));
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSignup);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Rockwell", Font.ITALIC, 22));
		lblName.setBounds(374, 162, 87, 22);
		contentPane.add(lblName);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Rockwell", Font.ITALIC, 22));
		lblUsername.setBounds(374, 224, 124, 22);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Rockwell", Font.ITALIC, 22));
		lblPassword.setBounds(374, 282, 124, 24);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(517, 167, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(517, 229, 100, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(517, 288, 100, 20);
		contentPane.add(passwordField);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(Color.GRAY);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Rockwell", Font.ITALIC, 20));
		btnSignUp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnSignUp.setBounds(436, 360, 124, 33);
		contentPane.add(btnSignUp);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(325, 106, 365, 7);
		contentPane.add(separator);
	}
}
