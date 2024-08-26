/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;
//import com.hms.model.DataStore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ASM
 */
public class SearchTest {
    
     public static String search(String title) {
           StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("test_reports.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Test Name: " + title)) {
                    found = true;
                    result.append(line).append("\n");
                    // Continue reading until the end of the report
                    while ((line = reader.readLine()) != null && !line.trim().isEmpty()) {
                        result.append(line).append("\n");
                    }
                    break; // Stop after finding the first match
                }
            }
            if (!found) {
                return "Test report not found.";
            }
        } catch (IOException e) {
            return "An error occurred while reading the file: " + e.getMessage();
        }
        return result.toString();
    }
}
