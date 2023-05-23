package com.guru.gurukotlin.repositories;

import com.guru.gurukotlin.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
