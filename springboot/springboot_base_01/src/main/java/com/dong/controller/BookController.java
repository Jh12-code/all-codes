package com.dong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${username[0].age}")
    private String name1;



    @GetMapping
    public String getById(){
        System.out.println("spring is running...");
        System.out.println("country-->"+name1);
        return "spring is running...";
    }
}
