/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;
import com.hms.model.PasswordData;

/**
 *
 * @author ASM
 */
public class LogingController {
//    private String userId;
//    private char[] password;
    
    public boolean checker(String user,char[] password){
        
        PasswordData pd = new PasswordData();
        
        if(pd.isValid(user,password)==true)
            return true;
        else 
            return false;
    
    }
}
