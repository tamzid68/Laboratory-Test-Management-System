/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;
import com.hms.model.DataStore;
/**
 *
 * @author ASM
 */
public class SearchTest {
    
     public static String search(String title) {
        for (TestReport test : DataStore.tests) {  // Access the list in DataStore
            if (test.title.equalsIgnoreCase(title)) {
                return test.showForSearch();
            }
        }
        return "Not found";
    }
}
