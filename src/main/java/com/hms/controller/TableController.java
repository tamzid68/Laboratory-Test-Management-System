/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;
import com.hms.model.GetDataAll;

/**
 *
 * @author Hello World
 */
public class TableController {
    public Object[][] getData(){
    return GetDataAll.getAllTests();
    }
}
