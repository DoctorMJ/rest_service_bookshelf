package com.example.lectures.bookshelf.service;

import com.example.lectures.bookshelf.model.Book;
import java.util.List;

public interface BookService {
    void addBook (Book book);
    List<Book> readAllb();
    List<Book> readB(int AuID);
    boolean updateBook(Book book, int bnumber);
    boolean deleteBook(int bnumber);


}
