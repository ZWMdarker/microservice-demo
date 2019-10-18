package com.darker.item.controller;

import com.darker.item.entity.Item;
import com.darker.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id" )Long id){
        return this.service.queryItemById(id);
    }
}
