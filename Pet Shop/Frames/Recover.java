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
	JButton canBtn,chng, eyeOpen, eyeClose, eyeOpen1, eyeClose1;
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

		ImageIcon icon = new ImageIcon(getClass().getResource("/Images/Pet Shop Icon.png"));
		this.setIconImage(icon.getImage());
		
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
		passF.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(passF);

		eyeClose = new JButton();
        eyeClose.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose.setBounds(500,135,20,20);
        eyeClose.setForeground(Color.white);
        eyeClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose.setFocusPainted(false);
        eyeClose.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose.setContentAreaFilled(false);
        eyeClose.addActionListener(this);
        panel.add(eyeClose);

        eyeOpen = new JButton();
        eyeOpen.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen.setBounds(500,135,20,20);
        eyeOpen.setForeground(Color.white);
        eyeOpen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen.setFocusPainted(false);
        eyeOpen.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen.setContentAreaFilled(false);
        eyeOpen.addActionListener(this);
        eyeOpen.setVisible(false);
        panel.add(eyeOpen);
		
		conPassL = new JLabel("Confirm Password:");
		conPassL.setBounds(95,180,200,25);
		conPassL.setFont(defFont);
		panel.add(conPassL);
		
		conPassF = new JPasswordField();
		conPassF.setBounds(95,210,400,35);
		conPassF.setFont(new Font("Segoe UI",Font.PLAIN,18));
		panel.add(conPassF);

		eyeClose1 = new JButton();
        eyeClose1.setIcon(new ImageIcon("Images/Eye Close.png"));
        eyeClose1.setBounds(500,218,20,20);
        eyeClose1.setForeground(Color.white);
        eyeClose1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeClose1.setFocusPainted(false);
        eyeClose1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeClose1.setContentAreaFilled(false);
        eyeClose1.addActionListener(this);
        panel.add(eyeClose1);

        eyeOpen1 = new JButton();
        eyeOpen1.setIcon(new ImageIcon("Images/Eye Open.png"));
        eyeOpen1.setBounds(500,218,20,20);
        eyeOpen1.setForeground(Color.white);
        eyeOpen1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        eyeOpen1.setFocusPainted(false);
        eyeOpen1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        eyeOpen1.setContentAreaFilled(false);
        eyeOpen1.addActionListener(this);
        eyeOpen1.setVisible(false);
        panel.add(eyeOpen1);
		
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
		else if(ae.getSource() == eyeClose){
            if (passF.getEchoChar() != '\u0000') {
                passF.setEchoChar('\u0000');
                eyeClose.setVisible(false);
                eyeOpen.setVisible(true);
            }
        }
        else if(ae.getSource() == eyeOpen){
            passF.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            eyeOpen.setVisible(false);
            eyeClose.setVisible(true);
        }
		else if(ae.getSource() == eyeClose1){
            if (conPassF.getEchoChar() != '\u0000') {
                conPassF.setEchoChar('\u0000');
                eyeClose1.setVisible(false);
                eyeOpen1.setVisible(true);
            }
        }
        else if(ae.getSource() == eyeOpen1){
            conPassF.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            eyeOpen1.setVisible(false);
            eyeClose1.setVisible(true);
        }
		else if(ae.getSource() == canBtn){
			int con = JOptionPane.showConfirmDialog(this, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

			if(con == JOptionPane.YES_OPTION){
				userlogin log = new userlogin();
				this.setVisible(false);
				log.setVisible(true);
			}
		}
	}
}