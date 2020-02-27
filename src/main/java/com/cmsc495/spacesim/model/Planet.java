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
    public ArrayList<Requirement> requirements;
    public ArrayList<Ship> dockedShips;

    
    
    
    //Constructor #1
    public Planet(String name, float distance, ArrayList<Requirement> requirements){
        
        this.distance = distance;
        this.name = name;
        isColonized = false;
        people = new ArrayList();
        this.requirements = requirements;
        dockedShips = new ArrayList();
        resources = new HashMap();
    } //End constructor #1
    
    
    
    //Constructor #2
    public Planet(String name, float distance){
        
        this.distance = distance;
        this.name = name;
        isColonized = false;
        people = new ArrayList();
        requirements = new ArrayList();
        dockedShips = new ArrayList();
        resources = new HashMap();
    } //End constructor #2
    
    
    // add the given people to the planet people
    public void addPeople(ArrayList<Person> p) {        
        this.people.addAll(p);
    }//End addPeople function
    
    // remove the given people from the ship people
    public void removePeople(ArrayList<Person> p) {
        this.people.removeAll(p);
    }//End removePeople function
    
     // get the distance to this planet from an origin planet
    public float distanceToPlanet(Planet origin){
        return Math.abs(origin.getDistance() - this.getDistance());
    } //End distanceToPlanet
    
    // add the given resources to the planet resources
    public void addResources(HashMap<String, Integer> r){
        //track the total number of resources to check at the end
        int totalInt = 0;
        
        //clone the resource map so we can rollback if we exceed the max cargo size
        HashMap<String, Integer> total = (HashMap)this.resources.clone();
                
        // loop over all resources
        for(String k : r.keySet()){
            if(!total.containsKey(k)){
                int i = r.get(k) + this.resources.get(k);
                total.put(k, i);
                totalInt += i;
            }
        }
        
        this.resources = total;
    }
    
    //method for setting Planet name
    public void setName(String name){
        this.name = name;
    }
    
    //method for getting Planet name
    public String getName(){
        return this.name;
    }
    
    //method for setting Planet distance
    public void setDistance(float distance){
        this.distance = distance;
    }
    
    //method for getting Planet distance
    public float getDistance(){
        return this.distance;
    }
    
    // remove the given resources from the planet resources
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
    
    // add up the total individual colonization progresses
    public float getCurrentTotalProgress(){
        
        float totalProgress = 0;
        
        totalProgress = colonizationProgress.buildingColonizationProgress + 
                        colonizationProgress.farmingColonizationProgress + 
                        colonizationProgress.scienceColonizationProgress;
        
        return totalProgress;
        
    } // End getCurrentTotalProgress()
    
    // complete the given requirement, removing the needed resources from the planet supply and incrementing the progress
    public void completeRequirement(ArrayList<Requirement> req) throws Exception{
        
        for(Requirement r : req){
            this.removeResources(r.resources);
            
            this.colonizationProgress = Progress.combineProgress(this.colonizationProgress, r.progressContribution);
        }

    }
    
    // add this ship to the docked ship array
    public void dockShip(Ship s){
        
        dockedShips.add(s);
        
    } // End dockedShip()

    
    
     // remove this ship from the docked ship array
    public void undockShip(Ship s){
        
        dockedShips.remove(s);
        
    } // End undockedShip()

    // toString method
    public String toString(){
        return name;
    }
    
    
} //End Planet Class
