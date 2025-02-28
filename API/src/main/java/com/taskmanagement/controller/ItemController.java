package com.taskmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/api/items")
    public List<String> getItems() {
        return Arrays.asList("Item1", "Item2", "Item3");
    }

}
