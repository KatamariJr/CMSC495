/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Megan
 */
public class ProgressTest {
    
    public ProgressTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of combineProgress method, of class Progress.
     */
    @Test
    public void testCombineProgress() {
        System.out.println("combineProgress");
        Progress p1 = null;
        Progress p2 = null;
        Progress expResult = null;
        Progress result = Progress.combineProgress(p1, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
