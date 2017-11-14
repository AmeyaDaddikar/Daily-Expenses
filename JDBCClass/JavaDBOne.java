package JDBCClass ;

import BaseClass.Expense;
import BaseClass.Income;
import BaseClass.User;
import main.MainClass;

import java.sql.*;

public class JavaDBOne {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver" ;
	private static final String DB_URL = "jdbc:mysql://localhost/daily_expenses?autoReconnect=true&useSSL=false" ;
	private static final String USER = "root" ;
	private static final String PASS = "" ;

	private static Connection conn = null ;

    public static boolean isResultSetEmpty(ResultSet resultSet) throws SQLException{
        return (!resultSet.isBeforeFirst() && resultSet.getRow() == 0) ;
    }

    public static User checkUser(String uname, String pword) {
        try {
            String usernameQuery = "SELECT * FROM user WHERE username = ? ;" ;
            PreparedStatement preparedUsername = null ;
            preparedUsername = prepare(usernameQuery) ;
            preparedUsername.setString(1, uname);
            ResultSet resultSet = preparedUsername.executeQuery();
            String username = null ;
            String name = null ;
            String password = null ;
            while(resultSet.next()) {
                username = resultSet.getString("username") ;
                name = resultSet.getString("name") ;
                password = resultSet.getString("password") ;
            }
            User user ;
            user = null ;
            if (username != null) {
                if(password.equals(pword)) {
                    user = new User(username, name, true);
                }
                else {
                    user = new User(username, name, false);
                }
            }
            return user ;
        } catch (SQLException se) {
			System.out.println("Error here") ;
			return null ;
        }
	}

    public static User loadUser(User currUser) {
        String incomeQuery = "SELECT * FROM income WHERE username = ? ;" ;
        String expenseQuery = "SELECT * FROM expense WHERE username = ? ;" ;

        PreparedStatement getIncome = null ;
        PreparedStatement getExpense = null ;

        try {
            getIncome = JavaDBOne.prepare(incomeQuery);
            getExpense = JavaDBOne.prepare(expenseQuery);

            getIncome.setString(1, currUser.getUsername()) ;
            getExpense.setString(1, currUser.getUsername()) ;

            ResultSet incomeSet = getIncome.executeQuery() ;
            ResultSet expenseSet = getExpense.executeQuery() ;

            while(incomeSet.next()) {
                String description = incomeSet.getString("description") ;
                float amount = incomeSet.getFloat("amount") ;
                int category = incomeSet.getInt("category") ;

                Income in = new Income(description, amount, category) ;
                currUser.addIncome(in) ;
            }
            while(expenseSet.next()) {
                String description = expenseSet.getString("description") ;
                float amount = expenseSet.getFloat("amount") ;
                int category = expenseSet.getInt("category") ;

                Expense ex = new Expense(description, amount, category) ;
                currUser.addExpense(ex) ;
            }
            System.out.println("Loaded!");
        } catch (SQLException se) {
            System.out.println("Error in loading information");
            currUser = null ;

            // Handle properly
            System.exit(1);
        }
        return currUser ;
    }

    public static boolean checkUserExists(String username) {
        try {
            String usernameQuery = "SELECT username FROM user WHERE username = ? ;" ;
            PreparedStatement checkExist = null ;
            checkExist = prepare(usernameQuery) ;
            checkExist.setString(1, username);
            ResultSet resultSet = checkExist.executeQuery();
            return (!JavaDBOne.isResultSetEmpty(resultSet));
        } catch (SQLException se) {
            System.out.println("Error here") ;
            return false ;
        }
    }

    public static boolean addUser(String username, String password, String name) {
        boolean added = false ;
        try {
            String addUserQuery = "INSERT INTO user VALUES (?, ?, ?) ;" ;
            PreparedStatement addNew = null ;
            addNew = prepare(addUserQuery) ;
            addNew.setString(1, username) ;
            addNew.setString(2, password) ;
            addNew.setString(3, name) ;
            addNew.execute() ;

            // Inform about successful addition of user
            System.out.println("Added!");
            added = true ;
        } catch (SQLException se) {
            se.printStackTrace() ;
        }
        return added ;
    }

    public static boolean addIncome(Income in) {
        boolean added = false ;

        try {
            String addIncomeQuery = "INSERT INTO income VALUES (?, ?, ?, ?, ?) ;" ;
            PreparedStatement addNew = null ;
            addNew = prepare(addIncomeQuery) ;
            addNew.setString(1, MainClass.currentUser.getUsername());
            addNew.setString(2, in.getDescription());
            addNew.setFloat(3, in.getAmount());
            addNew.setInt(4, in.getIncomeCategory());
            addNew.setInt(5, MainClass.currentUser.getNumInc()) ;
            addNew.execute() ;

            System.out.println("Successfully added income") ;
            added = true ;
        } catch (SQLException se) {
            se.printStackTrace() ;
        }

        return added ;
    }

