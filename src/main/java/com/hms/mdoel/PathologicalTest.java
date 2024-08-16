package com.hms.model;
/**
* 
*@author Tamzid
*
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
        return "<html>" +
               "<strong>Test Name:</strong> " + this.title + "<br>" +
               "<strong>Cost:</strong> " + String.format("%.2f", this.cost) + "TK<br>" +
               "<strong>Available:</strong> " + (this.isAvailable ? "Yes" : "No") +
               "</html>";
    }
    public String showForSearch(){
        return "Test Name: "+this.title+"\n"+
                "Cost: "+this.cost+"\n"+
                "Available: "+(this.isAvailable ? "Yes" : "No");
    }

    public static String search(String title) {
        for (PathologicalTest test : DataStore.tests) {  // Access the list in DataStore
            if (test.title.equalsIgnoreCase(title)) {
                return test.showForSearch();
            }
        }
        return "Not found";
    }
}
