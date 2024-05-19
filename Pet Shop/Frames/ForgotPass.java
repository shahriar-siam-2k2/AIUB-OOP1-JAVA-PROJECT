package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Classes.*;

public class ForgotPass extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	JLabel Label,nameL,queL,ansL,recovery,imgL;
	ImageIcon img;
	JTextField nameF,ansF,recoveryF;
	JComboBox queC;
	JButton backBtn,nextBtn;
	JRadioButton e, p;
	ButtonGroup bg;
	Color panelCol,btnCol,hovCol;
	Font headFont,defFont,btnFont;

	private int radio = 0;
	private String recMethod;
	
	public ForgotPass()
	{
		super("Password Recovery");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		hovCol = new Color(241,146,26);
		
		headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,18);
		
		panel =  new JPanel();
		panel.setLayout(null);
		panel.setBackground(panelCol);
		this.add(panel);

		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Pet Shop Icon.png"));
		this.setIconImage(icon.getImage());
		
		Label = new JLabel("Password Recover");
		Label.setBounds(170,20,450,35);
		Label.setFont(headFont);
		panel.add(Label);
		
		img = new ImageIcon("Images/pass recover icon.png");
		imgL = new JLabel(img);
		imgL.setBounds(620,180,150,150);
		panel.add(imgL);
		
		nameL = new JLabel("User Name:");
		nameL.setBounds(90,90,100,25);
		nameL.setFont(defFont);
		panel.add(nameL);
		
		nameF = new JTextField();
		nameF.setBounds(90,120,435,35);
		nameF.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(nameF);
		
		queL = new JLabel("Security Question:");
		queL.setBounds(90,170,200,25);
		queL.setFont(defFont);
		panel.add(queL);
		
		String items[]={"Choose a security question...", "Your hobby?", "Your birth place?", "Your dream job?", "Your favorite car name?"};
		queC = new JComboBox(items);
		queC.setBounds(90,200,435,35);
		queC.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(queC);
		
		ansL = new JLabel("Answer:");
		ansL.setBounds(90,250,100,25);
		ansL.setFont(defFont);
		panel.add(ansL);
		
		ansF = new JTextField();
		ansF.setBounds(90,280,435,35);
		ansF.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(ansF);
		
		e = new JRadioButton("Email");
		e.setBounds(360, 330, 60, 25);
		e.setFont(new Font("Segoe UI",Font.PLAIN,13));
		e.setCursor(new Cursor(Cursor.HAND_CURSOR));
		e.setFocusPainted(false);
		e.setOpaque(false);
		e.addMouseListener(this);
		e.addActionListener(this);
		panel.add(e);

		p = new JRadioButton("Phone Number");
		p.setBounds(415, 330, 117, 25);
		p.setFont(new Font("Segoe UI",Font.PLAIN,13));
		p.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p.setFocusPainted(false);
		p.setOpaque(false);
		p.addMouseListener(this);
		p.addActionListener(this);
		panel.add(p);

		bg = new ButtonGroup();
		bg.add(e);
		bg.add(p);
		
		recovery = new JLabel();
		recovery.setText("Select Recovery Method:");
		recovery.setBounds(90,330,270,25);
		recovery.setFont(defFont);
		panel.add(recovery);
		
		recoveryF = new JTextField();
		recoveryF.setBounds(90,360,435,35);
		recoveryF.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(recoveryF);
		
		
		backBtn = new JButton("Back");
		backBtn.setBounds(155,450,90,35);
		backBtn.setForeground(Color.WHITE);
		backBtn.setBackground(btnCol);
		backBtn.setFont(btnFont);
		backBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		nextBtn = new JButton("Next");
		nextBtn.setBounds(310,450,90,35);
		nextBtn.setForeground(Color.WHITE);
		nextBtn.setBackground(btnCol);
		nextBtn.setFont(btnFont);
		nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextBtn.setFocusPainted(false);
		nextBtn.addMouseListener(this);
		nextBtn.addActionListener(this);
		panel.add(nextBtn);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==backBtn)
		{
			backBtn.setBackground(hovCol);
			backBtn.setForeground(Color.WHITE);
			
		}
		else if(me.getSource()==nextBtn)
		{
			nextBtn.setBackground(hovCol);
			nextBtn.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==backBtn)
		{
			backBtn.setBackground(btnCol);
			backBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==nextBtn)
		{
			nextBtn.setBackground(btnCol);
			nextBtn.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae){
		boolean validate = false;
		int combo = queC.getSelectedIndex();
		String name = nameF.getText();
		String ques = String.valueOf(queC.getSelectedItem());
		String ans = ansF.getText();
		recMethod = recoveryF.getText();

		if(ae.getSource() == e){
			recovery.setText("Enter Recovery Email:");
			radio = 1;
		}
		else if(ae.getSource() == p){
			recovery.setText("Enter Recovery Phone Number:");
			radio = 2;
		}
		else if(ae.getSource() == nextBtn){
			if(name.isEmpty() == true || combo == 0 || ans.isEmpty() == true || recMethod.isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Please fill out all fields", "Empty Field", JOptionPane.WARNING_MESSAGE);
			}
			else if(radio == 0){
				JOptionPane.showMessageDialog(this, "Select Recovery Method", "Recovery Method", JOptionPane.WARNING_MESSAGE);
			}
			else if(radio == 1 && radio != 2){
				if(recMethod.contains("@") == false){
					JOptionPane.showMessageDialog(this, "Email should have '@' sign", "Invalid Email!", JOptionPane.WARNING_MESSAGE);
				}
				else {
					validate = true;
				}
			}
			else if(radio == 2 && radio != 1){
				if(!recMethod.matches("\\d+")) {
					JOptionPane.showMessageDialog(this, "Phone number should contain only numbers!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
					
				}
				else if(recMethod.length() < 11 || recMethod.length() > 11){
					JOptionPane.showMessageDialog(this, "Phone number should be 11 digits!", "Invalid Phone Number", JOptionPane.WARNING_MESSAGE);
				}
				else {
					validate = true;
				}
			}
			
			if(validate == true){
				UserAccount acc = new UserAccount();
				if(acc.forgotPassCredential(name, ques, ans, recMethod) == true){
					recoveryC rec = new recoveryC(name, recMethod, radio, this);
					this.setVisible(false);
					rec.setVisible(true);
				}
			}
		}
		else if(ae.getSource() == backBtn){
			userlogin log = new userlogin();
			this.setVisible(false);
			log.setVisible(true);
		}
	}
}
