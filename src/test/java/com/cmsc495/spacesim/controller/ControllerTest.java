/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.controller;

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
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of SendShip method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testSendShip() {
        System.out.println("SendShip");
        Controller.Ship s = null;
        Controller.Planet target = null;
        Controller.Person[] people = null;
        HashMap<Controller.Resource, Integer> resources = null;
        Controller.SendShip(s, target, people, resources);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllPeople method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllPeople() {
        System.out.println("GetAllPeople");
        Controller.Person[] expResult = null;
        Controller.Person[] result = Controller.GetAllPeople();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllShips method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllShips() {
        System.out.println("GetAllShips");
        Controller.Ship[] expResult = null;
        Controller.Ship[] result = Controller.GetAllShips();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllPlanets method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllPlanets() {
        System.out.println("GetAllPlanets");
        Controller.Planet[] expResult = null;
        Controller.Planet[] result = Controller.GetAllPlanets();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllResources method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testGetAllResources() {
        System.out.println("GetAllResources");
        HashMap<Controller.Resource, Integer> expResult = null;
        HashMap<Controller.Resource, Integer> result = Controller.GetAllResources();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddPlanet method, of class Controller.
     */
    @org.junit.jupiter.api.Test
    public void testAddPlanet() {
        System.out.println("AddPlanet");
        Controller.Planet p = null;
        Controller.AddPlanet(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
