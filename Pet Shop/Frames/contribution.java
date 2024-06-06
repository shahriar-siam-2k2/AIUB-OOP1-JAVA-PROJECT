package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contribution extends JFrame implements MouseListener, ActionListener {
	
	JPanel panel;
	JLabel imgLabel,heading,name,id;
    JButton back;
    ImageIcon img;
	Color panelCol,btnCol,btnHoverCol;
	Font headFont,defFont,fieldFont,btnFont;
	
	public contribution(){
		
		super("CONTRIBUTION");
		this.setSize(600,850);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //middle point popup
		this.setResizable(false);
		
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

		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Pet Shop Icon.png"));
		this.setIconImage(icon.getImage());
		
		heading=new JLabel("CONTRIBUTION");
		heading.setBounds(170,0,400,50);
		heading.setFont(headFont);
		heading.setForeground(btnCol);
		panel.add(heading);
		
		heading=new JLabel("OOP-1(JAVA) PROJECT");
		heading.setBounds(200,50,400,30);
		heading.setFont(defFont);
		//heading.setForeground(btnCol);
		panel.add(heading);
		
		heading=new JLabel("GROUP-01");
		heading.setBounds(245,80,400,30);
		heading.setFont(defFont);
		//heading.setForeground(btnCol);
		panel.add(heading);
		
		
		//pictures
		
		
		img=new ImageIcon("Images/siam.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(65,130,150,150);
		panel.add(imgLabel);
		
		name=new JLabel("J.M. Shahriar Ali Seam");
		name.setBounds(65,280,400,30);
		name.setFont(defFont);
		panel.add(name);
		
		name=new JLabel("ID: 23-53004-3");
		name.setBounds(65,305,400,30);
		name.setFont(fieldFont);
		panel.add(name);
		
		name=new JLabel("<html>Role: Userdata, account<br>management, credential checking,<br>package handling.</html>");
		name.setBounds(65,330,200,100);
		name.setFont(fieldFont);
		panel.add(name);

		
		img=new ImageIcon("Images/prottoy.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(365,130,150,150);
		panel.add(imgLabel);
		
		name=new JLabel("Anirban Prottoy");
		name.setBounds(365,280,400,30);
		name.setFont(defFont);
		panel.add(name);
		
		name=new JLabel("ID: 23-53005-3");
		name.setBounds(365,305,400,30);
		name.setFont(fieldFont);
		panel.add(name);
		
		name=new JLabel("<html>Role: Petshop, AdminPanel,<br>Register, Category,<br>Payment, Bkash and BkashCode frame making.</html>");
		name.setBounds(365,330,200,100);
		name.setFont(fieldFont);
		panel.add(name);
		
		
		
		
		img=new ImageIcon("Images/rafith.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(65,445,150,150);
		panel.add(imgLabel);
		
		name=new JLabel("Md. Rafith Tarafder ");
		name.setBounds(65,595,400,30);
		name.setFont(defFont);
		panel.add(name);
		
		name=new JLabel("ID: 23-53011-3");
		name.setBounds(65,620,400,30);
		name.setFont(fieldFont);
		panel.add(name);
		
		name=new JLabel("<html>Role: AdminLogin, ChangeAdminInfo, Login,<br>Card, BkashPin and<br>CardCode frame making.</html>");
		name.setBounds(65,645,200,100);
		name.setFont(fieldFont);
		panel.add(name);
		
		
		
		
		img=new ImageIcon("Images/kotha.jpg");
		imgLabel=new JLabel(img);
		imgLabel.setBounds(365,445,150,150);
		panel.add(imgLabel);
		
		name=new JLabel("Kotha Dhar");
		name.setBounds(365,595,400,30);
		name.setFont(defFont);
		panel.add(name);
		
		name=new JLabel("ID: 23-53561-3");
		name.setBounds(365,620,400,30);
		name.setFont(fieldFont);
		panel.add(name);
		
		name=new JLabel("<html>Role: Splash, GetStarted, AdminUserAdd,<br>Accessories and Home<br>frame making.</html>");
		name.setBounds(365,645,200,100);
		name.setFont(fieldFont);
		panel.add(name);
		
		
		//buttons
		
		
		back=new JButton("Back");
		back.setBounds(243,760,100,30);
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
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==back){
			back.setBackground(btnHoverCol);
			back.setForeground(Color.WHITE);
		}
		 
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==back){
			back.setBackground(btnCol);
			back.setForeground(Color.WHITE);
		}
	}
	
	
	
	//Action
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == back){
			this.setVisible(false);
		}
	}
}