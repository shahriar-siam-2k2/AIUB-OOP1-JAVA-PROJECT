package Frames;

import java.lang.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PayOpt extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel Label,cardL,bkashL,nagadL,imgL;
	ImageIcon img,img1,img2;
	JButton card,bkash,nagad,exit,back;
	Color panelCol,btnCol,hovCol,clr;
	Font headFont,defFont,btnFont;

	CatProduct1 cp1;
	CatProduct2 cp2;
	CatProduct3 cp3;
	CatProduct4 cp4;
	CatProduct5 cp5;
	CatProduct6 cp6;

	DogProduct1 dp1;
	DogProduct2 dp2;
	DogProduct3 dp3;
	DogProduct4 dp4;
	DogProduct5 dp5;
	DogProduct6 dp6;

	private double price;
	private int redirect;
	
	public PayOpt()
	{
		super("Payment Option");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		hovCol = new Color(241,146,26);
		
		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);
		
		Label = new JLabel("SELECT PAYMENT METHOD");
		Label.setBounds(90,30,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		
		img = new ImageIcon("Images/card.png");
		
		img1 = new ImageIcon("Images/bkash.png");
		
		
		img2 = new ImageIcon("Images/nagad1.png");
		
		
		card = new JButton(img);
		card.setBounds(90,100,120,113);
		card.setBackground(null);
		card.addMouseListener(this);
		card.addActionListener(this);
		panel.add(card);
		
		bkash = new JButton(img1);
		bkash.setBounds(237,100,120,113);
		bkash.setBackground(null);
		bkash.addMouseListener(this);
		bkash.addActionListener(this);
		panel.add(bkash);
		
		nagad = new JButton(img2);
		nagad.setBounds(380,100,120,113);
		nagad.setBackground(null);
		nagad.addMouseListener(this);
		nagad.addActionListener(this);
		panel.add(nagad);
		
		cardL = new JLabel("Card");
		cardL.setBounds(125,220,100,25);
		cardL.setFont(defFont);
		panel.add(cardL);
		
		bkashL = new JLabel("Bkash");
		bkashL.setBounds(275,220,100,25);
		bkashL.setFont(defFont);
		panel.add(bkashL);
		
		nagadL = new JLabel("Nagad");
		nagadL.setBounds(415,220,100,25);
		nagadL.setFont(defFont);
		panel.add(nagadL);
		
		clr = new Color(217,83,79);
		
		exit = new JButton("Exit");
		exit.setBounds(155,280,110,35);
		exit.setForeground(Color.WHITE);
		exit.setBackground(clr);
		exit.setFont(btnFont);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		back = new JButton("Back");
		back.setBounds(325,280,110,35);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);	
	}

	//price setter using inheritance

	public void setPriceCp1(double price, int redirect, CatProduct1 cp1){
		this.cp1 = cp1;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceCp2(double price, int redirect, CatProduct2 cp2){
		this.cp2 = cp2;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceCp3(double price, int redirect, CatProduct3 cp3){
		this.cp3 = cp3;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceCp4(double price, int redirect, CatProduct4 cp4){
		this.cp4 = cp4;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceCp5(double price, int redirect, CatProduct5 cp5){
		this.cp5 = cp5;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceCp6(double price, int redirect, CatProduct6 cp6){
		this.cp6 = cp6;
		this.price = price;
		this.redirect = redirect;
	}

	public void setPriceDp1(double price, int redirect, DogProduct1 dp1){
		this.dp1 = dp1;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceDp2(double price, int redirect, DogProduct2 dp2){
		this.dp2 = dp2;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceDp3(double price, int redirect, DogProduct3 dp3){
		this.dp3 = dp3;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceDp4(double price, int redirect, DogProduct4 dp4){
		this.dp4 = dp4;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceDp5(double price, int redirect, DogProduct5 dp5){
		this.dp5 = dp5;
		this.price = price;
		this.redirect = redirect;
	}
	public void setPriceDp6(double price, int redirect, DogProduct6 dp6){
		this.dp6 = dp6;
		this.price = price;
		this.redirect = redirect;
	}

	//mouse properties

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		
	    if(me.getSource()==exit)
		{
			exit.setBackground(Color.WHITE);
			exit.setForeground(clr);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(hovCol);
			back.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		
	    if(me.getSource()==exit)
		{
			exit.setBackground(clr);
			exit.setForeground(Color.WHITE);
		}
		else if(me.getSource()==back)
		{
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
	}
		
	//Action properties

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==back)
		{
			if(redirect == 1){
				cataccessories cat = new cataccessories();
				cat.setVisible(true);
				this.setVisible(false);
			}
			else if(redirect == 2){
				dogaccessories dog = new dogaccessories();
				dog.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource() == card){
			card c = new card(redirect, this);
			c.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == bkash){
			Bkash c = new Bkash(price, redirect, this);
			c.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource() == nagad){
			JOptionPane.showMessageDialog(this, "Not available right now", "Not Available", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
	
	
