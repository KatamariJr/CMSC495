package com.smsc495.spacesim.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cmsc495.spacesim.model.Person;
import com.cmsc495.spacesim.model.Planet;
import com.cmsc495.spacesim.model.Requirement;
import com.cmsc495.spacesim.model.Ship;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Megan
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
    public void testAddPeople() {
        System.out.println("addPeople");
        ArrayList<Person> p = null;
        Planet instance = null;
        instance.addPeople(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePeople method, of class Planet.
     */
    @Test
    public void testRemovePeople() {
        System.out.println("removePeople");
        ArrayList<Person> p = null;
        Planet instance = null;
        instance.removePeople(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distanceToPlanet method, of class Planet.
     */
    @Test
    public void testDistanceToPlanet() {
        System.out.println("distanceToPlanet");
        Planet origin = null;
        Planet instance = null;
        float expResult = 0.0F;
        float result = instance.distanceToPlanet(origin);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addResources method, of class Planet.
     */
    @Test
    public void testAddResources() {
        System.out.println("addResources");
        HashMap<String, Integer> h = null;
        Planet instance = null;
        instance.addResources(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeResources method, of class Planet.
     */
    @Test
    public void testRemoveResources() {
        System.out.println("removeResources");
        HashMap<String, Integer> r = null;
        Planet instance = null;
        instance.removeResources(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTotalProgress method, of class Planet.
     */
    @Test
    public void testGetCurrentTotalProgress() {
        System.out.println("getCurrentTotalProgress");
        Planet instance = null;
        float expResult = 0.0F;
        float result = instance.getCurrentTotalProgress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeRequirement method, of class Planet.
     */
    @Test
    public void testCompleteRequirement() {
        System.out.println("completeRequirement");
        ArrayList<Requirement> req = null;
        Planet instance = null;
        instance.completeRequirement(req);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dockShip method, of class Planet.
     */
    @Test
    public void testDockShip() {
        System.out.println("dockShip");
        Ship s = null;
        Planet instance = null;
        instance.dockShip(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of undockShip method, of class Planet.
     */
    @Test
    public void testUndockShip() {
        System.out.println("undockShip");
        Ship s = null;
        Planet instance = null;
        instance.undockShip(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
