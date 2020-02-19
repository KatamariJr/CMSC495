/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.controller;

import com.cmsc495.spacesim.model.Planet;
import com.cmsc495.spacesim.model.Requirement;
import com.cmsc495.spacesim.model.Ship;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllShips method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllShips() {
        System.out.println("GetAllShips");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllPlanets method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllPlanets() {
        System.out.println("GetAllPlanets");
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllResources method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllResources() {
        System.out.println("GetAllResources");
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddPlanet method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testAddPlanet() {
        System.out.println("AddPlanet");
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitializeEarth method, of class Controller.
     */
    @Test
    public void testInitializeEarth() {
        System.out.println("InitializeEarth");
        Controller.InitializeEarth();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        Ship s = null;
        Planet target = null;
        Controller.unloadShip(s, target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logEvent method, of class Controller.
     */
    @Test
    public void testLogEvent() {
        System.out.println("logEvent");
        String event = "";
        Controller.logEvent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logFile method, of class Controller.
     */
    @Test
    public void testLogFile() {
        System.out.println("logFile");
        String log = "";
        String fileName = "";
        Controller.logFile(log, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
