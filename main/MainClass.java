package main;

import BaseClass.User;
import GUI.Login;
import JDBCClass.JavaDBOne;

import javax.swing.*;

public class MainClass {
    public static User currentUser = null ;

    /*
    public static void loadUser(User currUser) {
//        currentUser = currUser ;

        String incomeQuery = "SELECT * FROM income WHERE username = ? ;" ;
        String expenseQuery = "SELECT * FROM expense WHERE username = ? ;" ;

        PreparedStatement getIncome = null ;
        PreparedStatement getExpense = null ;

        try {
            getIncome = JavaDBOne.prepare(incomeQuery);
            getExpense = JavaDBOne.prepare(expenseQuery);

            getIncome.setString(1, currentUser.getUsername()) ;
            getExpense.setString(1, currentUser.getUsername()) ;

            ResultSet incomeSet = getIncome.executeQuery() ;
            ResultSet expenseSet = getExpense.executeQuery() ;

            while(incomeSet.next()) {
                String description = incomeSet.getString("description") ;
                float amount = incomeSet.getFloat("amount") ;
                int category = incomeSet.getInt("category") ;

                Income in = new Income(description, amount, category) ;
                currentUser.addIncome(in) ;
            }
            while(expenseSet.next()) {
                String description = expenseSet.getString("description") ;
                float amount = expenseSet.getFloat("amount") ;
                int category = expenseSet.getInt("category") ;

                Expense ex = new Expense(description, amount, category) ;
                currentUser.addExpense(ex) ;
            }
            System.out.println("Loaded!");
        } catch (SQLException se) {
            System.out.println("Error in loading information");
            currentUser = null ;
            System.exit(1);
        }
    }
    */

    public static void loadUser(User user) {
        currentUser = JavaDBOne.loadUser(user) ;
        currentUser.displayIncome() ;
        currentUser.displayExpense() ;
    }

    public static void main(String[] args) {
        JavaDBOne.connect() ;

        Login l = new Login();
        l.setVisible(true);
        l.setTitle("Login Page");
        l.setBounds(100,100,700,500);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
