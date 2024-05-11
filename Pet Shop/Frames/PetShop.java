package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import Classes.*;

public class PetShop extends JFrame implements MouseListener, ActionListener {
	JPanel panel;
	JPanel label;
	JLabel wlc;
	ImageIcon logo;
	JLabel logolabel;
	JButton exit;
	JButton cont;
	JButton next;
	Color colour;
	Font myfont;
	
	public PetShop(){
		super("Get Started");
		this.setSize(900,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colour=new Color(255,242,223);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(colour);
		this.add(panel);
		
		logo=new ImageIcon("Images/petshoplogo.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(215,0,450,300);
		panel.add(logolabel);
		
		wlc=new JLabel("Welcome to our new Pet Shop!");
		wlc.setBounds(325,300,300,30);
		myfont=new Font("Calibri",Font.BOLD,18);
		wlc.setFont(myfont);
		panel.add(wlc);
		
		next=new JButton("Get Started");
		next.setBounds(225,375,450,30);
		next.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		next.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		next.setFont(myfont);
		next.addActionListener(this);
		next.setCursor(new Cursor(Cursor.HAND_CURSOR));
		next.setFocusPainted(false);
		panel.add(next);
		
		cont=new JButton("Contribution");
		cont.setBounds(225,420,450,30);
		cont.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		cont.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		cont.setFont(myfont);
		cont.addActionListener(this);
		cont.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cont.setFocusPainted(false);
		panel.add(cont);
		
		exit=new JButton("Exit");
		exit.setBounds(225,465,450,30);
		exit.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		exit.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		exit.setFont(myfont);
		exit.addActionListener(this);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
		panel.add(exit);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == next){
			Login login = new Login();
			login.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == cont){

		}
		else if(ae.getSource() == exit){
			this.setVisible(false);
		}
		else{

		}
	}
}