package com.litimindtree.librarymanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.litimindtree.librarymanagement.entity.Book;



@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // @Query("select b from Book b where b.bookId = :bookId")
    // public Book getBookByAuthorDetails(@Param("bookId") Long bookId);

    // @Query("SELECT b FROM Book b JOIN FETCH b.author WHERE b.bookId = :bookId")
    // public Optional<Book> getBookByAuthorDetails(@Param("bookId") Long bookId);

}