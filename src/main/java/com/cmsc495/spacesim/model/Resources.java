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

public class Resources {
    
    private ArrayList <Resources> possibleResources;
    private int weight;
    private int size;

    
    public Resources() {
        weight = 0;
        size = 0;
        possibleResources = new ArrayList();
    }
    
    //Add a Resource
    public static void initialized () {
        String[] possibleResources = new String[6];
        possibleSkills[0] = "Food";
        possibleSkills[1] = "Water";
        possibleSkills[2] = "Gasoline";
        possibleSkills[3] = "Coal";
        possibleSkills[4] = "Medical Supplied";
        possibleSkills[5] = "Building Materials";   
    }   
    
}
