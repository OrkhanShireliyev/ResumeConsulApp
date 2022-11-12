/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.company.main;

import com.company.dao.inter.UserDaoInter;

/**
 *
 * @author FX506ICB
 */
public class Main {

    public static void main(String[] args) {
           UserDaoInter userDao=Context.instanceUserDao();
            //System.out.println(userDao.getById(6));
           System.out.println(userDao.getAll());
        
    }
}
