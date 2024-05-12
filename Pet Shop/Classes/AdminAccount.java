package Classes;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import Frames.*;

public class AdminAccount {
    private String name, pass;

    public AdminAccount(){}

    public AdminAccount(String name, String pass){
        this.name = name;;
        this.pass = pass;
    }

    public void addAccount(){
        try{
            File file = new File(".\\Data\\Admin Data.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("======================================================");
            pw.println("\t\t### Pet Shop Admin Data ###");
            pw.println("======================================================");
            pw.println("User Name : " + name);               
            pw.println("Password : " + pass);            
            pw.println("======================================================");

            pw.flush();
            pw.close();
            bw.close();
            fw.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    public boolean checkAccount(){
        boolean flag = false;

        try{
            String txtName = "User Name : " + name;
            String txtPass = "Password : " + pass;
            BufferedReader reader = new BufferedReader(new FileReader(".\\Datas\\Admin Data.txt"));

            int lineCount = 0;
            while(reader.readLine() != null){
                lineCount++;
            }
            reader.close();

            for(int i=0 ; i <= lineCount ; i++){
                String userName = Files.readAllLines(Paths.get(".\\Datas\\Admin Data.txt")).get(i);

                if(userName.equals(txtName) == true){
                    String userPass = Files.readAllLines(Paths.get(".\\Datas\\Admin Data.txt")).get(i+1);

                    if(userPass.equals(txtPass) == true){
                        flag = true;
                        break;
                    }
                }
            }
        }
        catch(Exception ex){
            showMessageDialog(null, "Wrong username or password!", "ERROR!", ERROR_MESSAGE);
        }

        return flag;
    }
}