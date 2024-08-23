/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.view.Home;
import com.hms.view.LabTestSetup;
import com.hms.view.PathologicalTestSearch;

/**
 *
 * @author ASM
 */
public class RouteController {
    
    public void viewLabTesSetup(){
    new LabTestSetup().setVisible(true);
    }
    
    public void viewSearch(){
    new PathologicalTestSearch().setVisible(true);
    }
    
    public void viewHome(){
    new Home().setVisible(true);
    }
    
}
