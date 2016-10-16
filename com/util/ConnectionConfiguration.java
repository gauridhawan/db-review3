package com.util;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by GAURI DHAWAN on 9/3/2016.
 */
public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection connection = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gauri", "root", "gauridhawan22");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
