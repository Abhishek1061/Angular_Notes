package com.litimindtree.librarymanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.litimindtree.librarymanagement.entity.Author;
import com.litimindtree.librarymanagement.entity.Book;
import com.litimindtree.librarymanagement.service.BookService;



@RestController
@RequestMapping("/books")
public class BookContoller {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Author> addAuthor(@RequestBody Author author){
        return new ResponseEntity<Author>(bookService.createAuthor(author), HttpStatus.CREATED);
    }

    @PostMapping("/{authorId}")
    public ResponseEntity<Book> addAuthorBook(@PathVariable Long authorId, @RequestBody Book book){
        return new ResponseEntity<Book>(bookService.createBook(authorId, book), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthor(){
        return new ResponseEntity<List<Author>>(bookService.getAllAuthor(), HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookByAuthorDetails(@PathVariable Long bookId){
        return new ResponseEntity<Book>(bookService.getBookByAuthorDetails(bookId),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletebookRecordById(@PathVariable Long bookId){
        bookService.deleteById(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

    // public ResponseEntity<Void> deleteBookRecord(@PathVariable Long bookId){
        
    // }
}
