import java.util.ArrayList;
import Expense;
import Income;

public class User{

	private String name;
	private String password;
	
	private ArrayList<Expense> expense_list;
	private ArrayList<Income> income_list;
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
		this.expense_list = new ArrayList();
		this.income_list  = new ArrayList();
	}
	
	public String getName(){
		return this.name;
	}
	
	private String getPassword(){
		return this.password;
	}

	public ArrayList<Expense> getExpenses(){
		return this.expense_list;
	}
	
	public ArrayList<Income> getIncomes(){
		return this.income_list;
	}
	
}
