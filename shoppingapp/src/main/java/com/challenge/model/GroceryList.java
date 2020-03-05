package com.challenge.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class GroceryList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "list",cascade = CascadeType.ALL , orphanRemoval = true)
    private List<GroceryItem> list = new ArrayList<>();

    public GroceryList() {
    }

    public GroceryList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroceryList id(int id) {
        this.id = id;
        return this;
    }

    public GroceryList name(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }



    public void addItem(GroceryItem gi){
        list.add(gi);
        gi.setList(this);
    }
    public void removeItem(GroceryItem gi){
        list.remove(gi);
        gi.setList(null);
    }

}

