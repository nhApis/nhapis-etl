package com.nhapis.etl.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${book.desc}")
    private String desc;

    @Value("${book.page}")
    private int page;

    @RequestMapping("/hello")
    public String index() {
        String test = "name:=" + desc + " 共计:" + page + "页";
        System.out.println(test);
        return test;
    }
}
