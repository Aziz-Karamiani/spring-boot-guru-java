package com.guru.gurukotlin.repositories;

import com.guru.gurukotlin.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
