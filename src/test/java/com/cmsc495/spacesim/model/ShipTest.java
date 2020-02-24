/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.model;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RexannaMcGowan
 */
public class ShipTest {
    
    public ShipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTarget method, of class Ship.
     */
    @org.junit.Test
    public void testSetTarget() {
        System.out.println("setTarget");
        Planet target = null;
        Ship instance = new Ship();
        instance.setTarget(target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Ship.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Ship instance = new Ship();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuelCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testSetFuelCapacity() {
        System.out.println("setFuelCapacity");
        int fuelCapacity = 0;
        Ship instance = new Ship();
        instance.setFuelCapacity(fuelCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargoCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testSetCargoCapacity() {
        System.out.println("setCargoCapacity");
        int cargoCapacity = 0;
        Ship instance = new Ship();
        instance.setCargoCapacity(cargoCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeopleCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testSetPeopleCapacity() {
        System.out.println("setPeopleCapacity");
        int peopleCapacity = 0;
        Ship instance = new Ship();
        instance.setPeopleCapacity(peopleCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarget method, of class Ship.
     */
    @org.junit.Test
    public void testGetTarget() {
        System.out.println("getTarget");
        Ship instance = new Ship();
        Planet expResult = null;
        Planet result = instance.getTarget();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Ship.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        Ship instance = new Ship();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuelCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testGetFuelCapacity() {
        System.out.println("getFuelCapacity");
        Ship instance = new Ship();
        int expResult = 0;
        int result = instance.getFuelCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargoCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testGetCargoCapacity() {
        System.out.println("getCargoCapacity");
        Ship instance = new Ship();
        int expResult = 0;
        int result = instance.getCargoCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeopleCapacity method, of class Ship.
     */
    @org.junit.Test
    public void testGetPeopleCapacity() {
        System.out.println("getPeopleCapacity");
        Ship instance = new Ship();
        int expResult = 0;
        int result = instance.getPeopleCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addResources method, of class Ship.
     */
    @org.junit.Test
    public void testAddResources() {
        System.out.println("addResources");
        HashMap<String, Integer> r = null;
        Ship instance = new Ship();
        instance.addResources(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPeople method, of class Ship.
     */
    @org.junit.Test
    public void testAddPeople() {
        System.out.println("addPeople");
        ArrayList<Person> p = null;
        Ship instance = new Ship();
        instance.addPeople(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeResources method, of class Ship.
     */
    @org.junit.Test
    public void testRemoveResources() {
        System.out.println("removeResources");
        HashMap<String, Integer> r = null;
        Ship instance = new Ship();
        instance.removeResources(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePeople method, of class Ship.
     */
    @org.junit.Test
    public void testRemovePeople() {
        System.out.println("removePeople");
        ArrayList<Person> p = null;
        Ship instance = new Ship();
        instance.removePeople(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
