/*
 * CMSC495 SpaceSimProject
 * C.O.P.E. Team
 * 12FEB2020
 * Ship.java holds the data that constructs the Ship Class
 */
package com.cmsc495.spacesim.model;

import java.util.*;

/**
 *
 * @author RexannaSmith
 */
public class Ship {
    Planet target;
    private int speed, fuelCapacity, cargoCapacity, peopleCapacity;
    private String name, shipSize;
    HashMap<Resource,int> resources;
    ArrayList<Person> person;
    
    // Ship Constructor
    public Ship () {
        if (speed <= 300000 && fuelCapacity <= 500 && cargoCapacity <= 15 && peopleCapacity <= 6) {
            shipSize = "Small";
        }
        if ((speed > 300000 && speed < 400000) && (fuelCapacity > 500 && fuelCapacity < 1500) && (cargoCapacity > 15 && cargoCapacity < 25)
            && (peopleCapacity > 6 && peopleCapacity < 20)) {
            shipSize = "Medium";
        }
        if (speed >= 400000 && fuelCapacity >= 1500 && cargoCapacity >= 25 && peopleCapacity >= 20) {
            shipSize = "Large";
        }
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
    public void setfuelCapacity (int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    /**
     * Setter for cargoCapacity
     * @param cargoCapacity int
     * @return void
     **/
    public void setcargoCapacity (int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    /**
     * Setter for peopleCapacity
     * @param peopleCapacity int
     * @return void
     **/
    public void setpeopleCapacity (int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }
    
    //Getters
    
    /**
     * Getter for target
     * @return this.target
     **/
    protected Planet getTarget() {
        return this.target;
    }
    
    /**
     * Getter for name
     * @return this.name
     **/
    protected String getName() {
        return this.name;
    }
    
    /**
     * Getter for speed
     * @return this.speed
     **/
    protected int getSpeed() {
        return this.speed;
    }
    
    /**
     * Getter for fuelCapacity
     * @return this.fuelCapacity
     **/
    protected int getfuelCapacity() {
        return this.fuelCapacity;
    }
    
    /**
     * Getter for cargoCapacity
     * @return this.cargoCapacity
     **/
    protected int getCargoCapacity() {
        return this.cargoCapacity;
    }
    
    /**
     * Getter for peopleCapacity
     * @return this.peopleCapacity
     **/
    protected int getPeopleCapacity() {
        return this.peopleCapacity;
    }
    
    // add the given resources to the ship resources
    public void AddResources(HashMap<Resource, int>) {
        
    }
    
    // add the given people to the ship people
    public void AddPeople(ArrayList<Person>) {
        
    }
    
    // remove the given resources from the ship resources
    public void RemoveResources(HashMap<Resource, int>) {
        
    }
    
    // remove the given people from the ship people
    public void RemovePeople(ArrayList<Person>) {
        
    }
    
    // add this ship to the docked ship array
    public void DockShip(Ship) {
        
    }
    
    // remove this ship from the docked ship array
    public void UndockShip(Ship) {
        
    } 
}