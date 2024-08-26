/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASM
 */
public class SaveingData {
    
   public static void saveToFile(String data) {
        try (FileWriter writer = new FileWriter("test_reports.txt", true)) {
            writer.write(data + "\n");
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving data: " + e.getMessage());
        }
    }
}
