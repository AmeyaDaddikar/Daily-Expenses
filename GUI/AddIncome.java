package GUI;

import BaseClass.Income;
import JDBCClass.JavaDBOne;
import main.MainClass;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddIncome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddIncome() {
		setTitle("ADD INCOME");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 35, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String types[] = {"Card","Cash","Gift","Profit","Salary","Savings","Other"};
		contentPane.setLayout(null);
		JComboBox comboBox = new JComboBox(types);
		comboBox.setBounds(36, 71, 139, 31);
		contentPane.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(191, 126, 206, 52);
		contentPane.add(textArea);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(204, 97, 110, 18);
		lblDescription.setFont(new Font("Rockwell", Font.ITALIC, 14));
		contentPane.add(lblDescription);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setBounds(204, 45, 91, 18);
		lblAmount.setFont(new Font("Rockwell", Font.ITALIC, 14));
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(289, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAddIncome = new JButton("Add Income");
		btnAddIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if(e.getSource() == btnAddIncome) {
					float amount = 0.0f;
					try {
						amount = Float.parseFloat(textField.getText().toString());
					} catch (NumberFormatException ne) {
						// Inform about correct type of format
						System.out.println("Enter amount in decimal format only (with only digits and decimal point)");
						return ;
					}
					System.out.println(amount);
					System.out.println(textArea.getText().toString());
                    String description = (textArea.getText().toString());
					Income in = new Income(description, amount, 0);
                    MainClass.currentUser.addIncome(in) ;
                    JavaDBOne.addIncome(in) ;
                    MainClass.currentUser.displayIncome() ;
					dispose();
				}
			}
		});
		btnAddIncome.setBounds(156, 208, 139, 31);
		btnAddIncome.setForeground(Color.WHITE);
		btnAddIncome.setFont(new Font("Rockwell", Font.ITALIC, 14));
		btnAddIncome.setBackground(Color.BLUE);
		contentPane.add(btnAddIncome);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setFont(new Font("Rockwell", Font.ITALIC, 14));
		lblCategory.setBounds(38, 42, 91, 18);
		contentPane.add(lblCategory);
	}
}
