package Controller;

import java.sql.SQLException;
import Model.*;

public class Account 
{
    public void CreateAcc(String Fname,String genders,String dobText,String Add,int PNumText,String Email,String Uname,String Pass) throws SQLException
    {
        AccCreate accC=new AccCreate();
        accC.CreateAcc(Fname,genders,dobText,Add,PNumText,Email,Uname,Pass);
    }
}
