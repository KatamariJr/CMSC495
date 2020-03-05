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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author Tom Helfrich
 */
public class AppDB {
    private static final String url = "jdbc:sqlite:test21.db";
    
    public AppDB(){
        
    }
    //method for creating database
    public static void createDatabase(){
        
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
                + "   name text NOT NULL,\n"
                + "   distance float\n"
               // + "   name text NOT NULL\n "
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
    public void insertPlanet() {
        String sql = "INSERT INTO planet(name, distance) VALUES(?,?)";
        int batchSize = 3;
        
        try{
            Connection conn = this.connect();
            conn.setAutoCommit(false);
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            File file = new File("PlanetTest.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int count = 0;
            String line;
      
            while((line = reader.readLine()) != null){
                String[] s = line.split(",");
                String strName = s[0];
                String strDistance = s[1];
                
                pstmt.setString(1, strName);
                Float fDistance = Float.parseFloat(strDistance);
                pstmt.setFloat(2, fDistance);
                
                
                pstmt.addBatch();
                
                if(count % batchSize == 0){
                    pstmt.executeBatch();
                }
            }
            reader.close();
            pstmt.executeBatch();
            conn.commit();
            conn.close();
        }catch (IOException e){
                    e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
             
            }
        }
    
    //Method for deleting rows in Planet table
    public void deletePlanet(int strId) {
        String sql = "DELETE FROM planet WHERE planetId = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, strId);
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
                + "   name text NOT NULL,\n"
                + "   fuelCapacity integer,\n"
                + "   cargoCapacity integer,\n"
                + "   peopleCapacity integer,\n"
                + "   shipSize text NOT NULL\n"
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
    public void insertShip() {
        String sql = "INSERT INTO ship(name, fuelCapacity,cargoCapacity,peopleCapacity,shipSize) VALUES(?,?,?,?,?)";
 
        int batchSize = 3;
        
        try{
            Connection conn = this.connect();
            conn.setAutoCommit(false);
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            File file = new File("ShipTest.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int count = 0;
            String line;
      
            while((line = reader.readLine()) != null){
                String[] s = line.split(",");
                String strName = s[0];
                String strFuel = s[1];
                String strCargo = s[2];
                String strPeople = s[3];
                String strSize = s[4];
                
                pstmt.setString(1, strName);
                
                Integer sqlFuel = Integer.parseInt(strFuel);
                pstmt.setInt(2, sqlFuel);
                
                Integer sqlCargo = Integer.parseInt(strCargo);
                pstmt.setInt(3, sqlCargo);
                
                Integer sqlPeople = Integer.parseInt(strPeople);
                pstmt.setInt(4, sqlPeople);
                
                pstmt.setString(5, strSize);
                
                pstmt.addBatch();
                
                if(count % batchSize == 0){
                    pstmt.executeBatch();
                }
            }
            reader.close();
            pstmt.executeBatch();
            conn.commit();
            conn.close();
        }catch (IOException e){
                    e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
             
            }
    }
    //Method for deleting rows in ship table
    public void deleteShip(int strId) {
        String sql = "DELETE FROM ship WHERE shipId = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, strId);
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
                + "   Id integer PRIMARY KEY,\n"
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
    public void insertIdentifier() {
        String sql = "INSERT INTO Identifiers(type,value) VALUES(?,?)";
        int batchSize = 3;
        
        try{
            Connection conn = this.connect();
            conn.setAutoCommit(false);
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            File file = new File("IdentifierTest.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int count = 0;
            String line;
      
            while((line = reader.readLine()) != null){
                String[] s = line.split(",");
                String strType = s[0];
                String strValue = s[1];
                
                pstmt.setString(1, strType);
                
                pstmt.setString(2, strValue);
                
                pstmt.addBatch();
                
                if(count % batchSize == 0){
                    pstmt.executeBatch();
                }
            }
            reader.close();
            pstmt.executeBatch();
            conn.commit();
            conn.close();
        }catch (IOException e){
                    e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
             
            }
    }
    //Method for deleting rows in Identifiers table
    public void deleteIdentifier(int strId) {
        String sql = "DELETE FROM Identifiers WHERE Id = ?";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, strId);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //method for selecting all planet
    public void selectAllPlanets(){
        String sql = "SELECT planetID, name, distance FROM planet";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
          
            while (rs.next()== true) {
                System.out.println(rs.getInt("planetID") +  "\t" + 
                                rs.getString("name") + "\t" + 
                                rs.getFloat("distance"));            
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //method for selecting all ships
    public void selectAllShips(){
        String sql = "SELECT shipID, name, fuelCapacity, cargoCapacity, peopleCapacity, shipSize FROM ship";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            
            while (rs.next()) {
                System.out.println(rs.getInt("shipID") +  "\t" + 
                                   rs.getString("name") +  "\t" +
                                   rs.getInt("fuelCapacity") +  "\t" + 
                                   rs.getInt("cargoCapacity") +  "\t" + 
                                   rs.getInt("peopleCapacity") +  "\t" + 
                                   rs.getString("shipSize"));
                                   //rs.getString("strCargo"));
            
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //method for selecting all persons
    public void selectAllIdentifiers(){
        String sql = "SELECT Id, type, value FROM Identifiers";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("Id") +  "\t" + 
                                   rs.getString("type") + "\t" + 
                                   rs.getString("value"));
            
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
    }
    
    //main method for testing
    public static void main(String[] args){
        AppDB test = new AppDB();
        test.createDatabase();
        test.connect();
        test.createPlanetTable();
        test.insertPlanet();
        test.selectAllPlanets();
        test.createShipTable();
        test.insertShip();
        test.selectAllShips();
        test.createIdentifiersTable();
        test.insertIdentifier();
        test.selectAllIdentifiers();
        
        
    }
}
