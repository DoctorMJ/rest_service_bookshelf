package com.example.lectures.bookshelf.service;

import com.example.lectures.bookshelf.model.Author;
import com.example.lectures.bookshelf.model.Book;

public interface AuthorService {
    void addAuthor (Author author);
    boolean deleteAuthor(int authorid);
    boolean updateAuthor(Author author, int authorid);
}
