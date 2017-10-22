public class Income extends Data{
	
	private IncomeCategory income_category;
		
	public Income(){
		super();
		income_category = ANONYMOUS;
	}
	
	public Income(String description, IncomeCategory category){
		super(description);
		income_category = category;
	}
}

enum IncomeCategory {
	CASH,CARD,SAVINGS,SALARY,PROFIT,GIFT,ANONYMOUS
}
