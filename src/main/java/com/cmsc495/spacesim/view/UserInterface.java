/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmsc495.spacesim.view;

/**
 *
 * @author RexannaSmith
 */

import com.cmsc495.spacesim.controller.Controller;
import com.cmsc495.spacesim.model.Person;
import com.cmsc495.spacesim.model.Planet;
import com.cmsc495.spacesim.model.Ship;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.*;

public class UserInterface extends javax.swing.JFrame {
    
    private ArrayList<JSpinner> resourceValues = new ArrayList<JSpinner>();

    ViewLog logWindow = new ViewLog();
    private ArrayList<Person> pass = new ArrayList<Person>();
    private ArrayList<JCheckBox> passengerChecks = new ArrayList<JCheckBox>();
    
    /**
     * Creates new form COPEUserInterface
     */
    public UserInterface() {
        
        Controller.InitializeEarth();
        initComponents();
        if(!shipList.isSelectionEmpty())
            planetList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        planetList = new javax.swing.JList<>();
        passengerPanel = new javax.swing.JPanel();
        passengerPanelScroll = new javax.swing.JScrollPane();
        passengerPanelInner = new javax.swing.JPanel();
        refreshPassenger = new javax.swing.JButton();
        shipPanel = new javax.swing.JPanel();
        shipSizeComboBox = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        shipList = new javax.swing.JList<>();
        supplyPanel = new javax.swing.JPanel();
        supplyPanelScroll = new javax.swing.JScrollPane();
        supplyPanelInner = new javax.swing.JPanel();
        supplyPanelTestButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        viewLogButton = new javax.swing.JButton();
        mainWindowMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        loadDatabaseMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Planet Selection"));

        jScrollPane1.setViewportView(planetList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        passengerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Passenger Selection"));
        passengerPanel.setLayout(new javax.swing.BoxLayout(passengerPanel, javax.swing.BoxLayout.Y_AXIS));

        passengerPanelInner.setLayout(new java.awt.GridLayout(0, 1));
        passengerPanelScroll.setViewportView(passengerPanelInner);

        passengerPanel.add(passengerPanelScroll);

        refreshPassenger.setText("jButton1");
        refreshPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPassengerActionPerformed(evt);
            }
        });
        passengerPanel.add(refreshPassenger);

        shipPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Spaceship Selection")));

        shipSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        shipSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipSizeComboBoxActionPerformed(evt);
            }
        });

        setShipListModel();
        selectFirstShip();
        shipList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shipList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shipListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(shipList);

        javax.swing.GroupLayout shipPanelLayout = new javax.swing.GroupLayout(shipPanel);
        shipPanel.setLayout(shipPanelLayout);
        shipPanelLayout.setHorizontalGroup(
            shipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(shipSizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        shipPanelLayout.setVerticalGroup(
            shipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shipSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        supplyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Supply Selection"));
        supplyPanel.setLayout(new javax.swing.BoxLayout(supplyPanel, javax.swing.BoxLayout.Y_AXIS));

        supplyPanelInner.setLayout(new java.awt.GridLayout(0, 1));
        supplyPanelScroll.setViewportView(supplyPanelInner);

        supplyPanel.add(supplyPanelScroll);

        supplyPanelTestButton.setText("jButton1");
        supplyPanelTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplyPanelTestButtonActionPerformed(evt);
            }
        });
        supplyPanel.add(supplyPanelTestButton);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        viewLogButton.setText("View Log");
        viewLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLogButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mainWindowMenuBar.add(fileMenu);

        optionsMenu.setText("Options");

        loadDatabaseMenuItem.setText("jMenuItem1");
        loadDatabaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDatabaseMenuItemActionPerformed(evt);
            }
        });
        optionsMenu.add(loadDatabaseMenuItem);

        mainWindowMenuBar.add(optionsMenu);

        setJMenuBar(mainWindowMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewLogButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passengerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(supplyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passengerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewLogButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        //get ship
        //TODO set shiplist to type Ship
        //Ship s = shipList.getSelectedValue();
        Ship s = new Ship();
        
        //get target planet
        //TODO set planetList to type Planet
        //Planet target = planetList.getSelectedValue();
        Planet target = new Planet("planet", 20);
        
        //get list of chosen people
        //get selected checkboxes
        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < passengerChecks.size(); i++){
            
            JCheckBox j = passengerChecks.get(i);
            if (j.isSelected()){
                people.add(pass.get(i));
            }
        }
        
        
        //get all resources
        HashMap<String, Integer> resources = new HashMap<String, Integer>();
        for (JSpinner sp : resourceValues){
            resources.put(sp.getName(), (Integer)sp.getValue());
        }
        
        System.out.println("sending ship");
        System.out.println(s);
        System.out.println(target);
        System.out.println(people);
        System.out.println(resources);
        
        //send trhe ship
        Controller.sendShip(s, target, people, resources);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void supplyPanelTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplyPanelTestButtonActionPerformed
        supplyPanelInner.removeAll();
        resourceValues.clear();
        HashMap<String, Integer> res = Controller.getAllResources();

        for(String k : res.keySet()){
            System.out.println("go");
            supplyPanelInner.add(makeResourceContainerListItem(k));
        }

        supplyPanelInner.revalidate();
        supplyPanelInner.repaint();


        System.out.println(Arrays.toString(supplyPanelInner.getComponents()));
        
    }
    
    private javax.swing.JPanel makeResourceContainerListItem(String text) {
        javax.swing.JPanel r = new javax.swing.JPanel();
        javax.swing.JSpinner s = new javax.swing.JSpinner();
        s.setName(text);
        
        //add to total list
        resourceValues.add(s);
                
        javax.swing.JLabel l = new javax.swing.JLabel(text);
        r.add(l);
        r.add(s);
        return r;
    
    }//GEN-LAST:event_supplyPanelTestButtonActionPerformed

    // makePassengerContainerListItem will return a sub component that will be put in the passenger list,
    // and also add this checkbox to the global list of checkboxes.
    private javax.swing.JPanel makePassengerContainerListItem(Person p, int index) {
        javax.swing.JPanel r = new javax.swing.JPanel(new GridLayout(1,3));        
        javax.swing.JCheckBox c = new javax.swing.JCheckBox();
        c.setName(String.valueOf(index));
        
        passengerChecks.add(c);
        
        
        
        javax.swing.JLabel l = new javax.swing.JLabel(p.name);
        javax.swing.JLabel l2 = new javax.swing.JLabel(p.skill);
        
        r.add(l);
        r.add(l2);
        r.add(c);
        return r;
    }
    
    // when ship size is changed, update the JList of ships matching the size
    private void shipSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipSizeComboBoxActionPerformed
        setShipListModel();
        selectFirstShip();
    }//GEN-LAST:event_shipSizeComboBoxActionPerformed

    // Ensure the first ship is selected
    public void selectFirstShip(){
        try{
        shipList.setSelectedIndex(0);
        }catch(Exception e){
            System.out.println("There are no ships to display");
        }
        
    }
    
    // sets the model of the ship list to be displayed
    private void setShipListModel(){
        shipList.setModel(new javax.swing.AbstractListModel<Ship>() {
            ArrayList<Ship> ships = Controller.searchShipSize(shipSizeComboBox.getSelectedItem().toString());

            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return ships.size(); }
            public Ship getElementAt(int i) { return ships.get(i); }
        });
    }
    
    private void refreshPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPassengerActionPerformed
        pass = Controller.getAllPeople();
        passengerPanelInner.removeAll();
        passengerChecks.clear();
       
        
        for(int i = 0; i < pass.size(); i++){
            Person p = pass.get(i);
            passengerPanelInner.add(makePassengerContainerListItem(p, i));
        }


        passengerPanelInner.revalidate();
        passengerPanelInner.repaint();

    }//GEN-LAST:event_refreshPassengerActionPerformed

    private void viewLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLogButtonActionPerformed
        // TODO add your handling code here:
        logWindow.setVisible(true);
    }//GEN-LAST:event_viewLogButtonActionPerformed

    private void shipListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shipListValueChanged
        // TODO add your handling code here:
        if(!shipList.isSelectionEmpty())
            planetList();
    }//GEN-LAST:event_shipListValueChanged

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loadDatabaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDatabaseMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("database load button clicked");
    }//GEN-LAST:event_loadDatabaseMenuItemActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
                }
        });
    }

    
    //Function to display Planet Selection
    public void planetList(){
        planetList.setModel(new javax.swing.AbstractListModel<Planet>() {
            ArrayList<Planet> planets = Controller.getPlanetList(
             (float)shipList.getSelectedValue().getFuelCapacity());
            public int getSize() { return planets.size(); }
            public Planet getElementAt(int i) { return planets.get(i); }
        });
        planetList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(planetList);
        planetList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        planetList.setLayoutOrientation(JList.VERTICAL);
        
        jScrollPane1.getViewport().setView(planetList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem loadDatabaseMenuItem;
    private javax.swing.JMenuBar mainWindowMenuBar;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JPanel passengerPanel;
    private javax.swing.JPanel passengerPanelInner;
    private javax.swing.JScrollPane passengerPanelScroll;
    private javax.swing.JList<Planet> planetList;
    private javax.swing.JButton refreshPassenger;
    private javax.swing.JList<Ship> shipList;
    private javax.swing.JPanel shipPanel;
    private javax.swing.JComboBox<String> shipSizeComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel supplyPanel;
    private javax.swing.JPanel supplyPanelInner;
    private javax.swing.JScrollPane supplyPanelScroll;
    private javax.swing.JButton supplyPanelTestButton;
    private javax.swing.JButton viewLogButton;
    // End of variables declaration//GEN-END:variables
}
