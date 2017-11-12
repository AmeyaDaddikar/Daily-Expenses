import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddIncome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddIncome frame = new AddIncome();
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
	public AddIncome() {
		setTitle("ADD EXPENSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnAddExpense = new JButton("Add Income");
		btnAddExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
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
