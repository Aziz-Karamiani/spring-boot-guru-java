package com.guru.gurukotlin.services;

import com.guru.gurukotlin.domain.Book;

public interface BookService {
    public Iterable<Book> findAll();
}
