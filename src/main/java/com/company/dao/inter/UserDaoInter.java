/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

/**
 *
 * @author FX506ICB
 */

import com.company.entity.User;
import com.company.entity.UserSkill;

import java.util.List;

public interface UserDaoInter {
    public List<User>getAll();
    public User getById(int id);
    public boolean addUser(User u);
    public boolean updateUser(User u);
    public boolean removeUser(int id);




}
