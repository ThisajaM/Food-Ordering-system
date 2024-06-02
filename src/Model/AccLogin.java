package Model;

import View.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class AccLogin 
{
    public void loginAcc(String Uname,String Pass) throws SQLException
    {
        Statement st=MyDBConn.getMyDBCon().createStatement();
        String sql="select CID from CustomerD where CUserName='"+Uname+"' and CPassword='"+Pass+"' ";
        ResultSet rs=st.executeQuery(sql);
        if(rs.next())
        { 
           HomeView HV = new HomeView();
           HV.labUname.setText(Uname);
           HV.setVisible(true);  
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Username and Password"); 
            
            LoginView LV=new LoginView();
        }
    }
}
