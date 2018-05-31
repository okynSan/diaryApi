/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import de.danielbechler.diff.annotation.ObjectDiffProperty;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.annotations.Type;

/**
 *
 * @author andrey_zatvornitskiy
 */
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    private String insertUser;
    private Calendar insertDate;
    private String updateUser;
    private Calendar updateDate;
    private String deleteUser;
    private Calendar deleteDate;
    private Integer deleteStatute = 0;
    final private transient UUID uuid;
    
    public BaseModel() { 
        uuid = java.util.UUID.randomUUID();
    }

    /**
     * @return the insertUser
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "insert_user", nullable = false)
    @Type(type = "strictStringType")
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * @param insertUser the insertUser to set
     */
    public void setInsertUser(final String insertUser) {
        this.insertUser = insertUser;
    }

    /**
     * @return the insertDate
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "insert_date", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getInsertDate() {
        return insertDate;
    }

    /**
     * @param insertDate the insertDate to set
     */
    public void setInsertDate(final Calendar insertDate) {
        this.insertDate = insertDate;
    }

    /**
     * @return the updateUser
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "update_user")
    @Type(type = "strictStringType")
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(final String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return the updateDate
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "update_date")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(final Calendar updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the deleteUser
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "delete_user")
    @Type(type = "strictStringType")
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * @param deleteUser the deleteUser to set
     */
    public void setDeleteUser(final String deleteUser) {
        this.deleteUser = deleteUser;
    }

    /**
     * @return the deleteDate
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "delete_date")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    public Calendar getDeleteDate() {
        return deleteDate;
    }

    /**
     * @param deleteDate the deleteDate to set
     */
    public void setDeleteDate(final Calendar deleteDate) {
        this.deleteDate = deleteDate;
    }

    /**
     * @return the deleteStatute
     */
    @ObjectDiffProperty(ignore = true)
    @Column(name = "delete_statute", nullable = false)
    public Integer getDeleteStatute() {
        return deleteStatute;
    }

    /**
     * @param deleteStatute the deleteStatute to set
     */
    public void setDeleteStatute(final Integer deleteStatute) {
        this.deleteStatute = deleteStatute;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(11, 37).append(uuid).toHashCode();
    }

    @Override
    public abstract boolean equals(final Object obj);

    @Override
    public abstract String toString();

}
