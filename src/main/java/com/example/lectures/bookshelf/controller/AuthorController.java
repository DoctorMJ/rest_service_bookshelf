package com.example.lectures.bookshelf.controller;

import com.example.lectures.bookshelf.model.Author;
import com.example.lectures.bookshelf.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping(value = "/authors")
    public ResponseEntity<?> addAuthors(@RequestBody Author author) {
        authorService.addAuthor(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/authors/{authorid}")
    public ResponseEntity<?> deleteAuthor(@PathVariable(name = "authorid") int authorid) {
        final boolean deleted = authorService.deleteAuthor(authorid);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PutMapping(value = "/authors/{authorid}")
    public ResponseEntity<?> updateAuthor(@PathVariable(name = "authorid") int authorid, @RequestBody Author author) {
        final boolean updated = authorService.updateAuthor(author, authorid);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}