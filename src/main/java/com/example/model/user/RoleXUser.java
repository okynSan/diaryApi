/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model.user;

import com.example.model.BaseModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Where;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Entity
@Table(name = "role_x_user")
public class RoleXUser extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_x_user")
    private Integer roleXUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    @Where(clause = "delete_statute = 0")
    private Role roleId;

    public RoleXUser() {
    }

    public RoleXUser(Integer roleXUser) {
        this.roleXUser = roleXUser;
    }

    public Integer getRoleXUser() {
        return roleXUser;
    }

    public void setRoleXUser(Integer roleXUser) {
        this.roleXUser = roleXUser;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleXUser != null ? roleXUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleXUser)) {
            return false;
        }
        RoleXUser other = (RoleXUser) object;
        if ((this.roleXUser == null && other.roleXUser != null) || (this.roleXUser != null && !this.roleXUser.equals(other.roleXUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.model.user.RoleXUser[ roleXUser=" + roleXUser + " ]";
    }

}
