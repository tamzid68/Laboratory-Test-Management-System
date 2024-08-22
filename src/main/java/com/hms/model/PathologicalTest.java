package com.hms.model;


/**
* 
*@author Tamzid
*
*/
public class PathologicalTest extends LabTest{
//   private String title;
//   private double cost;
//   private boolean isAvailable;
    private String reagent;

    public PathologicalTest(String title,String reagent,double cost, boolean isAvailable) {
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
