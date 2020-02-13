/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.view;

import javax.swing.*;

public class Start {
    
    public static void main (String []args){
        System.out.println("Hello World!");
        JFrame f = new JFrame();
        Panel p = new Panel();
        f.add(p);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
}
