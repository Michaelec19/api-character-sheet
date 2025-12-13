package com.michaelec19.api_character_sheet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class to establish and manage the JDBC connection to the MySQL database.
 * This class is the backbone of the Data Persistence Layer.
 * @author Michaelec19
 * @since 2.0
 */
public class DBConnection {

    // Configuration of the jdbc connection
    
    // URL MySQL: jdbc:mysql://[host]:[port]/[database_name]
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dnd_db";
    
    // credentials
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Tauro519.";
    
    
    /**
     * Establishes and returns a connection to the MySQL database.
     * @return A Connection object to interact with the database.
     * @throws SQLException If a database access error occurs or the url is null.
     */
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found");
            e.printStackTrace();
            throw new SQLException("JDBC Driver not available", e);
        }

        System.out.println("Attempting to connect to database....");
        
        // The DriverManager use credentials to establish a connection
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        
        System.out.println("Connection successful");
        return connection;
    }
}