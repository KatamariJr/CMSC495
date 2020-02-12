/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.controller;

import java.util.*;

public class Controller {
    
    private static Planet earth;
    
    
    // load the given resources onto the specified ship (checking capacity) and send it to the target planet.
    // this will start a timer.
    public static void SendShip(Ship s, Planet target, Person[] people, HashMap<Resource,Integer> resources){
        
        int totalResources = 0;
        for (Map.Entry<Resource, Integer> k : resources.entrySet()){
            totalResources += k.getValue();
        }
  
        //check if we can send teh ship
        if (totalResources > s.cargoCapacity){
            // throw insufficient space exception
        }
        float planetDistance  = earth.DistanceToPlanet(target);
        if (planetDistance > s.fuelCapacity){
            //throw not enough fuel exception
        }
        
        earth.RemovePeople(people);
        earth.RemoveResources(resources);
        s.AddPeople(people);
        s.AddResources(resources);
        earth.UndockShip(s);
        
        //this might be the spot where we should start a timer, but for now we appear at the planet immediately
        target.DockShip(s);
        UnloadShip(s, target);
    }
    
    
    //these are here only for completion, they will be removed when the model stuff comes in
    class Ship{
    
    }

    class Planet{

    }

    class Person{

    }

    class Resource{

    }
    
}
