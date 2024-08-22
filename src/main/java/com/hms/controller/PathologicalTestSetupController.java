/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;
import com.hms.model.PathologicalTest;

/**
 *
 * @author Hello World
 */
public class PathologicalTestSetupController {
    private String title;
    private double cost;
    private boolean isAvailable;
    private String testType;
    
    public PathologicalTestSetupController(String title,String testType,double cost, boolean isAvailable)
    {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.testType = testType;
    }
    public String testSetup(){
    
        PathologicalTest pTest = new PathologicalTest(title,testType,cost, isAvailable);
        if(pTest.returnLabTestInfo().isEmpty())
            return "error with Data base";
        else
            return pTest.returnLabTestInfo();
    }
    
}
