package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PetSelect extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel Label,catL,dogL;
	ImageIcon img,img1;
	JButton catBtn,dogBtn,exit,back;
	Color panelCol,btnCol,hovCol,clr;
	Font headFont,defFont,btnFont;
	
	PetSelect()
	{
		super("Pet Selection");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
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
		
		Label = new JLabel("SELECT YOUR PET");
		Label.setBounds(163,30,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		
		img = new ImageIcon("Images/PS.png");	
		img1 = new ImageIcon("Images/PSPIC1.png");
		
		catBtn = new JButton(img);
		catBtn.setBounds(125,100,150,150);
		catBtn.setBackground(null);
		catBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        catBtn.setFocusPainted(false);
		catBtn.setBorderPainted(false);
		catBtn.addMouseListener(this);
		catBtn.addActionListener(this);
		panel.add(catBtn);
		
		dogBtn = new JButton(img1);
		dogBtn.setBounds(325,100,150,150);
		dogBtn.setBackground(null);
		dogBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        dogBtn.setFocusPainted(false);
		dogBtn.setBorderPainted(false);
		dogBtn.addMouseListener(this);
		dogBtn.addActionListener(this);
		panel.add(dogBtn);
		
		catL = new JLabel("CAT");
		catL.setBounds(183,260,100,25);
		catL.setFont(defFont);
		panel.add(catL);
		
		dogL = new JLabel("DOG");
		dogL.setBounds(381,260,100,25);
		dogL.setFont(defFont);
		panel.add(dogL);
		
		clr = new Color(217,83,79);
		
		exit = new JButton("Exit");
		exit.setBounds(160,310,110,35);
		exit.setForeground(Color.WHITE);
		exit.setBackground(clr);
		exit.setFont(btnFont);
		exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setFocusPainted(false);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		back = new JButton("Back");
		back.setBounds(325,310,110,35);
		back.setForeground(Color.WHITE);
		back.setBackground(btnCol);
		back.setFont(btnFont);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
		back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);	
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==catBtn)
		{
			catBtn.setBackground(hovCol);
		}
		else if(me.getSource()==dogBtn)
		{
			dogBtn.setBackground(hovCol);
		}
		else if(me.getSource()==exit)
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
		if(me.getSource()==catBtn)
		{
			catBtn.setBackground(null);
		}
		else if(me.getSource()==dogBtn)
		{
			dogBtn.setBackground(null);
		}
		else if(me.getSource()==exit)
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
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==catBtn){
			cataccessories A1=new cataccessories();
			this.setVisible(false);
			A1.setVisible(true);
		}
		else if(ae.getSource()==dogBtn){
			dogaccessories A2=new dogaccessories();
			this.setVisible(false);
			A2.setVisible(true);
		}
		else if(ae.getSource()==exit){
			this.setVisible(false);
		}
		else if(ae.getSource()==back){
			GetStarted B1=new GetStarted();
			B1.setVisible(true);
			this.setVisible(false);
		}
	}
}