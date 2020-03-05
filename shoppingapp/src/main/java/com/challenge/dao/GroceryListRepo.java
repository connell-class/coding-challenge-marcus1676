package com.challenge.dao;

import com.challenge.model.GroceryList;

import org.springframework.data.repository.CrudRepository;


public interface GroceryListRepo extends CrudRepository<GroceryList,Integer> {

    GroceryList findByName(String name);
    
}