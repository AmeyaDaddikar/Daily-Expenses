package BaseClass;

import java.util.ArrayList;
import java.util.Collections;

/*
I felt there is no real need of saving the password of the user in the program, as
usually password is never displayed anywhere.
The password is required only in the following case
1 . login
2 . changing password

If we are going to implement a database, then we can just check the password
with the database everytime

The password will be saved in the database only.
This way the password of the user can be protcted
*/


public class User{

	private String username;
    private String name;
    private boolean usable ;
	//private String password;
	
	private ArrayList<Expense> expense_list;
	private ArrayList<Income> income_list;

	//CREATES A USER WITH A NAME AND A PASSWORD
	public User(String username, String name, boolean usable){
        this.username = username ;
		this.name = name ;
        this.usable = usable ;
		//this.password = password;
		this.expense_list = new ArrayList<>();
		this.income_list  = new ArrayList<>();
	}

	//CREATES A USER WITH A NAME AS "root" AND A PASSWORD ""	
	public User() {
        this.name = "default_user";
		this.name = "Default user";
		//this.password = "";
		this.expense_list = new ArrayList<>();
		this.income_list  = new ArrayList<>();
	}

	//SETS NEW NAME FOR THE USER
	public void setName(String new_name){
		name = new_name;
	}
	
	//RETURNS THE USER NAME
	public String getName(){
		return name;
	}

	//SETS NEW NAME FOR THE USER
	public void setUsername(String new_username){
		username = new_username;
	}

	//RETURNS THE USER NAME
	public String getUsername(){
		return username;
	}

	// Returns the usability
    public boolean isUsable() {
	    return usable ;
    }

    public int getNumInc() {
		return income_list.size() ;
	}

    public int getNumExp() {
        return expense_list.size() ;
    }

    public ArrayList<Data> getAllJoinedData() {
	    ArrayList<Data> ad = new ArrayList<Data>() ;
	    ad.addAll(income_list) ;
		ad.addAll(expense_list) ;
		Collections.sort(ad);
		for(Data data : ad) {
            System.out.println(data);
        }
        return ad ;
    }

    public ArrayList<Income> getIncome_list() {
	    return income_list ;
    }

    public ArrayList<Expense> getExpense_list() {
        return expense_list;
    }

    /*//RETURNS THE USER PASSWORD
	private String getPassword(){
		return password;
	}*/

	//STATIC FUNCTION FOR LOGIN THAT RETURNS A NEW USER INSTANCE
    /*
	public static User login(String username, String password)throws Exception{
		
		boolean isUser = true; //REMOVE THIS LINE AND THE NEXT FEW AS WELL. Needed for console debugging only
		 
		//check if the username exists and password is correct throw exception if wrong
		//here for the console part, if isUser is false, then the function throws error
		
		if(!isUser)
			throw new Exception();	
			
		User curr_user = new User(username);
		//get the income_list and expense list from the database
		
		return curr_user;
	}
	*/
	
	//RETURNS THE ENTIRE EXPENSE LIST INSTANCE
	public ArrayList<Expense> getExpenses(){
		return expense_list;
	}
	
	//RETURNS THE ENTIRE INCOME LIST INSTANCE
	public ArrayList<Income> getIncomes(){
		return income_list;
	}
	
	// ADDS AN EXPENSE TO THE EXPENSE LIST
	public void addExpense(Expense new_expense){
		expense_list.add(new_expense); 
		//add to list in the remote database	
	}
	
	//REMOVES ALL EXPENSES
	public void deleteAllExpenses(){
		expense_list.clear();
		//clear list in the remote database
	}
	
	// ADDS AN INCOME TO THE INCOME LIST
	public void addIncome(Income new_income){
		income_list.add(new_income);
		//add to list in the remote database
	}
	
	//REMOVES ALL INCOMES
	public void deleteAllIncomes(){
		income_list.clear();
		//clear list in the remote database
	}

	public void displayIncome() {
        System.out.println("Displaying Incomes") ;
        for(Income in : income_list) {
            System.out.println(in.toString());
        }
    }

    public void displayExpense() {
        System.out.println("Displaying Expenses") ;
        for(Expense ex : expense_list) {
            System.out.println(ex.toString());
        }
    }

    //Main program is just an illustration of what the core functionalities
	// of this application can be.
	//Main to be edited once GUI is being implemented.
    /*
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		 /////This will be the login screen ///////
		String name = scan.nextLine();
		String password = scan.nextLine();
		
		try{
			User curr_user = login(name,password);
		}catch( Exception e){
			System.out.println("Invalid user");
			return;
		}
		
		////In GUI, a message should pop saying that invalid username or password
		////The login screen will stay up even if login fails
		
		
		
	}
	*/
}
