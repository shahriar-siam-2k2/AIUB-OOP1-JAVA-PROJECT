package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contribution extends JFrame implements MouseListener, ActionListenerS {

    JLabel main,body,code,imglable;
    JPanel panel;
    JPasswordField codef;
    JButton back,pay;
    Color pc,btc,btc2;
    Font f1,f2,f3;
    ImageIcon img;

    public contribution()
    {
      super("Pet shop ");
      this.setSize(750,500);
      this.setLocationRelativeTo(null);
      this.setResizable(false);

      f1=new Font("Segoe UI",Font.BOLD,32);
      
      btc=new Color(61,35,20);
   

      panel=new JPanel();
      panel.setLayout(null);
      panel.setBackground(getForeground());
      panel.setBackground(pc);
      this.add(panel);

      main=new JLabel("Contributions ");
      main.setForeground(btc);
      main.setBounds(230,1,450,30);
      main.setFont(f1);
      panel.add(main);

      body=new JLabel(" 1. J.M Shahriar Ali Siam");
      body.setBounds(120,52,850,30);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      
      body=new JLabel("ID: 23-53004-3");
      body.setBounds(130,83,850,30);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      
      body=new JLabel("2. Anirban Prottoy");
      body.setBounds(120,132,850,40);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      body=new JLabel("ID: 23-53005-3");
      body.setBounds(130,174,280,40);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      body=new JLabel(" 3. Md. Rafith Tarafder ");
      body.setBounds(120,230,850,35);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      body=new JLabel("ID: 23-53011-3 ");
      body.setBounds(130,270,850,30);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      body=new JLabel("4. Kotha Dhar");
      body.setBounds(120,330,850,38);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      body=new JLabel("ID: 23-53561-3");
      body.setBounds(130,370,850,30);
      body.setForeground(btc);
      body.setFont(f1);
      panel.add(body);

      

      back=new JButton("Back");
     back.setBounds(600,410,70,25);
      back.setFont(f3);
     back.setBackground(btc);
      back.setForeground(Color.WHITE);
      back.addMouseListener(this);
      panel.add(back);

   


    }
 
    public void mouseClicked(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {
    if(e.getSource()==back)
    {
        back.setBackground(Color.WHITE);
        back.setForeground(btc);
    }
    
 }
 public void mouseExited(MouseEvent e) {


    back.setBackground(btc);
    back.setForeground(Color.WHITE);
 }

 public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {
    }
    public action
    
}
