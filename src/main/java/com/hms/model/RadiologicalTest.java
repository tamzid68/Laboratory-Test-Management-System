/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Tazmid
 */
public class RadiologicalTest extends LabTest{
    
//   private String title;
   private String plateDimention;
//   private double cost;
//     private boolean isAvailable;

    public RadiologicalTest
        (String title,String plateDimention,double cost, boolean isAvailable) {
        this.title = title;
        this.plateDimention = plateDimention;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
//        public RadiologicalTest()
//        {
//            System.out.println(tk);
//        }

    public String returnLabTestInfo() {
        return "<html>" +
               "<strong>Test Name:</strong> " + this.title + "<br>" +
                "<string>Plate Dimention:</string> "+ this.plateDimention+"<br>"+
               "<strong>Cost:</strong> " + String.format("%.2f", this.cost) + "TK<br>" +
               "<strong>Available:</strong> " + (this.isAvailable ? "Yes" : "No") +
               "</html>";
    }
    public String showForSearch(){
        return "Test Name: "+this.title+"\n"+
                "Cost: "+this.cost+"\n"+
                "Test type: "+this.plateDimention+"\n"+
                "Available: "+(this.isAvailable ? "Yes" : "No")+"\n";
    }

//    public static String search(String title) {
//        for (PathologicalTest test : DataStore.tests) {  // Access the list in DataStore
//            if (test.title.equalsIgnoreCase(title)) {
//                return test.showForSearch();
//            }
//        }
//        return "Not found";
//    }
    
}
