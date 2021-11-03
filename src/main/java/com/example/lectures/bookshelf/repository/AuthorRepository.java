package com.example.lectures.bookshelf.repository;

import com.example.lectures.bookshelf.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
