/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.model;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mad Preacher
 */
public class PlanetTest {
    
    public PlanetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addPeople method, of class Planet.
     */
    @Test
    public void testAddPeople1() {
        System.out.println("addPeople");
        ArrayList<Person> p = new ArrayList<>();
        Planet instance = new Planet("Jupiter", 1000);
        instance.addPeople(p);
        assertEquals(p, instance.people);
                // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of addPeople method, of class Planet.
     */
    @Test
    public void testAddPeople2() {
        System.out.println("addPeople");
        ArrayList<Person> p = new ArrayList<>();
        Person person = new Person("Muigai", "Programmer");
        p.add(person);
        Planet instance = new Planet("Jupiter", 100); 
        instance.addPeople(p);
        assertEquals(1, instance.people.size()); // check that the people arrary has one element only
        assertEquals("Muigai", instance.people.get(0).name); // verify that the person added is correct
        assertEquals("Programmer", instance.people.get(0).skill); // verify that the skill added is correct
                // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removePeople method, of class Planet.
     */
    @Test
    public void testRemovePeople() {
        System.out.println("removePeople");
        ArrayList<Person> p = new ArrayList<>();
        Planet instance = new Planet("Jupiter", 100);
        instance.removePeople(p);
        assertTrue(instance.people.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test // check that a list with items is completely empty after method call
    public void testRemovePeople2() {
        System.out.println("removePeople");
        ArrayList<Person> p = new ArrayList<>();
        Planet instance = new Planet("Jupiter", 100);
        Person person = new Person("Silvester", "Assassin");        
        p.add(person);
        instance.addPeople(p);
        instance.removePeople(p);
        assertEquals(0, instance.people.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test // Check that the list is not completely empty
    public void testRemovePeople3() {
        System.out.println("removePeople");
        ArrayList<Person> p = new ArrayList<>();
        Planet instance = new Planet("Jupiter", 100);
        Person person = new Person("Silvester", "Assassin");        
        p.add(person);
        instance.addPeople(p);
        instance.people.add(new Person("Michael", "Chemist"));
        instance.removePeople(p);
        assertEquals(1, instance.people.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of distanceToPlanet method, of class Planet.
     */
    @Test
    public void testDistanceToPlanet() {
        System.out.println("distanceToPlanet");
        Planet origin = new Planet("Earth", 0);
        Planet instance = new Planet("Mars", 100);
        float expResult = 100;
        float result = instance.distanceToPlanet(origin);
        assertEquals(expResult, result, 100);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addResources method, of class Planet.
     */
    @Test
    public void testAddResources() {
        System.out.println("addResources");
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Coal", 10);
        r.put("Water", 10);
        r.put("Goldal", 10);
        r.put("Fuel", 10);
        
        Planet instance = new Planet("Earth", 0);
        instance.addResources(r);
        assertEquals(false, instance.resources.isEmpty());
        assertEquals(4, instance.resources.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddResources2() {
        System.out.println("addResources");
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Coal", 10);
        r.put("Water", 10);
        r.put("Goldal", 10);
        r.put("Fuel", 10);
        
        Planet instance = new Planet("Earth", 0);
        instance.resources.put("Sugar", 10);
        instance.addResources(r);
        assertEquals(false, instance.resources.isEmpty());
        assertEquals(5, instance.resources.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Planet.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Nebulius";
        Planet instance = new Planet("Kaplain", 10000);
        instance.setName(name);
        assertEquals("Nebulius", instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDistance method, of class Planet.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        float distance = 2000;
        Planet instance = new Planet("Kaplain", 10000);
        instance.setDistance(distance);
        assertEquals((int)distance, (int)instance.getDistance());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeResources method, of class Planet.
     */
    @Test
    public void testRemoveResources() throws Exception {
        System.out.println("removeResources");
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Coal", 2);
        r.put("Water", 2);
        r.put("Gold", 2);
        r.put("Fuel", 2);
        
        Planet instance = new Planet("Earth", 0);
        instance.resources.put("Coal", 10);
        instance.resources.put("Water", 10);
        instance.resources.put("Gold", 10);
        instance.resources.put("Fuel", 10);
        instance.removeResources(r);
        assertEquals((int)8, (int)instance.resources.get("Coal"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of removeResources method, of class Planet.
     */
    @Test (expected=Exception.class)
    public void testRemoveResources2() throws Exception {
        System.out.println("removeResources");
        HashMap<String, Integer> r = new HashMap<>();
        r.put("Coal", 20);
        r.put("Water", 20);
        r.put("Gold", 11);
        r.put("Fuel", 2);
        
        Planet instance = new Planet("Earth", 0);
        instance.resources.put("Coal", 10);
        instance.resources.put("Water", 10);
        instance.resources.put("Gold", 10);
        instance.resources.put("Fuel", 10);
        instance.removeResources(r);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dockShip method, of class Planet.
     */
    @Test
    public void testDockShip() {
        System.out.println("dockShip");
        Ship s = new Ship();
        Planet instance = new Planet("Jupiter", 1000);
        instance.dockShip(s);
        assertEquals(s, instance.dockedShips.get(0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of undockShip method, of class Planet.
     */
    @Test
    public void testUndockShip() {
        System.out.println("undockShip");
        Ship s = new Ship();
        Planet instance = new Planet("Jupiter", 1000);
        instance.dockShip(s);
        instance.undockShip(s);
        assertTrue(instance.dockedShips.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
