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


public class Planet {
    
    
    private float distance;
    private String name;
    private Progress colonization;
    private boolean isColonized;
    private HashMap<Resource, int> resources;
    private Person [] people;
    private Requirements [] requirements;
    private Ships [] dockedShips;

    

    
    
    
    public Planet(){
    } 
    
    
    
    
    // add the given people to the planet people
    private void addPeople(Person[] p){
    } //End addPeople()
    
    
    
    
    // remove the given people from the planet people
    private void removePepole(Person[] p){
    } //End removePeople()
    
    
    
    
     // get the distance to this planet from an origin planet
    private float distanceToPlanet(Planet origin){
        float holder = 0;   //Just a holder until real code is inputted
        return holder;
    } //End distanceToPlanet
    
    
    
    
    // add the given resources to the planet resources
    private void addResoures(HashMap add){
    } //End addResources
    
    
    
    
    // remove the given resources from the planet resources
    private void removeResources(HashMap remove){
    } //End removeResources()
    
    

    
    
    private float getCurrentTotalProgress(){
        float holder = 0;   //Just a holder until real code is inputted
        return holder;
    } // End getCurrentTotalProgress()
    
    
    
    
    
} //End Planet Class
