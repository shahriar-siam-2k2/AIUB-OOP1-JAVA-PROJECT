package Frames;

import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
import java.awt.event.*;

public class Nagad extends JFrame implements MouseListener, ActionListener{
	JPanel panel;
	ImageIcon img;
	JLabel imgL,merchant,total,tk,charge;
	JButton proceed,close;
	JTextField number;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	
	PayOpt po;

	private double price;
	private int redirect;

	public Nagad(double price, int redirect, PayOpt po){
		super("Nagad Payment");
		this.setSize(515,788);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //middle point popup
		this.setResizable(false);

		this.po = po;
		this.price = price;
		this.redirect = redirect;
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);

		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		fieldFont = new Font("Segoe UI",Font.PLAIN,16);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		this.add(panel);

		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/nagad1.png"));
		this.setIconImage(icon.getImage());
		
		merchant=new JLabel("Pet Shop Merchant");
		merchant.setBounds(138,100,400,50);
		merchant.setForeground(Color.WHITE);
		merchant.setFont(new Font("Segoe UI",Font.BOLD,24));
		panel.add(merchant);
		
		total=new JLabel("Total Amount:");
		total.setBounds(35,180,105,30);
		total.setForeground(Color.WHITE);
		total.setFont(new Font("Segoe UI",Font.BOLD,15));
		panel.add(total);
		
		tk=new JLabel();
		tk.setText(" BDT " + price);
		tk.setBounds(140,180,105,30);
		tk.setForeground(Color.WHITE);
		tk.setFont(new Font("Segoe UI",Font.PLAIN,15));
		panel.add(tk);
		
		charge=new JLabel("Charge:");
		charge.setBounds(35,220,60,30);
		charge.setForeground(Color.WHITE);
		charge.setFont(new Font("Segoe UI",Font.BOLD,15));
		panel.add(charge);
		
		charge=new JLabel();
		charge.setText(" BDT " + 0.0);
		charge.setBounds(95,220,100,30);
		charge.setForeground(Color.WHITE);
		charge.setFont(new Font("Segoe UI",Font.PLAIN,15));
		panel.add(charge);
		
		merchant=new JLabel("Your Nagad Account Number");
		merchant.setBounds(148,330,400,30);
		merchant.setForeground(Color.WHITE);
		merchant.setFont(new Font("Segoe UI",Font.PLAIN,15));
		panel.add(merchant);
		
		number=new JTextField();
		number.setBounds(40,370,415,40);
		number.setFont(fieldFont);
		panel.add(number);
		
		merchant=new JLabel("By clicking 'Proceed' you are agreeing to our Terms and Conditions");
		merchant.setBounds(30,420,500,30);
		merchant.setForeground(Color.WHITE);
		merchant.setFont(new Font("Segoe UI",Font.PLAIN,15));
		panel.add(merchant);
		
		
		//buttons
		
		
		proceed=new JButton("Proceed");
		proceed.setBounds(100,540,100,30);
		proceed.setForeground(new Color(171,22,24));
		proceed.setBackground(Color.WHITE);
		proceed.setFont(new Font("Segoe UI",Font.BOLD,15));
		proceed.setCursor(new Cursor(Cursor.HAND_CURSOR));
		proceed.setFocusPainted(false);
		proceed.setBorderPainted(false);
		proceed.addMouseListener(this);
		proceed.addActionListener(this);
		panel.add(proceed);
		
		close=new JButton("Close");
		close.setBounds(300,540,100,30);
		close.setForeground(new Color(171,22,24));
		close.setBackground(Color.WHITE);
		close.setFont(new Font("Segoe UI",Font.BOLD,15));
		close.setCursor(new Cursor(Cursor.HAND_CURSOR));
		close.setFocusPainted(false);
		close.setBorderPainted(false);
		close.addMouseListener(this);
		close.addActionListener(this);
		panel.add(close);

		
		
		//Picture
		
		
		img=new ImageIcon("Images/nogodimg.jpg");
		imgL=new JLabel(img);
		imgL.setBounds(0,0,500,750);
		panel.add(imgL);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==proceed){
			proceed.setBackground(new Color(163,164,166));
			proceed.setForeground(Color.BLACK);
		}
		else if(me.getSource()==close){
			close.setBackground(new Color(163,164,166));
			close.setForeground(Color.BLACK);
		} 
	}
	public void mouseExited(MouseEvent me){if(me.getSource()==proceed){
			proceed.setBackground(Color.WHITE);
			proceed.setForeground(new Color(171,22,24));
		}
		else if(me.getSource()==close){
			close.setBackground(Color.WHITE);
			close.setForeground(new Color(171,22,24));
		}
	}
	
	//Action
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == proceed){
			String num = number.getText();
			if(num.length() == 0){
				JOptionPane.showMessageDialog(this, "Enter mobile number.", "Empty Field", JOptionPane.WARNING_MESSAGE);
			}
			else if (!num.matches("\\d+")) {
				JOptionPane.showMessageDialog(this, "Phone number should contain only numbers!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
			}
			else if(num.length() < 11 || num.length() > 11){
				JOptionPane.showMessageDialog(this, "Phone number should be 11 digits!", "Invalid Phone Number", JOptionPane.WARNING_MESSAGE);
			}
			else{
				NagadVerification nv = new NagadVerification(price, redirect, num, this);
				nv.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource() == close){
			int confirm = JOptionPane.showConfirmDialog(this, "Are you sure?\n(By clicking YES your payment will cancel)", "Confirmation", JOptionPane.YES_NO_OPTION);

			if(confirm == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(this, "Order place failed due to payment cancellation!", "Payment Failed", JOptionPane.ERROR_MESSAGE);

				this.setVisible(false);
				
				if(redirect == 1){
					cataccessories cat = new cataccessories();
					cat.setVisible(true);
				}
				else if(redirect == 2){
					dogaccessories dog = new dogaccessories();
					dog.setVisible(true);
				}
			}
		}
	}
}