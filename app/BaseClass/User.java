package Daily1;

import java.util.ArrayList;
import java.util.Scanner;

public class User{
	Scanner ip=new Scanner(System.in);
	static Scanner ssc=new Scanner(System.in);
	private String name;
	private String password;
	private String description;
	private ArrayList<Expense> expense_list;
	private ArrayList<Income> income_list;
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
		this.expense_list = new ArrayList();
		this.income_list  = new ArrayList();
	}
	
	public User() {
		
	}

	public static String getName(){
		return name;
	}
	
	private static String getPassword(){
		password=ssc.next();
		return password;
	}

	public ArrayList<Expense> getExpenses(){
		System.out.println("Enter description...");
		description=ip.next();
		Expense expense=new Expense(description+"");
		expense_list.add(expense);
		return this.expense_list;
	}
	
	public ArrayList<Income> getIncomes(){
		System.out.println("Enter description...");
		description=ip.next();
		Income income=new Income(description+"");
		income_list.add(income);
		return this.income_list;
	}
	public static void main(String[] args)
	{
		User u=new User();
		Scanner sc=new Scanner(System.in);
		int opt=4;
		while(opt!=3)
		{
		System.out.println("1.INCOME \n2.EXPENSE \n3.EXIT");
		while(opt>3)
		{
			System.out.println("Enter a number between 1 and 3");
			opt=sc.nextInt();
		}
		switch(opt)
		{
		case 1:
			u.getIncomes();
			break;
		case 2:
			u.getExpenses();
			break;
		default:
			
		}
		}
	}
}
