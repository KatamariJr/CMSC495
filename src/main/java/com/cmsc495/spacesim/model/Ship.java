/*
 * CMSC495 SpaceSimProject
 * C.O.P.E. Team
 * 19FEB2020
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
    public Ship (int speed, int fuelCapacity, int cargoCapacity, int peopleCapacity, String name, String shipSize) {
 
    }
    
    // Default Ship Constructor with passed values
    public Ship () {
        speed = 300000;
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
     * Setter for speed
     * @param speed int
     * @return void
     **/
    public void setSpeed (int speed) {
        this.speed = speed;
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
     * Getter for speed
     * @return this.speed
     **/
    public int getSpeed() {
        return this.speed;
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

        for (String key: r.keySet()) {
            for (int i = 0; i <= cargoCapacity; i++) {
                r.get(key);
            }
        }
    }
    
    // add the given people to the ship people
    public void addPeople(ArrayList<Person> p) {
        ArrayList<Person> shipPeopleAL = new ArrayList<Person>(peopleCapacity);
        
        shipPeopleAL.addAll(p);
    }
    
    // remove the given resources from the ship resources
    public void removeResources(HashMap<String, Integer> r) {
        r.clear();
    }
    
    // remove the given people from the ship people
    public void removePeople(ArrayList<Person> p) {
        p.clear();
    }
}