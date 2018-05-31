    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller.user;

import com.example.model.greating.Greating;
import com.example.model.user.User;
import com.example.service.greating.IGreatingService;
import com.example.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author andrey_zatvornitskiy
 */
@RestController
@RequestMapping("user")
public class UserController {
    
     @Autowired
        IUserService iUserService;
    
    @RequestMapping("/getUserById")
    @ResponseBody User getUserById(Integer userId){
       return iUserService.getUserById(userId);
    }
    
}
