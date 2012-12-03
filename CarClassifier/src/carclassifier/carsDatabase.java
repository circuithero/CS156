/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carclassifier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Creates and manages a connection to the cars database.
 * 
 * @author Danny Ng
 */
public class carsDatabase {
    private Connection con;
    private Statement statement;
    
    public carsDatabase(String connection, String user, String password) {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(connection, user, password);
            statement = con.createStatement();
            System.out.println("Connected to database!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    /**
     * get the database connection object.
     */
    public Connection getDBConnection() {
        return this.con;
    }
    
    public void disconnectFromDB() {
        try {
            con.close();
            System.out.println("Disconnected from database!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
