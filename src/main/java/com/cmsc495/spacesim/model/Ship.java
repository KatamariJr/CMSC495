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
    private float speed;
    private int fuelCapacity, cargoCapacity, peopleCapacity;
    private String name, shipSize;
    HashMap<Resource,int> resources;
    Person[] person;
    
    // Ship Constructor
    public Ship () {
        if (fuelCapacity <= 500 && cargoCapacity <= 15 && peopleCapacity <= 6) {
            shipSize = "Small";
        }
        if ((fuelCapacity > 500 && fuelCapacity < 1500) && (cargoCapacity > 15 && cargoCapacity < 25)
            && (peopleCapacity > 6 && peopleCapacity < 20)) {
            shipSize = "Medium";
        }
        if (fuelCapacity >= 1500 && cargoCapacity >= 25 && peopleCapacity >= 20) {
            shipSize = "Large";
        }
    }
    
    // add the given resources to the ship resources
    private void AddResources(HashMap<Resource, int>) {
        
    }
    
    // add the given people to the ship people
    public void AddPeople(Person[]) {
        
    }
    
    // remove the given resources from the ship resources
    public void RemoveResources(HashMap<Resource, int>) {
        
    }
    
    // remove the given people from the ship people
    public void RemovePeople(Person[]) {
        
    }
    
    // add this ship to the docked ship array
    public void DockShip(Ship) {
        
    }
    
    // remove this ship from the docked ship array
    public void UndockShip(Ship) {
        
    }
    
}