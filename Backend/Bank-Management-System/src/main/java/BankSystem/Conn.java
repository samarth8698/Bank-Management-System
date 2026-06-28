package BankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conn 
{
    Connection connection;
    Statement statement;
    public Conn()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Mysql");
            statement = connection.createStatement();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}