/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.model;

/**
 *
 * @author Megan
 */


import java.util.*;
import java.time.*;


public class Requirement {
   
    public HashMap<String, Integer> resources;
    public HashMap<String, Integer> skills;
    public Progress progressContribution;
    public Duration duration;
    
    
    public Requirement(){
        
        resources = new HashMap<String, Integer>();
        skills = new HashMap<String, Integer>();
               
    }
    
    
    
    
    
} //End Requirements class
