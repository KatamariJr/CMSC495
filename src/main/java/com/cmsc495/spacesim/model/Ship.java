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
 * @author RexannaMcGowan
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
    
    /**************** GETTERS and SETTERS **************/
    public void setTarget (Planet target) {
        this.target = target;
    }
    
    protected Planet getTarget {
        return this.target;
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