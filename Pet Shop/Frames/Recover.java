package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;

public class Recover extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel Label,passL,conPassL;
	JPasswordField passF,conPassF;
	JButton canBtn,chng;
	Color panelCol,btnCol,hovCol;
	Font headFont,defFont,btnFont;

	recoveryC rec;

	private String name;
	
	Recover(String name, recoveryC rec)
	{
		super("Password Recovery");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		hovCol = new Color(241,146,26);
		
		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,18);

		this.rec = rec;
		this.name = name;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);
		
		Label = new JLabel("ENTER NEW PASSWORD");
		Label.setBounds(115,30,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		passL = new JLabel("Password:");
		passL.setBounds(95,100,100,25);
		passL.setFont(defFont);
		panel.add(passL);
		
		passF = new JPasswordField();
		passF.setBounds(95,130,400,35);
		passF.setFont(defFont);
		passF.setEchoChar('*');
		panel.add(passF);
		
		conPassL = new JLabel("Confirm Password:");
		conPassL.setBounds(95,180,200,25);
		conPassL.setFont(defFont);
		panel.add(conPassL);
		
		conPassF = new JPasswordField();
		conPassF.setBounds(95,210,400,35);
		conPassF.setFont(defFont);
		conPassF.setEchoChar('*');
		panel.add(conPassF);
		
		canBtn = new JButton("Cancel");
		canBtn.setBounds(160,290,110,35);
		canBtn.setForeground(Color.WHITE);
		canBtn.setBackground(btnCol);
		canBtn.setFont(btnFont);
		canBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	canBtn.setFocusPainted(false);
		canBtn.addActionListener(this);
		canBtn.addMouseListener(this);
		panel.add(canBtn);
		
		chng = new JButton("Change");
		chng.setBounds(315,290,110,35);
		chng.setForeground(Color.WHITE);
		chng.setBackground(btnCol);
		chng.setFont(btnFont);
		chng.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	chng.setFocusPainted(false);
		chng.addActionListener(this);
		chng.addMouseListener(this);
		panel.add(chng);
		
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==canBtn)
		{
			canBtn.setBackground(hovCol);
			canBtn.setForeground(Color.WHITE);
			
		}
		else if(me.getSource()==chng)
		{
			chng.setBackground(hovCol);
			chng.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==canBtn)
		{
			canBtn.setBackground(btnCol);
			canBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==chng)
		{
			chng.setBackground(btnCol);
			chng.setForeground(Color.WHITE);
		}	
	}
	
	public void actionPerformed(ActionEvent ae){
		String pass = passF.getText();
		String confirm = conPassF.getText();

		if(ae.getSource() == chng){
			if(pass.isEmpty() == true || confirm.isEmpty() == true){
				JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
			}
			else if(pass.equals(confirm) == false){
				JOptionPane.showMessageDialog(null, "Password not matched!", "ERROR!", JOptionPane.ERROR_MESSAGE);
			}
			else {
				UserAccount acc = new UserAccount();
				acc.changePass(name, pass);

				userlogin login = new userlogin();
				this.setVisible(false);
				login.setVisible(true);
			}
		}
	}
}