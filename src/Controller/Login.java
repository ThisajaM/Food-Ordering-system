package Controller;

import java.sql.SQLException;
import Model.*;

public class Login 
{
    public void loginAcc(String Uname,String Pass) throws SQLException
    {
        AccLogin  AccLog=new AccLogin();
        
        AccLog.loginAcc(Uname,Pass);
    }
}
