/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service.user;

import com.example.model.user.User;

/**
 *
 * @author andrey_zatvornitskiy
 */
public interface IUserService {
    public User getUserById(Integer userId);
    public User getUserByCreditionals(String name, String pasword);
    public User getUserByName(String userName);
    
}
