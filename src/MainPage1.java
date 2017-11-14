//package dailyExpenses;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.ui.RefineryUtilities;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage1 extends JFrame
{

	private JPanel contentPane;
	JButton btnPieChart = new JButton("PIE CHART");
	JButton btnAddExpense = new JButton("ADD EXPENSE");
	JButton btnAddIncome = new JButton("ADD INCOME");
	JButton btnViewAll = new JButton("VIEW ALL");
	JButton btnLineGraph = new JButton("LINE GRAPH");
	
	public MainPage1() 
	{
		setTitle("MAIN PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(165, 35, 1000, 667);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDailyExpenses = new JLabel("DAILY EXPENSES");
		lblDailyExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblDailyExpenses.setFont(new Font("Rockwell", Font.PLAIN, 28));
		lblDailyExpenses.setBounds(50, 40, 300, 40);
		contentPane.add(lblDailyExpenses);
		
		JLabel lblExpenses = new JLabel("EXPENSES :");
		lblExpenses.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpenses.setBounds(61, 149, 118, 28);
		contentPane.add(lblExpenses);
		
		JLabel lblIncome = new JLabel("INCOME :");
		lblIncome.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncome.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblIncome.setBounds(61, 221, 118, 28);
		contentPane.add(lblIncome);
		
		JLabel lblTransfer = new JLabel("TRANSFER : ");
		lblTransfer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransfer.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblTransfer.setBounds(61, 291, 118, 28);
		contentPane.add(lblTransfer);
		
		JLabel lblBalance = new JLabel("BALANCE :");
		lblBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblBalance.setBounds(61, 362, 118, 28);
		contentPane.add(lblBalance);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(74, 91, 250, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(368, 40, 15, 500);
		contentPane.add(separator_1);
		
		JLabel lblExpense = new JLabel("EXPENSE");
		lblExpense.setForeground(Color.RED);
		lblExpense.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpense.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblExpense.setBounds(222, 149, 118, 28);
		contentPane.add(lblExpense);
		
		JLabel lblIncome_1 = new JLabel("INCOME");
		lblIncome_1.setForeground(new Color(50, 205, 50));
		lblIncome_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncome_1.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblIncome_1.setBounds(222, 221, 118, 28);
		contentPane.add(lblIncome_1);
		
		JLabel lblTransfer_1 = new JLabel("TRANSFER");
		lblTransfer_1.setForeground(new Color(255, 153, 0));
		lblTransfer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransfer_1.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblTransfer_1.setBounds(222, 291, 118, 28);
		contentPane.add(lblTransfer_1);
		
		JLabel lblBalance_1 = new JLabel("BALANCE");
		lblBalance_1.setForeground(new Color(0, 0, 255));
		lblBalance_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalance_1.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		lblBalance_1.setBounds(222, 362, 118, 28);
		contentPane.add(lblBalance_1);
		
		JLabel lblPreviousTransactions = new JLabel("PREVIOUS ");
		lblPreviousTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreviousTransactions.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblPreviousTransactions.setBounds(418, 41, 233, 40);
		contentPane.add(lblPreviousTransactions);
		
		JLabel lblTransactions = new JLabel("TRANSACTIONS :");
		lblTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransactions.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblTransactions.setBounds(418, 73, 233, 40);
		contentPane.add(lblTransactions);
		
		JLabel label = new JLabel("1. ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label.setBounds(418, 149, 233, 28);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_1.setBounds(418, 190, 233, 28);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_2.setBounds(418, 230, 233, 28);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_3.setBounds(418, 278, 233, 28);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_4.setBounds(418, 324, 233, 28);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("6.");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_5.setBounds(418, 363, 233, 28);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7.");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		label_6.setBounds(418, 410, 233, 28);
		contentPane.add(label_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(418, 114, 235, 10);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(687, 40, 15, 500);
		contentPane.add(separator_3);
		
		JLabel lblDisplayGraphs = new JLabel("DISPLAY GRAPHS");
		lblDisplayGraphs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplayGraphs.setFont(new Font("Rockwell", Font.PLAIN, 28));
		lblDisplayGraphs.setBounds(680, 40, 300, 40);
		contentPane.add(lblDisplayGraphs);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(712, 91, 250, 10);
		contentPane.add(separator_4);
		
		btnPieChart.setForeground(Color.WHITE);
		btnPieChart.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnPieChart.setBackground(Color.BLUE);
		btnPieChart.setBounds(772, 279, 137, 40);
		contentPane.add(btnPieChart);
		btnPieChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			      PieChart demo = new PieChart( "Expenses" );  
			      demo.setSize( 560 , 367 );    
				  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			      RefineryUtilities.centerFrameOnScreen( demo );    
			      demo.setVisible( true ); 
			}
		});
		
		btnLineGraph.setForeground(Color.WHITE);
		btnLineGraph.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnLineGraph.setBackground(Color.BLUE);
		btnLineGraph.setBounds(772, 182, 137, 40);
		contentPane.add(btnLineGraph);
		btnLineGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JavaJFreeChartLineChartExample barChart = new JavaJFreeChartLineChartExample("LineGraph");
				barChart.pack();
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				RefineryUtilities.centerFrameOnScreen(barChart);
				barChart.setVisible(true);
				barChart.setBounds(250, 350, 500, 500);
			}
		});
		btnViewAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewAll();
			}
		});
		btnViewAll.setForeground(Color.WHITE);
		btnViewAll.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnViewAll.setBackground(Color.BLUE);
		btnViewAll.setBounds(442, 468, 173, 40);
		contentPane.add(btnViewAll);
		
		btnAddIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddIncome ai = new AddIncome();
				ai.newScreen();
			}
		});
		btnAddIncome.setForeground(Color.WHITE);
		btnAddIncome.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnAddIncome.setBackground(Color.BLUE);
		btnAddIncome.setBounds(110, 421, 159, 40);
		contentPane.add(btnAddIncome);
		
		JList list = new JList();
		list.setBounds(202, 447, 1, 1);
		contentPane.add(list);
		
		btnAddExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddExpenses ad = new AddExpenses();
				ad.newScreen();
			}
		});
		btnAddExpense.setForeground(Color.WHITE);
		btnAddExpense.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnAddExpense.setBackground(Color.BLUE);
		btnAddExpense.setBounds(110, 484, 159, 40);
		contentPane.add(btnAddExpense);
	}
	
	
}
