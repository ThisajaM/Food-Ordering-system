package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConn 
{
    private static Connection con;
    
    public static Connection getMyDBCon()
    {
        try
        {
            String dbpath="jdbc:mysql://localhost:8889/Starbucks";
            con=DriverManager.getConnection(dbpath,"root","root");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        return con;
    }
}
