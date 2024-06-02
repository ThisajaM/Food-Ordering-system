package Controller;

import Model.*;
import java.sql.SQLException;

public class Home 
{
    public void AddCart(String Item,int qty,int total,String Uname) throws SQLException
    {
        AccHome accH=new AccHome();
        accH.AddCart(Item,qty,total,Uname);
    }
}
