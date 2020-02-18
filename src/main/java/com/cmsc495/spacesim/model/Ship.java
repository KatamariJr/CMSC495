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
    Planet target;
    private int speed, fuelCapacity, cargoCapacity, peopleCapacity;
    private String name, shipSize;
    HashMap<String,Integer> resources;
    ArrayList<Person> person;
    
    // Ship Constructor
    public Ship () {
        /******** Insert all encompassing if statement here ******/
        if (speed > 1 && fuelCapacity > 1 && cargoCapacity > 1 && peopleCapacity > 1) {
            shipSize = "";
        }
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
    public void AddResources(HashMap<String, Integer>) {
        
    }
    
    // add the given people to the ship people
    public void AddPeople(ArrayList<Person>) {
        
    }
    
    // remove the given resources from the ship resources
    public void RemoveResources(HashMap<String, Integer>) {
        
    }
    
    // remove the given people from the ship people
    public void RemovePeople(ArrayList<Person>) {
        
    }
    
    // add this ship to the docked ship array
    public void DockShip(ArrayList<Ship> s) {
        
    }
    
    // remove this ship from the docked ship array
    public void UndockShip(ArrayList<Ship> s) {
        
    } 
}