package com.samplespring.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class _Controller {

    @RequestMapping("/books")
    public Object getAllBooks () {
       return Arrays.asList(
               new Book("book1","2001","Action"),
               new Book("book2","2002","Comedy"),
               new Book("book3","2003","Romance"),
               new Book("book4","2004","Critique")
               );

    }

}
