package com.hms.model;
import java.io.FileWriter;
import java.io.IOException;

/**
* 
*@author Tamzid
*
*/
public class TestReport extends LabTest{
//   private String title;
//   private double cost;
//   private boolean isAvailable;
    private String reagent;

    public TestReport(String title,String reagent,double cost, boolean isAvailable) {
//        this.title = title;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
        super(title,cost,isAvailable);
        this.reagent = reagent;
    }

    public String returnLabTestInfo() {
        
        return "<html>" +
               "<strong>Test Name:</strong> " + this.title + "<br>" +
                "<string>Test type:</string> "+ this.reagent+"<br>"+
               "<strong>Cost:</strong> " + String.format("%.2f", this.cost) + "TK<br>" +
               "<strong>Available:</strong> " + (this.isAvailable ? "Yes" : "No") +
               "</html>";
    }
    public String showForSearch(){
        return "Test Name: "+this.title+"\n"+
                "Cost: "+this.cost+"\n"+
                "Test type: "+this.reagent+"\n"+
                "Available: "+(this.isAvailable ? "Yes" : "No")+"\n";
    }
    
   
   
}
