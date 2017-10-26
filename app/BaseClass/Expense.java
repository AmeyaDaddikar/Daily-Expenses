package Daily1;

public class Expense extends Data{
	
	private ExpenseCategory expense_category;
	
	public Expense(){
		super();
		expense_category = ExpenseCategory.ANONYMOUS;
	}
	
	public Expense(String description,float amount,ExpenseCategory category){
		super(description,amount);
		expense_category = category;
	}
	
	public ExpenseCategory setExpenseCategory(){
		return expense_category;
	}
	
	public void setExpenseCategory(ExpenseCategory category){
		expense_category = category;
	}
}

//ENUM, JUST TO MAKE THE CATEGORIES DISTINCTIVE
enum ExpenseCategory {
	CASH(1),CARD(2),STATIONARY(3),ANONYMOUS(4);
	public int value;  
	
	ExpenseCategory(int value){  
		this.value = value;  
	}
	
}
