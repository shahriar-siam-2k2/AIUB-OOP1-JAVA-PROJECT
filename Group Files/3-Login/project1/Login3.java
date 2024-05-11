import java.lang.*;
import javax.swing.*;
import java.awt.*;


public class Login3 extends JFrame
{
    JLabel  Label;
	JPanel Panel;
	ImageIcon img;
	JLabel imgLabel;
	
    JButton login;
    JButton register;
    JButton exit;
    JButton adLogin;
	
	Color myColor;
	Font myFont;
	
	public Login3()
	{
		super("Pet Shop");
		this.setSize(900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(400,180);
		myColor = new Color(255,242,233);
		myFont=new Font("Calibri",Font.BOLD,18);
		
		Panel = new JPanel();
		Panel.setLayout(null);
		Panel.setBackground(myColor);
		this.add(Panel);
		
		img = new ImageIcon("petshoplogo.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(215,0,450,300);
		Panel.add(imgLabel);
		
		Label = new JLabel("Get Started");
		Label.setBounds(390,325,300,30);
		Label.setFont(new Font("Calibri", Font.BOLD, 25));
		Panel.add(Label);
		
		login = new JButton("Login");
		login.setBounds(225,375,450,30);
		login.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,20);
		login.setBackground(myColor);
		login.setFont(myFont);
		Panel.add(login);
		
		register = new JButton("Register");
		register.setBounds(225,420,450,30);
		register.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,20);
		register.setBackground(myColor);
		register.setFont(myFont);
		Panel.add(register);
		
		adLogin = new JButton("Admin Login");
		adLogin.setBounds(225,465,450,30);
		adLogin.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,18);
		adLogin.setBackground(myColor);
		adLogin.setFont(myFont);
		Panel.add(adLogin);
		
		exit = new JButton("Exit");
		exit.setBounds(225,505,450,30);
		exit.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,18);
		exit.setBackground(myColor);
		exit.setFont(myFont);
		Panel.add(exit);
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	
}