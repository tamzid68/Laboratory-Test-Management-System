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
        tests.add(new PathologicalTest("Blood Test", 50.0, true));
        tests.add(new PathologicalTest("X-Ray", 100.0, true));
        tests.add(new PathologicalTest("MRI", 500.0, false));
    }
}
