package com.example;

import com.example.DAO.user.IUserDao;
import com.example.model.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

    @Autowired
    IUserDao iUserDao;

    @Test
    public void contextLoads() {
        User r = iUserDao.getUserById(3);
        System.out.println(r.toString());
    }

    @Test
    @Rollback(false)
    public void saveNewUserTest() {
        User newUser = new User();
        newUser.setFirstName("Andrey");
        newUser.setLastName("Zatvornickiy");
        newUser.setName("andrey_zatvornickiy");
        newUser.setPassword("starLight");

        int a = iUserDao.saveNewUser(newUser);
        System.out.println(a);
    }

    @Test
    public void getUserByName() {

        String password = "starLight";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);

        System.out.println(hashedPassword);

        User us = iUserDao.getUserByName("andrey_zatvornickiy");
        System.out.println(us.toString());
    }
}
