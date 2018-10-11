package com.nhapis.etl.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("${book.name}")
    public static String name;

    @Value("${book.author}")
    public static String author;
}
