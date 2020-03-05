package com.challenge.controller;

import java.util.List;

import com.challenge.model.GroceryList;
import com.challenge.service.GroceryListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * ListController
 */
@RestController
@RequestMapping(value = "/list")
public class ListController {

    @Autowired
    private GroceryListService serv;

    @GetMapping("/all")
    public List<GroceryList> readAll(){
        System.out.println("just work ");
        return serv.readAll();
    }

    @PostMapping("/save")
    public GroceryList saveList(@RequestBody GroceryList list) {
        return serv.saveOrUpdate(list);
    }
    
}