package com.example.biblotek;

import java.sql.*;
import com.example.biblotek.DatabaseConnection;

public class DatabaseConnection {

    static String name = "";

    public static String connect() {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/TestBase"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "admin"; // Replace with your MySQL password

        // Establishing the connection
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Executing the query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            name = "";
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String fullName = firstName + " " + lastName;
                name += fullName + "\n";
            }

            // Don't forget to close the connection and result set when you're done
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
