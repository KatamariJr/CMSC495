/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.controller;

import java.util.*;

public class Controller {
    
    private static Planet earth;
    private static ArrayList<Planet> planets = new ArrayList<Planet>(Arrays.asList(new Planet[]{earth}));
    
    
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
    
    // GetAllPeople will return all people on the starting planet.
    public static Person[] GetAllPeople(){
        return earth.people;
    }
    
    // GetAllShips will return all ships on the starting planet.
    public static Ship[] GetAllShips(){
        return earth.ships;
    }
    
    // GetAllPlanets will return all planets.
    public static Planet[] GetAllPlanets(){
        return planets;
    }
    
    // GetAllResources will return all resources on the starting planet.
    public static HashMap<Resource, Integer> GetAllResources(){
        return earth.resources;
    }
    
    // AddPlanet will append p to the static planet list.
    public static void AddPlanet(Planet p){
        planets.add(p);
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