    public static boolean addExpense(Expense ex) {
        boolean added = false ;

        try {
            String addExpenseQuery = "INSERT INTO expense VALUES (?, ?, ?, ?, ?) ;" ;
            PreparedStatement addNew = null ;
            addNew = prepare(addExpenseQuery) ;
            addNew.setString(1, MainClass.currentUser.getUsername());
            addNew.setString(2, ex.getDescription());
            addNew.setFloat(3, ex.getAmount());
            addNew.setInt(4, ex.getExpenseCategory());
            addNew.setInt(5, MainClass.currentUser.getNumExp()) ;
            addNew.execute() ;

            System.out.println("Successfully added income") ;
            added = true ;
        } catch (SQLException se) {
            se.printStackTrace() ;
        }

        return added ;
    }

    /*
    public static PreparedStatement prepareTest(String st) throws SQLException {
        System.out.println("By PreparedStatement in method") ;
        String sql = "SELECT username FROM user WHERE username = ? " ;
        PreparedStatement pstmt = null ;

        pstmt = conn.prepareStatement(sql) ;
        pstmt.setString(1, st) ;
        ResultSet rs = pstmt.executeQuery() ;

        while(rs.next()) {
            String username = rs.getString("username") ;

            System.out.println("Username: " + username) ;
        }

        return pstmt ;
    }

    public static PreparedStatement prepareStmt(String st) throws SQLException {
        System.out.println("By PreparedStatement in method") ;
        String sql = "SELECT username FROM user WHERE username = ? " ;
        PreparedStatement pstmt = null ;

        pstmt = conn.prepareStatement(sql) ;
        pstmt.setString(1, st) ;
        ResultSet rs = pstmt.executeQuery() ;

        while(rs.next()) {
            String username = rs.getString("username") ;

            System.out.println("Username: " + username) ;
        }

        return pstmt ;
    }
    */
	public static PreparedStatement prepare(String string) throws SQLException {
	    PreparedStatement pstmt = null ;
        pstmt = conn.prepareStatement(string) ;
        return pstmt ;
    }

	public static boolean connect() {
	    try {
            Class.forName(JDBC_DRIVER) ;
        } catch (ClassNotFoundException ce) {
            System.out.println("MySQL Driver class not found") ;
            return false ;
        }
        System.out.println("Connecting to database...");
	    try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException se) {
            System.out.println("Could not connect") ;
            return false ;
        }
        return true ;
    }

    /*
	public static void trialMain() {
		System.out.println("Hello World") ;
		Statement stmt = null ;
		try {
			System.out.println("Creating statement...") ;
			stmt = conn.createStatement() ;
			String sql ;

			System.out.println("All") ;
			sql = "SELECT * FROM user WHERE username = \'Vineet\'" ;
			ResultSet rs = stmt.executeQuery(sql) ;

			while(rs.next()) {
				String username = rs.getString("username") ;
				String password = rs.getString("password") ;
				String firstname = rs.getString("firstname") ;
				String lastname = rs.getString("lastname") ;

				System.out.print("Username: " + username) ;
				System.out.print(", Password: " + password) ;
				System.out.print(", First name: " + firstname) ;
				System.out.println(", Last name: " + lastname) ;
			}

			System.out.println("By Statement") ;
			sql = "SELECT username FROM user WHERE username = \'Vineet\'" ;
			rs = stmt.executeQuery(sql) ;

			while(rs.next()) {
				String username = rs.getString("username") ;

				System.out.println("Username: " + username) ;
			}

			System.out.println("By PreparedStatement") ;
			sql = "SELECT username FROM user WHERE username = ? " ;
			PreparedStatement pstmt = null ;

			pstmt = conn.prepareStatement(sql) ;
			pstmt.setString(1, "Vineet") ;
			rs = pstmt.executeQuery() ;

			while(rs.next()) {
			    String username = rs.getString("username") ;

			    System.out.println("Username: " + username) ;
			}

			try {
                JavaDBOne.prepareTest("Vineet");
            } catch (SQLException se) {
                System.out.println("Caught SQL Exception");
            }

			rs.close() ;
			stmt.close() ;
		} catch(SQLException se) {
			se.printStackTrace() ;
		} catch(Exception e) {
			e.printStackTrace() ;
		} finally {
			try {
				if(stmt != null)
					stmt.close() ;
			} catch(SQLException se2) {}
		}
	}
	*/

    public static void closeConnection() {
	    try {
            conn.close();
        } catch (SQLException se) {
            System.out.println("Exception while closing the connection");
        }

        System.out.println("Goodbye!") ;
    }

    /*
    public static void main(String[] args) {
	    JavaDBOne.connect() ;
        JavaDBOne.trialMain() ;
        try {
            JavaDBOne.prepareTest("Vineet");
        } catch (SQLException se) {
            System.out.println("SQL Exception 2");
        }
        JavaDBOne.closeConnection() ;
    }
    */
}
