package Daily1;

public class Expense extends Data{
	
	private ExpenseCategory expense_category;
	
	public Expense(){
		super();
		expense_category = ExpenseCategory.ANONYMOUS;
	}
	
	public Expense(String description,ExpenseCategory category){
		super(description);
		expense_category = category;
	}
	
}

enum ExpenseCategory {
	CASH,CARD,STATIONARY,ANONYMOUS;
	
}
