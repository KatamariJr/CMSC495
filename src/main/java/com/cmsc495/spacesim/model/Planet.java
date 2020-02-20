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
    
    
    public float distance;
    public String name;
    public Progress colonizationProgress;
    public boolean isColonized;
    public HashMap<String, Integer> resources;
    public ArrayList<Person> people;
    public ArrayList<Requirement> requirement;
    public ArrayList<Ship> dockedShips;

    
    
    
    
    public Planet(){
        
        distance = 0;
        name = "";
        isColonized = false;
        people = new ArrayList();
        requirement = new ArrayList();
        dockedShips = new ArrayList();
        resources = new HashMap();
    } //End constructor
    
    
    
    
    // add the given people to the planet people
    public void addPeople(ArrayList<Person> p){
    } //End addPeople()
    
    
    
    
    // remove the given people from the planet people
    public void removePeople(ArrayList<Person> p){
    } //End removePeople()
    
    
    
    
     // get the distance to this planet from an origin planet
    public float distanceToPlanet(Planet origin){
        float holder = 0;   //Just a holder until real code is inputted
        return holder;
    } //End distanceToPlanet
    
    
    
    
    // add the given resources to the planet resources
    public void addResources(HashMap<String, Integer> add){
    } //End addResources
    
    
    
    
    // remove the given resources from the planet resources
    public void removeResources(HashMap<String, Integer> remove){
    } //End removeResources()
    
    

    
    
    public float getCurrentTotalProgress(){
        float holder = 0;   //Just a holder until real code is inputted
        return holder;
    } // End getCurrentTotalProgress()
    
    
        // complete the given requirement, removing the needed resources from the planet supply and incrementing the progress
    public void completeRequirement(ArrayList<Requirement> req){
    } //End completeRequirement()
    
    
    
    
    // add this ship to the docked ship array
    public void dockShip(Ship s){
        
    } // End dockedShip()

    
    
     // remove this ship from the docked ship array
    public void undockShip(Ship s){
        
    } // End undockedShip()

    
    
    
} //End Planet Class
