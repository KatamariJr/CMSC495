/*
 * CMSC495 SpaceSimProject
 * C.O.P.E. Team
 * 23FEB2020
 * Ship.java holds the data that constructs the Ship Class
 */
package com.cmsc495.spacesim.model;

import java.util.*;

/**
 *
 * @author RexannaSmith
 */
public class Ship {
    public Planet target;
    public int speed, fuelCapacity, cargoCapacity, peopleCapacity;
    public String name, shipSize;
    public HashMap<String, Integer> resources;
    public ArrayList<Person> people;
    
    // Parameterized Ship Constructor
    public Ship (int fuelCapacity, int cargoCapacity, int peopleCapacity, String name, String shipSize) {
        this.fuelCapacity = fuelCapacity;
        this.cargoCapacity = cargoCapacity;
        this.peopleCapacity = peopleCapacity;
        this.name = name;
        this.shipSize = shipSize;
    }
    
    // Default Ship Constructor with passed values
    public Ship () {
        fuelCapacity = 500;
        cargoCapacity = 15;
        peopleCapacity = 6;
        name = "Default Ship";
        shipSize = "Small";
    }
    
    //Setters
    
    /**
     * Setter for target
     * @param target Planet
     * @return void
     **/
    public void setTarget (Planet target) {
        this.target = target;
    }
    
    /**
     * Setter for name
     * @param name String
     * @return void
     **/
    public void setName (String name) {
        this.name = name;
    }
    
    /**
     * Setter for fuelCapacity
     * @param fuelCapacity int
     * @return void
     **/
    public void setFuelCapacity (int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    /**
     * Setter for cargoCapacity
     * @param cargoCapacity int
     * @return void
     **/
    public void setCargoCapacity (int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    /**
     * Setter for peopleCapacity
     * @param peopleCapacity int
     * @return void
     **/
    public void setPeopleCapacity (int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }
    
    /**
     * Setter for shipSize
     * @param shipSize String
     * @return void
     **/
    public void setShipSize (String shipSize) {
        this.shipSize = shipSize;
    }
    //Getters
    
    /**
     * Getter for target
     * @return this.target
     **/
    public Planet getTarget() {
        return this.target;
    }
    
    /**
     * Getter for name
     * @return this.name
     **/
    public String getName() {
        return this.name;
    }
    
    /**
     * Getter for fuelCapacity
     * @return this.fuelCapacity
     **/
    public int getFuelCapacity() {
        return this.fuelCapacity;
    }
    
    /**
     * Getter for cargoCapacity
     * @return this.cargoCapacity
     **/
    public int getCargoCapacity() {
        return this.cargoCapacity;
    }
    
    /**
     * Getter for peopleCapacity
     * @return this.peopleCapacity
     **/
    public int getPeopleCapacity() {
        return this.peopleCapacity;
    }
    
    // add the given resources to the ship resources
    public void addResources(HashMap<String, Integer> r) {
        /*
         * original code to go through HashMap keySet
        for (String key: r.keySet()) {
            for (int i = 0; i <= cargoCapacity; i++) {
                r.get(key);
            }
        } */
        
        // code to coincide with Planet.java function addResources
        int totalInt = 0;
        HashMap<String, Integer> total = new HashMap();
        
        total = (HashMap)this.resources.clone();
        
        totalInt = total.size();
        
        for(String rec : r.keySet()){
            if(total.containsKey(rec)){
                
            }else{
                totalInt++;
                total.put(rec, null);
            }
        }//End for loop to go through HashMap keys
        
        this.resources = total;
    }//End addResources function
    
    // add the given people to the ship people
    public void addPeople(ArrayList<Person> p) {        
        // original function to add all people in the Person arrayList to the ship's people ArrayList
        // this.people.addAll(p);
        
        // code to coincide with Planet.java function addPeople
        for(int i = 0; i < p.size(); i++){
            Person p1 = p.get(i);
            for(int j = 0; j < people.size(); j++){
                Person p2 = people.get(j);
            
                if(p1.equals(p2)){
                   //do nothing 
                }else
                    people.add(p1);
            }//End inner for loop
        }//End for outer Loop
    }//End addPeople function
    
    // remove the given resources from the ship resources
    public void removeResources(HashMap<String, Integer> r) {
        //code to coincide with Planet.Java function removeResources
        int totalInt = 0;
        int valOne = 0;
        int valTwo = 0;
        int valDiff = 0;
        HashMap<String, Integer> diff = new HashMap();
        
        diff = (HashMap)this.resources.clone();
        
        totalInt = diff.size();
        try{
            for(String rec : r.keySet()){
                if(diff.containsKey(rec)){
                    valOne = r.get(rec);
                    valTwo = diff.get(rec);
                    valDiff = valOne - valTwo;
                }
            }//End for loop to go through HashMap differentiation
        }catch(Exception E){
            System.out.println("Error in removeResouces");
        }   
        
        this.resources = diff;
    }
    
    // remove the given people from the ship people
    public void removePeople(ArrayList<Person> p) {
        // original function to remove all people from ship's arrayList of people
        // this.people.removeAll(p);
        
        // code to coincide with Planet.java function removePeople
        for(int i = 0; i < p.size(); i++){
            Person p1 = p.get(i);
            for(int j = 0; j < people.size(); j++){
                Person p2 = people.get(j);
            
                if(p1.equals(p2)){
                  people.remove(p1);
                }
            }//End inner for loop
        }//End for outer Loop
    }//End removePeople function
    
    // toString for Ship class. 
    public String toString(){
        return name + "(" + fuelCapacity + " gal)";
    }
}