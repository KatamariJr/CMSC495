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
        possibleResources [0] = "Food";
        possibleResources[1] = "Water";
        possibleResources[2] = "Gasoline";
        possibleResources[3] = "Coal";
        possibleResources[4] = "Medical Supplied";
        possibleResources[5] = "Building Materials";   
    }   
    
}
