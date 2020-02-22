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
    
    //Create new database
    public static void createDatabase(){
        String url = "jdbc:sqlite:test.db";
        
        try(Connection conn = DriverManager.getConnection(url)){
            if(conn != null){
                 DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //method for creating Planet table
    public static void createPlanetTable(){
        //Database connection string
        String url = "jdbc:sqlite:test.db";
        //SQL statement for creating Planet table
        String sql = "CREATE TABLE IF NOT EXISTS planet (\n"
                + "   planetID integer PRIMARY KEY,\n"
                + "   distance float,\n"
                + "   name text NOT NULL\n "
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            //create Planet table
            stmt.execute(sql);
            //System.out to see if table was created
            System.out.println("Planet table created.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //Method for creating Ship table
    public static void createShipTable(){
        //Database connection string
        String url = "jdbc:sqlite:test.db";
        //SQL statement for creating Ship table
        String sql = "CREATE TABLE IF NOT EXISTS ship (\n"
                + "   shipID integer PRIMARY KEY,\n"
                + "   fuelCapacity integer,\n"
                + "   cargoCapacity integer,\n"
                + "   peopleCapacity integer,\n"
                + "   name text NOT NULL\n "
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            //create ship table
            stmt.execute(sql);
            //System.out to see if table was created
            System.out.println("Ship table created.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //Method for creating Person table
    public static void createPersonTable(){
        //Database connection string
        String url = "jdbc:sqlite:test.db";
        //SQL statement for creating person table
        String sql = "CREATE TABLE IF NOT EXISTS person (\n"
                + "   personID integer PRIMARY KEY,\n"
                + "   skill text NOT NULL,\n"
                + "   name text NOT NULL\n "
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            //create Person table
            stmt.execute(sql);
            //System.out to see if table was created
            System.out.println("Person table created.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //method for creating Skill table
    public static void createSkillTable(){
        //Database connection string
        String url = "jdbc:sqlite:test.db";
        //SQL statement for creating skill table
        String sql = "CREATE TABLE IF NOT EXISTS skill (\n"
                + "   skillID integer PRIMARY KEY,\n"
                + "   skill text NOT NULL\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            //create skille table
            stmt.execute(sql);
            //System.out to see if table was created
            System.out.println("Skill table created.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    // This method retrieves a ship list from a sql database
    // It is based on conditions present in the UI (most likely)
    // the ship size. If a user selects small ship, the condition is 
    // small, hopefully there is such a parameter in the table
    public ArrayList getShip(String condition) throws SQLException{
        ArrayList<Ship> ships = new ArrayList<>();
        // It may be beneficial to create a connect variable to be used by all methods
        Statement stmt = con.createStatement(); 
        ResultSet result = stmt.executeQuery("SELECT * FROM Ships WHERE condition <= " + condition);
        while(result.next()){
            Ship tempShip = new Ship();
            tempShip.setName(result.getString("name"));
            tempShip.setfuelCapacity(result.getInt("FuelCapacity"));
            tempShip.setcargoCapacity(result.getInt("CargoCapacity"));
            tempShip.setpeopleCapacity(result.getInt("peopleCapacity"));
            tempShip.setSpeed(result.getInt("speed"));
            ships.add(tempShip);         
        }
        return ships;
    }

    public ArrayList getPlanet(String condition){
        ArrayList<Planet> planets = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Planets WHERE condition = " + condition);
        while(result.next()){
            Planet tempPlanet = new Planet();
            tempPlanet.setName(result.getString("name"));
            tempPlanet.setDistance(result.getFloat("distance"));
            tempPlanet.setColonized(result.getBoolean("isColonized"));
            planets.add(tempPlanet);   
        }
        return planets;
    }

    public ArrayList getPerson(String condition){
        ArrayList<Person> person = new ArrayList<>();
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Person WHERE condition = " + condition);
        while(result.next()){
            Person tempPerson = new Person();
            tempPerson.setName(result.getString("name"));
            tempPerson.setSkill(result.getString("skill"));
            person.add(tempPerson);         
        }
        return person;

    }

    //main method to test database has been created; need to comment out later
    public static void main (String[]args){
        createDatabase();
        createPlanetTable();
        createShipTable();
        createPersonTable();
        createSkillTable();
    }
    
    
}
