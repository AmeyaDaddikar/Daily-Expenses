public class Expense extends Data{
	
	private ExpenseCategory expense_category;
	
	public Expense(){
		super();
		expense_category = 
	}
	
	public Expense(String description){
		super(description);
	}
	
}

enum ExpenseCategory {
	CASH,CARD,STATIONARY,ANONYMOUS
}
