package com.example.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Cart {
    @OneToMany(mappedBy = "cart")
    private List<Item> items;
}
