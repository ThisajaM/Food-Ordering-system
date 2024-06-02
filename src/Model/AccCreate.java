package Model;

import View.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AccCreate 
{
    public void CreateAcc(String Fname, String genders, String dobText, String Add, int PNumText, String Email, String Uname, String Pass)
    {
        try
        {
        Statement st=MyDBConn.getMyDBCon().createStatement();
        int count=st.executeUpdate("insert into CustomerD(CFullName,CGender,CDateOfBirth,CAddress,CTelNumber,CEmail,CUserName,CPassword)values('"+Fname+"','"+genders+"','"+dobText+"','"+Add+"','"+PNumText+"','"+Email+"','"+Uname+"','"+Pass+"')");
        if (count > 0)
        {
            JOptionPane.showMessageDialog(null, "Account created successfully");
            
            LoginView LV=new LoginView();
            LV.setVisible(true); 
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Username you Entered already taken.Please try again");
            
            CreateAccView CV=new CreateAccView();
            CV.setVisible(true); 
        }
    }
}
