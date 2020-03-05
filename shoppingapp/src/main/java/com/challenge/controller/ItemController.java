package com.challenge.controller;

import java.util.List;

import com.challenge.model.GroceryItem;
import com.challenge.service.GroceryItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * ItemController
 */
@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private GroceryItemService serv;

    @GetMapping("/{name}")
    public GroceryItem read(@PathVariable("name") String name){
        return serv.readItem(name);
    }

    @PostMapping("/save")
    public GroceryItem saveItem(@RequestBody GroceryItem groceryItem) {
        return serv.saveOrUpdate(groceryItem);
    }

    @GetMapping(value="/items")
    public List<GroceryItem> getItems() {
        System.out.println("just work ");
        return serv.readAll();
    }
    
    
}