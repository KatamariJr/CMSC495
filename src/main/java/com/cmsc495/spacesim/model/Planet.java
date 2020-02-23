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
    public void addPeople(ArrayList<Person> p){
        
        for(int i = 0; i < p.size(); i++){
            Person p1 = p.get(i);
            for(int j = 0; j<people.size(); j++){
                Person p2 = people.get(j);
            
                if(p1.equals(p2)){
                   //do nothing 
                }else
                    people.add(p1);
            
            }//End inner for loop
        }//End for outer Loop
        
    } //End addPeople()
    
    
    
    
    // remove the given people from the planet people
    public void removePeople(ArrayList<Person> p){
        
        
        for(int i = 0; i < p.size(); i++){
            Person p1 = p.get(i);
            for(int j = 0; j<people.size(); j++){
                Person p2 = people.get(j);
            
                if(p1.equals(p2)){
                  people.remove(p1);
                }
            
            }//End inner for loop
        }//End for outer Loop
        
        
        
    } //End removePeople()
    
    
    
    
     // get the distance to this planet from an origin planet
    public float distanceToPlanet(Planet origin){
        
        return distance;
        
    } //End distanceToPlanet
    
    
    
    
    // add the given resources to the planet resources
    public void addResources(HashMap<String, Integer> h){
        
        int totalInt = 0;
        HashMap<String, Integer> total = new HashMap();
        
        total = (HashMap)this.resources.clone();
        
        totalInt = total.size();
        
        for(String rec : h.keySet()){
            if(total.containsKey(rec)){
                
            }else{
                totalInt++;
                total.put(rec, null);
            }
        
        }
        
        this.resources = total;
        
    } //End addResources
    
    
    
    
    // remove the given resources from the planet resources
    public void removeResources(HashMap<String, Integer> r){
        
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
                
            }}
        }catch(Exception E){
                
        }   
        
        
        
        this.resources = diff;
        
    } //End removeResources()
    
    

    
    
    public float getCurrentTotalProgress(){
        
        float totalProgress = 0;
        
        totalProgress = colonizationProgress.buildingColonizationProgress + 
                        colonizationProgress.farmingColonizationProgress + 
                        colonizationProgress.scienceColonizationProgress;
        
        return totalProgress;
        
    } // End getCurrentTotalProgress()
    
    
        // complete the given requirement, removing the needed resources from the planet supply and incrementing the progress
    public void completeRequirement(ArrayList<Requirement> req){
        
        for(int i = 0; i < req.size(); i++){
            Requirement r1 = req.get(i);
            for(int j = 0; j<requirements.size(); j++){
                Requirement r2 = requirements.get(j);
            
                if(r1.equals(r2)){
                  requirements.remove(r1);
                }
            
            }//End inner for loop
        }//End for outer Loop
        
        
    } //End completeRequirement()
    
    
    
    
    // add this ship to the docked ship array
    public void dockShip(Ship s){
        
        dockedShips.add(s);
        
    } // End dockedShip()

    
    
     // remove this ship from the docked ship array
    public void undockShip(Ship s){
        
        dockedShips.remove(s);
        
    } // End undockedShip()

    
    
    
} //End Planet Class
