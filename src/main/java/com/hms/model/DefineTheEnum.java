/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author ASM
 */
public class DefineTheEnum {

    public enum PathologicalTestType {
        BLOOD_TEST("Blood Test"),
        URINALYSIS("Urinalysis"),
        BIOPSY("Biopsy"),
        PAP_SMEAR("Pap Smear"),
        CULTURE_TEST("Culture Test"),
        SEROLOGY_TEST("Serology Test"),
        HISTOPATHOLOGY("Histopathology"),
        IMMUNOHISTOCHEMISTRY("Immunohistochemistry"),
        GENETIC_TESTING("Genetic Testing"),
        CYTOLOGY("Cytology"),
        X_RAY("X-Ray"),
        MRI_SCAN("MRI-Scan");

        private final String displayName;

        // Constructor
        PathologicalTestType(String displayName) {
            this.displayName = displayName;
        }

        //Method to return the display name
        @Override
        public String toString() {
            return displayName;
        }
    }

    public enum RadiologicalTestType {
        X_RAY("X-Ray"),
        CT_SCAN("CT Scan"),
        MRI("MRI"),
        ULTRASOUND("Ultrasound"),
        PET_SCAN("PET Scan"),
        MAMMOGRAPHY("Mammography"),
        FLUOROSCOPY("Fluoroscopy"),
        DEXA_SCAN("DEXA Scan"),
        ANGIOGRAPHY("Angiography"),
        NUCLEAR_MEDICINE_SCANS("Nuclear Medicine Scans");

        private final String displayName;

        RadiologicalTestType(String displayName) {
            this.displayName = displayName;
        }

        // Method to return the display name
        @Override
        public String toString() {
            return displayName;
        }
    }

}
