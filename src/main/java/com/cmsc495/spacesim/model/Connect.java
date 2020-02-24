/*
 * Create the SQLite database and establish the connection.
 * Includes System.out statements for debuggins that need to be 
 * commented out at a later time
 */
package com.cmsc495.spacesim.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tom Helfrich
 */
public class Connect {
    String url = "jdbc:sqlite:test8.db";
    Connection conn = connect();
    
    private Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    
    // This method retrieves a ship list from a sql database
    // It is based on conditions present in the UI (most likely)
    // the ship size. If a user selects small ship, the condition is 
    // small, hopefully there is such a parameter in the table
    public ArrayList getShip(String condition) throws SQLException{
        ArrayList<Ship> ships = new ArrayList<>();
        // It may be beneficial to create a connect variable to be used by all methods
        Statement stmt = conn.createStatement(); 
        ResultSet result = stmt.executeQuery("SELECT * FROM Ships WHERE condition <= " + condition);
        while(result.next()){
            Ship tempShip = new Ship();
            tempShip.setName(result.getString("name"));
            tempShip.setfuelCapacity(result.getInt("FuelCapacity"));
            tempShip.setcargoCapacity(result.getInt("CargoCapacity"));
            tempShip.setpeopleCapacity(result.getInt("peopleCapacity"));
            ships.add(tempShip);         
        }
        return ships;
    }

    public ArrayList getPlanet(String condition) throws SQLException{
        ArrayList<Planet> planets = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Planets WHERE condition = " + condition);
        while(result.next()){
            Planet tempPlanet = new Planet();
            tempPlanet.setName(result.getString("name"));
            tempPlanet.setDistance(result.getFloat("distance"));
            planets.add(tempPlanet);   
        }
        return planets;
    }

    public ArrayList getIdentifier(String type) throws SQLException{
        ArrayList<String> list = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Identifiers WHERE type = " + type);
        while(result.next()){
            String text = "";
            text = result.getString("value");
            list.add(text);         
        }
        return list;
    }

    /*//main method to test database has been created; need to comment out later
    public static void main (String[]args){
       
    }
    */
    
}
