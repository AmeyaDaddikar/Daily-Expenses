//package dailyExpenses;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{         
	Container c;
	JLabel userlabel=new JLabel("Username");
	JLabel pwdlabel=new JLabel("Password");
	JTextField user_tf=new JTextField();
	JPasswordField pswd_pf=new JPasswordField();
	JButton btnLogin=new JButton("LOGIN");
	JButton btnSignUp = new JButton("SIGN UP");
	
	public Login()
	{
		c=this.getContentPane();
        getContentPane().setLayout(null);
        user_tf.setBounds(200, 100, 200, 50);
        c.add(user_tf);
        pswd_pf.setBounds(200, 200, 200, 50);
        c.add(pswd_pf);
        pwdlabel.setBounds(100, 200, 100, 50);
        c.add(pwdlabel);
        userlabel.setBounds(100, 100, 100, 50);
        c.add(userlabel);
        btnLogin.setBounds(150, 300, 100, 50);
        c.add(btnLogin);
        btnLogin.addActionListener(this);
        btnSignUp.setBounds(300,300,100,50);
        c.add(btnSignUp);
        btnSignUp.addActionListener(this);
	}
	public boolean authenticate(String username,String password)
	{
		//Authenticate the user
		return true;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnLogin)
		{
			if(authenticate(user_tf.getText().toString(),pswd_pf.getText().toString()))
			{
				dispose();
				new MainPage().setVisible(true);;
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid username or password");
			}
		}
		else if(e.getSource()==btnSignUp)
		{
			dispose();
			new SignUp().setVisible(true);;
		}
	}
	public static void main(String[] args)
	{
		Login l = new Login();
		l.setVisible(true);	
		l.setTitle("Login Page");
		l.setBounds(100,100,700,500);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
