package GUI;

import BaseClass.Expense;
import JDBCClass.JavaDBOne;
import main.MainClass;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddExpenses extends JFrame {

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
	public AddExpenses() {
		setTitle("ADD EXPENSE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 35, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String types[] = {"Clothing","Education","Food","Fun","Health","Other"};
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
		
		JButton btnAddExpense = new JButton("Add Expense");
		btnAddExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if(e.getSource() == btnAddExpense) {
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
					Expense ex = new Expense(description, amount, 0);
                    MainClass.currentUser.addExpense(ex) ;
					JavaDBOne.addExpense(ex) ;
                    MainClass.currentUser.displayExpense() ;
					dispose();
				}
			}
		});
		btnAddExpense.setBounds(156, 208, 139, 31);
		btnAddExpense.setForeground(Color.WHITE);
		btnAddExpense.setFont(new Font("Rockwell", Font.ITALIC, 14));
		btnAddExpense.setBackground(Color.BLUE);
		contentPane.add(btnAddExpense);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setFont(new Font("Rockwell", Font.ITALIC, 14));
		lblCategory.setBounds(38, 42, 91, 18);
		contentPane.add(lblCategory);
	}
}
