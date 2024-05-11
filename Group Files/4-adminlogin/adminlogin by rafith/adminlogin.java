import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute;

public class adminlogin extends JFrame implements MouseListener{

    JLabel adminlog,name,pass,imgLabel;
        JTextField namef;
        JPasswordField passf;
        JButton exit,login,back;
        JPanel panel;
        Color bgc,col,col2;
        Font mf1,mf2,mf3;
        ImageIcon img;
        

        
    public adminlogin()
    {
        super("Pet Shop");
        this.setSize(750,400);
        this.setLocationRelativeTo(null);
      
        bgc=new Color(255, 242, 223);
        col=new Color(241,146,26);
        col2=new Color(61,35,20);
        mf1=new Font("Arial Black",Font.BOLD,32);
        mf2=new Font("Serif Bold",Font.BOLD,25);
        mf3=new Font("Arial Black",Font.BOLD,14);
    

        panel=new JPanel();
        panel.setLayout(null);
       panel.setBackground(bgc);
        

        adminlog=new JLabel("Admin Login");
        adminlog.setBounds(240,0,350,65);
        adminlog.setFont(mf1);
        adminlog.setForeground(col2);
        panel.add(adminlog);

        name=new JLabel("Name ");
        name.setBounds(100,103,100,75);
        name.setForeground(col);
        name.setFont(mf2);
        panel.add(name);

        namef=new JTextField();
        namef.setBounds(225,120,210,33);
        panel.add(namef);

        pass=new JLabel("Password");
        pass.setBounds(100,160,160,55);
        pass.setFont(mf2);
        pass.setForeground(col);
        panel.add(pass);

        passf=new JPasswordField();
        passf.setBounds(225,170,210,30);
        panel.add(passf);


        login=new JButton("Login");
        login.setBounds(95,300,90,35);
        login.setFont(mf3);
        login.setForeground(Color.BLACK);
        login.setBackground(Color.white);
        login.addMouseListener(this);
        panel.add(login);

        exit=new JButton("Exit");
        exit.setBounds(200,300,90,35);
        exit.setFont(mf3);
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.white);
        exit.addMouseListener(this);
        panel.add(exit);

        back=new JButton("Back");
        back.setBounds(300,300,90,35);
        back.setFont(mf3);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.white);
        back.addMouseListener(this);
        panel.add(back);
        
        img=new ImageIcon("vecteezy_silhouette-of-businessman-standing-with-folded-arms_19045392.png");
        imgLabel=new JLabel(img);
        imgLabel.setBounds(520,90,200,300);
       panel.add(imgLabel);

       



        this.add(panel);
       
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==login)
        {
            login.setBackground(col2);
            login.setForeground(Color.white);
        }
        else if(e.getSource()==exit)
        {
            exit.setBackground(col2);
            exit.setForeground(Color.white);
        }
        else if(e.getSource()==back)
        {
            back.setBackground(col2);
            back.setForeground(Color.white);
        }
    
    }
    @Override
    public void mouseExited(MouseEvent e) {

        login.setBackground(Color.white);
        login.setForeground(Color.black);
       exit.setBackground(Color.white);
        exit.setForeground(Color.black);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        
    }
@Override
public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub
    
}
@Override
public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub
    
}
    
}