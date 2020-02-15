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
    public static void main (String args[]) {
        ArrayList<Resources> possibleResources = new ArrayList<Resources>();
        possibleResources.add("Food");
        possibleResources.add("Water");
        possibleResources.add("Gasoline");
        possibleResources.add("Coal");
        possibleResources.add("Medical Supplies");
        possibleResources.add("Building Materials");
    }

}
