/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import com.company.entity.Country;
import java.util.List;

/**
 *
 * @author FX506ICB
 */
public interface CountryDaoInter {
    
 public List<Country> getAllCountry(); 
 
public Country getCountryById(int id);

public boolean updateCountry(Country cc);

public boolean removeCountry(int id);

public boolean addCountry(Country cc);
}
