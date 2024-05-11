import java.lang.*;
import javax.swing.*; // javac *.java && java Start
import java.awt.*;
public class AdminPanel extends JFrame{
	JPanel panel;
	JLabel label;
	JLabel admin;
	ImageIcon logo;
	JLabel logolabel;
	JButton userdata;
	JButton chgpass;
	JButton exit;
	JButton back;
	Color colour;
	Font myfont;
	
	public AdminPanel(){
		super("Admin Panel");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		colour=new Color(255,242,223);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(colour);
		this.add(panel);
		
		logo=new ImageIcon("adminpanellogo.png");
		logolabel=new JLabel(logo);
		logolabel.setBounds(550,0,300,300);
		panel.add(logolabel);
		
		admin=new JLabel("Admin Panel");
		admin.setBounds(100,120,600,100);
		myfont=new Font("Calibri",Font.BOLD,70);
		admin.setFont(myfont);
		panel.add(admin);
		
		userdata=new JButton("User Data");
		userdata.setBounds(170,350,260,50);
		userdata.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		userdata.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		userdata.setFont(myfont);
		panel.add(userdata);
		
		chgpass=new JButton("Change Password");
		chgpass.setBounds(450,350,260,50);
		chgpass.setForeground(Color.WHITE);
		colour=new Color(241,146,26);
		chgpass.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		chgpass.setFont(myfont);
		panel.add(chgpass);
		
		exit=new JButton("Exit");
		exit.setBounds(170,420,260,50); //(450,450,260,30);
		exit.setForeground(Color.BLACK);
		colour=new Color(241,146,26);
		exit.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		exit.setFont(myfont);
		exit.setOpaque(false);
		panel.add(exit);
		
		back=new JButton("Back");
		back.setBounds(450,420,260,50); //(450,450,260,30);
		back.setForeground(Color.BLACK);
		colour=new Color(241,146,26);
		back.setBackground(colour);
		myfont=new Font("Calibri",Font.BOLD,20);
		back.setOpaque(false);
		back.setFont(myfont);
		panel.add(back);
	}
}