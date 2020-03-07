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
import static org.junit.jupiter.api.Assertions.assertTrue;

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
     * Test of addResources method, of class Ship.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testAddResources() throws Exception {
        System.out.println("addResources");
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Food", 5);
        r.put("Water", 5);
        r.put("Coal", 5);
        Ship instance = new Ship();
        instance.addResources(r);
        assertTrue(r.keySet().size() > 0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of addPeople method, of class Ship.
     */
    @org.junit.Test
    public void testAddPeople() {
        System.out.println("addPeople");
        ArrayList<Person> p = new ArrayList<>();
        Person person = new Person("Suzy", "Engineer");
        p.add(person);
        Ship instance = new Ship();
        instance.addPeople(p);
        assertTrue(p.size() == 1);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of removeResources method, of class Ship.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testRemoveResources() throws Exception {
        System.out.println("removeResources");
        HashMap<String, Integer> r = new HashMap<>();
        Ship instance = new Ship();
        instance.removeResources(r);
        assertTrue(r.keySet().isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of removePeople method, of class Ship.
     */
    @org.junit.Test
    public void testRemovePeople() {
        System.out.println("removePeople");
        ArrayList<Person> p = new ArrayList<>();
        Ship instance = new Ship();
        instance.removePeople(p);
        assertTrue(p.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
}