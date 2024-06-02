package Controller;

import Model.*;
import java.sql.SQLException;

public class Edit 
{
    public void EditAcc(String Fname, String Add, int PNum, String Email, String Pass,String Uname) throws SQLException
    {
        AccEdit accE=new AccEdit();
        accE.EditAcc(Fname,Add,PNum,Email,Pass,Uname);
    }
}
