package com.samplespring.app;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {
    String name;
    String publishedYear;

    String type;

    public Book(String name, String publishedYear, String type) {
        this.name = name;
        this.publishedYear = publishedYear;
        this.type = type;
    }
}
