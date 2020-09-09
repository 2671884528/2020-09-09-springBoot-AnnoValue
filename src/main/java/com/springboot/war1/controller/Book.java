package com.springboot.war1.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 郭永钢
 * @data 2020/9/9 14:13
 * @desc:
 */
@Data
//@ConfigurationProperties(prefix = "book", value = "book.properties")
@RestController
@PropertySource(value = "book.properties",encoding = "UTF-8")
public class Book {

    @Value("${book.name}")
    String name;
    @Value("${book.author}")
    String author;

    @Autowired
    Book2 bookService;

    @RequestMapping("/book")
    public String index(){
        return name;
    }

    @RequestMapping("/book2")
    public String book2(){
        return bookService.name+"********"+bookService.author;
    }
}
