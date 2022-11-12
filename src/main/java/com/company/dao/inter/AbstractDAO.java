/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author FX506ICB
 */



public abstract class AbstractDAO {
    
    public  Connection connect() throws SQLException{
          
        String url="jdbc:mysql://localhost:3306/resumetekrar";
        String username="root";
        String password="19942368";
        Connection c=DriverManager.getConnection(url, username, password);
        return c;
    }
//       public static void foo()throws Exception{
//             // Class.forName("com.mysql.jdbc.Driver");
//      
//      
//    }
    } 

