/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.SaveingData;
import com.hms.model.TestReport;

/**
 *
 * @author Hello World
 */
public class LabTestSetupController {

    private String title;
    private double cost;
    private boolean isAvailable;
    private String testType;
    //public String name ="labData";

    public LabTestSetupController(String title, String testType, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.testType = testType;
    }

    public String testSetup() {

        TestReport pTest = new TestReport(title, testType, cost, isAvailable);

        if (pTest.toString().isEmpty()) {
            return "error with Data base";
        } else {
            return pTest.toString();
        }

    }

    public void saveFile() {
        TestReport report = new TestReport(title, testType, cost, isAvailable);
        String reportData = report.showForSearch();
        SaveingData.saveToFile(reportData);
    }

}
