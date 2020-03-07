/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.controller;

import com.cmsc495.spacesim.model.Planet;
import com.cmsc495.spacesim.model.Requirement;
import com.cmsc495.spacesim.model.Ship;
import com.cmsc495.spacesim.model.Person;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    
    public ControllerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of SendShip method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testSendShip() {
        System.out.println("SendShip");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllPeople method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllPeople() {
        System.out.println("GetAllPeople");
        Controller.InitializeEarth();
        ArrayList<Person> p = Controller.getAllPeople();
        assertTrue(!p.isEmpty());
    }

    /**
     * Test of GetAllShips method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllShips() {
        System.out.println("GetAllShips");
        Controller.InitializeEarth();
        ArrayList<Ship> s = Controller.getAllShips();
        assertTrue(!s.isEmpty());
    }

    /**
     * Test of GetAllResources method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllResources() {
        System.out.println("GetAllResources");
        Controller.InitializeEarth();
        HashMap<String, Integer> r = Controller.getAllResources();
        assertTrue(r.keySet().size() > 0);
    }

    /**
     * Test of AddPlanet method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testAddPlanet() {
        System.out.println("AddPlanet");
        Controller.InitializeEarth();
        Planet p = new Planet("Test", 700);
        Controller.addPlanet(p);
        ArrayList<Planet> planets = Controller.getAllPlanets();
        assertTrue(planets.size() == 2);
    }

    /**
     * Test of InitializeEarth method, of class Controller.
     */
    @Test
    public void testInitializeEarth() {
        System.out.println("InitializeEarth");
        Controller.InitializeEarth();
        ArrayList<Planet> planets = Controller.getAllPlanets();
        assertTrue(planets.size() == 1);
    }

    /**
     * Test of newRequirement method, of class Controller.
     */
    @Test
    public void testNewRequirement() {
        System.out.println("newRequirement");
        Requirement result = Controller.newRequirement();
        assertTrue(result.resources.keySet().size() > 0);
        assertTrue(result.skills.keySet().size() > 0);
    }

    /**
     * Test of unloadShip method, of class Controller.
     */
    @Test
    public void testUnloadShip() {
        System.out.println("unloadShip");
        Ship s = new Ship();
        Planet target = new Planet("Jupiter", 1000);
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("Silvester", "Student"));
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Coal", 2);
        try{
            s.addResources(r);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        s.addPeople(p);
        
        Controller.unloadShip(s, target);
        assertEquals(p.get(0), target.people.get(0));
        assertEquals(r.get("Coal"), target.resources.get("Coal"));
    }
    
    /**
     * Test of logFile method, of class Controller.
     */
    @Test
    public void testLogFile() {
        System.out.println("logFile");
        String log = "passed";
        String fileName = "testFile.txt";
        Controller.logFile(log, fileName);
        try{
            File file = new File("testFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            assertEquals("---" + log, line);
        }catch(IOException IO){
            System.out.println("Error with file: " + IO.getMessage());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
