package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class recoveryC extends JFrame implements MouseListener, ActionListener {

    JLabel main,body,code,imglable;
    JPanel panel;
    JTextField codef;
    JButton send,submit;
    Color pc,btc,btc2, hovCol;
    Font f1,f2,f3;
    ImageIcon img;

    ForgotPass fpass;

    private String name;
    private String recovery;
    private int method;

    public recoveryC(String name, String recovery, int method, ForgotPass fpass)
    {
      super("Password Recovery");
      this.setSize(900,450);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
		this.setLocationRelativeTo(null);

      this.fpass = fpass;
      this.recovery = recovery;
      this.method = method;
      this.name = name;

      f1=new Font("Segoe UI",Font.BOLD,32);
      f2=new Font("Segoe UI",Font.PLAIN,18);
      f3=new Font("Segoe UI",Font.BOLD,18);

      pc=new Color(255,242,223);
      btc=new Color(61,35,20);
      btc2=new Color(81,188,86);
      hovCol = new Color(241,146,26);

      panel=new JPanel();
      panel.setLayout(null);
      panel.setBackground(getForeground());
      panel.setBackground(pc);
      this.add(panel);

      main=new JLabel("Enter Recovery Code");
      main.setForeground(btc);
      main.setBounds(270,10,500,40);
      main.setFont(f1);
      panel.add(main);

      body=new JLabel();
      if(method == 1){
            int len;
            String email = recovery;
            String split[] = email.split("@");
            String hiddenEmail, hiddenPart, localPart, domainPart;

            localPart = split[0];
            domainPart = split[1];

            len = localPart.length();
            hiddenPart = localPart.substring(0, 3) + "*****" + localPart.substring(len - 3);
            hiddenEmail = hiddenPart + "@" + domainPart;

            body.setText("Enter the verification code we sent to your email " + hiddenEmail + " to recover your password.");
            body.setBounds(50,110,850,30);
      }
      else if(method == 2){
            body.setText("Enter the verification code we sent to your phone number " + recovery.substring(0, 3) + "******" + recovery.substring(9, 11) + " via sms.");
            body.setBounds(130,110,850,30);
      }
      body.setForeground(btc);
      body.setFont(f2);
      panel.add(body);

      code=new JLabel("Enter Your Code");
      code.setBounds(275,210,150,30);
      code.setForeground(btc);
      code.setFont(f3);
      panel.add(code);

      codef=new JTextField();
      codef.setBounds(420,210,150,30);
      codef.setFont(f2);
      panel.add(codef);

      send=new JButton("Send Code Again");
      send.setBounds(220,330,190,33);
      send.setFont(f3);
      send.setBackground(btc);
      send.setForeground(Color.WHITE);
      send.setCursor(new Cursor(Cursor.HAND_CURSOR));
      send.setFocusPainted(false);
      send.addMouseListener(this);
      send.addActionListener(this);
      panel.add(send);

      submit=new JButton("Submit");
      submit.setBounds(465,330,190,33);
      submit.setForeground(Color.WHITE);
      submit.setBackground(btc2);
      submit.setFont(f3);
      submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
      submit.setFocusPainted(false);
      submit.addMouseListener(this);
      submit.addActionListener(this);
      panel.add(submit);
    }
 
    public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {
    if(e.getSource()==send)
    {
        send.setBackground(hovCol);
        send.setForeground(Color.WHITE);
    }
    else if(e.getSource()==submit)
    {
        submit.setBackground(Color.WHITE);
        submit.setForeground(btc2);
    }
 }
 public void mouseExited(MouseEvent e) {

    send.setBackground(btc);
    send.setForeground(Color.WHITE);

    submit.setBackground(btc2);
    submit.setForeground(Color.WHITE);
 }

 public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == send){
            JOptionPane.showMessageDialog(this, "Code Sent!", "Code Sent", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(ae.getSource() == submit){
            if(codef.getText().isEmpty() == true){
				JOptionPane.showMessageDialog(this, "Enter verification code.", "Empty Field", JOptionPane.WARNING_MESSAGE);
			}
			else if (!codef.getText().matches("\\d+")) {
				JOptionPane.showMessageDialog(this, "Verification code should contain only numbers!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
			}
            else {
                Recover rec = new Recover(name, this);
                this.setVisible(false);
                rec.setVisible(true);
            }
        }
    }
    
}
