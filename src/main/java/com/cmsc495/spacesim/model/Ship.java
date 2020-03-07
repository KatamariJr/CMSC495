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
        this.people = new ArrayList<>();
        this.resources = new HashMap<>();
    }
    
    // Default Ship Constructor with passed values
    public Ship () {
        this(500, 15, 6, "Default Ship", "Small");
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
    public void addResources(HashMap<String, Integer> r) throws Exception{
        //track the total number of resources to check at the end
        int totalInt = 0;
        
        //clone the resource map so we can rollback if we exceed the max cargo size
        HashMap<String, Integer> total = (HashMap)this.resources.clone();
                
        // loop over all resources
        for(String k : r.keySet()){
            total.put(k, total.getOrDefault(k, r.get(k))+r.get(k));
            totalInt += total.get(k);
        }
        
        //check max cargo amount
        if (totalInt > this.cargoCapacity){
            throw new Exception("too much cargo");
        }
        
        this.resources = total;
    }
    
    // add the given people to the ship people
    public void addPeople(ArrayList<Person> p) {        
        this.people.addAll(p);
    }//End addPeople function
    
    // remove the given resources from the ship resources
    public void removeResources(HashMap<String, Integer> r) throws Exception{
        HashMap<String, Integer> diff = (HashMap)this.resources.clone();
        
        for(String k : r.keySet()){
            int valDiff = r.get(k) - diff.get(k);
            if (valDiff < 0){
                throw new Exception("resource removal would result in negative resource count");
            }
            
            diff.put(k, valDiff);
        }//End for loop to go through HashMap differentiation

        this.resources = diff;
    }
    
    // remove the given people from the ship people
    public void removePeople(ArrayList<Person> p) {
        this.people.removeAll(p);
    }//End removePeople function
    
    // toString for Ship class. 
    public String toString(){
        return name;// + "(" + fuelCapacity + " gal)";
    }
}