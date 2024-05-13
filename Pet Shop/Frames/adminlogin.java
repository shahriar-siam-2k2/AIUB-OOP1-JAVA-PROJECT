package Frames;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Classes.*;

public class adminlogin extends JFrame implements MouseListener, ActionListener{

    JLabel adminlog,name,pass,imgLabel;
    JTextField namef;
    JPasswordField passf;
    JButton exit,login,back;
    JPanel panel;
    Color panelCol,btnCol,btnHoverCol, exitCol, loginCol;
    Font headFont, defFont, btnFont, fieldFont;
    ImageIcon img;

    public adminlogin()
    {
        super("Admin Login");
        this.setSize(750,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        panelCol = new Color(255,242,223);
		btnCol = new Color(61,35,20);
		btnHoverCol = new Color(241,146,26);
        exitCol = new Color(217,83,79);
        loginCol = new Color(81,188,86);

        headFont = new Font("Segoe UI",Font.BOLD,32);
		defFont = new Font("Segoe UI",Font.BOLD,18);
		btnFont = new Font("Serif Bold",Font.BOLD,16);
        fieldFont = new Font("Segoe UI",Font.PLAIN,16);
    

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(panelCol);
        

        adminlog=new JLabel("ADMIN LOGIN");
        adminlog.setBounds(250,0,350,65);
        adminlog.setFont(headFont);
        adminlog.setForeground(btnCol);
        panel.add(adminlog);

        name=new JLabel("Name");
        name.setBounds(100,65,100,75);
        name.setFont(defFont);
        panel.add(name);

        namef=new JTextField();
        namef.setBounds(100,120,290,30);
        namef.setFont(fieldFont);
        panel.add(namef);

        pass=new JLabel("Password");
        pass.setBounds(100,165,160,55);
        pass.setFont(defFont);
        panel.add(pass);

        passf=new JPasswordField();
        passf.setBounds(100,210,290,30);
        passf.setFont(fieldFont);
        panel.add(passf);

        exit=new JButton("Exit");
        exit.setBounds(100,280,90,35);
        exit.setFont(btnFont);
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        exit.addMouseListener(this);
        exit.addActionListener(this);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exit.setFocusPainted(false);
        panel.add(exit);

        back=new JButton("Back");
        back.setBounds(200,280,90,35);
        back.setFont(btnFont);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.addMouseListener(this);
        back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFocusPainted(false);
        panel.add(back);

        login=new JButton("Login");
        login.setBounds(300,280,90,35);
        login.setFont(btnFont);
        login.setForeground(Color.BLACK);
        login.setBackground(Color.WHITE);
        login.addMouseListener(this);
        login.addActionListener(this);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
		login.setFocusPainted(false);
        panel.add(login);

        img=new ImageIcon("Images/Admin-Login.png");
        imgLabel=new JLabel(img);
        imgLabel.setBounds(460,90,200,200);
        panel.add(imgLabel);


        this.add(panel);
    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}

    public void mouseEntered(MouseEvent me) {
        if(me.getSource()==login)
        {
            login.setBackground(loginCol);
            login.setForeground(Color.WHITE);
        }
        else if(me.getSource()==exit)
        {
            exit.setBackground(exitCol);
            exit.setForeground(Color.WHITE);
        }
        else if(me.getSource()==back)
        {
            back.setBackground(btnCol);
            back.setForeground(Color.WHITE);
        }
    
    }
    public void mouseExited(MouseEvent me) {

        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            String t1, t2;
            t1 = namef.getText();
            t2 = passf.getText();

            if(t1.isEmpty() == true || t2.isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Please fill out all fields.", "WARNING!", JOptionPane.WARNING_MESSAGE);
			}
            else{
                AdminAccount adAcc = new AdminAccount(t1, t2);
                if(adAcc.checkAccount() == true){
                    JOptionPane.showMessageDialog(this, "Login Successfull, press OK", "WELCOME", JOptionPane.INFORMATION_MESSAGE);
                    
                    AdminPanel adpan = new AdminPanel();
                    adpan.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    
                }
            }
        }
        else if(ae.getSource() == back){
            GetStarted gs = new GetStarted();
            gs.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == exit){
            this.setVisible(false);
        }
    }
}