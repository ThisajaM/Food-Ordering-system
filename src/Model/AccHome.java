package Model;

import View.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AccHome 
{
    public void AddCart(String Item,int qty,int total,String Uname) throws SQLException
    {
        Statement st=MyDBConn.getMyDBCon().createStatement();
        int count=st.executeUpdate("insert into Cart(Username,ItemName,ItemQty,ItemPrice)values('"+Uname+"','"+Item+"','"+qty+"','"+total+"')");
        if (count > 0)
        {
            JOptionPane.showMessageDialog(null, "Item added to cart");
            
            HomeView HV = new HomeView();
            HV.labUname.setText(Uname);
            HV.setVisible(true);
        }
    }
}
