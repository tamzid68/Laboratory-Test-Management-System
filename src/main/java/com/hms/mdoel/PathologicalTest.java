package com.hms.model;
/*
@ASM Tamzid

*/
public class PathologicalTest {
    String title;
    double cost;
    boolean isAvailable;

    public PathologicalTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public String show() {
        return "Test name: " + this.title + "\n" +
               "Cost: " + this.cost + "\n" +
               "Available: " + this.isAvailable;
    }

    public static String search(String title) {
        for (PathologicalTest test : DataStore.tests) {  // Access the list in DataStore
            if (test.title.equalsIgnoreCase(title)) {
                return test.show();
            }
        }
        return "Not found";
    }
}
