package com.guru.gurukotlin.services;

import com.guru.gurukotlin.domain.Book;
import com.guru.gurukotlin.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository1) {
        this.bookRepository = bookRepository1;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
