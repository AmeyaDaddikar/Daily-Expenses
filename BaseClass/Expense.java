package BaseClass;

public class Expense extends Data{
	
	private ExpenseCategory expense_category;
	
	public Expense(){
		super();
		expense_category = ExpenseCategory.ANONYMOUS;
	}
	
	public Expense(String description,float amount,int category){
		super(description,amount);
        expense_category = ExpenseCategory.values()[category] ;
	}

	public String toString() {
		String string = "Description: " + getDescription() + "\nAmount: Rs. " + getAmount() + "\nCategory: " + expense_category ;
		return string ;
	}

	public int getExpenseCategory() {
		return expense_category.getValue() ;
	}
	
	public void setExpenseCategory(int category){
		expense_category = ExpenseCategory.values()[category] ;
	}
}

//ENUM, JUST TO MAKE THE CATEGORIES DISTINCTIVE
enum ExpenseCategory {
	CASH(1),CARD(2),STATIONARY(3),ANONYMOUS(4);
	public int value;  
	
	ExpenseCategory(int value){  
		this.value = value;  
	}
	int getValue() {
		return value ;
	}
	
}
