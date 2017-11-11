package dailyExpenses;
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
	JButton btn=new JButton("LOGIN");
	
	public Login()
	{
		c=this.getContentPane();
        c.setLayout(null);
        userlabel.setBounds(100,100,100,50);
        pwdlabel.setBounds(100,200,100,50);
        user_tf.setBounds(200,100,200,50);
        pswd_pf.setBounds(200,200,200,50);
        btn.setBounds(250,300,100,50);
        c.add(user_tf);
        c.add(pswd_pf);
        c.add(pwdlabel);
        c.add(userlabel);
        c.add(btn);
        btn.addActionListener(this);
	}
	public boolean authenticate(String username,String password)
	{
		//Authenticate the user
		//System.out.println(username + " " + password);
		return true;
	}
	public static int[] getExpenses()
	{
		int a[] = {9,3,7,4,100,0};
		return a;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
		{
			if(authenticate(user_tf.getText().toString(),pswd_pf.getText().toString()))
			{
				dispose();
				new MainPage();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Invalid username or password");
			}
		}
	}

}
class daily
{
	public static void main(String[] args)
	{
		Login l = new Login();
		l.setVisible(true);	
		l.setTitle("Login Page");
		l.setBounds(100,100,700,500);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
