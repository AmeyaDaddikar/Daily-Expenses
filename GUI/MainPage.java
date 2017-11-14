package GUI;

import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame
{

	private JPanel contentPane;
	JButton btnPieChart = new JButton("PIE CHART");
	JButton btnAddExpense = new JButton("ADD EXPENSE");
	JButton btnAddIncome = new JButton("ADD INCOME");
	JButton btnViewAll = new JButton("VIEW ALL");
	JButton btnLineGraph = new JButton("LINE GRAPH");
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	
	public MainPage() 
	{
		setTitle("MAIN PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(165, 35, 1000, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDailyExpenses = new JLabel("DAILY EXPENSES");
		lblDailyExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblDailyExpenses.setFont(new Font("Rockwell", Font.PLAIN, 28));
		lblDailyExpenses.setBounds(44, 40, 300, 40);
		contentPane.add(lblDailyExpenses);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(50, 91, 274, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(368, 40, 15, 500);
		contentPane.add(separator_1);
		
		JLabel lblPreviousTransactions = new JLabel("PREVIOUS TRANSACTIONS ");
		lblPreviousTransactions.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreviousTransactions.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblPreviousTransactions.setBounds(502, 41, 359, 40);
		contentPane.add(lblPreviousTransactions);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(471, 91, 402, 10);
		contentPane.add(separator_2);
		
		btnPieChart.setForeground(Color.BLACK);
		btnPieChart.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnPieChart.setBackground(new Color(250, 235, 215));
		btnPieChart.setBounds(826, 510, 118, 28);
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
		
		btnLineGraph.setForeground(Color.BLACK);
		btnLineGraph.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnLineGraph.setBackground(new Color(250, 235, 215));
		btnLineGraph.setBounds(621, 510, 137, 28);
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
		btnViewAll.setForeground(Color.BLACK);
		btnViewAll.setFont(new Font("Myanmar Text", Font.BOLD | Font.PLAIN, 16));
		btnViewAll.setBackground(new Color(250, 235, 215));
		btnViewAll.setBounds(428, 510, 105, 28);
		contentPane.add(btnViewAll);
		
		btnAddIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddIncome ai = new AddIncome();
				ai.newScreen();
			}
		});
		btnAddIncome.setForeground(new Color(0, 0, 0));
		btnAddIncome.setFont(new Font("Myanmar Text", Font.PLAIN, 12));
		btnAddIncome.setBackground(new Color(211, 211, 211));
		btnAddIncome.setBounds(50, 459, 125, 28);
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
		btnAddExpense.setForeground(Color.BLACK);
		btnAddExpense.setFont(new Font("Myanmar Text", Font.PLAIN, 12));
		btnAddExpense.setBackground(new Color(128, 128, 128));
		btnAddExpense.setBounds(202, 459, 118, 28);
		contentPane.add(btnAddExpense);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(471, 127, 402, 137);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setToolTipText("");
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Description", "Date", "Category", "Amount"
			}
		));
		table_1.getColumnModel().getColumn(0).setResizable(false);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(471, 311, 402, 137);
		contentPane.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Description", "Date", "Category", "Amount"
			}
		));
		scrollPane_1.setViewportView(table_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(50, 324, 274, 90);
		contentPane.add(scrollPane_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Field", "Amount"
			}
		));
		scrollPane_2.setViewportView(table_3);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(70, 157, 79, 14);
		contentPane.add(lblUsername);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(70, 182, 46, 14);
		contentPane.add(lblName);
		
	}
}
