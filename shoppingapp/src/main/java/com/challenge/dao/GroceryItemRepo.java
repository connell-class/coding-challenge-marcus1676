package com.challenge.dao;

import com.challenge.model.GroceryItem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * GroceryItemRepo
 */
@Repository
public interface GroceryItemRepo extends CrudRepository<GroceryItem,Integer>{

    GroceryItem findByName(String name);
}