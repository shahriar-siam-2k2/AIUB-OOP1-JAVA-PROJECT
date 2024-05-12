package Classes;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

import Frames.*;

public class UserAccount {
    private String name, email, phn, pass, ques, ans;


    public UserAccount(){}

    public UserAccount(String name, String email, String phn, String pass, String ques, String ans){
        this.name = name;
        this.email = email;
        this.phn = phn;
        this.pass = pass;
        this.ques = ques;
        this.ans = ans;
    }

    public void addAccount(){
        try{
            File file = new File(".\\Data\\User Data.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm a");

            String td = date.format(dtFormat);

            pw.println("User Name : " + name);         
            pw.println("Email : " + email);       
            pw.println("Phone No : " + phn);       
            pw.println("Password : " + pass);       
            pw.println("Security Question : " + ques);           
            pw.println("Answer : " + ans);        
            pw.println("Time & Date : " + td);     
            pw.println("========================================================================");
            
            pw.close();
            bw.close();
            fw.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}