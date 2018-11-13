package Daily1;

public class Expense extends Data{
	
	private ExpenseCategory expense_category;
	
	public Expense(){
		super();
		expense_category = ExpenseCategory.ANONYMOUS;
	}
	
	public Expense(String description){
		super(description);
		int j=1;
		int s=5;
		for(ExpenseCategory i:ExpenseCategory.values())
		{
			System.out.println(j+" "+i);
			j=j+1;
		}
	while(s>4)
	{
		System.out.println("Enter a number between 1 and 4");
		s=sc.nextInt();
	}
	switch(s)
	{
	case 1:
		expense_category = ExpenseCategory.CASH;
		break;
	case 2:
		expense_category = ExpenseCategory.CARD;
		break;
	case 3:
		expense_category = ExpenseCategory.STATIONARY;
		break;
	case 4:
		expense_category = ExpenseCategory.ANONYMOUS;
		break;
	default:
		
	}
	}
	
}

enum ExpenseCategory {
	CASH(1),CARD(2),STATIONARY(3),ANONYMOUS(4);
	private int value;  
	private ExpenseCategory(int value){  
	this.value=value;  
}
}