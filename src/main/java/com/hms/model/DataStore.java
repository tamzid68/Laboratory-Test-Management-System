package com.hms.model;
/**
* 
*@author Tamzid
*
*/
import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public static List<PathologicalTest> tests = new ArrayList<>();

    static {
        tests.add(new PathologicalTest("Blood Test", "Hemoglobin", 500, true));
        tests.add(new PathologicalTest("Urine Test", "Urea", 300, false));
    }
}
