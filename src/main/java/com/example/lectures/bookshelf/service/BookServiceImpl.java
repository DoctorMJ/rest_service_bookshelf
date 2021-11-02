package com.example.lectures.bookshelf.service;

import com.example.lectures.bookshelf.model.Book;
import com.example.lectures.bookshelf.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {


   private final BookRepository bookRepository;
   public BookServiceImpl(BookRepository bookRepository) {
       this.bookRepository=bookRepository;
   }

   @Override
    public void addBook(Book book){
       bookRepository.save(book);
    }

    @Override
    public List<Book> readAllb(){
       return bookRepository.findAll();
}
@Override
    public List<Book> readB(int AuID){
       return bookRepository.findAll().stream().filter(book -> book.getAuId().equals(AuID)).collect(Collectors.toList());
}

@Override
    public boolean updateBook(Book book, int bnumber){
       if (bookRepository.existsById(bnumber)) {
           book.setBnumber(bnumber);
           bookRepository.save(book);
           return true;
       }
       return false;
}
@Override
    public boolean deleteBook(int bnumber){
       if (bookRepository.existsById(bnumber)){
           bookRepository.deleteById(bnumber);
           return true;
       }
       return false;
}

}
