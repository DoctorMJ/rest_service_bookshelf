package com.example.lectures.bookshelf.service;

//import com.example.lectures.bookshelf.model.Author;
import com.example.lectures.bookshelf.model.Book;
import java.util.List;

public interface BookService {
    void addBook (Book book);
    //void addAuthor (Author author);
    List<Book> readAllb();
    List<Book> readB(int AuID);
    boolean updateBook(Book book, int bnumber);
    //boolean updateAuthor(Author author, int auId);
    boolean deleteBook(int bnumber);


}
