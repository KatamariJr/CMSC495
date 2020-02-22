/*
 *This class has the create, insert, and select statements
 *used to instantiate the tables in the database.
 */
package com.cmsc495.spacesim.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Tom Helfrich
 */
public class AppDB {
    private static final String url = "jdbc:sqlite:test9.db";
    
    public AppDB(){
        
    }
    //method for creating database
    public static void createDatabase(){
        //String url = "jdbc:sqlite:test8.db";
        
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
    
    //Method for connecting to database
    private Connection connect() {
      
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    //method for creating Planet table
    public static void createPlanetTable(){
        //Database connection string
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
    
    //Method for inserting rows into Planet table
    public void insertPlanet(int planetId, float distance, String name) {
        String sql = "INSERT INTO planet(planetID,distance,name) VALUES(?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, planetId);
            pstmt.setFloat(2, distance);
            pstmt.setString(3, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //Method for deleting rows in Planet table
    public void deletePlanet(int id) {
        String sql = "DELETE FROM planet WHERE id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //Method for creating Ship table
    public static void createShipTable(){
        //Database connection string
        
        //SQL statement for creating Ship table
        String sql = "CREATE TABLE IF NOT EXISTS ship (\n"
                + "   shipID integer PRIMARY KEY,\n"
                + "   fuelCapacity integer,\n"
                + "   cargoCapacity integer,\n"
                + "   peopleCapacity integer,\n"
                + "   shipSize text NOT NULL,\n"
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
    //Method for inserting rows into Ship table
    public void insertShip(int shipId, int fuelCapacity, int cargoCapacity, int peopleCapacity, String shipSize, String name) {
        String sql = "INSERT INTO ship(shipID,fuelCapacity,cargoCapacity,peopleCapacity,shipSize,name) VALUES(?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, shipId);
            pstmt.setInt(2, fuelCapacity);
            pstmt.setInt(3, cargoCapacity);
            pstmt.setInt(4, peopleCapacity);
            pstmt.setString(5, shipSize);
            pstmt.setString(6, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    //Method for deleting rows in ship table
    public void deleteShip(int id) {
        String sql = "DELETE FROM ship WHERE id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //Method for creating Identifiers table
    public static void createIdentifiersTable(){
        //Database connection string
        //String url = "jdbc:sqlite:test8.db";
        //SQL statement for creating person table
        String sql = "CREATE TABLE IF NOT EXISTS Identifiers (\n"
                + "   id integer PRIMARY KEY,\n"
                + "   type text NOT NULL,\n"
                + "   value text NOT NULL\n "
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            //create Person table
            stmt.execute(sql);
            //System.out to see if table was created
            System.out.println("Identifiers table created.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //Method for inserting rows into Identifiers table
    public void insertIdentifier(int id, String type, String value) {
        String sql = "INSERT INTO Identifiers(id,type,value) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, type);
            pstmt.setString(3, value);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    //Method for deleting rows in Identifiers table
    public void deleteIdentifier(int id) {
        String sql = "DELETE FROM Identifiers WHERE id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //method for selecting all planet
    public void selectAllPlanets(){
        String sql = "SELECT planetID, distance, name FROM planet";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            if(rs.next()== false){
                System.out.println("ResultSet is empty");
            }else{
            while (rs.next()) {
                System.out.println(rs.getInt("planetID") +  "\t" + 
                                   rs.getFloat("distance") + "\t" +
                                   rs.getString("name"));
            }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //method for selecting all ships
    public void selectAllShips(){
        String sql = "SELECT shipID, fuelCapacity, cargoCapacity, peopleCapacity, shipSize, name FROM ship";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            if(rs.next()== false){
                System.out.println("ResultSet is empty");
            }else{
            while (rs.next()) {
                System.out.println(rs.getInt("shipID") +  "\t" + 
                                   rs.getInt("fuelCapacity") +  "\t" + 
                                   rs.getInt("cargoCapacity") +  "\t" + 
                                   rs.getInt("peopleCapacity") +  "\t" + 
                                   rs.getString("shipSize") + "\t" +
                                   rs.getString("name"));
            }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //method for selecting all persons
    public void selectAllIdentifiers(){
        String sql = "SELECT id, type, value FROM Identifiers";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            if(rs.next()== false){
                System.out.println("ResultSet is empty");
            }else{
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("type") + "\t" + 
                                   rs.getString("value"));
            }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
    }
    
    //main method for testing
    public static void main(String[] args){
        AppDB test = new AppDB();
        test.connect();
        test.createPlanetTable();
        test.insertPlanet(1, 1000, "Mars");
        test.insertPlanet(2, 10000, "Venus");
        test.insertPlanet(3, 100000, "Saturn");
        test.selectAllPlanets();   
        test.createShipTable();
        test.insertShip(1, 100, 10, 10, "Small", "Explorer");
        test.insertShip(2, 10000, 100, 100, "Medium", "Discoverer");
        test.insertShip(3, 10000000, 1000, 1000, "Large", "Cruiser");
        test.selectAllShips();
        test.createIdentifiersTable();
        test.insertIdentifier(1, "name", "Bob");
        test.insertIdentifier(2, "resource", "food");
        test.insertIdentifier(3, "skill", "medic");
        test.selectAllIdentifiers();
        
        
    }
}
