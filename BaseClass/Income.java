package BaseClass;

import java.time.LocalDateTime;

public class Income extends Data{
	
	private IncomeCategory income_category;

	public Income(){
		super();
		income_category = IncomeCategory.ANONYMOUS;
	}
	
	public Income(String description,float amount, int category, LocalDateTime date){
		super(description,amount, date);
		income_category = IncomeCategory.values()[category] ;
	}

    @Override
    public String toString() {
	    String string = "Description: " + getDescription() + "\nAmount: Rs. " + getAmount() + "\nCategory: " + income_category + "\nDate: " + getTime() ;
	    return string ;
    }

    public int getIncomeCategory(){
		return income_category.getValue() ;
	}

	public void setIncomeCategory(int category){
		income_category = IncomeCategory.values()[category] ;
	}
	
}

//ENUM, JUST TO MAKE THE CATEGORIES DISTINCTIVE
enum IncomeCategory {
	CASH(1),CARD(2),SAVINGS(3),SALARY(4),PROFIT(5),GIFT(6),ANONYMOUS(7);
	
	public int value;
	IncomeCategory(int value){  
		this.value = value;  
	}
	int getValue() {
	    return value ;
    }
}
