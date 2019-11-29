package com.example.springb.rnehave;
import java.sql.*;
import java.util.*;

public class Databaseforbindelse
{

    private Statement stmt;

    public Databaseforbindelse() throws Exception
    //public Databaseforbindelse()
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection forb = DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.cv.ihk.dk:1521:student","brugernavn","kode");
        stmt = forb.createStatement();
    }
    //  SE: https://javabog.dk/OOP/kapitel20.jsp
}
