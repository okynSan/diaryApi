/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DAO.user.impl;

import com.example.DAO.user.IUserDao;
import com.example.model.user.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
//import javax.transaction.Transaction;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(int userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    @Transactional
    public Integer saveNewUser(User user) {
        entityManager.persist(user);
        return user.getUserId();
    }

    @Override
    public User getUserByCreditionals(String name, String pasword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserByName(String name) {
        return entityManager.createQuery("SELECT c FROM User c WHERE c.name = :name", User.class)
                .setParameter("name", name)
                .getResultList()
                .get(0);
    }
    
    

}
