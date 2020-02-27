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
public class Progress {
    
    
    public float buildingColonizationProgress;
    public float farmingColonizationProgress;
    public float scienceColonizationProgress;
    
    
    
    
    public Progress(){
        
        buildingColonizationProgress = 0;
        farmingColonizationProgress = 0;
        scienceColonizationProgress = 0;
        
    } //End constructor
    
    public static Progress combineProgress(Progress p1, Progress p2) {
        Progress p = new Progress();
        p.buildingColonizationProgress = p1.buildingColonizationProgress + p2.buildingColonizationProgress;
        p.farmingColonizationProgress = p1.farmingColonizationProgress + p2.farmingColonizationProgress;
        p.scienceColonizationProgress = p1.scienceColonizationProgress + p2.scienceColonizationProgress;
        return p;
    }
    
    
} //End Progress Class
