package com.example.lectures.bookshelf.repository;

import com.example.lectures.bookshelf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Integer> {
}
