/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cmsc495.spacesim.model;

/**
 *
 * @author NoorQasim
 */


import java.util.*;

public class Person {
    
    public String skill;
    public String name;
    public boolean locked;
    
    public Person(String name, String skill) { 
        name = "";
        skill = "";
        locked = false;
    }
       
    // this person will be locked while they are being used to complete a requirement
    public void lock(){
        //set locked=true
        boolean locked = true;
    }
    
    // unlock a person after the requirement they are working on is completed.
    public void unlock(){
        //set locked=false
        boolean locked = false;  
    }
    
    // return the value of the locked field
    public boolean isLocked (){
        return locked;
    }
    
}