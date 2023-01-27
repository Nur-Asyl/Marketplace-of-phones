package Data;

import Data.interfaces.IDB;

import java.sql.*;

public class MySql implements IDB {


    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:mysql://localhost:2077/Users";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "MySQL", "root");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
