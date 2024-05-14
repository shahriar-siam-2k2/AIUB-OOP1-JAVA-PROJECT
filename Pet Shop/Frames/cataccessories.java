package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cataccessories extends JFrame implements MouseListener, ActionListener{

    JLabel name1,pass,wel,imglable,forgotPasswordLabel;
    JPanel panel;
   
    
    JButton b1,b2,b3,b4,b5,b6,back,exit;
    Font f1,bf;
    Color c1,c2,c3;
    ImageIcon img,img1,img2,img3,img4,img5;
   

    

    public cataccessories()
    {
        super("Pet Shop");
        this.setSize(900,600);
        this.setLocationRelativeTo(null);

        f1=new Font("Segoe UI",Font.BOLD,32);
        bf=new Font("Arial Black",Font.BOLD,15);
        c1=new Color(255,242,223);
        c2=new Color(241,146,26);
        c3=new Color(61,35,20);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(c1);
        this.add(panel);

        wel=new JLabel("Cat Accessories ");
        wel.setBounds(330,0,600,95);
        wel.setForeground(c3);
        wel.setFont(f1);
        panel.add(wel);

        b1=new JButton();

        img=new ImageIcon("Images/MeowMixDryCatFood.jpg");

        img1=new ImageIcon("Images/catproduct01.jpg");

        img2=new ImageIcon("Images/catplayingtoy.jpg");

        img3=new ImageIcon("Images/catneckbelt.jpg");

        img4=new ImageIcon("Images/CatECollarSunflower.jpg");

        img5=new ImageIcon("Images/CatBag.jpg");


        b1=new JButton(img);
        b1.setBounds(90,110,150,150);
        b1.setBackground(null);
        b1.addActionListener(this);
        panel.add(b1);

        name1=new JLabel("CatFood");
        name1.setBounds(105,260,100,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 200 Tk");
        name1.setBounds(99,277,150,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        b2=new JButton(img1);
        b2.setBounds(320,110,150,150);
        b2.setBackground(null);
        b2.addActionListener(this);
        panel.add(b2);

        name1=new JLabel("Cat Belt");
        name1.setBounds(340,260,100,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 460 Tk");
        name1.setBounds(335,277,110,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        b3=new JButton(img2);
        b3.setBounds(550,110,150,150);
        b3.setBackground(null);
        b3.addActionListener(this);
        panel.add(b3);

        name1=new JLabel("Cat Toy");
        name1.setBounds(575,260,100,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 280 Tk");
        name1.setBounds(571,277,110,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        b4=new JButton(img3);
        b4.setBounds(90,320,150,150);
        b4.setBackground(null);
        b4.addActionListener(this);
        panel.add(b4);

        name1=new JLabel("Cat ornaments ");
        name1.setBounds(105,470,140,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 900 Tk");
        name1.setBounds(110,487,140,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        b5=new JButton(img4);
        b5.setBounds(320,320,150,150);
        b5.setBackground(null);
        b5.addActionListener(this);
        panel.add(b5);

        name1=new JLabel("Cat-ECollar");
        name1.setBounds(340,470,100,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 700 Tk");
        name1.setBounds(335,487,110,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        b6=new JButton(img5);
        b6.setBounds(570,320,150,150);
        b6.setBackground(null);
        b6.addActionListener(this);
        panel.add(b6);

        name1=new JLabel("Cat Bag");
        name1.setBounds(575,470,100,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

        name1=new JLabel("Price 800 Tk");
        name1.setBounds(575,487,110,30);
        name1.setForeground(c3);
        name1.setFont(bf);
        panel.add(name1);

      

        back=new JButton("Back");
        back.setBounds(710,530,80,30);
        back.setBackground(c2);
        back.setFont(bf);
        back.setForeground(Color.WHITE);
        back.addMouseListener(this);
        back.addActionListener(this);
        panel.add(back);

        exit=new JButton("Exit");
        exit.setBounds(800,530,80,30);
        exit.setBackground(c2);
        exit.setFont(bf);
        exit.setForeground(Color.WHITE);
        exit.addMouseListener(this);
        back.addActionListener(this);
        panel.add(exit);
    }
   
    public void mouseClicked(MouseEvent e) { }
    
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==back)
        {
            back.setBackground(c3);
            
        }
        else if(e.getSource()==exit)
        {
            exit.setBackground(c3);
        }
       
    }
   
    public void mouseExited(MouseEvent e) {
        back.setBackground(c2);
        exit.setBackground(c2);
       
    }
   
    public void mousePressed(MouseEvent e) {}
   
    public void mouseReleased(MouseEvent e) { }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            CatProduct1 c1 = new CatProduct1();
            c1.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b2){
            CatProduct2 c2 = new CatProduct2();
            c2.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b3){
            CatProduct3 c3 = new CatProduct3();
            c3.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b4){
            CatProduct4 c4 = new CatProduct4();
            c4.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b5){
            CatProduct5 c5 = new CatProduct5();
            c5.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == b6){
            CatProduct6 c6 = new CatProduct6();
            c6.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == back){
            PetSelect ps = new PetSelect();
            ps.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == exit){
            this.setVisible(false);
        }
    }
    
}
