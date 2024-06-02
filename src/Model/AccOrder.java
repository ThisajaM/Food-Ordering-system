package Model;

import View.HomeView;
import java.sql.*;
import javax.swing.JOptionPane;

public class AccOrder 
{
    public void Order(String CusName,String OrdAdd,int OPNum,String Total,String pay,String CardHoldName,String CardNum,String Date,String Uname)
    {
        try
        {
        Statement st=MyDBConn.getMyDBCon().createStatement();
        int count=st.executeUpdate("insert into OrderD (OCusName,OAddress,OTelNum,OTotalPrice,OPayType,OCardHolName,OCardNum,Date) values('"+CusName+"','"+OrdAdd+"','"+OPNum+"','"+Total+"','"+pay+"','"+CardHoldName+"','"+CardNum+"','"+Date+"')");
        if (count > 0)
        {
            Statement st1=MyDBConn.getMyDBCon().createStatement();
            String sql = "DELETE FROM Cart WHERE Username='"+Uname+"'";
            
            st1.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Order Placed successfully"); 
            
            HomeView HV = new HomeView();
            HV.labUname.setText(Uname);
            HV.setVisible(true);
        }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
