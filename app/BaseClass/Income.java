package Daily1;

public class Income extends Data{
	
	private IncomeCategory income_category;
		
	public Income(){
		super();
		income_category = IncomeCategory.ANONYMOUS;
	}
	
	public Income(String description){
		super(description);
		int j=1;
		int s=8;
		for(ExpenseCategory i:ExpenseCategory.values())
		{
			System.out.println(j+" "+i);
			j=j+1;
		}
	while(s>7)
	{
		System.out.println("Enter a number between 1 and 4");
		s=sc.nextInt();
	}
	switch(s)
	{
	case 1:
		income_category = IncomeCategory.CASH;
		break;
	case 2:
		income_category = IncomeCategory.CARD;
		break;
	case 3:
		income_category = IncomeCategory.SAVINGS;
		break;
	case 4:
		income_category = IncomeCategory.SALARY;
		break;
	case 5:
		income_category = IncomeCategory.PROFIT;
		break;
	case 6:
		income_category = IncomeCategory.GIFT;
		break;
	case 7:
		income_category = IncomeCategory.ANONYMOUS;
		break;
	default:
		
	}
	
		
	}
}

enum IncomeCategory {
	CASH,CARD,SAVINGS,SALARY,PROFIT,GIFT,ANONYMOUS
}
