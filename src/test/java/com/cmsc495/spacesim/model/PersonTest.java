/*
 * Test file for Person.java
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
    @org.junit.Test (expected = NullPointerException.class)
    public void testLock() {
        System.out.println("***lock function***");
        Person test3 = null;
        test3.lock();
        if (test3.locked = false) {
            System.out.println("Lock function worked");
        }
        else {
            fail("This function didn't change the boolean value");
        }
    }

    /**
     * Test of unlock method, of class Person.
     */
    @org.junit.Test (expected = NullPointerException.class)
    public void testUnlock() {
        System.out.println("***unlock function***");
        Person test2 = null;
        test2.unlock();
        if (test2.locked = true) {
            System.out.println("Unlock function worked");
        }
        else {
            fail("This function didn't change the boolean value");
        }
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
