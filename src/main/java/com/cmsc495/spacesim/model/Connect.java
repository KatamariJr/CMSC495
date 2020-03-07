/*
 * Create the SQLite database and establish the connection.
 * Includes System.out statements for debuggins that need to be 
 * commented out at a later time
 */
package com.cmsc495.spacesim.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tom Helfrich
 */
public class Connect {
    String url = "jdbc:sqlite:test21.db";
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
    public ArrayList getShip(String condition){
        ArrayList<Ship> ships = new ArrayList<>();
        try{
            // It may be beneficial to create a connect variable to be used by all methods
            Statement stmt = conn.createStatement(); 
            ResultSet result = stmt.executeQuery("SELECT * FROM ship WHERE shipSize='" + condition +"'");
            while(result.next()){
                Ship tempShip = new Ship();
                tempShip.setName(result.getString("name"));
                tempShip.setFuelCapacity(result.getInt("fuelCapacity"));
                tempShip.setCargoCapacity(result.getInt("cargoCapacity"));
                tempShip.setPeopleCapacity(result.getInt("peopleCapacity"));
                tempShip.setShipSize(result.getString("shipSize"));
                ships.add(tempShip);         
            }
        }catch(SQLException sqlE){
            System.out.println(sqlE.getMessage());
        }
        return ships;
    }
    
    // retrieve a list of planets based on distance from earth
    public ArrayList getPlanet(float distance){
        ArrayList<Planet> planets = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM planet WHERE distance <= " + distance );
            while(result.next()){
                planets.add( new Planet(result.getString("name"), result.getFloat("distance")));   
            }
        }catch(SQLException sqlE){
            System.out.println(sqlE.getMessage());
        }
        return planets;
    }
    
    // retrieve a list based on the type from the database
    public ArrayList getIdentifier(String type){
        ArrayList<String> list = new ArrayList<>();
        try{
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM Identifiers WHERE type ='" + type + "'");
            while(result.next()){
                list.add(result.getString("value"));         
            }
        }catch(SQLException sqlE){
            System.out.println(sqlE.getMessage());
        }
        return list;
    }

    //main method to test database has been created; need to comment out later
    public static void main (String[]args){
        Connect test = new Connect();
        System.out.println(test.getIdentifier("resource"));
        System.out.println(test.getIdentifier("name"));
        System.out.println(test.getShip("Small"));
        System.out.println(test.getPlanet(10000));
    }
    
    
}
