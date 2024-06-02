package Controller;

import Model.*;
import java.sql.SQLException;

public class Order 
{
    public void Order(String CusName,String OrdAdd,int OPNum,String Total,String pay,String CardHoldName,String CardNum,String Date,String Uname) throws SQLException
    {
        AccOrder accO=new AccOrder();
        accO.Order(CusName,OrdAdd,OPNum,Total,pay,CardHoldName,CardNum,Date,Uname);
    }
}
