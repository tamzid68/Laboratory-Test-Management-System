/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.model.SearchTest;

/**
 *
 * @author ASM
 */
public class SearchController {

    public String search(String title) {
        SearchTest search = new SearchTest();
        return search.search(title);
    }
}
