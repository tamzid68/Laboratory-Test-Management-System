package com.hms.model;
/**
* 
*@author Tamzid
*
*/
import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public static List<TestReport> tests = new ArrayList<>();

    static {
        tests.add(new TestReport("Blood Test", "Hemoglobin", 500, true));
        tests.add(new TestReport("Urine Test", "Urea", 300, false));
    }
}
