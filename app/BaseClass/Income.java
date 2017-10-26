package Daily1;

public class Income extends Data{
	
	private IncomeCategory income_category;
		
	public Income(){
		super();
		income_category = IncomeCategory.ANONYMOUS;
	}
	
	public Income(String description,float amount, IncomeCategory category){
		super(description,amount);
		income_category = category;
	}
	
	public IncomeCategory setIncomeCategory(){
		return income_category;
	}
	
	public void setIncomeCategory(IncomeCategory category){
		income_category = category;
	}
	
}

//ENUM, JUST TO MAKE THE CATEGORIES DISTINCTIVE
enum IncomeCategory {
	CASH(1),CARD(2),SAVINGS(3),SALARY(4),PROFIT(5),GIFT(6),ANONYMOUS(7);
	
	public int value;
	IncomeCategory(int value){  
		this.value = value;  
	}
}
