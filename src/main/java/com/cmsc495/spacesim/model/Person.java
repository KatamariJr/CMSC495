/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cmsc495.spacesim.model;

import java.util.*;

/**
 *
 * @author NoorQasim
 */
public class Person {
    
    private ArrayList <Skills> possibleSkills;
    private String assignedPerson;
    private String name;
    private boolean locked;

    public Person() {
       possibleSkills = new ArrayList();
    }
    
    //Add a Skill
    public static void initialized () {
        String[] possibleSkills = new String[6];
        possibleSkills[0] = "Chemist";
        possibleSkills[0] = ("Medic");
        possibleSkills[0] = ("Architect");
        possibleSkills[0] = ("Engineer");
        possibleSkills[0] = ("Explorer");
        possibleSkills[0] = ("Builder");   
    }
    
}