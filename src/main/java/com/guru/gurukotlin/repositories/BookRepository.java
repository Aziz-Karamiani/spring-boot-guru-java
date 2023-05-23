package com.guru.gurukotlin.repositories;

import com.guru.gurukotlin.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
