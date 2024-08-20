package com.hms.model;
/**
* 
*@author Tamzid
*
*/
public class PathologicalTest {
   private String title;
   private String testType;
   private double cost;
   private boolean isAvailable;

    public PathologicalTest(String title,String testType,double cost, boolean isAvailable) {
        this.title = title;
        this.testType = testType;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public String show() {
        return "<html>" +
               "<strong>Test Name:</strong> " + this.title + "<br>" +
                "<string>Test type:</string> "+ this.testType+"<br>"+
               "<strong>Cost:</strong> " + String.format("%.2f", this.cost) + "TK<br>" +
               "<strong>Available:</strong> " + (this.isAvailable ? "Yes" : "No") +
               "</html>";
    }
    public String showForSearch(){
        return "Test Name: "+this.title+"\n"+
                "Cost: "+this.cost+"\n"+
                "Test type: "+this.testType+"\n"+
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
