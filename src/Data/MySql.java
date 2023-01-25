package Data;

import Data.interfaces.IDB;

import java.sql.*;

public class MySql implements IDB {


    public void getConnection(){
        try {
            // Step 1: Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create a connection to the MySQL database
            String url = "jdbc:mysql://host:port/database";
            String username = "username";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create a Statement object
            Statement statement = connection.createStatement();

            // Step 4: Execute the query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM table_name");

            // Step 5: Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("column_name"));
            }

            // Step 6: Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
