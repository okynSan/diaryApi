/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service.greating.impl;

import com.example.model.greating.Greating;
import com.example.service.greating.IGreatingService;
import org.springframework.stereotype.Service;

@Service
public class GreatingServiceImpl implements IGreatingService {

    @Override
    public Greating getGreating() {
        return new Greating("Hello world"); 
    }
    
}
