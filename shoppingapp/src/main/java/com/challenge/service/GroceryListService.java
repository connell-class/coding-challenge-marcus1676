package com.challenge.service;

import java.util.List;

import com.challenge.dao.GroceryListRepo;
import com.challenge.model.GroceryList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GroceryListService
 */
@Service
public class GroceryListService {

    @Autowired
    private GroceryListRepo repo;

    public List<GroceryList> readAll(){
        return (List<GroceryList>) repo.findAll();
    }

    public GroceryList saveOrUpdate(GroceryList list){
        return repo.save(list);
    }
}