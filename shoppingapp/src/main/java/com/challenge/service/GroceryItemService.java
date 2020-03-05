package com.challenge.service;

import java.util.List;

import com.challenge.dao.GroceryItemRepo;
import com.challenge.model.GroceryItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GroceryItemService
 */
@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepo repo;

    public GroceryItem saveOrUpdate(GroceryItem gi) {
        return repo.save(gi);
    }

    public List<GroceryItem> readAll(){
        return (List<GroceryItem>) repo.findAll();
    }

    public GroceryItem readItem(String name){
        return repo.findByName(name);
    }

    public GroceryItem deleteItem(GroceryItem gi){
        repo.delete(gi);
        return gi;
    }
}