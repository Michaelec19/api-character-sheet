package com.michaelec19.api_character_sheet.db;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Integration Test for DBConnection.
 * WARNING: These tests require a running MySQL server.
 * with the 'dnd_db' database and correct credentials defined in DBConnection.java.
 * @author Michaelec19
 * @since 1.0
 */
public class DBConnectionTest {

    /**
     * Test Case 1: Verifies that a successful connection.
     */
    @Test
    @SuppressWarnings("CallToPrintStackTrace")
    public void testSuccessfulConnection() {
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            assertNotNull("The connection object should not be null.", connection);
            if (connection.isClosed()) {
                fail("The connection was invalid.");
            }

        } catch (SQLException e) {
            System.err.println("INTEGRATION TEST WARNING: CONNECTION FAILED");
            System.err.println("Not establish connection, check MySQL server status and credentials.");
            System.err.println("Error: " + e.getMessage());
            fail("Failed to connect to the database. Error: " + e.getMessage());
            
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}