package Model;

import View.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AccEdit 
{
    public void EditAcc(String Fname, String Add, int PNum, String Email, String Pass, String Uname) throws SQLException
    {
        Statement st=MyDBConn.getMyDBCon().createStatement();
        st.executeUpdate("UPDATE CustomerD SET CFullName = '" + Fname + "', CAddress = '" + Add + "', CTelNumber = '" + PNum + "', CEmail = '" + Email + "', CPassword = '" + Pass + "' WHERE CUserName = '" +Uname+ "'");
     
        JOptionPane.showMessageDialog(null, "Account details changed successfully");
            
        HomeView HV = new HomeView();
        HV.labUname.setText(Uname);
        HV.setVisible(true); 
    }
}
