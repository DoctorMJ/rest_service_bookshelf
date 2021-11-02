package com.example.lectures.bookshelf.controller;


import com.example.lectures.bookshelf.model.Book;
import com.example.lectures.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
//*import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//*@SpringBootApplication(scanBasePackages= {"com.example.lectures.bookshelf.service","com.example.lectures.bookshelf.repository"})
@RestController
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "/books")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> readAllb() {
        final List<Book> books = bookService.readAllb();

        return books != null && !books.isEmpty()
                ? new ResponseEntity<>(books, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/books/{auid}")
    public ResponseEntity<List<Book>> readB(@PathVariable(name = "auid") int auid) {
        final List<Book> books = bookService.readB(auid);

        return books != null && !books.isEmpty()
                ? new ResponseEntity<>(books, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/books/{bnumber}")
    public ResponseEntity<?> updateBook(@PathVariable(name = "bnumber") int bnumber, @RequestBody Book book) {
        final boolean updated = bookService.updateBook(book, bnumber);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/books/{bnumber}")
    public ResponseEntity<?> deleteBook(@PathVariable(name = "bnumber") int bnumber) {
        final boolean deleted = bookService.deleteBook(bnumber);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
