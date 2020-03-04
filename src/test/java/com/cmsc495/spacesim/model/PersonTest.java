/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cmsc495.spacesim.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NoorQasim
 */
public class PersonTest {
    
    public PersonTest() {
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
     * Test of lock method, of class Person.
     */
    @org.junit.Test
    public void testLock() {
        System.out.println("lock");
        Person instance = null;
        instance.lock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlock method, of class Person.
     */
    @org.junit.Test
    public void testUnlock() {
        System.out.println("unlock");
        Person test2 = new Person("Steven", "Farmer");
        test2.unlock();
        // print out lock status System.out.println()
    }

    /**
     * Test of isLocked method, of class Person.
     */
    @org.junit.Test
    public void testIsLocked() {
        System.out.println("isLocked");
        Person test1 = new Person("Charles", "Engineer");
        boolean expResult = false;
        boolean result = test1.isLocked();
        assertEquals(expResult, result);
    }
    
}
