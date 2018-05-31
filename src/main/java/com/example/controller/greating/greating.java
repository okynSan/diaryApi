/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller.greating;

import com.example.model.greating.Greating;
import com.example.service.greating.IGreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andrey_zatvornitskiy
 */
@RestController
public class greating {
    
    @Autowired
    IGreatingService iGreatingService;
    
    @RequestMapping("/")
    Greating home(){
       return iGreatingService.getGreating();
    }
    
}
