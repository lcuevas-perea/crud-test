package com.crudproject.crud.repositories;

import com.crudproject.crud.repositories.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
