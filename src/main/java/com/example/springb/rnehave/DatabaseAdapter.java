package com.example.springb.rnehave;
import java.sql.*;

public class DatabaseAdapter {
    public static Connection getConnection() {
     //   public String getConnection() {

            try {
          String url = "jdbc:mysql://localhost:8081/KEA";
          String username = "root";
          String password = "rootkode";

            Connection conn = DriverManager.getConnection(url, username, password);

            System.out.println("Connection er lykkedes");
            return conn;
         } catch (Exception e) {
                 System.out.println("Connection fejlede " + e);
        }


        return null;
    }
     /*
    public static void insertData(Connection conn, int postNr, String byNavn) {
           try {
       PreparedStatement statement = conn.preparedStatement(sql, "INSERT INTO indhold VALUES('"+ postNr + "' + byNavn + "')");
        statement.execute();
        System.out.println(byNavn + " lagt til databasen");
        } catch (SQLException e) {
            System.out.println(e);
        }
     }
     /*
     andre statement jeg måske kan bruge: Class.forName("com.mysql.jdbc.Driver");

                                          Connection forb = DriverManager.getConnection(
                                         "jdbc:mysql://localhost/test?user=bruger&password=ak");
    */

}
