/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hello World
 */
public class GetDataAll {

    public static Object[][] getAllTests() {
        StringBuilder result = new StringBuilder();
        Object[][] tableData = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("test_reports.txt"))) {
            System.out.println("File opened Successfully: " + new File("test_report.txt").getAbsolutePath());
            String line;
            List<Object[]> rows = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                if (line.contains("Test Name: ")) {
                    String[] testNameParts = line.split(":");
                    String testName = (testNameParts.length > 1) ? testNameParts[1].trim() : "Unknown";

                    String lineTestType = reader.readLine();
                    String[] testTypeParts = lineTestType.split(":");
                    String testType = (testTypeParts.length > 1) ? testTypeParts[1].trim() : "Unknown";

                    String lineCost = reader.readLine();
                    String[] costParts = lineCost.split(":");
                    String cost = (costParts.length > 1) ? costParts[1].trim() : "0";

                    String lineAvailable = reader.readLine();
                    String[] availableParts = lineAvailable.split(":");
                    String available = (availableParts.length > 1) ? availableParts[1].trim() : "N/A";

                    // Add this row to the list
                    rows.add(new Object[]{testName, testType, cost, available});
                }
            }

            // Convert list to 2D array for the table model
            tableData = new Object[rows.size()][];
            for (int i = 0; i < rows.size(); i++) {
                tableData[i] = rows.get(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return tableData;
    }
}
