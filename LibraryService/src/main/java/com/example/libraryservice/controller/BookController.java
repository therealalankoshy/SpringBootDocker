package com.example.libraryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "getAllBooks")
    public String getAllBooks(){
        return "getAllBooks";
    }

    @GetMapping(value = "getOneBook")
    public String getOneBook(){
        return "getOneBook";
    }
}
