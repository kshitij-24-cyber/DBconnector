package com.example.dbconnector.Controller;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 25-05-2022
 */

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @PostMapping("/createTable")
    public String createTable(){
     return "DataBase sucessfully created";
    }
}
