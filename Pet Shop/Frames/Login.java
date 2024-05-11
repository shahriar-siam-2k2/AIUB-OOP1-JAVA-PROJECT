package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import Classes.*;

public class Login extends JFrame implements MouseListener, ActionListener
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
	
	public Login()
	{
		super("Login");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myColor = new Color(255,242,233);
		myFont=new Font("Calibri",Font.BOLD,18);
		
		Panel = new JPanel();
		Panel.setLayout(null);
		Panel.setBackground(myColor);
		
		img = new ImageIcon("Images/petshoplogo.jpg");
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
		login.addActionListener(this);
		login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		login.setFocusPainted(false);
		Panel.add(login);
		
		register = new JButton("Register");
		register.setBounds(225,420,450,30);
		register.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,20);
		register.setBackground(myColor);
		register.setFont(myFont);
		register.addActionListener(this);
		register.setCursor(new Cursor(Cursor.HAND_CURSOR));
		register.setFocusPainted(false);
		Panel.add(register);
		
		adLogin = new JButton("Admin Login");
		adLogin.setBounds(225,465,450,30);
		adLogin.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,18);
		adLogin.setBackground(myColor);
		adLogin.setFont(myFont);
		adLogin.addActionListener(this);
		adLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adLogin.setFocusPainted(false);
		Panel.add(adLogin);
		
		exit = new JButton("Exit");
		exit.setBounds(225,505,450,30);
		exit.setForeground(myColor.WHITE);
		myColor = new Color(241,146,26);
		myFont = new Font("Calibri",Font.BOLD,18);
		exit.setBackground(myColor);
		exit.setFont(myFont);
		exit.addActionListener(this);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		Panel.add(exit);

		this.add(Panel);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == login){
			
		}
		else if(ae.getSource() == register){

		}
		else if(ae.getSource() == adLogin){
			adminlogin admin = new adminlogin();
			admin.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
		else{

		}
	}
}