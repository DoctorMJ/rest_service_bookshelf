package com.example.lectures.bookshelf.service;

import com.example.lectures.bookshelf.model.Author;
import com.example.lectures.bookshelf.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public void AuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public boolean updateAuthor(Author author, int authorid) {
        if (authorRepository.existsById(authorid)) {
            author.setAuId(authorid);
            authorRepository.save(author);
            return true;
        }
        return false;
    }
    @Override
    public boolean deleteAuthor(int authorid){
        if (authorRepository.existsById(authorid)){
            authorRepository.deleteById(authorid);
            return true;
        }
        return false;
}
}