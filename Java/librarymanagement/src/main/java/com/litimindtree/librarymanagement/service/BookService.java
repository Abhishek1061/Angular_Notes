package com.litimindtree.librarymanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.litimindtree.librarymanagement.entity.Author;
import com.litimindtree.librarymanagement.entity.Book;
import com.litimindtree.librarymanagement.exception.RecordNotFoundException;
import com.litimindtree.librarymanagement.repository.AuthorRepository;
import com.litimindtree.librarymanagement.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Book createBook(Long authorId, Book book) {
        Author author = authorRepository.findById(authorId).get();
        if(author != null){
            book.setAuthor(author);
            return bookRepository.save(book);
        }else{
            throw new RecordNotFoundException("Record not found");
        }   
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }
    // public List<Book> getBookByAuthorName(String name,Book book){
    // return bookRepository.getBookByName(name);
    // }

    public Book getBookByAuthorDetails(Long bookId) {
        return bookRepository.findById(bookId).get();
    }

    public Book updateBook(Long id, Book book) {
        Book bb = bookRepository.findById(id).get();
        if (bb != null) {
            bb.setBookId(book.getBookId());
            bb.setGenre(book.getGenre());
            return bookRepository.save(bb);
        }
        return null;
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    

}
