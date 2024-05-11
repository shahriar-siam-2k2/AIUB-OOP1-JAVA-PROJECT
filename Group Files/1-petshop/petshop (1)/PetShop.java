import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
public class PetShop extends JFrame{
	JPanel panel;
	JPanel label;
	JLabel wlc;
	ImageIcon logo;
	JLabel logolabel;
	JButton exit;
	JButton cont;
	JButton next;
	Color colour;
	Font myfont;
	
	public PetShop(){
		super("Get Started");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		colour=new Color(255,242,223);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(colour);
		this.add(panel);
		
		logo=new ImageIcon("petshoplogo.jpg");
		logolabel=new JLabel(logo);
		logolabel.setBounds(215,0,450,300);
		panel.add(logolabel);
		
		wlc=new JLabel("Welcome to our new Pet Shop!");
		wlc.setBounds(325,300,300,30);
		myfont=new Font("Calibri",Font.BOLD,18);
		wlc.setFont(myfont);
		panel.add(wlc);
		
		next=new JButton("Get Started");
		next.setBounds(225,375,450,30);
		next.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		next.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		next.setFont(myfont);
		panel.add(next);
		
		cont=new JButton("Contribution");
		cont.setBounds(225,420,450,30);
		cont.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		cont.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		cont.setFont(myfont);
		panel.add(cont);
		
		exit=new JButton("Exit");
		exit.setBounds(225,465,450,30);
		exit.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		exit.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		exit.setFont(myfont);
		panel.add(exit);
	}
}